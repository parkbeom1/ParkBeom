package method_Overload;
/*
  Test2 객체화를 한다음에 Test2 의 메소드 add에 new Human2로 리턴받는다.
  그 값을 Human2 객체로 부터 주소값을 할당 받는다.
 	
 	<Today Point>
 	즉 블록안에서 매개변수로 클래스를 받으면 참조 변수를 통해
 	그블록안에서 호출하여 사용할수있게 된다.
 	
 */
class Human2 {
	String name;
	int age;
}
class Test2 {
	Human2 add(Human2 h) {
		h.name = "박범";
		h.age = 27;
		return h;
	}
	Human2 add(Human2 h,Human2 h2) {
		h.name += h2.name = "이순신";
		h.age += h2.age = 40;
		return h2;
	}
}
public class Ex15_method_Overload {
	public static void main(String[] args) {
		Test2 test = new Test2();
		Human2 human = test.add(new Human2());
		System.out.println(human.name);
		System.out.println(human.age);
		
		System.out.println("*****************");
		
		Test2 test2 = new Test2();
		Human2 human2 = test2.add(new Human2(), new Human2());
		System.out.println(human2.name);
		System.out.println(human2.age);
	}
}
