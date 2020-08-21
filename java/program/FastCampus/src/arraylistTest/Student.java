package arraylistTest;

import java.util.ArrayList;

public class Student {
	
	// 아이디,이름 
	int studentID; 
	String studentName;
	
	// 과목 을 ArrayList로 관리하기
	ArrayList<Subject> subjectList; // ArrayList 선언 
	
	// 생성은 생성자에서 주로 많이 생성한다.
	public Student(int studentID,String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();	 // ArrayList 생성
	}
	// 과목을 수강할때마다 과목이름,과목점수 추가하기
	public void addSubject(String name,int score) {
		Subject subject = new Subject(name,score);
		// ArrayList에 추가하기
		subjectList.add(subject);
	}
	// 전체 정보 
	public void showStudentInfo() {
		//총점 
		int total = 0;
		// 각 과목의 점수 출력	
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "학생의 " + subject.getName() + " 과목의  성적은" + subject.getScore() + " 입니다.");
		}
		System.out.println(studentName + "학생의  총점은" + total + " 입니다." );
	}
}
