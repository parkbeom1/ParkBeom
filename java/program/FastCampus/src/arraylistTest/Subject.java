package arraylistTest;

public class Subject { 
	
	// ������ �����ڷ������� ������ ����
	private String name; // ���� �̸�
	private int score; // ���� ����
	
	public Subject(String name,int score) { // ���� �ʱ�ȭ 
		this.name = name;
		this.score = score;
	}
	public String getName() { // �̸� �ҷ����� �Լ�
		return name;
	}
	public void setName(String name) { // �̸� �����ϴ� �Լ� 
		this.name = name;
	}
	public int getScore() { // ���� �ҷ����� �Լ�
		return score;
	}
	public void setScore(int score) { // ���� �����ϴ� �Լ� 
		this.score = score;
	}
}
