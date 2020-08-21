package staticexam;

class InitTest{
	static int cv1 = 10; // 10으로 초기값 공유
	static int cv2;
	int iv = 11;
	
	// static 초기자
	static { // static 초기자는 static 자원을 초기화 한다.
		// 항상 static은 객체 생성 앞에 있다.
		cv1 = 111;
		cv2 = cv1 + 222;
	}
	
	{  // 초기자 블록 
	   // 초기자 블록(member field 초기화)
	   // 객체 생성 나서 int iv = 1; 변수가 메모리에 올라가고 나서 바로 호출
	   // 인위적 >> if(iv > 10) iv = 100;
	  if(iv > 10) iv = 100;
	  iv = 3;
	  System.out.println("iv : " + iv);
	}
}
	public class Static_init {
	public static void main(String[] args) {
		System.out.println(InitTest.cv1); // 111
		System.out.println(InitTest.cv2); // 333
		
		InitTest it = new InitTest(); 
		System.out.println(it.iv);	// 초기화블록에 의해
									// 3 으로 초기화
	}	
}


