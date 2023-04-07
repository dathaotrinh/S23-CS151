package q1;

public class StudentTester {
    public static void main(String[] args) {
        /* Test InpersonStudent */
        Student s1 = new InpersonStudent();
        s1.setFirstName("Truffle");
        s1.setLastName("Le");
        s1.setStudentId(s1.generateId());
        s1.setYear(Year.SOPHOMORE);
        s1.setYearOfGraduation(2025);
        s1.setDepartment("Art");
        s1.setCourseFee(400.0);
        ((InpersonStudent) s1).setParkingFee(150.0);
        ((InpersonStudent) s1).setNumOfClasses(5);
        s1.setSemesterFee(s1.calculateSemesterFee());
        System.out.println(s1);

        Student s2 = new InpersonStudent("Truffle", "Le", Year.SOPHOMORE, 2025, "Art", 400);
        s2.setStudentId(s2.generateId());
        ((InpersonStudent) s2).setParkingFee(150.0);
        ((InpersonStudent) s2).setNumOfClasses(5);
        s2.setSemesterFee(s2.calculateSemesterFee());
        System.out.println(s2);

        Student s3 = new InpersonStudent("Truffle", "Le", Year.SOPHOMORE, 2025, "Art", 400, 150.0, 5);
        System.out.println(s3);

        System.out.println();

        /* Test OnlineStudent */

        Student s4 = new OnlineStudent();
        s4.setFirstName("Mocha");
        s4.setLastName("Tran");
        s4.setStudentId(s4.generateId());
        s4.setYear(Year.SOPHOMORE);
        s4.setYearOfGraduation(2025);
        s4.setDepartment("CS");
        s4.setCourseFee(400.0);
        ((OnlineStudent) s4).setNumOfInpersonClasses(3);
        ((OnlineStudent) s4).setNumOfOnlineClasses(2);
        s4.setSemesterFee(s4.calculateSemesterFee());
        System.out.println(s4);

        Student s5 = new OnlineStudent("Mocha", "Tran", Year.SOPHOMORE, 2025, "CS", 400.0);
        ((OnlineStudent) s5).setNumOfInpersonClasses(3);
        ((OnlineStudent) s5).setNumOfOnlineClasses(2);
        s5.setSemesterFee(s5.calculateSemesterFee());
        System.out.println(s5);

        Student s6 = new OnlineStudent("Mocha", "Tran", Year.SOPHOMORE, 2025, "CS", 400.0, 2, 3);
        System.out.println(s6);

        System.out.println();

        /* Test OnlineStudents registered for more than 5 classes*/

        Student s7 = new OnlineStudent("Mocha", "Tran", Year.SOPHOMORE, 2025, "CS", 400.0);
        s7.setFirstName("Mocha");
        s7.setLastName("Tran");
        s7.setStudentId(s7.generateId());
        s7.setYear(Year.SOPHOMORE);
        s7.setYearOfGraduation(2025);
        s7.setDepartment("CS");
        s7.setCourseFee(400.0);
        ((OnlineStudent) s7).setNumOfInpersonClasses(3);
        ((OnlineStudent) s7).setNumOfOnlineClasses(3);
        s7.setSemesterFee(s7.calculateSemesterFee());
        System.out.println(s7);

        Student s8 = new OnlineStudent("Mocha", "Tran", Year.SOPHOMORE, 2025, "CS", 400.0, 3, 3);
        System.out.println(s8);


        System.out.println();

        /* Test InpersonStudent registered for more than 5 classes*/

        Student s9 = new InpersonStudent();
        s9.setFirstName("Truffle");
        s9.setLastName("Le");
        s9.setStudentId(s1.generateId());
        s9.setYear(Year.SOPHOMORE);
        s9.setYearOfGraduation(2025);
        s9.setDepartment("Art");
        s9.setCourseFee(400.0);
        ((InpersonStudent) s9).setParkingFee(150.0);
        ((InpersonStudent) s9).setNumOfClasses(6);
        s9.setSemesterFee(s9.calculateSemesterFee());
        System.out.println(s9);

        Student s10 = new InpersonStudent("Truffle", "Le", Year.SOPHOMORE, 2025, "Art", 400, 150.0, 6);
        System.out.println(s10);
    }
}
