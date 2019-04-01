package Errorzy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Markers {


    private List<Country> countrylist;

    public Markers() {
    }

    public Markers(List<Country> countrylist) {
        this.countrylist = countrylist;
    }

    @XmlElement(name = "country")
    public List<Country> getCountrylist() {
        return countrylist;
    }

    @Override
    public String toString() {
        return "Markers{" +
                "countrylist=" + countrylist +
                '}';
    }


}
