package Homework2.Aufgabe3;
import java.util.ArrayList;

public class Inbox {
    ArrayList<Mail> mails = new ArrayList<>();
    public Inbox() {

    }

    public Inbox(ArrayList<Mail> mails) {
        this.mails = mails;
    }

    public void printAllMailHeaders(){
        for(Mail mail : mails){
            System.out.println(mail.isRead() + " | " + mail.getSubject() + " | " + mail.getSender() + " | " + mail.getDatetime());
        }
    }

    public void openMail(int index){
        if(index >= 0 && index < mails.size()) {
            Mail mail = mails.get(index);
            mail.markAsRead();
            mail.printInfo();
        }
    }


    public int countUnreaad(){
        int counter = 0;
        for(Mail mail : mails){
            if(!mail.isRead()){
                counter++;
            }
        }
        return counter;
    }


    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public ArrayList<Mail> getMails() {
        return mails;
    }

    public void setMails(ArrayList<Mail> mails) {
        this.mails = mails;
    }
}
