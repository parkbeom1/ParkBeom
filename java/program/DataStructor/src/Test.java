
public class Test {
	public static void main(String[] args) {
		Test2 test = new Test2("�ڹ�",27);
		String name = test.getName(); // ����Ÿ���� String �̴ϱ� string���� �޴´�.
		System.out.println(name);
		
		int age = test.getAge();
		System.out.println(age);
		
		System.out.println(test.getName() + test.getAge());
		
		 int[] caoo = test.getInt(new int[5]); // 5���� ���� �ּҰ��� �Ҵ��� 
		
		 for(int i = 0 ,num = 0; i < caoo.length; i++ , num++) {
			 caoo[i] += num;
			 System.out.println(caoo[i]);
		 }
	}
}
