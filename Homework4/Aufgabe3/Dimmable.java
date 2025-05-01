package Homework4.Aufgabe3;

public interface Dimmable {
    final int MAX_BRIGHTNESS = 100;
    public void setBrightness(int level);
    public int getBrightness();
    public void dimToHalf();
}
