package Homework2.Aufgabe3;
public class Mail {
    String sender;
    String subject;
    String message;
    String datetime;
    boolean read = false;

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getMessage() {
        return message;
    }

    public boolean isRead() {
        return read;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public Mail(String sender, String subject, String message, String datetime) {
        this.sender = sender;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;

    }

    public void markAsRead() {
        this.read = true;
    }

    public void printInfo(){
        System.out.println(subject + " from " + sender + " on " + datetime +  ": " + message);
    }
}
