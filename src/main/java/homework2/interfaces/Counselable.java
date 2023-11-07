package homework2.interfaces;

import homework2.person.Student;

import java.util.List;

public interface Counselable {
    void provideCounseling(Student student);
    List<Student> getAdvisedStudents();
}
