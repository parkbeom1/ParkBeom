/*
 OOP Ư¡
 ��� ĸ��ȭ ������ �߻�ȭ 
������ ����� �����̴�.
1. ���
JAVA : child extends Base
c# : child : Base

2. Ư¡
2.1 ���� ����� �Ұ�
2.2 ���ϻ�� (�Ҿƹ����� �ƹ������� �ƹ����� �ٽ� ���� - ������ ����� ���� ��, ������ ����� ���� �������� Ŭ������ ��� )
2.3 ���߻���� ���� (���� : interface)

3. ���
3.1 ������ �ǹ̴� ���뼺

3.2 ����  - �ʱ��� �������� ��� - �������̽� �� �����κ��� ���� ����� �ʱ����� �� 
3.3 ���뼺 >> ���� >> ��� (�ð�... ���� �ڿ��� �����.(�и�,�߻�ȭ,�Ϲ�ȭ))

4. ��� ���� Memory ?
	Gand >> Father > child
	
	����ڰ� ����� ��� Ŭ������ default Object Ŭ������ ��� �Ѵ�.
	class Car extends Object ... �����Ǿ��ִ�.
	Object ��� Ŭ������ root(�ֻ���) : ��� Ŭ������ �θ� Ŭ����  
	
*/
class Car extends Object {
}
class GrandFather extends Object {
	public GrandFather(){
		System.out.println("�Ҿƹ��� ������");
	}
	public int gmoney = 5000;
	private int pmoney = 10000; // private ���� ���� �Ұ� (��ü ,��Ӱ���) - ĸ��ȭ 
	
	public int getmoney() { // getmoney �� ���ؼ� �Լ��� ȣ���ؼ� �����ü��ִ�. ( ���� private �� ����� getter �� setter �� ������ �Ѵ� ) 
		return pmoney;
	}
}
class Father extends GrandFather {
	public Father() {
		System.out.println("�ƹ��� ������");
	}
	public int fmoney = 3000;
}

class Child extends Father {
	public Child() {
		System.out.println("���� ������");
	}
	public int cmoney = 1000;
}
public class Ex01_inherit {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney); // �Ҿƹ��� ���� ����
		System.out.println(child.fmoney); // �ƹ����� ����
		System.out.println(child.cmoney); 
		
		System.out.println(child.getmoney());
		
		Car car = new Car();
		
	}
}
