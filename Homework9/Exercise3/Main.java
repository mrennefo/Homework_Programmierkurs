package Homework9.Exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        Movie harryPotter = new Movie("Harry Potter", 1980, 8.0);
        Movie starWars = new Movie("Star Wars", 1990, 9.5);
        Movie tributeVonPanem = new Movie("Tribute von Panem", 1988, 5.8);
        Movie herrDerRinge = new Movie("Herr der Ringe", 1999, 7.1);
        Movie spiderman = new Movie("Spiderman", 2000, 9.2);
        movies.add(harryPotter);
        movies.add(starWars);
        movies.add(tributeVonPanem);
        movies.add(herrDerRinge);
        movies.add(spiderman);


        movies.stream().filter(m -> m.getRating() >= 8.5)
                .sorted(Comparator.comparing(Movie::getYear))
                .sorted(Comparator.comparing(Movie::getRating).reversed())
                .forEach(m -> System.out.println(m.toString()));
    }
}
