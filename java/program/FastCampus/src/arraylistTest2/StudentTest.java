package arraylistTest2;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentkim = new Student(1825408, "김철중");
		studentkim.addbook("김지영", "토지");
		studentkim.addbook("청와대", "짱짱");
		studentkim.addbook("롤렌롤링", "해이");
		
		
		Student studentpark = new Student(1825400, "박범");
		studentpark.addbook("박새로이", "이태원");
		studentpark.addbook("카카", "카카오");
		
		studentkim.showStudentInfo();
		studentpark.showStudentInfo();
		studentkim.showStudentInfo();
		
	}
}
