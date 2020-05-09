package massim.protocol.scenario.city.data;

import javax.xml.bind.annotation.*;

/**
 * Holds JAXB annotated data of a well facility.
 */
@XmlRootElement(name = "well")
@XmlAccessorType(XmlAccessType.NONE)
public class WellData extends FacilityData {

    @XmlAttribute
    public String team;

    @XmlAttribute
    public String type;

    @XmlAttribute
    public int integrity;

    /**
     * For JAXB
     */
    private WellData() {
        super();
    }

    public WellData(String name, double lat, double lon, String team, String typeName, int integrity) {
        super(name, lat, lon);
        this.team = team;
        this.type = typeName;
        this.integrity = integrity;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getType() {
        return type;
    }

    public int getIntegrity() {
        return integrity;
    }
}
