package hospital;

import hospital.exception.RemoveException;

public class HospitalClient {
    private Hospital hospital;

    public HospitalClient(Hospital hospital) {
        this.hospital = hospital;
    }

    public static void main(String[] args) {
        HospitalClient hospitalClient = new HospitalClient(new Hospital("NTNU sykehus"));
        HospitalTestData.fillRegisterWithTestData(hospitalClient.hospital);

        Employee p = hospitalClient.hospital.getDepartments().get("Akutten").getEmployees().get(0);
        Employee e = new Employee("Knut","knut","knut");

        //System.out.println(e.getFirstName());
        System.out.println(hospitalClient.hospital.getDepartments().get("Akutten").getEmployees());
        try{
            hospitalClient.hospital.getDepartments().get("Akutten").remove(p);

        }catch (RemoveException re){
            re.printStackTrace();
        }
        System.out.println(hospitalClient.hospital.getDepartments().get("Akutten").getEmployees());
        try {
            hospitalClient.hospital.getDepartments().get("Akutten").remove(e);
        } catch (RemoveException re){
            re.printStackTrace();
        }
    }
}
