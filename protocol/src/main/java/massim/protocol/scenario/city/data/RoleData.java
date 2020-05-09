package massim.protocol.scenario.city.data;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Holds data of a role for serialization.
 */
@XmlRootElement(name = "role")
@XmlAccessorType(XmlAccessType.NONE)
public class RoleData {

    @XmlAttribute
    public String name;

    @XmlAttribute
    public int baseSpeed;

    @XmlAttribute
    public int maxSpeed;

    @XmlAttribute
    public int baseBattery;

    @XmlAttribute
    public int maxBattery;

    @XmlAttribute
    public int baseLoad;

    @XmlAttribute
    public int maxLoad;

    @XmlAttribute
    public int baseSkill;

    @XmlAttribute
    public int maxSkill;

    @XmlAttribute
    public int baseVision;

    @XmlAttribute
    public int maxVision;

    /**
     * For JAXB
     */
    private RoleData(){}

    public RoleData(String name, int baseSpeed, int maxSpeed, int baseBattery, int maxBattery, int baseLoad,
                    int maxLoad, int baseSkill, int maxSkill, int baseVision, int maxVision) {
        this.name = name;
        this.baseSpeed = baseSpeed;
        this.maxSpeed = maxSpeed;
        this.baseBattery = baseBattery;
        this.maxBattery = maxBattery;
        this.baseLoad = baseLoad;
        this.maxLoad = maxLoad;
        this.baseSkill = baseSkill;
        this.maxSkill = maxSkill;
        this.baseVision = baseVision;
        this.maxVision = maxVision;
    }

    public String getName() {
        return name;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getBaseBattery() {
        return baseBattery;
    }

    public int getMaxBattery() {
        return maxBattery;
    }

    public int getBaseLoad() {
        return baseLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getBaseSkill() {
        return baseSkill;
    }

    public int getMaxSkill() {
        return maxSkill;
    }

    public int getBaseVision() {
        return baseVision;
    }

    public int getMaxVision() {
        return maxVision;
    }
}
