package ch09;

public class SubjectTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		
		studentLee.setKoreanSubject("����", 100);
		studentLee.setMathSubject("����", 99);
		
		Student studentKim = new Student(200, "Lee");
		
		studentKim.setKoreanSubject("����", 50);
		studentKim.setMathSubject("����", 65);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}
}
