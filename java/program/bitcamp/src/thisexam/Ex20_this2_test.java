package thisexam;

class Zcar3 {
	String color;
	String geartype;
	int door;
	
	public Zcar3() { // �⺻���� 
		System.out.println("�⺻ ������");
	}
	
	public Zcar3(String color,String gertype) {
		this.color = color;
		this.geartype = geartype;
		System.out.println("Overloading constructor param 2��");
	}
	
	public Zcar3(String color, String geartype, int door) {
		super();
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("Overloading constructor param 3��");
	}
	void print() {
		System.out.println("������ : " + color + " �� ���� : " + door);
	}
}
public class Ex20_this2_test {
	public static void main(String[] args) {
		Zcar zcar = new Zcar();
		
		zcar.print();
	}
}
