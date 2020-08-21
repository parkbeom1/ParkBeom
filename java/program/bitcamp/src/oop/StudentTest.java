package oop;

public class StudentTest {
	public static void main(String[] args) {
		Student studentKim = new Student(2020,"이순신");
		Student studentPark = new Student();
		// 인스턴스 생성
		// 참조변수 .를 통해 클래스의 속성과 메소드를 참조한다.
		studentPark.studentName = "박범";
		studentPark.address = "용인";
//		studentKim.showinfo();
		
		Student studentHu = studentKim; // 주소값 할당 
		studentHu.showinfo();
		
		System.out.println(studentHu);
		System.out.println(studentPark);
			
	}
}
