
package migration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ws" type="{http://logic/}ws" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="sourceManagerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="destinationManagerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="destinationWSDLAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ws",
    "sourceManagerURL",
    "destinationManagerURL",
    "destinationWSDLAddress"
})
@XmlRootElement(name = "moveWS")
public class MoveWS {

    protected Ws ws;
    protected String sourceManagerURL;
    protected String destinationManagerURL;
    protected String destinationWSDLAddress;

    /**
     * Gets the value of the ws property.
     * 
     * @return
     *     possible object is
     *     {@link Ws }
     *     
     */
    public Ws getWs() {
        return ws;
    }

    /**
     * Sets the value of the ws property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ws }
     *     
     */
    public void setWs(Ws value) {
        this.ws = value;
    }

    /**
     * Gets the value of the sourceManagerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceManagerURL() {
        return sourceManagerURL;
    }

    /**
     * Sets the value of the sourceManagerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceManagerURL(String value) {
        this.sourceManagerURL = value;
    }

    /**
     * Gets the value of the destinationManagerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationManagerURL() {
        return destinationManagerURL;
    }

    /**
     * Sets the value of the destinationManagerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationManagerURL(String value) {
        this.destinationManagerURL = value;
    }

    /**
     * Gets the value of the destinationWSDLAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationWSDLAddress() {
        return destinationWSDLAddress;
    }

    /**
     * Sets the value of the destinationWSDLAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationWSDLAddress(String value) {
        this.destinationWSDLAddress = value;
    }

}
