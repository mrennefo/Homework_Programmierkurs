package Homework4.Aufgabe1;

public abstract class GroceryItem extends Article {
    private boolean isPopular;

    public void setPopular(boolean popular) {
        isPopular = popular;
    }

    public boolean isPopular() {
        return isPopular;
    }
}
