package thisexam;
/*
	this�� ����Ͽ� �������� �����ڸ� ȣ���Ѵ�.
	 1. ��ü �ڽ��� ����Ű�� this(������ ������ �ּҸ� ���� ���̶�� ����)
	 2. this ��ü �ڽ�(������ ȣ��) >> ��Ģ : �������� �����ڸ� ȣ���Ѵ�.
*/
class Test5{
	int i;
	int j;
	
	Test5(int i,int j) {
		// �׷��� ������ ����.. member field ����
		// Test(int i,int j){} ���� this�� ���������� �Ѵ� �Ķ���Ͱ� i�� �ȴ�.
		// >> this >> Test >>
		this.i = i;
		this.j = j;
	}
}
class Book2 {
	String bookname;
	public Book2(String bookname) {
		this.bookname = bookname;
	}
}
// Today Point
class Socar{
	String color;
	String geartype;
	int door;
	public Socar() { // �����ڿ��� �⺻���� �Ѵ�.
		this.color = "red";
		this.geartype = "auto";
		this.door = 4;
	}
	// ���� �ٲٱ� ( �� �ʱ�ȭ)
	public Socar(String color,String geartype,int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	public void print() {
		System.out.println(this.color + "\n" + this.geartype + "\n" + this.door);
	}
}
public class Ex19_this {
	public static void main(String[] args) {
		Test5 t = new Test5(20,20);
		System.out.println(t.i + "," + t.j);
		
		Socar socar = new Socar(); // �⺻ ������ ȣ��
		socar.print();
		
		//���� �ε��� ȣ���Ͽ� ���� ���ϴ� ������ �ʱ�ȭ �Ҽ� �ִ�.
		Socar socar2 = new Socar("Color", "Auto", 5);
		socar2.print();
	}
}
