package staticexam;

// 주소값을 할당하기 위한 테스트
public class Tv {
	
	int TvCount;
	String TvColor;
	
	public Tv tCall() {
		Tv t = new Tv();
		return t; // 참조 변수를 리턴할수있다.(주소값)
	}
	public Tv tCall2() {
		return new Tv(); // 참조 변수 생성 할수있는 메모리 생성을 리턴한다.
	}
	public void tCall3(Tv t) {
		System.out.println("t 주소값 : " + t);
	}
	public Tv tCall(Tv t) {
		TvCount = 5;
		TvColor = "red";
		return t; // 리턴값 t를 리턴해서 
	}
	public static void main(String[] args) {
		Tv t = new Tv();
		Tv t2 = t.tCall(t); // 리턴값을 t를 받는다. 
		System.out.println(t2.TvCount + t2.TvColor);
	}
}
