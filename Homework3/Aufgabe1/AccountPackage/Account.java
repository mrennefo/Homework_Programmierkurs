package Homework3.Aufgabe1.AccountPackage;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;
    public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }
    public double getBalance() {
        return balance;
    }

    public void changePin(int pin) {
        if(this.pin == pin){
            this.pin = pin;
        } else{
            System.out.println("The PIN is incorrect please enter the valid PIN");
        }
    }



}
