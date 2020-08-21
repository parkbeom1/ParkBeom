
public class Test {
	public static void main(String[] args) {
		Test2 test = new Test2("박범",27);
		String name = test.getName(); // 리턴타입이 String 이니까 string으로 받는다.
		System.out.println(name);
		
		int age = test.getAge();
		System.out.println(age);
		
		System.out.println(test.getName() + test.getAge());
		
		 int[] caoo = test.getInt(new int[5]); // 5개의 공간 주소값을 할당함 
		
		 for(int i = 0 ,num = 0; i < caoo.length; i++ , num++) {
			 caoo[i] += num;
			 System.out.println(caoo[i]);
		 }
	}
}
