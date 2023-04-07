package q2;

import java.util.Date;

public class Partime extends Intern {
    private double hoursWorkedPerWeek;

    public Partime() {

    }

    public Partime(double hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public Partime(double hourlyRate, double hoursWorkedPerWeek) {
        super(hourlyRate);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public Partime(String lastName, String firstName, String idNumber, Date dob, double hourlyRate, double hoursWorkedPerWeek) {
        super(lastName, firstName, idNumber, dob, hourlyRate);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public double getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(double hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public double monthlyEarning() {
        return this.hoursWorkedPerWeek * 4 * super.getHourlyRate();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Hours worked per month: " + this.hoursWorkedPerWeek + "\n";
    }
}
