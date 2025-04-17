package Homework2.Aufgabe3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Mail mail1 = new Mail("dwada", "wadawd", "wdwfawd", "11.02.2020");
        Mail mail2 = new Mail("dwaadwadasa", "wadbfawd", "wdafgwwd", "12.02.2020");
        Mail mail3 = new Mail("dwadaada", "waawfdyhdawd", "wwdawd", "21.02.2020");
        Mail mail4 = new Mail("dwaada", "wadawdawd", "wdaeewwd", "30.02.2020");
        Mail mail5 = new Mail("dascybghrwadwada", "wadawesfqd", "wdardgwd", "15.03.2020");
        Mail mail6 = new Mail("dwadsada", "wadadwd", "wdawd", "20.03.2021");
        Mail mail7 = new Mail("dwahtzfda", "wadbvawd", "wdawfwd", "12.11.2022");

        Inbox myInbox = new Inbox();
        myInbox.addMail(mail1);
        myInbox.addMail(mail2);
        myInbox.addMail(mail3);
        myInbox.addMail(mail4);
        myInbox.addMail(mail5);
        myInbox.addMail(mail6);
        myInbox.addMail(mail7);

        myInbox.openMail(2);
        myInbox.openMail(5);
        myInbox.openMail(10);

        System.out.println("Unread messages: " + myInbox.countUnreaad());

    }
}
