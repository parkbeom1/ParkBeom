package staticexam;

public class Static_Method {
	
	public void method() {
		System.out.println("나 일반 함수야");
	}
	
	public static void smethod() {
		System.out.println("나 static 함수야");
	}
	public static void main(String[] args) {
		
		// method() , smethod() 호출해서 실행해보기
		Static_Method sm = new Static_Method();
		sm.method();
		sm.smethod();
		
	}
}
