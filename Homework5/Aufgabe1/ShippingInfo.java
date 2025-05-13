package Homework5.Aufgabe1;
import Homework5.Aufgabe2.*;

public class ShippingInfo {
    String city;
    int zip;
    String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }


    public ShippingInfo(String city, int zip, String country) throws MissingShippingInfoException{
        if(city.equals("") || city == null){
            throw new MissingShippingInfoException("Missing City!");
        } else {
            this.city = city;
        }
        if(zip >= 0) {
            this.zip = zip;
        } else {
            throw new MissingShippingInfoException("Zip is negative");
        }
        this.country = country;
    }
}
