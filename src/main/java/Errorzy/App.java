package Errorzy;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * temp main
 *
 */
public class App {
    public static void main(String[] args) throws JAXBException {

        System.out.println("Rowery jedziemy!");


            File file = new File("src/nextbike-live_polska.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            City postCode = (City) jaxbUnmarshaller.unmarshal(file);

            System.out.println("Miasto: " + postCode.getName());
            System.out.println("Dlugosc geogr: " + postCode.getLat());
            System.out.println("Szerokosc geogr: " + postCode.getLng());
            System.out.println("Dostepne roweey: " + postCode.getAvailable_bikes());

        }
    }
