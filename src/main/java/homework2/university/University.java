
package homework2.university;

import homework2.Faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    protected String name;
    protected String address;
    private List<Faculty> faculties;

    public University(String name, String address) {
        this.name = name;
        this.address = address;
        this.faculties = new ArrayList<>();
    }

    public University() {

    }


    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Faculty> getFaculties() {
        return new ArrayList<>(faculties); // Return a copy to protect the encapsulation
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", faculties=" + faculties +
                '}';
    }

    public void printAllFaculties() {
        System.out.println("Faculties at " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println(faculty.getName());

        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, faculties);
    }
}
