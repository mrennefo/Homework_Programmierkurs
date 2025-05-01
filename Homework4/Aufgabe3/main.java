package Homework4.Aufgabe3;

public class main {
    public static void main(String[] args) {
        Lamp lampe = new Lamp();
        // turn on , set brightness , dim to half , print result
        lampe.turnOn ();
        lampe.setBrightness (80);
        lampe.dimToHalf ();
        System.out.println(" Brightness : " + lampe.getBrightness ());
    }
}
