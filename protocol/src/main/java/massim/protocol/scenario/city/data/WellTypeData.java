package massim.protocol.scenario.city.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Holds information about a well type.
 */
@XmlRootElement(name = "wellType")
@XmlAccessorType(XmlAccessType.NONE)
public class WellTypeData {

    @XmlAttribute
    public String name;

    @XmlAttribute
    public int efficiency;

    @XmlAttribute
    public int cost;

    @XmlAttribute
    public int integrity;

    @XmlAttribute
    public int initialIntegrity;

    // For JAXB
    private WellTypeData() {}

    public WellTypeData(String name, int efficiency, int cost, int integrity, int initialIntegrity) {
        this.name = name;
        this.efficiency = efficiency;
        this.cost = cost;
        this.integrity = integrity;
        this.initialIntegrity = initialIntegrity;
    }

    public String getName() {
        return name;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public int getCost() {
        return cost;
    }

    public int getIntegrity() {
        return integrity;
    }

    public int getInitialIntegrity() {
        return initialIntegrity;
    }

    @Override
    public String toString() {
        return "WellTypeData{" +
                "name='" + name + '\'' +
                ", efficiency=" + efficiency +
                ", cost=" + cost +
                ", integrity=" + integrity +
                ", initialIntegrity=" + initialIntegrity +
                '}';
    }
}
