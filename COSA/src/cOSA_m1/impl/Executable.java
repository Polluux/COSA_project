package cOSA_m1.impl;

import cOSA_m1.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import cOSA.Glue;

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
		
		
		ServerImpl server = new ServerImpl();
		
		ServerInput sin = new ServerInputImpl();
		server.eSet(COSA_m1Package.SERVER__SERVERINPUT,sin);
		
		ServerOuput sout = new ServerOuputImpl();//Oui j'ai oublié le T !!
		server.eSet(COSA_m1Package.SERVER__SERVEROUPUT,sout);
		
		RpcServerAttachmentImpl rsa = new RpcServerAttachmentImpl();
		rsa.setFrom(rpc.getServerinrole());
		rsa.setTo(server.getServerinput());
		rsa.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__RPCSERVERATTACHMENT,  new ArrayList<RpcServerAttachment>() {{add(rsa);}} );
		
		ServerRpcAttachmentImpl sra = new ServerRpcAttachmentImpl();
		sra.setFrom(server.getServerouput());
		sra.setTo(rpc.getServeuroutrole());
		sra.init();
		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__SERVERRPCATTACHMENT,  new ArrayList<ServerRpcAttachment>() {{add(sra);}} );
		
		
		ConnectionManagerImpl connectionManager = new ConnectionManagerImpl();
		connectionManager.setServerconfiginput(new ServerConfigInputImpl());
		connectionManager.setServerconfigoutput(new ServerConfigOutputImpl());
		connectionManager.setConnectioninputfromdatabaseport(new ConnectionInputFromDataBasePortImpl());
		connectionManager.setConnectionouputtodatabaseport(new ConnectionOuputToDataBasePortImpl());
		connectionManager.setConnectioninputfromsecurityport(new ConnectionInputFromSecurityPortImpl());
		connectionManager.setConnectionoutputtosecurityport(new ConnectionOutputToSecurityPortImpl());
		connectionManager.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTIONMANAGER,connectionManager);
		
		OutputBindingImpl out2 = new OutputBindingImpl();
		out2.setServerconfigoutput(connectionManager.getServerconfigoutput());
		out2.setServerouput(sout);
		out2.init();
		server.eSet(COSA_m1Package.SERVER__OUTPUTBINDING,out2);
		
		InputBindingImpl in2 = new InputBindingImpl();
		in2.setServerconfiginput(connectionManager.getServerconfiginput());
		in2.setServerinput(sin);
		in2.init();
		server.eSet(COSA_m1Package.SERVER__INPUTBINDING,in2);	
		

		ConnectionSecurityConnectorImpl conConSec = new ConnectionSecurityConnectorImpl();
		conConSec.setConnectionsecurityinrole(new ConnectionSecurityInRoleImpl());
		conConSec.setConnectionsecurityoutrole(new ConnectionSecurityOutRoleImpl());
		conConSec.setSecurityconnectioninrole(new SecurityConnectionInRoleImpl());
		conConSec.setSecurityconnectionoutrole(new SecurityConnectionOutRoleImpl());
		conConSec.setCSCOnnectorGlue(new CSCOnnectorGlueImpl());
		conConSec.getCSCOnnectorGlue().setConnectionoutput(conConSec.getConnectionsecurityinrole());
		conConSec.getCSCOnnectorGlue().setConnectioninput(conConSec.getSecurityconnectionoutrole());
		conConSec.getCSCOnnectorGlue().setSecurityoutput(conConSec.getSecurityconnectioninrole());
		conConSec.getCSCOnnectorGlue().setSecurityinput(conConSec.getConnectionsecurityoutrole());
		conConSec.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTIONSECURITYCONNECTOR,conConSec);
		
		ConnectionConnectorSecurityAttachmentImpl ccsa = new ConnectionConnectorSecurityAttachmentImpl();
		ccsa.setFrom(connectionManager.getConnectionoutputtosecurityport());
		ccsa.setTo(conConSec.getConnectionsecurityinrole());
		ccsa.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTIONCONNECTORSECURITYATTACHMENT, ccsa);
		
		ConnectorSecurityConnectionAttachmentImpl csca = new ConnectorSecurityConnectionAttachmentImpl();
		csca.setFrom(conConSec.getSecurityconnectionoutrole());
		csca.setTo(connectionManager.getConnectioninputfromsecurityport());
		csca.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTORSECURITYCONNECTIONATTACHMENT, csca);
		
		SecurityManagerImpl securityManager = new SecurityManagerImpl();
		securityManager.setSecurityinputfromconnectionport(new SecurityInputFromConnectionPortImpl());
		securityManager.setSecurityouputtoconnectionport(new SecurityOuputToConnectionPortImpl());
		securityManager.setSecurityoutputtodatabaseport(new SecurityOutputToDatabasePortImpl());
		securityManager.setSecurityinputfromdatabaseport(new SecurityInputFromDatabasePortImpl());
		securityManager.init();
		server.eSet(COSA_m1Package.SERVER__SECURITYMANAGER, securityManager);
		
		ConnectorConnectionSecurityAttachmentImpl ccsa2 = new ConnectorConnectionSecurityAttachmentImpl();
		ccsa2.setFrom(conConSec.getConnectionsecurityoutrole());
		ccsa2.setTo(securityManager.getSecurityinputfromconnectionport());
		ccsa2.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTORCONNECTIONSECURITYATTACHMENT, ccsa2);
		
		SecurityConnectorConnectionAttachmentImpl scca = new SecurityConnectorConnectionAttachmentImpl();
		scca.setFrom(securityManager.getSecurityouputtoconnectionport());
		scca.setTo(conConSec.getSecurityconnectioninrole());
		scca.init();
		server.eSet(COSA_m1Package.SERVER__SECURITYCONNECTORCONNECTIONATTACHMENT, scca);
		
		DatabaseSecurityConnectorImpl conDbSec = new DatabaseSecurityConnectorImpl();
		conDbSec.setSecuritydatabaseinrole(new SecurityDatabaseInRoleImpl());
		conDbSec.setDecuritydatabaseoutrole(new DecurityDatabaseOutRoleImpl());//Oui... Oui, j'ai mis un D à la place d'un S .. oui il y a plein de typos dans ce code généré
		conDbSec.setDatabasesecurityinrole(new DatabaseSecurityInRoleImpl());
		conDbSec.setDatabasesecurityoutrole(new DatabaseSecurityOutRoleImpl());
		conDbSec.setDSConnectorGlue(new DSConnectorGlueImpl());
		conDbSec.getDSConnectorGlue().setSecurityoutput(conDbSec.getSecuritydatabaseinrole());
		conDbSec.getDSConnectorGlue().setSecurityinput(conDbSec.getDatabasesecurityoutrole());
		conDbSec.getDSConnectorGlue().setDatabaseoutput(conDbSec.getDatabasesecurityinrole());
		conDbSec.getDSConnectorGlue().setDatabaseinput(conDbSec.getDecuritydatabaseoutrole());
		conDbSec.init();
		server.eSet(COSA_m1Package.SERVER__DATABASESECURITYCONNECTOR, conDbSec);
		
		SecurityConnectorDatabaseAttachmentImpl scda = new SecurityConnectorDatabaseAttachmentImpl();
		scda.setFrom(securityManager.getSecurityoutputtodatabaseport());
		scda.setTo(conDbSec.getSecuritydatabaseinrole());
		scda.init();
		server.eSet(COSA_m1Package.SERVER__SECURITYCONNECTORDATABASEATTACHMENT, scda);
		
		ConnectorDatabaseSecurityAttachmentImpl cdsa = new ConnectorDatabaseSecurityAttachmentImpl();
		cdsa.setFrom(conDbSec.getDatabasesecurityoutrole());
		cdsa.setTo(securityManager.getSecurityinputfromdatabaseport());
		cdsa.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTORDATABASESECURITYATTACHMENT, cdsa);
		
		DataBaseImpl database = new DataBaseImpl();
		database.setDatabaseinputfromconnectionport(new DatabaseInputFromConnectionPortImpl());
		database.setDatabaseoutputtosecurityport(new DatabaseOutputToSecurityPortImpl());
		database.setDatabaseinputfromsecurityport(new DatabaseInputFromSecurityPortImpl());
		database.setDatabaseoutputtoconnectionport(new DatabaseOutputToConnectionPortImpl());
		database.init();
		server.eSet(COSA_m1Package.SERVER__DATABASE, database);
		
		ConnectorSecurityDatabaseAttachmentImpl csda = new ConnectorSecurityDatabaseAttachmentImpl();
		csda.setFrom(conDbSec.getDecuritydatabaseoutrole());
		csda.setTo(database.getDatabaseinputfromsecurityport());
		csda.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTORSECURITYDATABASEATTACHMENT, csda);
		
		DatabaseConnectorSecurityAttachmentImpl dcsa = new DatabaseConnectorSecurityAttachmentImpl();
		dcsa.setFrom(database.getDatabaseoutputtosecurityport());
		dcsa.setTo(conDbSec.getDatabasesecurityinrole());
		dcsa.init();
		server.eSet(COSA_m1Package.SERVER__DATABASECONNECTORSECURITYATTACHMENT, dcsa);
		
		ConnectionDatabaseConnectorImpl conDatCon = new ConnectionDatabaseConnectorImpl();
		conDatCon.setConnectiondbinrole(new ConnectionDBInRoleImpl());
		conDatCon.setConnectiondboutrole(new ConnectionDBOutRoleImpl());
		conDatCon.setDbconnectioninrole(new DBConnectionInRoleImpl());
		conDatCon.setDbconnectionoutrole(new DBConnectionOutRoleImpl());
		conDatCon.setCDConnectorGlue(new CDConnectorGlueImpl());
		conDatCon.getCDCnnectorGlue().setConnectionoutput(conDatCon.getConnectiondbinrole());
		conDatCon.getCDCnnectorGlue().setConnectioninput(conDatCon.getDbconnectionoutrole());
		conDatCon.getCDCnnectorGlue().setDatabaseoutput(conDatCon.getDbconnectioninrole());
		conDatCon.getCDCnnectorGlue().setDatabaseinput(conDatCon.getConnectiondboutrole());
		conDatCon.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTIONDATABASECONNECTOR, conDatCon);
		
		ConnectorConnectionDatabaseAttachmentImpl ccda = new ConnectorConnectionDatabaseAttachmentImpl();
		ccda.setFrom(conDatCon.getConnectiondboutrole());
		ccda.setTo(database.getDatabaseinputfromconnectionport());
		ccda.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTORCONNECTIONDATABASEATTACHMENT , ccda);
		
		DatabaseConnectorConnectionAttachmentImpl dcca = new DatabaseConnectorConnectionAttachmentImpl();
		dcca.setFrom(database.getDatabaseoutputtoconnectionport());
		dcca.setTo(conDatCon.getDbconnectioninrole());
		dcca.init();
		server.eSet(COSA_m1Package.SERVER__DATABASECONNECTORCONNECTIONATTACHMENT , dcca);
		
		ConnectionConnectorDatabaseAttachmentImpl ccda2 = new ConnectionConnectorDatabaseAttachmentImpl();
		ccda2.setFrom(connectionManager.getConnectionouputtodatabaseport());
		ccda2.setTo(conDatCon.getConnectiondbinrole());
		ccda2.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTIONCONNECTORDATABASEATTACHMENT , ccda2);
		
		ConnectorDatabaseConnectionAttachmentImpl cdca = new ConnectorDatabaseConnectionAttachmentImpl();
		cdca.setFrom(conDatCon.getDbconnectionoutrole());
		cdca.setTo(connectionManager.getConnectioninputfromdatabaseport());
		cdca.init();
		server.eSet(COSA_m1Package.SERVER__CONNECTORDATABASECONNECTIONATTACHMENT , cdca);

		clientServerConfiguration.eSet(COSA_m1Package.CS_CONF__SERVER,server);
		
		
			
		/*
		
		String value = "SET toto = \"1\"";	
		
		System.out.println("Pour une raison de lisibilité afin de présenter le contenu des ports, ceux-ci gardent la dernière valeur qu'ils ont reçus");
		
		System.out.println("Je rentre la valeur "+value+" dans ma config.");
		clientServerConfiguration.getCsqueryports().get(0).setValue(value);
		
		System.out.println("La valeur de d'entrée de mon client est : "+clientServerConfiguration.getClients().get(0).getConfiginput().getValue());
		System.out.println("La valeur de sortie de mon client est : "+clientServerConfiguration.getClients().get(0).getRequestportrpc().getValue());
		System.out.println("La valeur d'entrée de mon RPC est : "+clientServerConfiguration.getRpcs().get(0).getClientoutrole().getValue());
		System.out.println("La valeur de sortie de mon RPC est : "+clientServerConfiguration.getRpcs().get(0).getServerinrole().getValue());
		System.out.println("La valeur d'entrée de mon Server est : "+clientServerConfiguration.getServer().getServerinput().getValue());
		System.out.println("La valeur d'entrée de mon ConnectionManager est : "+server.getConnectionmanager().getServerconfiginput().getValue());
		System.out.println("La valeur de sortie de mon ConnectionManager vers DataBaseManager est : "+server.getConnectionmanager().getConnectionouputtodatabaseport().getValue());
		System.out.println("La valeur de sortie de mon ConnectionManager vers SecurityManager est : "+server.getConnectionmanager().getConnectionoutputtosecurityport().getValue());
		System.out.println("La valeur d'entrée de mon Connection to Security connector est : "+server.getConnectionsecurityconnector().getConnectionsecurityinrole().getValue());
		System.out.println("La valeur de sortie de mon Connection to Security connector est : "+server.getConnectionsecurityconnector().getConnectionsecurityoutrole().getValue());
		System.out.println("La valeur d'entrée de mon Security Manager est : "+securityManager.getSecurityinputfromconnectionport().getValue());
		System.out.println("La valeur de sortie de mon Security Manager est : "+securityManager.getSecurityoutputtodatabaseport().getValue());
		System.out.println("La valeur d'entrée de mon Security to Database Connector est : "+server.getDatabasesecurityconnector().getSecuritydatabaseinrole().getValue());
		System.out.println("La valeur de sortie de mon Security to Database Connector est : "+server.getDatabasesecurityconnector().getDecuritydatabaseoutrole().getValue());
		System.out.println("La valeur d'entrée de mon DataBase Manager est : "+server.getDatabase().getDatabaseinputfromsecurityport().getValue());
		System.out.println("La valeur de sortie de mon Database Manager est : "+server.getDatabase().getDatabaseoutputtoconnectionport().getValue());
		System.out.println("La valeur d'entrée de mon Database to Connection Connector est : "+server.getConnectiondatabaseconnector().getDbconnectioninrole().getValue());
		System.out.println("La valeur de sortie de mon Database to Connection Connector est : "+server.getConnectiondatabaseconnector().getDbconnectionoutrole().getValue());
		System.out.println("La valeur d'entrée de mon ConnectionManager est : "+server.getConnectionmanager().getConnectioninputfromdatabaseport().getValue());
		System.out.println("La valeur d'entrée de mon ConnectionManager depuis Security est : "+server.getConnectionmanager().getConnectioninputfromsecurityport().getValue());
		System.out.println("La valeur de sortie de mon ConnectionManager vers Security est : "+server.getConnectionmanager().getConnectionoutputtosecurityport().getValue());
		System.out.println("La valeur de sortie de mon ConnectionManager vers Server est : "+server.getConnectionmanager().getServerconfigoutput().getValue());
		System.out.println("La valeur de sortie de mon Server est : "+clientServerConfiguration.getServer().getServerouput().getValue());
		System.out.println("La valeur d'entrée de mon RPC est : "+clientServerConfiguration.getRpcs().get(0).getServeuroutrole().getValue());
		System.out.println("La valeur de sortie de mon RPC est : "+clientServerConfiguration.getRpcs().get(0).getClientinrole().getValue());
		System.out.println("La valeur d'entrée de mon Client est : "+clientServerConfiguration.getClients().get(0).getResponseportrpc().getValue());
		System.out.println("La valeur de sortie de mon Client est : "+clientServerConfiguration.getClients().get(0).getConfigoutput().getValue());
		
		System.out.println("The output of my configuration is : "+clientServerConfiguration.getCsresponseports().get(0).getValue());
		
		*/
		
		ArrayList<String> queries = new ArrayList<String>() {{
			add("Coucou");
			add("SET toto = \"1\"");
			add("GET coucou");
			add("GET toto");
		}};
		
		for(String q : queries) {
			System.out.println("VALUE : "+q);
			clientServerConfiguration.getCsqueryports().get(0).setValue(q);
			System.out.println("OUPUT : "+clientServerConfiguration.getCsresponseports().get(0).getValue()+"\n");
		}
		
	}

}
