package staticexam;
/*
	총 몇개인가 ? 할때 공유되는 자원을 쓸때
	객체가 생성될떄 생성자에다가  static 을 써서 ++ 시킨다. 
*/
public class Student {
	private static int serialnum = 1000; // 모든인스턴스가 하나의 값을 가리킴
	// 기준값이 바뀌면 안되니까 static은 private 으로 만드는게 맞다 가져다쓸수없을때
	// 
	
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialnum++; 
		// 시리얼넘버를 학번으로 지정하고 싶으면 ?
		studentID = serialnum; //serialnum을 어싸인 해주면 된다. 
							   //매번 증가하는 값이 각 인스턴스 값이 된다.
	}
	public Student(int id,String name) {
		studentID = id;
		studentName = name;
		address="주소 없음";
		serialnum++;
	}
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	public String getStudentName() {
		return studentName;
	}
	
	// 정보은닉(private).
	// studentID는 값이 바뀌면 안되니까 set은안하고 get으로 불러와서 알아낸다.
	public int getstudentID() {
		// 일반메소드에서 static 변수를 사용할수있다. 왜? static변수는 그 이전에 생성되니까
		// 처음에 프로그램에 로드될때 생성됬다가 프로그램 내려갈때 사라진다. 
		// static 은 큰메모리를 쓰면 안되고 이미 만들어져서 사용할수 있는것이다.
		serialnum++; 
		return studentID;
	}
	// private static 에 대한 public static 메소드가 생겼다. 
	public static int getSerialnum() {
		int i = 0; // static메소드에서 인스턴스변수를 사용할수없다.
//		studentName = "Lee";
		// 왜? static메소드는 인스턴스상관없이 호출되는 메소드이다.
		// 근데 인스턴스 변수는 인스턴스화 한다음 사용할수있는 인스턴스변수이기 때문에
		// 이 변수를 값을 넣으려면 이변수는 new 를 해야 생기는 메모리니까 static 메소드안에서
		// 사용할수없다.
		
		return serialnum;
	}
	
}
