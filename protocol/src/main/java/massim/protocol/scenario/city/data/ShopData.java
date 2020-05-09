package massim.protocol.scenario.city.data;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.Vector;

/**
 * Holds data of a shop facility.
 */
@XmlRootElement(name = "shop")
@XmlAccessorType(XmlAccessType.NONE)
public class ShopData extends FacilityData {

    @XmlElement(name = "item")
    public List<StockData> stocks = new Vector<>();

    /**
     * For jaxb
     */
    private ShopData() {}

    /**
     * Constructor.
     * @param name name of the shop
     * @param lat latitude
     * @param lon longitude
     * @param stocks stock of items
     */
    public ShopData(String name, double lat, double lon, List<StockData> stocks) {

        super(name, lat, lon);
        this.stocks = stocks;
    }


    /**
     * Constructor.
     * @param name name of the shop
     * @param lat latitude
     * @param lon longitude
     */
    public ShopData(String name, double lat, double lon) {
        this(name, lat, lon, null);
    }
}
