package Homework4.Aufgabe3;

public class Lamp implements Switchable, Dimmable {
    int brightness;
    boolean isOn;

    @Override
    public void turnOn(){
        isOn = true;
    }

    @Override
    public void turnOff(){
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setBrightness(int level) {
        if(level > 0 && level < MAX_BRIGHTNESS && isOn){
            brightness = level;
        }
    }

    @Override
    public void dimToHalf(){
        brightness = MAX_BRIGHTNESS / 2;
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}
