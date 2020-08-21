package oop;
// �����ڴ� �������� ����.

public class Student {
	// ��� ����  = �ν��Ͻ� ����
	private int studentID; // default
	public String studentName;
	public String address;
	private String gender; // private �������� Ŭ�����ܿ��� �����Ҽ�����.
	
	public static int total;
	
	//public = ���������� �̰� �ڿ� ������ Ÿ�� , �������� ���Եȴ�.
	//�����ڴ� Ŭ������� ���ƾ� �Ѵ�.
	public Student() { // �⺻ ������ , �ٸ������ڰ� �ְ� �⺻ �����ڰ� ������ �⺻�����ڴ� �������� �ʴ´�.
		// �����ڵ� ���� �޼ҵ带 ������ ������ �ְ� �̸��� ������ �Ű������� �ٸ���� �����ε� �̶�� �Ѵ�.
		total++;
	}
	Student(int id,String name) { // �Ű������� �ִ� ������ 
		this.studentID = id;
		this.studentName = name;
		total++;
	}
	
	Student(String name) {
		this.studentName = name;
	}
	
	public void showinfo() { // �޼ҵ�(�Լ�) �޼ҵ� �ϳ��� ��� �ϳ�
		int i; // ��������
		System.out.println( this.studentName  +  "," + this.studentID);
		System.out.println("������ ������ + " + this.total);
		// �޼ҵ� �ϳ��� ��� �ϳ� ����
		// ȣ���ϰ� ����ϰ� ����� ���� �����Ѵ�.
		// �޼ҵ�� ������ ���� �������� ȣ���Ҽ� �ִ� - ������
		// ���� ���� �Ű�����(�Ķ���Ͱ�) , �����ϴ� ��ȯ�� �� �ִ�.
	}
	
	public String getString() { // ��ȯ���� String , �޼ҵ���� ī��ǥ���
		return studentName; 
		// �޸𸮴� ���� ���� �̴�.
	}
	public static void main(String[] args) {
		// ��ü�� �����ؼ� ����Ϸ��� ����(heap) �ؼ� ��� �Ѵ�. 
		Student student = new Student();
		student.studentName = "�ڹ�";
		student.studentID = 1825408;
		
		Student studentk = new Student(1825408, "�ڹ�");
		studentk.showinfo();
		
	}
}
