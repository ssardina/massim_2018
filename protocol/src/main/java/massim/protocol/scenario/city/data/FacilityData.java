package massim.protocol.scenario.city.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

/**
 * Created in 2017.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public abstract class FacilityData {

    @XmlAttribute
    public String name;

    @XmlAttribute
    public double lat;

    @XmlAttribute
    public double lon;

    /**
     * Constructor for JAXB
     */
    FacilityData(){};

    FacilityData(String name, double lat, double lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacilityData that = (FacilityData) o;
        return Double.compare(that.lat, lat) == 0 &&
                Double.compare(that.lon, lon) == 0 &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lat, lon);
    }

    /**
     * @return the name of the facility
     */
    public String getName(){
        return name == null? "" : name;
    }

    /**
     * @return the latitude of this facility
     */
    public double getLat() {
        return lat;
    }

    /**
     * @return the longitude of this facility
     */
    public double getLon() {
        return lon;
    }
}
