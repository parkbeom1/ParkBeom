package practice;

class Shape {
	String color="red";
	
	void draw() {
		System.out.println("������ �׸���");
	}
}

class Point { // ���� �� ��� Ŭ���� 
	
	int x , y; // ��ǥ 
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this(10,15);
	}
}
//���� ���弼�� ( ���� ���� : ���� ������ �������� ������ �ִ�)
//1. ���� �����̴� (is ~ a) : ����(shape)
//2. ���� ���� ������ �ִ� (has ~ a) : ��(Point) >> member  field 
//3. ���� �������� ������ �ִ� ( Ư����) : r
//���� ��������  �ʱⰪ 10�� ������
//���� ��ǥ�� �ʱⰪ (10,15) ������
//�⺻(�ʱⰪ) �������� ������ �������� ���� ���� �Է¹��� �� �ִ�  (���� ����� ����)
class Circle extends Shape {
	Point point; // ���� ���� ������ �ִ�.
	int r;
	
	public Circle(int r , Point point) {
		this.r = r;
		this.point = point;
	}
	
	public Circle() {
		
		this(10,new Point(10,15));
	}

	@Override
	void draw() {
		System.out.println("���� �׸���.");
	}
}
//�� ����� ���� ���� �ϼ̴ٸ� �Ʒ� ������ .......
//���� 2)
//�ﰢ�� Ŭ������ ���弼��
//����) �ﰢ���� 3���� ���� ����  �׸��� �׸��ٶ�� ����� ������ �ִ�
//Shape, point ���� �޾ƿ�
//hint) (x,y)  (x,y)  (x,y) 3���� ��ǥ�� 
//default �� �׸� �� �ְ� , 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�
//80��
//why : ���� Ÿ���� ������ �����ǰ� �ִ� 
//int x, y, z
//int[] .....

class Triangle extends Shape {
	Point point;
	Point point2;
	Point point3;
	public Triangle(Point point,Point point2,Point point3) {
		this.point = point;
		this.point2 = point2;
		this.point3 = point3;
	}
	// Point point = new Point();  ��ü ��ü�� �����κ��� �����Ǵϱ�
	// this() ������ ��  �ν��Ͻ�ȭ ���ִ°� new �� ���� ���ִ� 
	// �������� ������ ������ Ÿ�� �� ���µ� �ּҰ��� �޴°� �Ķ���ͷ� ��
	public Triangle() {
		this(new Point(), new Point(),new Point());
	}
}
class Triangle2 extends Shape {
	Point[] point;
	public Triangle2(Point[] point) { // �����ڴ� ������ 
		this.point = point;
	}
	// Point[] point = new Point[]{�ʱ�ȭ ����} ;
	public Triangle2(){ 
		this(new Point[] 
		{new Point(10,20),new Point(30,40),new Point(50,60)});
		// �ٸ� ������ ȣ��
	}
	void trianglePoint() {
		for(Point pointarray : point) {
			System.out.println();
		}
	}
}


public class Ex02_Inherit_Composition {	
	public static void main(String[] args) {
		
	}
}
 
 


