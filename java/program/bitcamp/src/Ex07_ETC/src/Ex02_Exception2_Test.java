
public class Ex02_Exception2_Test {
	public static void main(String[] args) {
		
		int num = 100;
		int result = 0;
		System.out.println("main start");
		try {
			for(int i = 0; i < 10; i++) {
				result = num /(int)(Math.random()*10);
			}
		} catch(ArithmeticException e) { // 0���� ������ ���
			if(Math.random() == 0) {
				System.exit(0);
				System.out.println("������ �߻� �����ڿ��� ���� �߼�");
				System.out.println(e.getMessage());
			}
		} catch(NullPointerException e) {
			
		} catch(Exception e) {
			// ���� ���� , null ���ܸ� ������ �������� ���� ó�� �Ѵ�. 
		}
		System.out.println("main end");
	}		
}

