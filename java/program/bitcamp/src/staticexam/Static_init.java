package staticexam;

class InitTest{
	static int cv1 = 10; // 10���� �ʱⰪ ����
	static int cv2;
	int iv = 11;
	
	// static �ʱ���
	static { // static �ʱ��ڴ� static �ڿ��� �ʱ�ȭ �Ѵ�.
		// �׻� static�� ��ü ���� �տ� �ִ�.
		cv1 = 111;
		cv2 = cv1 + 222;
	}
	
	{  // �ʱ��� ��� 
	   // �ʱ��� ���(member field �ʱ�ȭ)
	   // ��ü ���� ���� int iv = 1; ������ �޸𸮿� �ö󰡰� ���� �ٷ� ȣ��
	   // ������ >> if(iv > 10) iv = 100;
	  if(iv > 10) iv = 100;
	  iv = 3;
	  System.out.println("iv : " + iv);
	}
}
	public class Static_init {
	public static void main(String[] args) {
		System.out.println(InitTest.cv1); // 111
		System.out.println(InitTest.cv2); // 333
		
		InitTest it = new InitTest(); 
		System.out.println(it.iv);	// �ʱ�ȭ��Ͽ� ����
									// 3 ���� �ʱ�ȭ
	}	
}


