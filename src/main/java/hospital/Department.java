package hospital;

import hospital.exception.RemoveException;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    ArrayList<Patient> patientArrayList = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public ArrayList<Employee> getEmployees() {
        return employeeArrayList;
    }
    public void addEmployee(Employee employee){
        employeeArrayList.add(employee);
    }
    public ArrayList<Patient> getPatients(){
        return patientArrayList;
    }

    public void addPatient(Patient patient){
        patientArrayList.add(patient);
    }

    public void remove(Person person) throws RemoveException {
        if (person instanceof Patient){
            if (patientArrayList.contains(person)){
            patientArrayList.remove(person);}
            else {
                throw new RemoveException("Failed to remove patient");
            }
        }
        else if(person instanceof Employee){
            if (employeeArrayList.contains(person)){
            employeeArrayList.remove(person);}
            else {
                throw new RemoveException("Failed to remove employee");
            }
        }
    }

}
