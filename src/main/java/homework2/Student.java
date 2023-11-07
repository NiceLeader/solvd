
package homework2;

import homework2.interfaces.Enrollable;
import homework2.interfaces.Evaluatable;
import homework2.interfaces.Financeable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student extends Person implements Enrollable, Evaluatable, Financeable {

    protected List<Subject> enrolledSubjects;
    private List<Double> grades;
    private Faculty faculty;

    public Student(String name) {
        super(name);
        this.enrolledSubjects = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void enrollInSubject(Subject subject) {
        enrolledSubjects.add(subject);
    }

    public void calculateAndPrintGPA() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        double gpa = sum / grades.size();
        System.out.println("GPA: " + gpa);
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return this.faculty;
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

    @Override
    public void processPayment(BigDecimal amount) {

    }

    @Override
    public BigDecimal getBalance() {
        return null;
    }

    @Override
    public void addGrade(double grade) {
        grades.add(grade);
    }

    @Override
    public List<Double> getGrades() {
        return Collections.unmodifiableList(grades);
    }

}
