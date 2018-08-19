
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
 *         &lt;element name="tomcatManagerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
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
    "tomcatManagerURL"
})
@XmlRootElement(name = "undeploy")
public class Undeploy {

    protected Ws ws;
    protected String tomcatManagerURL;

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
     * Gets the value of the tomcatManagerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTomcatManagerURL() {
        return tomcatManagerURL;
    }

    /**
     * Sets the value of the tomcatManagerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTomcatManagerURL(String value) {
        this.tomcatManagerURL = value;
    }

}
