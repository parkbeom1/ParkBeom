package oop;

public class StudentTest {
	public static void main(String[] args) {
		Student studentKim = new Student(2020,"�̼���");
		Student studentPark = new Student();
		// �ν��Ͻ� ����
		// �������� .�� ���� Ŭ������ �Ӽ��� �޼ҵ带 �����Ѵ�.
		studentPark.studentName = "�ڹ�";
		studentPark.address = "����";
//		studentKim.showinfo();
		
		Student studentHu = studentKim; // �ּҰ� �Ҵ� 
		studentHu.showinfo();
		
		System.out.println(studentHu);
		System.out.println(studentPark);
			
	}
}
