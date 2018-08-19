
package controllerPkg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="webContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stop", propOrder = {
    "webContext"
})
public class Stop {

    protected String webContext;

    /**
     * Gets the value of the webContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebContext() {
        return webContext;
    }

    /**
     * Sets the value of the webContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebContext(String value) {
        this.webContext = value;
    }

}
