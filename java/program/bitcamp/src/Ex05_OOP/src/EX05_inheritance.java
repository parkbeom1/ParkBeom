class Test2 {
	int x = 100;
	
	void print() {
		System.out.println("�θ��Լ� Test2");
		
	}
}


class Test3 extends Test2 {

	int x = 300; // C# �θ� �����ϱ�  // ����������....
	
	@Override
	void print() {
		System.out.println("�ڽ��� �θ� �Լ��� ������");
	}

	void print(String str) { // �����ε�
		System.out.println("���� �����ε� �Լ��� ");
	}
}	
public class EX05_inheritance {
	public static void main(String[] args) {
		Test3 t = new Test3();
		System.err.println(t.x); // int x  �����ǵ� x�� ȣ��� 
		t.print(); // �ڽĲ� ��ȣ��
		t.print("�����ε� ȣ��"); // �����ε� 
		
	}
}
