package homework2.university;

public class UniversityConfig {
    public static final String UNIVERSITY_NAME;
    public static int totalEnrolledStudents;

    static {
        UNIVERSITY_NAME = "Global University";
        totalEnrolledStudents = 0; // Example of setting a static variable in a static block
    }

    public static void initialize() {
    }

    public static void incrementEnrolledStudents() {
        totalEnrolledStudents++;
    }
}


