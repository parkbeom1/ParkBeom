package thisexam;
/*
	��Ģ : �����ڴ� ��ü ������ �Ѱ��� ȣ���Ҽ��ִ�. (Car() �Ǵ� Car(10,20) or...)
	this ��ü �ּ�
	�Ʒ� �ڵ带 ���� ������ �ȵ�� �κ��� ������ �̾߱�...
	�ذ� : ������
*/
class Zcar {
	String color;
	String geartype;
	int door;
	
	public Zcar() { // �⺻�����ڿ��� �ʱ�ȭ�� �Ѵ�.
		this("Red","Auto",4);
		System.out.println("default constructor");
	}
	
	Zcar(String color,String geartype,int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
		// �����ε��� ���� ������ ��?
		// �����丵 : ������ ���� �ڵ带 ����� �Ѵ�.
	}
	void print() {
		System.out.print(this.color +" , " + this.geartype + " , " + this.geartype);
	}
}
public class Ex20_this {
	public static void main(String[] args) {
		Test5 t = new Test5(20,20);
		System.out.println(t.i + " , " + t.j);
		Book2 book = new Book2("ȫ�浿��");
		
		Socar socar = new Socar();
		socar.print();  // �⺻ ������ ȣ��
		
		Socar socar2 = new Socar("color", "auto", 5); 
		socar2.print(); // �����ε� ȣ��(������ �ڵ尡 ������ - �����丵 )
	}
}
