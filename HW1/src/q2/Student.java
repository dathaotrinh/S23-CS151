package q2;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private String sid;
	private String name;
	private int year;
	private Map<String, Character> coursesTaken;
	private double gpa;
	
	public Student() {
		
	}
	
	public Student(String sid, String name, int year, Map<String, Character> coursesTaken) throws Exception {
		super();
		this.sid = sid;
		this.name = name;
		this.year = year;
		this.coursesTaken = coursesTaken;
		this.calculateGPA();
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Map<String, Character> getCoursesTaken() {
		return coursesTaken;
	}
	public void setCoursesTaken(Map<String, Character> coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
	public double getGpa() {
		return gpa;
	}
	
	/*
	Suppose that each class is 3 credits
	Grade scale: A=4 B=3 C=2 D=1 F=0
	Formula: GPA = sum(grade*credits)/totalCredits
	*/
	public void calculateGPA() throws Exception {
		int numberOfCoursesTaken = coursesTaken.size();

		// no class taken, gpa starts from 4.0 (?)
		if(numberOfCoursesTaken == 0) {
			this.gpa = 4.0;
		}
		
		double totalCredits = numberOfCoursesTaken * 3;
		double totalScore = 0.0;
		
		Map<Character, Integer> gradeScale = new HashMap<>();
		gradeScale.put('A', 4);
		gradeScale.put('B', 3);
		gradeScale.put('C', 2);
		gradeScale.put('D', 1);
		gradeScale.put('F', 0);
		
		for(String courseName: coursesTaken.keySet()) {
			Character courseGrade = coursesTaken.get(courseName);
			if(gradeScale.containsKey(courseGrade)) {
				totalScore += gradeScale.get(courseGrade) * 3;
			} else {
				throw new Exception("Grade not found in Scale");
			}
		}
		
		double gpa = totalScore/totalCredits;

		this.gpa = gpa;
	}
	
	public void printInfo() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student name: ").append(name).append("\nStudentId: ").append(sid).append("\nYear: ").append(year).append("\n");
		
		for(String courseName: coursesTaken.keySet()) {
			builder.append(courseName).append(": " ).append(coursesTaken.get(courseName)).append("\n");
		}
		
		builder.append("GPA: ").append(this.gpa);
		System.out.println(builder);
	}
}
