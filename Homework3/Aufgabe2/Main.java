package Homework3.Aufgabe2;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();

        System.out.println(m1.getType());
        System.out.println(m2.getType());

        //m1.send();

        if(m1 instanceof Email){
            Email e1 =  (Email) m1;
            e1.send();
        }
    }
}
