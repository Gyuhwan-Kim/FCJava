package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		System.out.println("student ����");
	}
	
	public Student(int studentNumber, String studentName, int grade) {
		studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {

		return studentName + " �л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
}