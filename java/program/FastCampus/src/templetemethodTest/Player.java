package templetemethodTest;

public class Player  {
	// �����ʵ忡�� �����Ѵ�.
	
	PlayerLevel level; // ��ӹ��� Ŭ�������� level ������ ���Եȴ�.
	
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
