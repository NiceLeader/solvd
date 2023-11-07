package homework2;

import homework2.university.UniversityConfig;

public class Subject {
    private String name;
    private int credits;


    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCreditPoints() {
        return credits * 10;
    }

    public int getEnrolledStudentCount() {
        return UniversityConfig.totalEnrolledStudents;
    }
}
