package method_Overload;
/*
  OOP(��ü���� ���α׷���)
  1. ��� 
  2. ĸ��ȭ(����ȭ) : private -> getter(�б�) setter(����)
  : �����Ҵ�,�����Ҵ� �� ����  ���������� ���� �����Ҵ��� ���ؼ� �����͸� ��ȣ
  >> method overloading ��Ÿũ����Ʈ �����ε� ó�� �������� ����Ѵ�. 
  �߿�) �޼ҵ� �ϳ��� �̸����� �������� ����� �ϴ� �Լ��̴�.
  1. �����ε� �����׻� ������ ���ش�. �����(������) ���� ���ϰ� ����϶�� 
  �����ڰ� ����ߴ�.
  2. ���ϰ� ����϶�� ������ ���(������)
  3. �����ε� �𸣸� 20�� �ٸ� �̸��� ������ �ȴٴ� �������� �ִ�.
  
  ����) �Լ� �̸��� ���� �Ķ������ ������ �޶�� �Ѵ�.
  1. �Լ� �̸��� ���ƾ� �Ѵ�.
  2. �Ķ������ ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
  3. ����Ÿ���� ����� ����.(�����ε��� �Ǵܱ����� �ƴϴ�)
  4. ��ǻ�ʹ� ������ �����Ѵ�.(int ,s) �� (s ,int) �� �ٸ��� �Ѵ�. ������ �ٸ����� ����
*/
class Human {
	String name;
	int age;
}
class OverTest2 {
	int add(int i) {
		return 100 + 100;
	}
	
	int add(int i,int j) {
		return i + j;
	}
	
	String add(String s) {
		return s;
	}
	String add(int i , String s) {
		
		return null;
	}
	void add(Human human) {
		human.name="ȫ�浿";
		human.age=100;
		System.out.println(human.name+" , "+human.age);
	}
	Human add1(Human human) {
		human.name="��ö��";
		human.age = 500;
		
		return human;
	}
}
public class Ex14_method_Overloading {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
		Human h = new Human();
		Human h2 = new Human();
		String result = ot.add("world");
		System.out.println(result);
		
		String str = ot.add("world");
		ot.add(str); // ���������� ���� �Ѵ�. 
		ot.add(h.name);
		ot.add(h2.name);
	}
}
