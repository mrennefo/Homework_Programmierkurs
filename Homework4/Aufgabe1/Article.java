package Homework4.Aufgabe1;

public abstract class Article {
    private int discountThreshold;
    private int householdLimit;

    public int getDiscountThreshold() {
        return discountThreshold;
    }

    public void setDiscountThreshold(int discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

    public int getHouseholdLimit() {
        return householdLimit;
    }

    public void setHouseholdLimit(int householdLimit) {
        this.householdLimit = householdLimit;
    }

    public abstract int getBulkDiscount();
    public abstract boolean showWarning();

}
