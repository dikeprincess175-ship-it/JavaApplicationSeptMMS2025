package hospital.models;

import java.time.LocalDate;

public class Doctor extends Staff {

    private String specialization;
    private String licenseNumber;

    public Doctor() {
    }

    public Doctor( String firstName, String lastName,
            char gender, LocalDate dateOfBirth, String phone,
            String email, String street, String city, String Country,
            String specialization, String license, String staffId,
            LocalDate employmentDate, double Salary,Department department) {
        
        super( firstName, lastName, gender,
                dateOfBirth, phone, email,
                street, city, Country,staffId, 
                employmentDate, Salary,department);
        
        this.specialization = specialization;
        this.licenseNumber= license;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }



}
