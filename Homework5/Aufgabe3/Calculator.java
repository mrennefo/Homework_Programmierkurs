package Homework5.Aufgabe3;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Calculator.divideWithoutException(3, 0));
        try {
            System.out.println(Calculator.divideWithException(3, 0));
        } catch (ArithmeticException e) {
            System.err.println("You can't divide by zero");
        }
    }

    public static double divideWithoutException(double a, double b) {
        if(b != 0) {
            return a / b;
        } else {
            return -1;
        }
    }

    public static double divideWithException(double a, double b) throws ArithmeticException {
        if(b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException();
        }
    }
}
