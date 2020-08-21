package oop;
// 생성자는 강제성을 띄운다.

public class Student {
	// 멤버 변수  = 인스턴스 변수
	private int studentID; // default
	public String studentName;
	public String address;
	private String gender; // private 정보은닉 클래스외에는 참조할수없다.
	
	public static int total;
	
	//public = 접근제어자 이고 뒤에 데이터 타입 , 변수명이 오게된다.
	//생성자는 클래스명과 같아야 한다.
	public Student() { // 기본 생성자 , 다른생성자가 있고 기본 생성자가 없으면 기본생성자는 제공하지 않는다.
		// 생성자도 여러 메소드를 여러개 있을수 있고 이름은 같지만 매개변수가 다른경우 오버로딩 이라고 한다.
		total++;
	}
	Student(int id,String name) { // 매개변수가 있는 생성자 
		this.studentID = id;
		this.studentName = name;
		total++;
	}
	
	Student(String name) {
		this.studentName = name;
	}
	
	public void showinfo() { // 메소드(함수) 메소드 하나당 기능 하나
		int i; // 지역변수
		System.out.println( this.studentName  +  "," + this.studentID);
		System.out.println("생성된 개수는 + " + this.total);
		// 메소드 하나당 기능 하나 수행
		// 호출하고 사용하고 수행된 값을 리턴한다.
		// 메소드로 구현된 것은 여러곳에 호출할수 있다 - 가독성
		// 들어가는 값을 매개변수(파라미터값) , 리턴하는 반환값 이 있다.
	}
	
	public String getString() { // 반환값이 String , 메소드명은 카멜표기법
		return studentName; 
		// 메모리는 스택 구조 이다.
	}
	public static void main(String[] args) {
		// 객체를 생성해서 사용하려면 생성(heap) 해서 써야 한다. 
		Student student = new Student();
		student.studentName = "박범";
		student.studentID = 1825408;
		
		Student studentk = new Student(1825408, "박범");
		studentk.showinfo();
		
	}
}
