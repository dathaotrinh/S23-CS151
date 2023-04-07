package q2;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {
	public static void main(String[] args) throws Exception {
		// Create a map of courses taken
		Map<String, Character> stuCoursesTaken = new HashMap<>();
		stuCoursesTaken.put("CS151", 'A');
		stuCoursesTaken.put("CS146", 'B');
		stuCoursesTaken.put("CS147", 'B');

		// Create student info
		String stuName = "Student";
		String sid = "1234";
		int year = 2;

		// Student object created by the default constructor
		Student stu1 = new Student();
		
		stu1.setName(stuName);
		stu1.setSid(sid);
		stu1.setYear(year);
		stu1.setCoursesTaken(stuCoursesTaken);
		stu1.calculateGPA();
		stu1.printInfo();
		
		System.out.println();

		// Student object created by the parameterized constructor
		Student stu2 = new Student(sid, stuName, year, stuCoursesTaken);
		stu2.printInfo();
	}
}
