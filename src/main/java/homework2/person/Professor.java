package homework2.person;

import homework2.Subject;
import homework2.interfaces.Teachable;
import homework2.person.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person implements Teachable {
    private final List<Subject> taughtSubjects;

    public Professor(String name) {
        super(name);
        this.taughtSubjects = new ArrayList<>();
    }

    public void printSubjectsTaught() {
        for (Subject subject : taughtSubjects) {
            System.out.println(subject);
        }
    }

    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", taughtSubjects=" + taughtSubjects +
                '}';
    }

    @Override
    public void teachSubject(Subject subject) {
        this.taughtSubjects.add(subject);
    }

    @Override
    public List<Subject> getTaughtSubjects() {
        return new ArrayList<>(this.taughtSubjects);
    }

    @Override
    public String getRole() {
        return "Professor";
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
