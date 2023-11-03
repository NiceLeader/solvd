
package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    protected String name;  // made protected to use the modifier as required
    protected List<Subject> enrolledSubjects;  // made protected to use the modifier as required

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
        return new ArrayList<>(enrolledSubjects); // Return a copy to protect the encapsulation
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
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(enrolledSubjects, student.enrolledSubjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledSubjects);
    }
}
