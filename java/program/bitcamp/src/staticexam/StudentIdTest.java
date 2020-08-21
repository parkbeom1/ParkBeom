package staticexam;

public class StudentIdTest {
	public static void main(String[] args) { // 지역변수
			
		Student studentLee = new Student("Lee");
//		System.out.println(Student.serialnum); // 1001
								// 클래스로부터 접근할수있다.
		
		// private static메소드를 가져오려면 get으로 가져온다.
		System.out.println(Student.getSerialnum());
			
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialnum()); // 1002
		System.out.println(Student.getSerialnum()); // 1002
		// 같은 메모리를 바라보니까 값이 공유된다. 
		System.out.println(studentLee.getstudentID()); // 1001
		System.out.println(studentKim.getstudentID()); // 1002
		//studentID = serialnum; 생성자에서 호출됬을때 하나씩 증가하는것을 알수있다.
		
		
	}
}
