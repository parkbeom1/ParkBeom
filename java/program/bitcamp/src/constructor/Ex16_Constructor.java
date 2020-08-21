package constructor;
/*
	������ �Լ�(Constructor)
	1. �Լ�(Ư���� ����)
	2. Ư���� ����(member field �ʱ�ȭ)
	Tip { �Ϲ� �ʱ��� } static { �ʱ��� �Լ� }
	3. �Ϲ� �Լ��� �ٸ����� �̸��� �ٸ��� �Լ� �̸��� �����Ǿ� �ִ�.
	 �Լ� �̸��� Ŭ�����̸��� �Ȱ���
	3.2 ���� ���� : ��ü ���� new �� ������ �� �޸𸮿� ������ �����
	 �ι�°�� ����(�ν��Ͻ�����) �� �ö󰡰� ���� �ڵ����� ȣ��Ǵ� �Լ��̴�.
	3.3 ���� ���� ������ return Ÿ���� ����. �� void ��� ���̴�. 
	void >> public void Ŭ���� �̸�
	4. ���� : �����Ǵ� ��ü���� ���������� �ٸ� ��� member field ���� �ʱ�ȭ �Ҽ��ִ�
	class Car {String color;}
	�ڵ����� ����� �ڵ����� ������ ������ �ϳ� ������ �Ѵ�(�䱸����) -= ������
	class Car {String color ,public Car(String color) 
	{ this.color = color }}
	�ڵ����� ����� ������ �ϳ��� ������ �����µ� �ٸ� ���� �������� �ִ�.
	5. ������ �Լ��� �ϳ��� �̸����� �������� ����� �����ε��� �����ϴ�
	6. ����� ���� �����ε� �����ڸ� ������ �Լ��� �ϳ��� ���� �ߴٸ� 
	* ����Ʈ ������ �Լ��� �ݵ�� ������ ��� �Ѵ�. ( �߿� ) 	
*/
// ����� ���� �ڵ����� ����� �ݵ�� �ڵ����� �̸��� �ο����ּ���.
class Car{
	String carname;
	/*������ �����ڴ� ��� Ÿ���� void �� ������ �����ϴ�. ������ �ϰ� Ŭ������ �ٷ� ���´�
	  private�� �ü��� �ִµ� �̱��� ���� �ٲ۴�.
	*/
}
class Car2 {
	String carname;
	
	Car2(){ // �⺻�����ڿ��� �ʱ�ȭ �Ѵ�.
		carname = "����"; 
		}
	}

class Car3 {
	String carname;
    Car3() {
		carname = "����";
		}
    Car3(String name) {
    	this.carname = name;
    	}
	}
class Car4 {
	String carname;
	/* default constructor �ڵ尡 ����
	default constructor �����Ǹ�
	���������� overloading �����ڸ� �����ߴٸ� ... default �� �ڵ����� ��������� �ʴ´�
	�������� �ǵ��� �ڵ����� �����Ҷ� ������ �̸��� ������� �������� ����.
	*/
	public Car4(String carname) {
		this.carname = carname;
		}
	}
public class Ex16_Constructor {
	public static void main(String[] args) {
		
		Car car = new Car(); // �����ڰ� ���� �����ڸ�
							 // ������ ������ �����Ϸ��� �ڵ����� �Ʒ� �ڵ�(�⺻�����ڸ� �����Ѵ�)
		car.carname = "����";
		
		Car2 c2 = new Car2();
		System.out.println(c2.carname); // ����
		
		Car3 c3 = new Car3("ī�Ϲ�");
		System.out.println(c3.carname);
		
		Car4 c4 = new Car4("K7");
		System.out.println(c4.carname);
	}
}
