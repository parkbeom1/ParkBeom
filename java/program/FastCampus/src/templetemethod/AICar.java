package templetemethod;

public class AICar extends Car { // 추상클래스 상속 받음
	@Override
	public void drive() {
		System.out.println("차를 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}
	@Override
	public void stop() {
		System.out.println("스스로 자동차가 멈춤니다.");
	}
	@Override
	public void washCar() {
		System.out.println(" 자동 세차 합니다.");
	}
	
}
