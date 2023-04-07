package q2;

import java.util.Date;

public class Intern extends Developer {
    private double hourlyRate;

    public Intern() {

    }

    public Intern(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Intern(String lastName, String firstName, String idNumber, Date dob, double hourlyRate) {
        super(lastName, firstName, idNumber, dob);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlyEarning() {
        return this.hourlyRate * INTERN_MONTHLY_HOURS_WORKED;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Monthly Salary: " + this.monthlyEarning() + "\n";
    }
}
