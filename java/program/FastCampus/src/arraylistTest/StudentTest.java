package arraylistTest;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1825408, "박범");
		Student studentKim = new Student(1925408, "김철중");
		
		// 과목 추가
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("영어", 100);
		
		studentKim.addSubject("국어", 90);
		studentKim.addSubject("영어", 85);
		studentKim.addSubject("수학", 85);
		
		// 전체 정보 		
		studentLee.showStudentInfo();	
		System.out.println("----------------------------");
		studentKim.showStudentInfo();
	}
}
