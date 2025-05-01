package Homework4.Aufgabe1;

public class Flour extends PopularGrocey{
    public Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        setQuantity(quantity);
        setDiscountThreshold(discountThreshold);
        setHouseholdLimit(15);
    }

    @Override
    public int getBulkDiscount(){
        if(getQuantity() > getDiscountThreshold()){
            return 5;
        }
        return 0;
    }
}
