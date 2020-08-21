package templetemethodTest;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) { // 템플릿 메소드
								 // final 메소드는 변하면 안된다.
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
