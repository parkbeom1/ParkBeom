package abstractex;

public abstract class Computer {
	// 상위클래스에서 컴퓨터 여러 종류의 클래스들이 있는데 전원키는거 끄는건 구현이 가능
	// 공통적으로 쓰는 메소드  근데 display 나 typing 는 하위클래스에 따라서
	// 데스크톱 노트북 한몸등 서로 다르다 
	// 하위클래스는 반드시 구현해줘야 하는 상위클래스에서 선언하고 구현 책임을
	// 하위클래스한테 위임한다.
	
	public abstract void display();
	// 구현을하지않겠다는 뜻이다. =  추상 메소드 는 하위클래스에서 구현해줌
	// 더이상 오류 없다 
	public abstract void typing(); 
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
