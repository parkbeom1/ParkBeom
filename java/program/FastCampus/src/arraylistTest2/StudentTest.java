package arraylistTest2;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentkim = new Student(1825408, "��ö��");
		studentkim.addbook("������", "����");
		studentkim.addbook("û�ʹ�", "¯¯");
		studentkim.addbook("�ѷ��Ѹ�", "����");
		
		
		Student studentpark = new Student(1825400, "�ڹ�");
		studentpark.addbook("�ڻ�����", "���¿�");
		studentpark.addbook("īī", "īī��");
		
		studentkim.showStudentInfo();
		studentpark.showStudentInfo();
		studentkim.showStudentInfo();
		
	}
}
