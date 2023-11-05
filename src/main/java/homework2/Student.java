
package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends Person {
    protected List<Subject> enrolledSubjects;

    public Student(String name) {
        super(name);
        this.enrolledSubjects = new ArrayList<>();
    }

    public void enrollInSubject(Subject subject) {
        enrolledSubjects.add(subject);
    }

    public List<Subject> getEnrolledSubjects() {
        return new ArrayList<>(enrolledSubjects);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
        ", enrolledSubjects=" + enrolledSubjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(enrolledSubjects, student.enrolledSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), enrolledSubjects);
    }
}
