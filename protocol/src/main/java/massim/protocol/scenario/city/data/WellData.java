package massim.protocol.scenario.city.data;

import javax.xml.bind.annotation.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WellData wellData = (WellData) o;
        return integrity == wellData.integrity &&
                team.equals(wellData.team) &&
                type.equals(wellData.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, type, integrity);
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

    @Override
    public String toString() {
        return "WellData{" +
                "name='" + name + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", team='" + team + '\'' +
                ", type='" + type + '\'' +
                ", integrity=" + integrity +
                '}';
    }
}
