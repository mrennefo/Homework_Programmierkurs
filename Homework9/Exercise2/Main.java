package Homework9.Exercise2;

public class Main {
    public static void main(String[] args) {
        StudentFormatter format1 = (s) -> {
            String rueck = "Student: "+ s.getName() + ", Year: " + s.getYear();
            return rueck;
        };
        StudentFormatter format2 = (s) -> {
            String rueck = s.getName() + " studies " + s.getMajor() + " in Year " + s.getYear();
            return rueck;
        };

        Student s1 = new Student("Alice", 2, "Physics");
        Student s2 = new Student("Bob", 3, "Maths");

        System.out.println(format1.format(s1));
        System.out.println(format2.format(s2));
    }
}
