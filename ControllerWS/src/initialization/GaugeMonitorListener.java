package initialization;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;

import javax.management.Notification;
import javax.management.NotificationListener;
import javax.management.monitor.MonitorNotification;
import javax.xml.namespace.QName;

import logic.ControllerClass;
import migration.MigratorWS;
import migration.MigratorWSPortType;
import migration.Ws;

public class GaugeMonitorListener implements NotificationListener {

	private static final QName SERVICE_NAME = new QName("http://logic/", "MigratorWS");

	@Override
	public void handleNotification(Notification notification, Object handback) {
		// TODO Auto-generated method stub
		MonitorNotification monitorNotif = (MonitorNotification) notification;
		if (monitorNotif.getType().equals(MonitorNotification.THRESHOLD_HIGH_VALUE_EXCEEDED)) {
			writeMessage("high value exceeded\n");
			duplicateWS();
			monitorNotif.getTrigger();
		} else if (monitorNotif.getType().equals(MonitorNotification.THRESHOLD_LOW_VALUE_EXCEEDED)) {
			writeMessage("low value exceeded\n");
			//String wsdl = "http://127.0.0.1:8081/ComputationWS/services/ComputationClassPort?wsdl";
			String wsdl = "http://149.149.134.241:8080/ComputationWS/services/ComputationClassPort?wsdl";
			if (ControllerClass.endpointList.contains(wsdl)) {
			ControllerClass.endpointList.removeElement(wsdl);
			ControllerClass.endpointList.removeElement(wsdl);
			}
			//if (ControllerClass.endpointList.contains(wsdl)) {
			//	undeployWS();
			//	ControllerClass.endpointList.removeElement(wsdl);
			//}
			monitorNotif.getTrigger();
		}

	}

	public static void undeployWS() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		URL wsdlURL = MigratorWS.WSDL_LOCATION;
		MigratorWS ss = new MigratorWS(wsdlURL, SERVICE_NAME);
		MigratorWSPortType port = ss.getMigratorWSPort();
		System.out.println("Invoking undeployWS...");
		migration.Ws undeployWS = new migration.Ws();
		undeployWS.setDirectory("resources");
		undeployWS.setWarName("ComputationWS.war");
		undeployWS.setWebPath("ComputationWS");
		undeployWS.setWsdlName("computationclass.wsdl");
		//java.lang.String tomcatManagerURL = "http://127.0.0.1:8081/manager/text";
		java.lang.String tomcatManagerURL = "http://149.149.134.241:8080/manager/text";
		boolean result = port.undeploy(undeployWS, tomcatManagerURL);
		System.out.println("undeploy.result=" + result);

	}

	public static void writeMessage(String content) {
		String fileName = "./resources/config2.txt";
		ControllerContextListener context = new ControllerContextListener();
		ClassLoader classLoader = context.getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		System.out.println(file.getAbsolutePath());
		BufferedWriter out = null;
		try {
			FileWriter fstream = new FileWriter(file, true);
			out = new BufferedWriter(fstream);
			out.write(content);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@SuppressWarnings("unused")
	private static void duplicateWS() {
		//String wsdl = "http://127.0.0.1:8081/ComputationWS/services/ComputationClassPort?wsdl";
		String wsdl = "http://149.149.134.241:8080/ComputationWS/services/ComputationClassPort?wsdl";
		if (!ControllerClass.endpointList.contains(wsdl)) {
			URL wsdlURL = MigratorWS.WSDL_LOCATION;
			MigratorWS ss = new MigratorWS(wsdlURL, SERVICE_NAME);
			MigratorWSPortType port = ss.getMigratorWSPort();
			System.out.println("Invoking duplicateWS...");
			Ws _duplicateWS_ws = new Ws();
			_duplicateWS_ws.setDirectory("resources");
			_duplicateWS_ws.setWarName("ComputationWS.war");
			_duplicateWS_ws.setWebPath("ComputationWS");
			_duplicateWS_ws.setWsdlName("computationclass.wsdl");
			//java.lang.String _duplicateWS_destinationManagerURL = "http://127.0.0.1:8081/manager/text";
			java.lang.String _duplicateWS_destinationManagerURL = "http://149.149.134.241:8080/manager/text";
			//java.lang.String _duplicateWS_destinationWSDLAddress = "http://127.0.0.1:8081/ComputationWS/services";
			java.lang.String _duplicateWS_destinationWSDLAddress = "http://149.149.134.241:8080/ComputationWS/services";
			boolean _duplicateWS__return = port.duplicateWS(_duplicateWS_ws, _duplicateWS_destinationManagerURL,
					_duplicateWS_destinationWSDLAddress);
			ControllerClass.endpointList.add(wsdl);
			ControllerClass.endpointList.add(wsdl);
		}
		// System.out.println("duplicateWS.result=" + _duplicateWS__return);
	}

	public static boolean exist(String serverUrl) {

		final Socket socket;
		try {
			URL url = new URL(serverUrl);
			socket = new Socket(url.getHost(), url.getPort());
		} catch (IOException e) {
			return false;
		}

		try {
			socket.close();
		} catch (IOException e) {
			// will never happen, it's thread-safe
		}

		return true;
	}

	@SuppressWarnings("unused")
	private static void moveWS() {
		URL wsdlURL = MigratorWS.WSDL_LOCATION;
		MigratorWS ss = new MigratorWS(wsdlURL, SERVICE_NAME);
		MigratorWSPortType port = ss.getMigratorWSPort();

		System.out.println("Invoking duplicateWS...");
		Ws _duplicateWS_ws = new Ws();
		_duplicateWS_ws.setDirectory("resources");
		_duplicateWS_ws.setWarName("ComputationWS.war");
		_duplicateWS_ws.setWebPath("ComputationWS");
		_duplicateWS_ws.setWsdlName("computationclass.wsdl");
		// java.lang.String _moveWS_sourceManagerURL =
		// "http://127.0.0.1:8080/manager/text";
		java.lang.String _duplicateWS_destinationManagerURL = "http://127.0.0.1:8081/manager/text";
		java.lang.String _duplicateWS_destinationWSDLAddress = "http://127.0.0.1:8081/ComputationWS/services";
		boolean _duplicateWS__return = port.duplicateWS(_duplicateWS_ws, _duplicateWS_destinationManagerURL,
				_duplicateWS_destinationWSDLAddress);
		ControllerClass.endpointList.add("http://127.0.0.1:8081/ComputationWS/services/ComputationClassPort?wsdl");
		// System.out.println("duplicateWS.result=" + _duplicateWS__return);
	}
}
