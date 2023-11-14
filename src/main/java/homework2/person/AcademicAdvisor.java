package homework2.person;

import homework2.Subject;
import homework2.interfaces.Counselable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AcademicAdvisor extends Person implements Counselable {
    private final List<Student> advisedStudents;

    public AcademicAdvisor() {
        this.advisedStudents = new ArrayList<>();
    }

    public void printAdvisedStudents() {
        for (Student student : advisedStudents) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "AcademicAdvisor{" +
                "name='" + name + '\'' +
                ", advisedStudents=" + advisedStudents +
                '}';
    }

    @Override
    public void provideCounseling(Student student) {
        this.advisedStudents.add(student);
    }

    @Override
    public List<Student> getAdvisedStudents() {
        return new ArrayList<>(this.advisedStudents);
    }

    @Override
    public String getRole() {
        return "Academic Advisor";
    }

    @Override
    public void enrollInSubject(Subject subject) {

    }

    @Override
    public List<Subject> getEnrolledSubjects() {
        return null;
    }

    @Override
    public void addGrade(double grade) {

    }

    @Override
    public List<Double> getGrades() {
        return null;
    }

    @Override
    public void processPayment(BigDecimal amount) {

    }

    @Override
    public BigDecimal getBalance() {
        return null;
    }
}

