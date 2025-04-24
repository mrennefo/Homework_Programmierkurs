package Homework3.Aufgabe1.ExternalAuditPackage;

import Homework3.Aufgabe1.AccountPackage.Account;

public class CompanyAccount extends Account {
    public CompanyAccount(String owner, double balance, int pin, String internalNote) {
        super(owner, balance, pin, internalNote);
    }

    public static void main(String[] args) {
        CompanyAccount account = new CompanyAccount("Marc", 2000, 12345, "Nothing");
        //System.out.println(account.internalNote);
        System.out.println(account.pin);
        System.out.println(account.owner);
        //System.out.println(account.balance);
    }
}
