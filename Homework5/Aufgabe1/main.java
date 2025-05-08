package Homework5.Aufgabe1;

import Homework5.Aufgabe2.InvalidCustomerException;
import Homework5.Aufgabe2.InvalidShippingInfoException;
import Homework5.Aufgabe2.MissingShippingInfoException;

public class main {

    public static void main( String [] args) {
        try {
            ShippingInfo info = new ShippingInfo(" Munich", 80331, " Germany ");
            Profile profile = new Profile(info);
            Customer customer = new Customer(profile, 123);
            System.out.println (" Shipping to: " + customer.getProfile().getShippingInfo().getCity());
        } catch(MissingShippingInfoException msie){
            System.err.println(msie.getMessage());
        } catch (InvalidShippingInfoException isie){
            System.err.println(isie.getMessage());
        } catch (InvalidCustomerException ice) {
            System.err.println(ice.getMessage());
        }
    }
}
