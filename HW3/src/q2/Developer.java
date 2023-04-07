package q2;

import java.util.Date;

public abstract class Developer  implements DeveloperInfo {
    private String lastName;
    private String firstName;
    private String idNumber;
    private Date dob;

    public Developer() {
    }

    public Developer(String lastName, String firstName, String idNumber, Date dob) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.dob = dob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public abstract double monthlyEarning();

    @Override
    public String toString() {
        return "ID Employee number : " + this.idNumber + "\n" +
                "Employee name: " + this.firstName + " " + this.lastName + "\n" +
                "Birth date: " + this.dob + "\n";
    }
}
