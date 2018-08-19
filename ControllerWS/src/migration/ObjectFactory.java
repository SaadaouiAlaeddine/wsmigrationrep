
package migration;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the logic package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: logic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DuplicateWS }
     * 
     */
    public DuplicateWS createDuplicateWS() {
        return new DuplicateWS();
    }

    /**
     * Create an instance of {@link Ws }
     * 
     */
    public Ws createWs() {
        return new Ws();
    }

    /**
     * Create an instance of {@link DuplicateWSResponse }
     * 
     */
    public DuplicateWSResponse createDuplicateWSResponse() {
        return new DuplicateWSResponse();
    }

    /**
     * Create an instance of {@link MoveWS }
     * 
     */
    public MoveWS createMoveWS() {
        return new MoveWS();
    }

    /**
     * Create an instance of {@link MoveWSResponse }
     * 
     */
    public MoveWSResponse createMoveWSResponse() {
        return new MoveWSResponse();
    }

    /**
     * Create an instance of {@link Undeploy }
     * 
     */
    public Undeploy createUndeploy() {
        return new Undeploy();
    }

    /**
     * Create an instance of {@link UndeployResponse }
     * 
     */
    public UndeployResponse createUndeployResponse() {
        return new UndeployResponse();
    }

}
