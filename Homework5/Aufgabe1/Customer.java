package Homework5.Aufgabe1;
import Homework5.Aufgabe2.*;

public class Customer {
    Profile profile;
    int id;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Customer(Profile profile, int id) throws InvalidCustomerException {
        if(profile == null){
            throw new InvalidCustomerException("Profile is null");
        } else {
            this.profile = profile;
        }
        if(id < 0){
            throw new InvalidCustomerException("ID is negative");
        } else {
            this.id = id;
        }
    }
}
