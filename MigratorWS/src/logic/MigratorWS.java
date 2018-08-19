package logic;
import java.io.File;
import java.io.IOException;

import javax.jws.WebService;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.catalina.ant.DeployTask;
import org.apache.catalina.ant.UndeployTask;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;


@WebService(targetNamespace = "http://logic/", endpointInterface = "logic.MigratorWSSEI", portName = "MigratorWSPort", serviceName = "MigratorWSService")
public class MigratorWS implements MigratorWSSEI {
	
	private boolean updateWSDLAddress(String wsdlAddress, WS ws) {
		boolean s = true;
		try {
			String fileName = ws.getDirectory() + "/wsdl/" + ws.getWsdlName();
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource(fileName).getFile());
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder;
			docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(file);
			Node soapAddress = doc.getElementsByTagName("soap:address").item(0);
			NamedNodeMap attr = soapAddress.getAttributes();
			Node nodeAttr = attr.getNamedItem("location");
			nodeAttr.setTextContent(wsdlAddress);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(file.getAbsolutePath()));
			transformer.transform(source, result);

		} catch (SAXException | IOException | TransformerException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			s = false;
		}
		return s;
	}

	private boolean updateWarFile(WS ws) {
		String wsdlFilePath = "wsdl/" + ws.getWsdlName();
		String warFilePath = ws.getWarName();
		boolean s = true;
		ClassLoader classLoader = getClass().getClassLoader();
		try {
			String cmd = "jar -uvf" + " " + warFilePath + " " + wsdlFilePath;
			ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", cmd);
			pb.directory(new File(classLoader.getResource("./" + ws.getDirectory()).getPath()));
			Process p = pb.start();
			p.waitFor();
		} catch (IOException | InterruptedException e) {
			// e.printStackTrace();
			s = false;
		}
		return s;
	}

	private boolean updateWS(String wsdlAddress, WS ws) {
		boolean s = true;
		s = updateWSDLAddress(wsdlAddress, ws);
		if (s) {
			s = updateWarFile(ws);
		}
		return s;
	}

	private boolean deploy(WS ws, String tomcatManagerURL) {
		System.out.println("aaaa");
		String filePath = ws.getDirectory() + "/" + ws.getWarName();
		ClassLoader classLoader = getClass().getClassLoader();
		File warFile = new File(classLoader.getResource(filePath).getFile());
		boolean s = true;
		String webPath = "/" + ws.getWebPath();
		DeployTask deployTask = new DeployTask();
		deployTask.setUrl(tomcatManagerURL);
		deployTask.setUsername("deployer");
		deployTask.setPassword("admin");
		deployTask.setLocalWar(warFile.getAbsolutePath());
		deployTask.setPath(webPath);
		try {
			deployTask.execute();
		} catch (Exception e) {
			System.out.println(warFile.getAbsolutePath());
			e.printStackTrace();
			s = false;
		}
		return s;
	}

	public boolean undeploy(WS ws, String tomcatManagerURL) {
		String webPath = "/" + ws.getWebPath();
		boolean s = true;
		UndeployTask undeployTask = new UndeployTask();
		undeployTask.setUrl(tomcatManagerURL);
		undeployTask.setUsername("deployer");
		undeployTask.setPassword("admin");
		undeployTask.setPath(webPath);
		try {
			undeployTask.execute();
		} catch (Exception e) {
			// e.printStackTrace();
			s = false;
		}
		return s;
	}

	public boolean moveWS(WS ws, String sourceManagerURL, String destinationManagerURL,
			String destinationWSDLAddress) {
		boolean s = true;
		s = updateWS(destinationWSDLAddress, ws);
		if (s) {
			s = deploy(ws, destinationManagerURL);
		}
		if (s) {
			s = undeploy(ws, sourceManagerURL);
		}
		return s;
	}

	public boolean duplicateWS(WS ws, String destinationManagerURL, String destinationWSDLAddress) {
		boolean s = true;
		s = updateWS(destinationWSDLAddress, ws);
		if (s) {
			s = deploy(ws, destinationManagerURL);
		}
		return s;
	}
}