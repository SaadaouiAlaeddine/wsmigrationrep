package logic;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "ControllerWSSEI", targetNamespace = "http://logic/")
public interface ControllerWSSEI {

	boolean start(@WebParam(name = "arg0") String webContext);

	boolean stop(@WebParam(name = "arg0") String webContext);

	String getNextEndpoint();

}