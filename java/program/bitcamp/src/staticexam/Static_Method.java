package staticexam;

public class Static_Method {
	
	public void method() {
		System.out.println("�� �Ϲ� �Լ���");
	}
	
	public static void smethod() {
		System.out.println("�� static �Լ���");
	}
	public static void main(String[] args) {
		
		// method() , smethod() ȣ���ؼ� �����غ���
		Static_Method sm = new Static_Method();
		sm.method();
		sm.smethod();
		
	}
}
