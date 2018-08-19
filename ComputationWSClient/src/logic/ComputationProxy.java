package logic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.apache.cxf.service.factory.ServiceConstructionException;

public class ComputationProxy {
	public static URL wsdlURL;
	public static QName service_name;
	public static QName portName;
	public static Service service;
	public static ComputationClassPortType port;

	static {
		
			try {
				wsdlURL = new URL("http://localhost:8080/ComputationWS/services/CdomputationClassPort?wsdl");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			service_name = new QName("http://logic/", "ComputationClass");
			portName = new QName("http://logic/", "ComputationClassPort");
			service = Service.create(wsdlURL, service_name);
			port = service.getPort(portName, ComputationClassPortType.class);
	}

	public static void main(String args[]) {
		try
		{
		System.out.println(port.febonacci(4));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			BindingProvider bp = (BindingProvider)port;
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/ComputationWS/services/ComputationClassPort?wsdl");
		}
	}

}
