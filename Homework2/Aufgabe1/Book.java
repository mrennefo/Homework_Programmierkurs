package Homework2.Aufgabe1;

public class Book extends Publications{
    private String author;

    public Book(String title, int year, String author){
        super(title, year);
        this.author = author;
    }

    @Override public String getInfo(){
        return super.getInfo() + " by " + author;
    }
}
