package arraylistTest;

public class Subject { 
	
	// 과목은 참조자료형으로 가져다 쓰기
	private String name; // 과목 이름
	private int score; // 과목 점수
	
	public Subject(String name,int score) { // 강제 초기화 
		this.name = name;
		this.score = score;
	}
	public String getName() { // 이름 불러오는 함수
		return name;
	}
	public void setName(String name) { // 이름 설정하는 함수 
		this.name = name;
	}
	public int getScore() { // 점수 불러오는 함수
		return score;
	}
	public void setScore(int score) { // 성적 설정하는 함수 
		this.score = score;
	}
}
