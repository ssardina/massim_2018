package massim.protocol.scenario.city.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * Stores an amount for an item, e.g. to store crafting requirements.
 */
@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.NONE)
public class ItemAmountData {

    @XmlAttribute
    public String name;

    @XmlAttribute
    public int amount;

    /**
     * For JAXB
     */
    private ItemAmountData(){}

    /**
     * Constructor.
     * @param name name of the item
     * @param amount how many items to represent
     */
    public ItemAmountData(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAmountData that = (ItemAmountData) o;
        return amount == that.amount &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    /**
     * @return the item's name
     */
    public String getName() {
        return name == null? "" : name;
    }

    /**
     * @return the item amount
     */
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "ItemAmountData{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}