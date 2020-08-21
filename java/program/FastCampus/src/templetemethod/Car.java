package templetemethod;

public abstract class Car { // 추상클래스
	
	public abstract void drive(); // 추상 메소드
	public abstract void stop();
	public void startCar() {
		System.out.println("시동을 킵니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끈다.");
	}	
	
	public void washCar() {
		// abstract 메소드로 하면 하위클래스가 반드시구현해야한다.
		// 하지만 일반 메소드로 하면 
		// 하위클래스가 재정의 해도되고  변경이 가능하다
		System.out.println("샤워함"); 
	}
	
	// 템플릿메소드 ( 미리 순서를 정의해 놓은 메소드 )
	// 틀이되는 메소드는 재정의하면 안되서 final 로 해놓는다.
	// 달리는 시나리오 정의 
	// 달리는 메뉴어대로 하위클래스에서 실행해준다.
	
	final public void run() { // final은 재정의할수없다 
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
