package controllerPkg;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-09-28T11:56:21.460-05:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://logic/", name = "ControllerWSSEI")
@XmlSeeAlso({ObjectFactory.class})
public interface ControllerWSSEI {

    @WebMethod
    @RequestWrapper(localName = "start", targetNamespace = "http://logic/", className = "controllerPkg.Start")
    @ResponseWrapper(localName = "startResponse", targetNamespace = "http://logic/", className = "controllerPkg.StartResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean start(
        @WebParam(name = "webContext", targetNamespace = "")
        java.lang.String webContext
    );

    @WebMethod
    @RequestWrapper(localName = "getNextEndpoint", targetNamespace = "http://logic/", className = "controllerPkg.GetNextEndpoint")
    @ResponseWrapper(localName = "getNextEndpointResponse", targetNamespace = "http://logic/", className = "controllerPkg.GetNextEndpointResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getNextEndpoint();

    @WebMethod
    @RequestWrapper(localName = "stop", targetNamespace = "http://logic/", className = "controllerPkg.Stop")
    @ResponseWrapper(localName = "stopResponse", targetNamespace = "http://logic/", className = "controllerPkg.StopResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean stop(
        @WebParam(name = "webContext", targetNamespace = "")
        java.lang.String webContext
    );
}