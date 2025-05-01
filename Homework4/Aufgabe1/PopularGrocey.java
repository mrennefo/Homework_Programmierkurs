package Homework4.Aufgabe1;

public abstract class PopularGrocey extends GroceryItem {
    private int popularityLevel;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PopularGrocey(int popularityLevel) {
        setPopular(true);
        this.popularityLevel = popularityLevel;
    }

    @Override
    public boolean showWarning(){
        if(quantity > getHouseholdLimit()){
            return true;
        }
        return false;
    }
}
