package abstractex;

public class DeskTop extends Computer {
	
	// 추상메소드를  반드시 구현해줘야 한다. 구현을 위임하려면
	// abstract(예약어) 클래스로 지정하면 된다.

	// 추상메소드를 구현하기
	@Override
	public void display() { 
		System.out.println("DeskTop display");
	}
	@Override
	public void typing() {
		System.out.println("DeskTop typing");
	}
	
	// 추상클래스에서 구현된 메소드 다시 재정의가 가능하다 
	@Override
	public void turnOn() {
		System.out.println("desktop turnOn");
	}
	@Override
	public void turnOff() {
		System.out.println("desktop turnOff");
	}
}
