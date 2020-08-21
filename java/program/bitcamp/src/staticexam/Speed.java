package staticexam;

public class Speed {
	
	private int speed;
	
	public void speedUp() { // 호출할때마다
		speed += 10; // speed = speed + 10
	}
	
	public void seedDown() {
		if(speed > 0) {
			speed -= 10; // speed = speed - 10
		} else {
			speed = 0;
			speed += 10;
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		// speed의 초기값을 설정한다.
		this.speed = speed;
	}
	public static void main(String[] args) {
		Speed speed = new Speed();
		speed.setSpeed(100);
		speed.seedDown(); // 90
		speed.seedDown(); // 80
		speed.seedDown(); // 70

		speed.speedUp();  // 80	
		System.out.println(speed.getSpeed()); // 80 값을 불러옴 
	}
}
