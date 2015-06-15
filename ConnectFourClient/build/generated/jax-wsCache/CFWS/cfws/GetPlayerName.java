
package cfws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlayerName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPlayerName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="playerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlayerName", propOrder = {
    "playerNumber"
})
public class GetPlayerName {

    protected int playerNumber;

    /**
     * Gets the value of the playerNumber property.
     * 
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     * Sets the value of the playerNumber property.
     * 
     */
    public void setPlayerNumber(int value) {
        this.playerNumber = value;
    }

}
