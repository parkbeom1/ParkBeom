package arraylistTest2;

import java.util.ArrayList;

public class Student {
	
	// 이름 ,학번
	int studentID;
	String studentName;
	int index;
	
	ArrayList<Book> booklist;
	
	// 학생 생성자
	public Student(int studentID,String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		booklist = new ArrayList<Book>();
	}
	
	public void addbook(String author,String title) {
		Book book = new Book();	
		book.setAuthor(author);
		book.setTitle(title);
		booklist.add(book); // 객체로 생성된 book를 ArrayList에 추가한다
		
	}
	public void showStudentInfo() {	
		
		System.out.print(this.studentName + " 학생이 읽은 책은 : ");
	
		for(Book book : booklist) {
			System.out.print(" 저자 : " +book.getAuthor() + " 제목 :" + book.getTitle());
		}
		System.out.println("입니다.");		
	}
}