package homework2;

import java.util.ArrayList;
import java.util.List;

public class Specialization {
    private String name;
    private List<Subject> subjects;

    public Specialization(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

