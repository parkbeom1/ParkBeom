package templetemethodTest;

public class Player  {
	// 멤퍼필드에서 선언한다.
	
	PlayerLevel level; // 상속받은 클래스들이 level 변수에 대입된다.
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();		
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
