
package logic.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.12
 * Wed Jul 26 15:12:40 CDT 2017
 * Generated source version: 3.1.12
 */

@XmlRootElement(name = "moveWSResponse", namespace = "http://logic/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveWSResponse", namespace = "http://logic/")

public class MoveWSResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}

