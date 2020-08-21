package staticexam;
/*
	static method : �����ڰ� static �޼ҵ带 ����ٴ� ���� ���� ����ϴϱ� ���ϰ� ������
	 - ������
	 ��? static�� ����� �޸𸮸� ���� ��� �ִ� . �����ڿ��̴�.
	 static�� �̿��ؼ� �����ͼ� �����ִ�. ��? ���� ����ϴϱ� ��ü ���� �����ִ�.
	 Ŭ�����κ��� �޼ҵ带 �ҷ��ü��ִ�.
*/
class StaticClass {
	int iv; // �ν��Ͻ� ����
	static int cv; // static ����
	// �Ϲ� �ڿ��� �Ϲ� �ڿ����� static �� static ���� ��ƶ�
	
	void m() {
		// iv ���� ������ ����ִ�. cv���� ������ ����ִ�.
		// static �ڿ��� �׻� �Ϲ� �ڿ����� memory ���� ������ �ȴ�.
		
		iv = 100; // ����Լ������� ��ȿ�� ���̴�.
		StaticClass.cv = 200;
	}
	static void sm() {
		// static �Լ�
		// 1. �Ϲ� �Լ� iv���� ������ ��� ����. ��? ��������  satic�� ���� �޸𸮿� �����ǰ� ���������ϱ�
		StaticClass.cv = 100;
//		iv = 100; //  > �Ϲ� �ν��Ͻ� ������ static �޼ҵ忡�� ��� �Ұ� <
	}
}
public class Ex9_sm {
	public static void main(String[] args) {
		StaticClass.sm(); // Ŭ�����κ��� ������ ����
		
		// �Ϲ��ڿ� ��ü�� �ν��Ͻ�ȭ ����� �Ѵ�.
		StaticClass sc = new StaticClass();
		System.out.println(sc.iv); // int iv;
		System.out.println(sc.cv); // cv���� �����Ǵϱ� 200 -> 100�� �� 
		
	}
}
