
public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("0���� �����ϴ�.");
		try {
			// ����  ������ �߻��ص� �ϴ� ���α׷��� ������ ������� �ʾ����� ���ڴ�
			System.out.println(0/0); 
			// ������ �߻��ϸ� �� ������ ������ �ִ� ��ü�� �ڵ����� ����
			// �����Ϸ��� ������ �´� ��ü�� new java.lang.ArithmeticException
			// �߻��� ������ ������ ArithmeticException �����Ѵ�. 
			// �ٵ� Exception���� �ٹ������ִ� ū������ ����.
			// e.printStackTrace �� ���ܳ����� ����.
		} catch(Exception e) { //���ܿ� ���� �����κ� (������ �˷��ִ� �κ�)
			// ���� ������ �߻��߰� ������ ..������ ���� ��(��ġ�°Ծƴϴ�)
			e.printStackTrace(); // ��ü������ ������
			System.out.println(e.getMessage());
		} finally {
			System.out.println("������ �����ϴ� �ڵ�");
		}
	}
}
