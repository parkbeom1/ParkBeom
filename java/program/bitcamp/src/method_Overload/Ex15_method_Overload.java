package method_Overload;
/*
  Test2 ��üȭ�� �Ѵ����� Test2 �� �޼ҵ� add�� new Human2�� ���Ϲ޴´�.
  �� ���� Human2 ��ü�� ���� �ּҰ��� �Ҵ� �޴´�.
 	
 	<Today Point>
 	�� ��Ͼȿ��� �Ű������� Ŭ������ ������ ���� ������ ����
 	�׺�Ͼȿ��� ȣ���Ͽ� ����Ҽ��ְ� �ȴ�.
 	
 */
class Human2 {
	String name;
	int age;
}
class Test2 {
	Human2 add(Human2 h) {
		h.name = "�ڹ�";
		h.age = 27;
		return h;
	}
	Human2 add(Human2 h,Human2 h2) {
		h.name += h2.name = "�̼���";
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
