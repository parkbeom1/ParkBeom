/*
	다형성(상속관계에서만 존재 한다) : 하나의 코드가 여러가지 
	다형성 : 여러가지 성질 형태를 가질수 있는 능력이다.
	c# : 다형성 ( 우리가 배웠던 오버로딩 도 다형성으로 보고 오버라이딩도 다형성으로 본다 )
	
	JAVA : [상속관계] 에서 부모 하나의 참조 변수가 여러개의 자식객체의 타입을 가질수 있다.
	하나의 참조 변수 >>  [ 부모 타입 ]
	부모클래스 타입의 참조 변수가 여러개의 자식 클래스 객체를 담을수 있다.
	다형성 : 현실) 부모는 자식에게 조건없이 모든걸 준다.
	자식이 부모에게 조건없이 드린다. >> 다형성
*/
class Tv { // 부모로 만들것이다. 일반화 , 추상화 , 공통자원 , 분모 
	boolean power;// 전원을 가지고 있다.
	int ch; // 채널
	
	void power() { // 끄고 킬수있다.
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
public class Ex10_Inherit_Poly {	
	public static void main(String[] args) {
		
	}
}
// Tv의 모든기능을 가지는 CapTv
class CapTv extends Tv { // 캡션 티비가 가지고 있는 특수화 되고 구체화 되고 고유한 자원을 표현 하면 된다. 우리가 일반화되고 추상화 된것은 tv를 통해 가지고 있다 
	
	String text; // 자막정보
	
	String captionTest() { // 자막 정보 리턴
		return this.text ="현재 자막 처리중.....";
	}
	
	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("전원 :" + captv.power);
		
		captv.chUp();
		System.out.println("채널정보 : " + captv.ch);
		System.out.println(captv.captionTest()); // 자식의 자막 처리 기능
		// 기존 배운 내용
		
		// Car 타입에  c는 = new Car();
		// Car 타입에 c2 = c; 가능 같은타입이니까
		Tv tv2 = captv; // 부모타입은 자식타입의 주소를 가질수있다. - 다형성  
						// 단 부모는 자신의 자원만 접근 할수 있다.
						// 단 재정의만 제외하고 
		// tv2. 부모꺼만 보인다. 
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		// 같은 주소이지만 보이는것은 다르다.
		
		// 같은 601호에 들어가도 자식은 다 볼수있지만 부모는 자신의 사준것만 보인다
		Tv tv = new CapTv(); // 업캐스팅 
		CapTv captv2 = (CapTv)tv; // 다운 캐스팅
	}
}
