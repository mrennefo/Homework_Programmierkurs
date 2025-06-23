package Homework9.Exercise1;

public enum CoursePhase {
    NOT_STARTED("Course not started yet"),
    ONGOING("Course in Progress"),
    FINISHED("Course has ended");

    private String message;

    CoursePhase(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
