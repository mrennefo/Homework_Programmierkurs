package Homework3.Aufgabe1.AccountPackage;

public class AccountManager {
    public static void main(String[] args) {
        Account account = new Account("Marc", 2000, 12345, "Nothing");
        System.out.println(account.internalNote);
        System.out.println(account.pin);
        System.out.println(account.owner);
        //System.out.println(account.balance);
    }
}
