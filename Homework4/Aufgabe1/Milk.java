package Homework4.Aufgabe1;

public class Milk extends PopularGrocey{
    public Milk(int quantity, int discountThreshhold, int popularityLevel) {
        super(popularityLevel);
        setDiscountThreshold(discountThreshhold);
        setQuantity(quantity);
        setHouseholdLimit(20);
    }

    @Override
    public int getBulkDiscount() {
        if(getQuantity() <  getDiscountThreshold()){
            return 12;
        }
        return 0;
    }


}
