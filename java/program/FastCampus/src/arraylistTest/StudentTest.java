package arraylistTest;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1825408, "�ڹ�");
		Student studentKim = new Student(1925408, "��ö��");
		
		// ���� �߰�
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 100);
		
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 85);
		
		// ��ü ���� 		
		studentLee.showStudentInfo();	
		System.out.println("----------------------------");
		studentKim.showStudentInfo();
	}
}
