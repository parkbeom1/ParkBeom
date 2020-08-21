package oop;

public class FunctionTest {
	
	public static int add(int num1,int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting); // 반환값이 없을때 void
	}
	
	public static int calcSum() { // 매개변수=파라미터 가 없을때
		int sum = 0;
		int i;
		for(i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int total = add(n1,n2); // 메소드를 활용한다.
		sayHello("안녕하세요.");
		System.out.println(total); // n1 + n2 
		int num = calcSum();
		System.out.println(num); // 5050
	}
}
