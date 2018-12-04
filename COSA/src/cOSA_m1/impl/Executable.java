package cOSA_m1.impl;

import cOSA_m1.*;

import java.util.ArrayList;
import java.util.Collection;

public class Executable {

	public static void main(String[] args) {
		CSConfImpl clientServerConfiguration = new CSConfImpl();
		
		CSQueryPorts csqp = new CSQueryPortsImpl();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__CSQUERYPORTS, new ArrayList<CSQueryPorts>() {{add(csqp);}} );
		
		CSResponsePorts csrp = new CSResponsePortsImpl();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__CSRESPONSEPORTS, new ArrayList<CSResponsePorts>() {{add(csrp);}} );

		ClientImpl myClient = new ClientImpl();
		myClient.setRequestportrpc(new RequestPortRPCImpl());
		myClient.setResponseportrpc(new ResponsePortRPCImpl());
		myClient.setConfiginput(new ConfigInputImpl());
		myClient.setConfigoutput(new ConfigOutputImpl());
		myClient.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__CLIENTS, new ArrayList<Client>() {{add(myClient);}} );
		
		OutputBindingsImpl out = new OutputBindingsImpl();
		out.setClientoutput(myClient.getConfigoutput());
		out.setConfigoutput(csrp);
		out.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__OUTPUTBINDINGS, new ArrayList<OutputBindings>() {{add(out);}} );
		
		InputBindingsImpl in = new InputBindingsImpl();
		in.setClientinput(myClient.getConfiginput());
		in.setConfiginput(csqp);
		in.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__INPUTBINDINGS, new ArrayList<InputBindings>() {{add(in);}} );
		
		RPCImpl rpc = new RPCImpl();
		rpc.setClientinrole(new ClientInRoleImpl());
		rpc.setClientoutrole(new ClientOutRoleImpl());
		rpc.setServerinrole(new ServerInRoleImpl());
		rpc.setServeuroutrole(new ServeurOutRoleImpl());
		rpc.setRpcglue(new RpcGlueImpl());
		rpc.getRpcglue().setClientin(rpc.getClientinrole());
		rpc.getRpcglue().setClientout(rpc.getClientoutrole());
		rpc.getRpcglue().setServerin(rpc.getServerinrole());
		rpc.getRpcglue().setServeurout(rpc.getServeuroutrole());
		rpc.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__RPCS, new ArrayList<RPC>() {{add(rpc);}} );
		
		ClientRpcAttachmentImpl cra = new ClientRpcAttachmentImpl();
		cra.setFrom(myClient.getRequestportrpc());
		cra.setTo(rpc.getClientoutrole());
		cra.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__CLIENTRPCATTACHMENT, new ArrayList<ClientRpcAttachment>() {{add(cra);}} );
		
		RpcClientAttachmentImpl rca = new RpcClientAttachmentImpl();
		rca.setFrom(rpc.getClientinrole());
		rca.setTo(myClient.getResponseportrpc());
		rca.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__RPCCLIENTATTACHMENT, new ArrayList<RpcClientAttachment>() {{add(rca);}} );
		
		String value = "Meh";
		System.out.println("Je rentre la valeur "+value+" dans ma config.");
		clientServerConfiguration.getCsqueryports().get(0).setValue(value);
		System.out.println("La valeur de d'entrée de mon client est : "+clientServerConfiguration.getClients().get(0).getConfiginput().getValue());
		System.out.println("La valeur de de sortie de mon client est : "+clientServerConfiguration.getClients().get(0).getRequestportrpc().getValue());
		System.out.println("La valeur d'entrée de mon RPC est : "+clientServerConfiguration.getRpcs().get(0).getClientoutrole().getValue());
		System.out.println("La valeur de sortie de mon RPC est : "+clientServerConfiguration.getRpcs().get(0).getServerinrole().getValue());
	
	}

}
