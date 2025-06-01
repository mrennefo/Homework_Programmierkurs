package Homework8;

public class Rectangle extends Shape{
    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "width=" + width + ", length=" + length;
    }
}
