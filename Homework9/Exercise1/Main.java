package Homework9.Exercise1;

public class Main {
    public static void main(String[] args) {
        CoursePhase ongoing = CoursePhase.ONGOING;
        CoursePhase finished = CoursePhase.FINISHED;
        CoursePhase notStarted = CoursePhase.NOT_STARTED;

        System.out.println(ongoing.getMessage());
        System.out.println(finished.getMessage());
        System.out.println(notStarted.getMessage());
    }
}
