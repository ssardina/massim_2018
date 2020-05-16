package massim.protocol.scenario.city.data;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

/**
 * Holds data of an action (that was already executed).
 */
@XmlRootElement(name = "action")
@XmlAccessorType(XmlAccessType.NONE)
public class ActionData {

    @XmlAttribute
    public String type;

    @XmlAttribute
    public String result;

    @XmlElement
    public List<String> params;

    /**
     * For JAXB
     */
    private ActionData() {}

    /**
     * Constructor.
     * @param type the name/type of the action
     * @param result the result of executing the action
     * @param parameters the parameters given to the action
     */
    public ActionData(String type, List<String> parameters, String result) {
        this.type = type;
        this.result = result;
        if(parameters != null && parameters.size() > 0) this.params = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionData that = (ActionData) o;
        return type.equals(that.type) &&
                params.equals(that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, params);
    }

    /**
     * @return the type of the action
     */
    public String getType() {
        return type ==  null? "" : type;
    }

    /**
     * @return the result of the action
     */
    public String getResult() {
        return result == null? "" : result;
    }

    /**
     * @return a list of the actions parameters or null in case of 0 parameters
     */
    public List<String> getParams() {
        return params == null? new Vector<>() : params;
    }

    @Override
    public String toString() {
        return "ActionData{" +
                type + "(" + params + ") - " +
                result +
                "}";
    }
}
