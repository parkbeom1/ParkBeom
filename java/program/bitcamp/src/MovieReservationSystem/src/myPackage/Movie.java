package myPackage;

public class Movie {
	private String title; // ����
	private String openDate; // �ð�
	private int playtime; // �󿵽ð�
	private String grade; // ��� 
	
	public Movie(String title,String openDate,int playtime,String grade) {
		this.title = title;
		this.openDate = openDate;
		this.playtime = playtime;
		this.grade = grade;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public int getPlaytime() {
		return playtime;
	}

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}
