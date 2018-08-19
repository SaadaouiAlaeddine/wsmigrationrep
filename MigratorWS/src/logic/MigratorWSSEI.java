package logic;

import javax.jws.WebService;

@WebService(name = "MigratorWSSEI", targetNamespace = "http://logic/")
public interface MigratorWSSEI {

	boolean undeploy(WS ws, String tomcatManagerURL);

	boolean moveWS(WS ws, String sourceManagerURL, String destinationManagerURL, String destinationWSDLAddress);

	boolean duplicateWS(WS ws, String destinationManagerURL, String destinationWSDLAddress);

}