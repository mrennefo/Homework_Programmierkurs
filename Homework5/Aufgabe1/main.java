package Homework5.Aufgabe1;

import Homework5.Aufgabe2.InvalidCustomerException;
import Homework5.Aufgabe2.InvalidShippingInfoException;
import Homework5.Aufgabe2.MissingShippingInfoException;

public class main {

    public static void main( String [] args) {

        try { //Try with ressources schließt automatisch die verwendete Datei nach der Ausführrung des try block alternative mit finally und dann auto closable
            //Dependency Injection ist verletzt, wenn eine Klasse selbst Objekte erzeugt, die es für die weitere Funktion braucht bspw bei Profile
            ShippingInfo info = new ShippingInfo(" Munich", -1, " Germany ");
            Profile profile = new Profile(info);
            Customer customer = new Customer(profile, 123);
            System.out.println (" Shipping to: " + customer.getProfile().getShippingInfo().getCity()); //Die Verkettung bricht die law von demeter
        } catch(MissingShippingInfoException msie){
            System.err.println(msie.getMessage());
        } catch (InvalidShippingInfoException isie){
            System.err.println(isie.getMessage());
        } catch (InvalidCustomerException ice) {
            System.err.println(ice.getMessage());
        }
    }
}
