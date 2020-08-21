package method_Overload;

class Human4{
	String name;
	int age;
}

class OverTest {
	int add(int i) {
		return 100+100;
	}
	int add(int i,int j) {
		return i+j;
	}
	String add(String s) {
		return s;
	}
	String add(String s,int i) {
		return s + i;
	}
	void add(Human4 human) {
		human.name="ȫ�浿";
		human.age=50;
		System.out.println(human.name + " , " + human.age);
	}
}
public class Ex14_method_OverloadingTest {
	public static void main(String[] args) {
		OverTest ot2 = new OverTest();
		Human4 h = new Human4();
		Human4 h2 = new Human4();
		
		int result = ot2.add(100);
		/* int add(int i) {
		 	return 100+100;
		 */
		System.out.println(result);
		
		String str = ot2.add("world");
		ot2.add(h);
		ot2.add(h);
	}
}
