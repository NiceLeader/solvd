package homework2;
import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private String address;
    private List<Faculty> faculties;

    public University(String name, String address) {
        this.name = name;
        this.address = address;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Getters and Setters
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
        return faculties;
    }
}
