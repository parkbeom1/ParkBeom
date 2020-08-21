package arraylistTest2;

import java.util.ArrayList;

public class Student {
	
	// �̸� ,�й�
	int studentID;
	String studentName;
	int index;
	
	ArrayList<Book> booklist;
	
	// �л� ������
	public Student(int studentID,String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		booklist = new ArrayList<Book>();
	}
	
	public void addbook(String author,String title) {
		Book book = new Book();	
		book.setAuthor(author);
		book.setTitle(title);
		booklist.add(book); // ��ü�� ������ book�� ArrayList�� �߰��Ѵ�
		
	}
	public void showStudentInfo() {	
		
		System.out.print(this.studentName + " �л��� ���� å�� : ");
	
		for(Book book : booklist) {
			System.out.print(" ���� : " +book.getAuthor() + " ���� :" + book.getTitle());
		}
		System.out.println("�Դϴ�.");		
	}
}