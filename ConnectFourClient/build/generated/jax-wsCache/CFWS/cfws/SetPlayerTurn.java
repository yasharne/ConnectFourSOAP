
package cfws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlayerTurn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlayerTurn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="playerTurn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlayerTurn", propOrder = {
    "playerTurn"
})
public class SetPlayerTurn {

    protected int playerTurn;

    /**
     * Gets the value of the playerTurn property.
     * 
     */
    public int getPlayerTurn() {
        return playerTurn;
    }

    /**
     * Sets the value of the playerTurn property.
     * 
     */
    public void setPlayerTurn(int value) {
        this.playerTurn = value;
    }

}
