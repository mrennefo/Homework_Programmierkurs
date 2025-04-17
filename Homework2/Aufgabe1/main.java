package Homework2.Aufgabe1;

public class main {
    public static void main(String[] args) {
        Textbook myTextbook = new Textbook("Data Structures", 2020, "Jane Doe", "Computer Sience");
        System.out.println(myTextbook.getInfo());

        Publications myPublication = new Publications("Algorithms", 2019);
        System.out.println(myPublication.getInfo());

        Book myBook = new Book("Software Engineering", 2022, "Marc Rennefort");
        System.out.println(myBook.getInfo());
    }
}
