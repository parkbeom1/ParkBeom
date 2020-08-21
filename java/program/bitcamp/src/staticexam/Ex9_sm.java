package staticexam;
/*
	static method : 설계자가 static 메소드를 만든다는 것은 많이 사용하니까 편하게 쓰세요
	 - 가독성
	 왜? static을 만들면 메모리를 많이 잡고 있다 . 공유자원이다.
	 static을 이용해서 가져와서 쓸수있다. 왜? 많이 사용하니까 객체 없이 쓸수있다.
	 클래스로부터 메소드를 불러올수있다.
*/
class StaticClass {
	int iv; // 인스턴스 변수
	static int cv; // static 변수
	// 일반 자원은 일반 자원끼리 static 은 static 끼리 놀아라
	
	void m() {
		// iv 값을 가지고 놀수있다. cv값을 가지고 놀수있다.
		// static 자원은 항상 일반 자원보다 memory 먼저 생성이 된다.
		
		iv = 100; // 블록함수에서만 유효한 값이다.
		StaticClass.cv = 200;
	}
	static void sm() {
		// static 함수
		// 1. 일반 함수 iv값을 가지고 놀수 없다. 왜? 생성시점  satic이 먼저 메모리에 생성되고 먼저나가니까
		StaticClass.cv = 100;
//		iv = 100; //  > 일반 인스턴스 변수는 static 메소드에서 사용 불가 <
	}
}
public class Ex9_sm {
	public static void main(String[] args) {
		StaticClass.sm(); // 클래스로부터 접근이 가능
		
		// 일반자원 객체는 인스턴스화 해줘야 한다.
		StaticClass sc = new StaticClass();
		System.out.println(sc.iv); // int iv;
		System.out.println(sc.cv); // cv값이 공유되니까 200 -> 100이 됨 
		
	}
}
