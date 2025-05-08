package Homework5.Aufgabe1;
import Homework5.Aufgabe2.*;

public class Profile {
    ShippingInfo shippingInfo;

    public ShippingInfo getShippingInfo(){
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public Profile(ShippingInfo shippingInfo)  throws InvalidShippingInfoException{
        if(shippingInfo == null){
            throw new InvalidShippingInfoException("Shipping Info is null");
        } else {
            this.shippingInfo = shippingInfo;
        }
    }
}
