/*
	변수의 반대말 상수
	상수 : 한번 값이 정해지면(초기화 되면) 변경 불가능 하다.
	상수자원 : 고유값(주민번호) , 수학(PI = 3.141592 ... , 버전번호 시스템 관리번호)  
	상수는 관용적으로 대문자로 쓴다.
	java : final int NUM = 10;  // final = 너가 마지막 값이야 바꾸면 안돼
	
	final 키워드 
	클래스 앞에 >> final class Car{} >> final math >> 상속 금지
	함수 앞에  public final >> 상속관계에서 오버라이딩 재정의 하지마  (override 금지)
	public static final void print() >> 객체간 공유함수 
*/
// final 를 남발 하면 안된다. 
class Vcard {
	final String KIND = "10"; // 상수로 데이터 타입 선언하면 바로 초기화 해줘야 한다.(마지막 데이터 타입이니까 값을 넣어줘야한다.) 
	final int NUM; // 생성자에서 초기화 
	
	public Vcard() {
		NUM = 20;
	}
	void method() {
		System.out.println(Math.PI);	
	}
}
class Vcard2 {
	final String KIND; // 멤버필드에서 반드시 초기화를 해줘야하지는 않지만  생성자에서 초기화를 보장해줘야한다 -> 기본 값이 된다. 
	final int NUM;
	// 생성자에서 초기화를 해준다.
	/*
	public Vcard2() {
		this.KIND ="heart";
		this.NUM = 10;
	}
	*/
	public Vcard2(String KIND,int NUM) {  // 기본값이 된다.
		// 오버로딩을 만들면 초기화를 해줘야 한다. 오버로딩 값으로 초기화를 해주는 
		// 요구사항 : 카드 35장의 모양과 숫자는 다르다 한번 정해지면 변경이 불가능 하다
		// 객체가 만들어질대 한번만 초기화 하니까  스페이스의 1번 스페이스의 2번  스페이스의 3번 객체마다 초기화 할수있다.  
		// 35장의 카드를 만들면서 한번세팅한 카드모양과 번호는 변경이 불가하다 
		this.KIND = KIND;
		this.NUM = NUM;
	}
	public String toString() {
		return KIND + NUM;
	}
}
public class Ex07_Final {	
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		vcard.method();
		Vcard2 vcard2 = new Vcard2("space",1); // 한번정해지면 못바꾼다. 왜 ? final 로 메소드로 되어있으니까 
		System.out.println(vcard2);
	}
}
