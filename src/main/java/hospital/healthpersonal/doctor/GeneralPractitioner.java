package hospital.healthpersonal.doctor;

import hospital.Patient;
import hospital.healthpersonal.doctor.Doctor;

public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnose(Patient patient, String diagnosis) {

    }
}
