package q2;

import java.util.Date;

public class SDE extends Developer {
    private Education education;
    private Level level;

    public SDE() {

    }

    public SDE(Education education, Level level) {
        this.education = education;
        this.level = level;
    }

    public SDE(String lastName, String firstName, String idNumber, Date dob, Education education, Level level) {
        super(lastName, firstName, idNumber, dob);
        this.education = education;
        this.level = level;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public double monthlyEarning() {
        double earning = STOCKS_PER_MONTH;
        if(this.level == Level.I) {
            earning += DEV_MONTHLY_SALARY;
        } else if(this.level == Level.II) {
            earning += DEV_MONTHLY_SALARY * 1.5;
        } else {
            earning += DEV_MONTHLY_SALARY * 2.0;
        }
        return earning;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Monthly Salary: " + this.monthlyEarning() + "\n";
    }
}
