package hospital.healthpersonal.doctor;

import hospital.Employee;
import hospital.Patient;

public abstract class Doctor extends Employee {
    protected Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public abstract void setDiagnose(Patient patient,String diagnosis);
}
