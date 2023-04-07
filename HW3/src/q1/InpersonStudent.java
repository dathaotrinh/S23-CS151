package q1;

public class InpersonStudent extends Student{
    private double parkingFee;
    private int numOfClasses;

    public InpersonStudent() {
    }

    public InpersonStudent(String firstName, String lastName, Year year, int yearOfGraduation, String department, double courseFee) {
        super(firstName, lastName, year, yearOfGraduation, department, courseFee);
    }

    public InpersonStudent(String firstName, String lastName, Year year, int yearOfGraduation, String department, double courseFee, double parkingFee, int numOfClasses) {
        super(firstName, lastName, year, yearOfGraduation, department, courseFee);
        this.parkingFee = parkingFee;
        this.numOfClasses = numOfClasses;
        if(isExceedingFiveClasses()) {
            System.out.println("Student " + super.getStudentId() +" cannot take more than 5 classes.");
        } else {
            super.setSemesterFee(this.calculateSemesterFee());
        }
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    public int getNumOfClasses() {
        return numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        this.numOfClasses = numOfClasses;
        if(isExceedingFiveClasses()) {
            System.out.println("Student " + super.getStudentId() +" cannot take more than 5 classes.");
        }
    }

    @Override
    public double calculateSemesterFee() {
        double semesterFee;
        if(isExceedingFiveClasses() || this.numOfClasses <= 0) {
            semesterFee = 0.0; // number of classes exceeds 5
        } else if(this.numOfClasses > 3){
            semesterFee = (super.getCourseFee() * 3) + (super.getCourseFee() * (this.numOfClasses - 3) * 0.8) + this.parkingFee;
        } else {
            semesterFee = super.getCourseFee() * this.numOfClasses + this.parkingFee;
        }

        return semesterFee;
    }

    @Override
    public String toString() {
        return "InpersonStudent{" +
                    "firstName='" + super.getFirstName() + '\'' +
                    ", lastName='" + super.getLastName() + '\'' +
                    ", year=" + super.getYear() +
                    ", studentId='" + super.getStudentId() + '\'' +
                    ", yearOfGraduation=" + super.getYearOfGraduation() +
                    ", department='" + super.getDepartment() + '\'' +
                    ", courseFee=" + super.getCourseFee() +
                    ", semesterFee=" + super.getSemesterFee() +
                    ", parkingFee=" + this.parkingFee +
                    ", numOfClasses=" + this.numOfClasses +
                    '}';

    }

    @Override
    public boolean isExceedingFiveClasses() {
        return this.numOfClasses > 5;
    }
}
