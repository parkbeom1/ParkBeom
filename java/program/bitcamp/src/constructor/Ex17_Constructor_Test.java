package constructor;
/*
 	- �䱸���� -
	�ڵ��� ������ �Դϴ�.
	��������� ������ �ڵ����� �ȷ��� �մϴ�.
	���� �ڵ����� �⺻ ����� ����� �ְ� .. ���� ���� ���� �ɼ��� �����Ҽ������ϴ�.
	1. �ڵ����� �⺻�� ���� ������ 4�� �ڵ��� ������ ���� 
	���� 
	2. ���� ������ �����ϰ� �ڵ��� ������ 4�� �⺻���� �Ҽ� �ְ�
	3. ���� ������ �⺻���� �ϰ� �ڵ����� ������ ���� �����ϰ�
	4. ���� ������ �ڵ��� ���� ��θ� �����Ͽ� ���� �����ϰ� �ͽ��ϴ�.
*/
class Car1 {
	int door;
	String color;
	String carinfo;
	// 1. �����ڿ��� �ʱ�ȭ(�⺻����)
	Car1(){
		door = 4;
		color = "red";
		carinfo = door + color;
	}
	// 2. ���� ������ �����ϰ� �ڵ��� ������ 4�� �⺻
	Car1(int door){
		this.door = door;
		color = "red";
		carinfo = door + color;
	}
	// 3. ���� ������ �⺻���� �ϰ� �ڵ����� ������ ���� �����ϴ�
	Car1(String color) {
		this.color = color;
		door = 4;
		carinfo = door + color;
	}
	// 4. ���� ������ �����ϰ� �ڵ����� ������ ���� �����ϴ�
	Car1(String color,int door) {
		this.color=color;
		this.door=door;
		carinfo = door + color;
	}
}
public class Ex17_Constructor_Test {
	public static void main(String[] args) {
		Car1 car = new Car1(); // �⺻����
		System.out.println(car.carinfo);
		Car1 car1 = new Car1(5); // ���� ����
		System.out.println(car1.carinfo);
		Car1 car2 = new Car1("blue"); // ���� ����
		System.out.println(car2.carinfo);
		Car1 car3 = new Car1("green", 7); // ���� ������ ���� �����Ѵ�.		
		System.out.println(car3.carinfo);
	}
}
