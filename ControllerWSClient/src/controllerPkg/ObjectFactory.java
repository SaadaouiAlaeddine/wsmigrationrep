
package controllerPkg;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the controllerPkg package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetNextEndpoint_QNAME = new QName("http://logic/", "getNextEndpoint");
    private final static QName _GetNextEndpointResponse_QNAME = new QName("http://logic/", "getNextEndpointResponse");
    private final static QName _Start_QNAME = new QName("http://logic/", "start");
    private final static QName _StartResponse_QNAME = new QName("http://logic/", "startResponse");
    private final static QName _Stop_QNAME = new QName("http://logic/", "stop");
    private final static QName _StopResponse_QNAME = new QName("http://logic/", "stopResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: controllerPkg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNextEndpoint }
     * 
     */
    public GetNextEndpoint createGetNextEndpoint() {
        return new GetNextEndpoint();
    }

    /**
     * Create an instance of {@link GetNextEndpointResponse }
     * 
     */
    public GetNextEndpointResponse createGetNextEndpointResponse() {
        return new GetNextEndpointResponse();
    }

    /**
     * Create an instance of {@link Start }
     * 
     */
    public Start createStart() {
        return new Start();
    }

    /**
     * Create an instance of {@link StartResponse }
     * 
     */
    public StartResponse createStartResponse() {
        return new StartResponse();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link StopResponse }
     * 
     */
    public StopResponse createStopResponse() {
        return new StopResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "getNextEndpoint")
    public JAXBElement<GetNextEndpoint> createGetNextEndpoint(GetNextEndpoint value) {
        return new JAXBElement<GetNextEndpoint>(_GetNextEndpoint_QNAME, GetNextEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextEndpointResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "getNextEndpointResponse")
    public JAXBElement<GetNextEndpointResponse> createGetNextEndpointResponse(GetNextEndpointResponse value) {
        return new JAXBElement<GetNextEndpointResponse>(_GetNextEndpointResponse_QNAME, GetNextEndpointResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Start }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "start")
    public JAXBElement<Start> createStart(Start value) {
        return new JAXBElement<Start>(_Start_QNAME, Start.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "startResponse")
    public JAXBElement<StartResponse> createStartResponse(StartResponse value) {
        return new JAXBElement<StartResponse>(_StartResponse_QNAME, StartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "stop")
    public JAXBElement<Stop> createStop(Stop value) {
        return new JAXBElement<Stop>(_Stop_QNAME, Stop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "stopResponse")
    public JAXBElement<StopResponse> createStopResponse(StopResponse value) {
        return new JAXBElement<StopResponse>(_StopResponse_QNAME, StopResponse.class, null, value);
    }

}
