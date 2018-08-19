
package migration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wsdlName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws", propOrder = {
    "directory",
    "warName",
    "webPath",
    "wsdlName"
})
public class Ws {

    @XmlElement(namespace = "")
    protected String directory;
    @XmlElement(namespace = "")
    protected String warName;
    @XmlElement(namespace = "")
    protected String webPath;
    @XmlElement(namespace = "")
    protected String wsdlName;

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the warName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarName() {
        return warName;
    }

    /**
     * Sets the value of the warName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarName(String value) {
        this.warName = value;
    }

    /**
     * Gets the value of the webPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPath() {
        return webPath;
    }

    /**
     * Sets the value of the webPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPath(String value) {
        this.webPath = value;
    }

    /**
     * Gets the value of the wsdlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlName() {
        return wsdlName;
    }

    /**
     * Sets the value of the wsdlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlName(String value) {
        this.wsdlName = value;
    }

}
