package homework2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Subject> enrolledSubjects;

    public Student(String name) {
        this.name = name;
        this.enrolledSubjects = new ArrayList<>();
    }

    public void enrollInSubject(Subject subject) {
        enrolledSubjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }
}
