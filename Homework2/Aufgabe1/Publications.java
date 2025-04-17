package Homework2.Aufgabe1;

public class Publications {
    String title;
    int year;

    public Publications(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getInfo(){
        return "The Publication " + this.title + " was published in  " + this.year;
    }
}
