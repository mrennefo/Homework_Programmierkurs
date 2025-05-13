package Homework5.Aufgabe3;

public class Calculator {
    public static void main(String[] args) {
        Calculator.divideWithExceptionHandling(3, 0);

        try {
            System.out.println(Calculator.divideWithoutExceptionHandling(3, 0));
        } catch (ArithmeticException e) {
            System.err.println("You can't divide by zero");
        }
    }

    public static double divideWithExceptionHandling(double a, double b) {
        try{
            return a/b;
        } catch(ArithmeticException e) {
            System.err.println("You can't divide by zero");
            return -1;
        }
    }

    public static double divideWithoutExceptionHandling(double a, double b) throws ArithmeticException {
        if(b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException();
        }
    }
}
