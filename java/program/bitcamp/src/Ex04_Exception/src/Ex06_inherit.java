/*
	this : ��ü �ڽ��� ����Ű�� this(this.empno , this.ename)
	this : �����ڸ� ȣ���ϴ� (this(100,"red"))
	���
	�θ�.�ڽ�
	super (�����ڽ��� �θ��� ���� �ּҰ�)  ��Ӱ��迡�� �θ� ���� ������ �ϴ� ��� 
	super�� �θ� ��ü�� �ּҰ��̴�. 
	1. super >> ��� ���迡�� �θ� �ڿ� ����
	2. super >> ��� ���迡�� �θ��� �����ڸ� ȣ���Ҷ� (���������)	
	tip) java >> super()
*/
class Base {
	String basename;
	Base() {
		System.out.println("Base �⺻ ������ �Լ�");
	}
	Base(String basename) {
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("�θ� ������ �޼ҵ�");
	}
}
class Derived extends Base {
	String dname;
	Derived(){
		System.out.println("Derived �⺻ ������ �Լ� ");
	}
	Derived(String dname) {
		// ���� �θ� ������(overloading) .. ȣ��...
		super(dname);  // �θ��� Base(String basename) ȣ�� 	
		this.dname = dname;
		System.out.println("dname " + this.dname);
	}
	@Override
	void method() {
		System.out.println("�ڽ��� ������ �޼ҵ�");
	}
	// ����� �θ�� �ڿ��� �׸����� { method ... ������ ...
	// ������ ��� super�� ���ؼ� �θ� �ڿ��� ���� �Ѵ�. �ڽ��� ���(�Լ� �ȿ����� ��� ����)
	void parent_method() {
		super.method(); // �θ��� �޼ҵ忡 �����Ѵ�. 
	}
}
public class Ex06_inherit {
	public static void main(String[] args) {
		/*
		Derived d= new Derived();
		System.out.println(d.basename);
		System.out.println(d.dname);
		d.method(); // �ڽ��� ������ �޼ҵ�
		d.parent_method(); // �θ� ������ �޼ҵ� 
		*/
		Derived d = new Derived("hello");
	}
}
