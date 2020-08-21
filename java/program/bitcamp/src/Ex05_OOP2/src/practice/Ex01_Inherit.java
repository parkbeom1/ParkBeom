package practice;

class Car{
	
	
}

class GrandFather extends Object { // 최상위클래스를 상속받는다.
	
	public GrandFather() {
		System.out.println("GrandFather");
	}
	public int gmoney = 500000;
	private int pmoney = 100000;
}
class Father extends  GrandFather {
	
	public Father() {
		System.out.println("Father");
	}
	public int fmoney = 3000;
}

class Child extends Father {
	public Child() {
		System.out.println("Child");
	}
	public int cmoney = 1000;
}
public class Ex01_Inherit {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney);
		System.out.println(child.fmoney);
		System.out.println(child.cmoney);
	}
}
