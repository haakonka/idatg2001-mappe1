package hospital;
import hospital.exception.RemoveException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department department = new Department("Test");
    Employee employee = new Employee("Kåre","Karlsen","13");
    Employee employee2 = new Employee("Kari","Karlsen","14");
    Patient patient = new Patient("Karl","Kul","11");
    Patient patient2 = new Patient("Karen","Kul","11");

    @BeforeEach
    void beforeTests() {
        department.getEmployees().add(employee);
        department.getEmployees().add(employee2);
        department.getPatients().add(patient);
    }

    @Test
    void remove() {
        assertEquals(2,department.getEmployees().size());
        try {
            department.remove(employee);
            department.remove(employee2);
        } catch (RemoveException e) {
            e.printStackTrace();
        }
        assertEquals(0,department.getEmployees().size());
    }

    @Test
    void remove2()  {
        assertNotEquals(0,department.getPatients().size());
        try {
            department.remove(patient2);
        } catch (RemoveException e) {
            e.printStackTrace();
        }
        assertEquals(1,department.getPatients().size());

    }
}