package thisexam;

class Zcar2 {
	String color;
	String geartype;
	int door;
	public Zcar2() { // �����ڿ��� �⺻����
		this("red","auto",4); // this������ ȣ��
		System.out.println("default constructor");
	}
	public Zcar2(String color,String geartype) {
		this.color = color;
		this.geartype = geartype;
		System.out.println("Overloading constructor param 2��");
	}
	
	// �ݺ��Ǵ� �ڵ�� �� �ڿ� ������ �ȴ�. �տ��� this()�Լ��� �Ἥ �ڵ带 �θ���
	Zcar2(String color,String geartype,int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("Overloading constructor param 3��");
	}
	void print() {
		System.out.println(" ������ : " + color + " �� ���� : " + door + " ��������� : " + geartype);
	}
}
public class Ex20_this2 {
	public static void main(String[] args) {
		Zcar2 zcar = new Zcar2(); 
		// ���߿� �����ε��� �޼ҵ尡 ���� ���� ����ȴ�. �׸��� �⺻�����ڴ� ������ ����ȴ�.
		zcar.print(); // 3
	}
}
