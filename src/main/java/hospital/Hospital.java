package hospital;

import java.util.HashMap;

public class Hospital {
    private final String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    HashMap<String,Department> departmentHashMap= new HashMap<>();

    public HashMap<String, Department> getDepartments(){
        return departmentHashMap;
    }

    public void addDepartment(Department department){
        departmentHashMap.put(department.getDepartmentName(), department);
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                '}';
    }

}
