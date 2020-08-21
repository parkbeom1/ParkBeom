package staticexam;
/*
	�� ��ΰ� ? �Ҷ� �����Ǵ� �ڿ��� ����
	��ü�� �����ɋ� �����ڿ��ٰ�  static �� �Ἥ ++ ��Ų��. 
*/
public class Student {
	private static int serialnum = 1000; // ����ν��Ͻ��� �ϳ��� ���� ����Ŵ
	// ���ذ��� �ٲ�� �ȵǴϱ� static�� private ���� ����°� �´� �����پ���������
	// 
	
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialnum++; 
		// �ø���ѹ��� �й����� �����ϰ� ������ ?
		studentID = serialnum; //serialnum�� ����� ���ָ� �ȴ�. 
							   //�Ź� �����ϴ� ���� �� �ν��Ͻ� ���� �ȴ�.
	}
	public Student(int id,String name) {
		studentID = id;
		studentName = name;
		address="�ּ� ����";
		serialnum++;
	}
	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}
	public String getStudentName() {
		return studentName;
	}
	
	// ��������(private).
	// studentID�� ���� �ٲ�� �ȵǴϱ� set�����ϰ� get���� �ҷ��ͼ� �˾Ƴ���.
	public int getstudentID() {
		// �Ϲݸ޼ҵ忡�� static ������ ����Ҽ��ִ�. ��? static������ �� ������ �����Ǵϱ�
		// ó���� ���α׷��� �ε�ɶ� ������ٰ� ���α׷� �������� �������. 
		// static �� ū�޸𸮸� ���� �ȵǰ� �̹� ��������� ����Ҽ� �ִ°��̴�.
		serialnum++; 
		return studentID;
	}
	// private static �� ���� public static �޼ҵ尡 �����. 
	public static int getSerialnum() {
		int i = 0; // static�޼ҵ忡�� �ν��Ͻ������� ����Ҽ�����.
//		studentName = "Lee";
		// ��? static�޼ҵ�� �ν��Ͻ�������� ȣ��Ǵ� �޼ҵ��̴�.
		// �ٵ� �ν��Ͻ� ������ �ν��Ͻ�ȭ �Ѵ��� ����Ҽ��ִ� �ν��Ͻ������̱� ������
		// �� ������ ���� �������� �̺����� new �� �ؾ� ����� �޸𸮴ϱ� static �޼ҵ�ȿ���
		// ����Ҽ�����.
		
		return serialnum;
	}
	
}
