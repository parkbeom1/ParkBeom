package staticexam;

public class StudentIdTest {
	public static void main(String[] args) { // ��������
			
		Student studentLee = new Student("Lee");
//		System.out.println(Student.serialnum); // 1001
								// Ŭ�����κ��� �����Ҽ��ִ�.
		
		// private static�޼ҵ带 ���������� get���� �����´�.
		System.out.println(Student.getSerialnum());
			
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialnum()); // 1002
		System.out.println(Student.getSerialnum()); // 1002
		// ���� �޸𸮸� �ٶ󺸴ϱ� ���� �����ȴ�. 
		System.out.println(studentLee.getstudentID()); // 1001
		System.out.println(studentKim.getstudentID()); // 1002
		//studentID = serialnum; �����ڿ��� ȣ������� �ϳ��� �����ϴ°��� �˼��ִ�.
		
		
	}
}
