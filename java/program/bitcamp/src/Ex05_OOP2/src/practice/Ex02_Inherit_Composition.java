package practice;

class Shape {
	String color="red";
	
	void draw() {
		System.out.println("도형을 그리다");
	}
}

class Point { // 한점 을 찍는 클래스 
	
	int x , y; // 좌표 
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this(10,15);
	}
}
//원을 만드세요 ( 원의 정의 : 원은 한점과 반지름을 가지고 있다)
//1. 원은 도형이다 (is ~ a) : 도형(shape)
//2. 원은 점을 가지고 있다 (has ~ a) : 점(Point) >> member  field 
//3. 원은 반지름을 가지고 있다 ( 특수성) : r
//원의 반지름은  초기값 10을 가진다
//점의 좌표는 초기값 (10,15) 가진다
//기본(초기값) 설정하지 않으면 반지름과 점을 값을 입력받을 수 있다  (원이 만들어 질때)
class Circle extends Shape {
	Point point; // 원은 점을 가지고 있다.
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
		System.out.println("원을 그리다.");
	}
}
//원 만드는 것을 이해 하셨다면 아래 문제를 .......
//문제 2)
//삼각형 클래스를 만드세요
//정의) 삼각형은 3개의 점과 색과  그리고 그리다라는 기능을 가지고 있다
//Shape, point 제공 받아요
//hint) (x,y)  (x,y)  (x,y) 3개의 좌표값 
//default 로 그릴 수 있고 , 3개의 좌표값을 받아서 그릴 수 있다
//80점
//why : 같은 타입의 변수가 나열되고 있다 
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
	// Point point = new Point();  객체 자체가 힙으로부터 생성되니까
	// this() 생성자 가  인스턴스화 해주는게 new 를 통해 해주는 
	// 참조형은 참조형 데이터 타입 이 들어가는데 주소값을 받는게 파라미터로 들어감
	public Triangle() {
		this(new Point(), new Point(),new Point());
	}
}
class Triangle2 extends Shape {
	Point[] point;
	public Triangle2(Point[] point) { // 생성자는 같도록 
		this.point = point;
	}
	// Point[] point = new Point[]{초기화 진행} ;
	public Triangle2(){ 
		this(new Point[] 
		{new Point(10,20),new Point(30,40),new Point(50,60)});
		// 다른 생성자 호출
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
 
 


