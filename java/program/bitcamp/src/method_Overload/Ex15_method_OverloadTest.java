package method_Overload;

class Human3 {
	String name;
	int age;
}
class Test3 { // add 메소드를 사용하기 위해 먼저 인스턴스화 한다. 
	
	Human3 add(Human3 h) {
		h.name = "박범";
		h.age = 27;
		return h;
	}
	
	Human3 add(Human3 h,Human3 h2) {
		h.name = "강호동";
		h.age = 40;
		
		h2.name = "유재석";
		h2.age = 40;
		return h2;
	}
}
public class Ex15_method_OverloadTest {
	public static void main(String[] args) {
		Test3 test = new Test3();
		Human3 human = test.add(new Human3());
		System.out.println(human.name);
		System.out.println(human.age);
		
		Human3 human2 = test.add(human, human);
		System.out.println(human2.name);
		System.out.println(human2.age);
		
		System.out.println("**********");
	}
}
