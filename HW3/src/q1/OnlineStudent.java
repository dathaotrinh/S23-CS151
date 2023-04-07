package q1;

public class OnlineStudent extends Student{
    private int numOfOnlineClasses;
    private int numOfInpersonClasses;

    public OnlineStudent() {
    }

    public OnlineStudent(String firstName, String lastName, Year year, int yearOfGraduation, String department, double courseFee) {
        super(firstName, lastName, year, yearOfGraduation, department, courseFee);
    }

    public OnlineStudent(String firstName, String lastName, Year year, int yearOfGraduation, String department, double courseFee, int numOfOnlineClasses, int numOfInpersonClasses) {
        super(firstName, lastName, year, yearOfGraduation, department, courseFee);
        this.numOfOnlineClasses = numOfOnlineClasses;
        this.numOfInpersonClasses = numOfInpersonClasses;
        if(isExceedingFiveClasses()) {
            System.out.println("Student " + this.getStudentId() +" cannot take more than 5 classes.");
        } else {
            super.setSemesterFee(this.calculateSemesterFee());
        }
    }

    public int getNumOfOnlineClasses() {
        return numOfOnlineClasses;
    }

    public void setNumOfOnlineClasses(int numOfOnlineClasses) {
        this.numOfOnlineClasses = numOfOnlineClasses;
        if(isExceedingFiveClasses()) {
            System.out.println("Student " + super.getStudentId() +" cannot take more than 5 classes.");
        }
    }

    public int getNumOfInpersonClasses() {
        return numOfInpersonClasses;
    }

    public void setNumOfInpersonClasses(int numOfInpersonClasses) {
        this.numOfInpersonClasses = numOfInpersonClasses;
        if(isExceedingFiveClasses()) {
            System.out.println("Student " + super.getStudentId() +" cannot take more than 5 classes.");
        }
    }

    @Override
    public String toString() {
        return "OnlineStudent{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", year=" + super.getYear() +
                ", studentId='" + super.getStudentId() + '\'' +
                ", yearOfGraduation=" + super.getYearOfGraduation() +
                ", department='" + super.getDepartment() + '\'' +
                ", courseFee=" + super.getCourseFee() +
                ", semesterFee=" + super.getSemesterFee() +
                ", numOfOnlineClasses=" + this.numOfOnlineClasses +
                ", numOfInpersonClasses=" + this.numOfInpersonClasses +
                '}';

    }

    @Override
    public double calculateSemesterFee() {
        if(isExceedingFiveClasses()) {
            return 0.0;
        }
        return this.numOfInpersonClasses * super.getCourseFee() + this.numOfOnlineClasses * 1.2 * super.getCourseFee();
    }

    @Override
    public boolean isExceedingFiveClasses() {
        if(this.numOfInpersonClasses + this.numOfOnlineClasses > 5) return true;
        return false;
    }
}
