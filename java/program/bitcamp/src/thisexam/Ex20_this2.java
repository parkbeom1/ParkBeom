package thisexam;

class Zcar2 {
	String color;
	String geartype;
	int door;
	public Zcar2() { // 생성자에서 기본설정
		this("red","auto",4); // this생성자 호출
		System.out.println("default constructor");
	}
	public Zcar2(String color,String geartype) {
		this.color = color;
		this.geartype = geartype;
		System.out.println("Overloading constructor param 2개");
	}
	
	// 반복되는 코드는 맨 뒤에 넣으면 된다. 앞에서 this()함수를 써서 코드를 부른다
	Zcar2(String color,String geartype,int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("Overloading constructor param 3개");
	}
	void print() {
		System.out.println(" 색깔은 : " + color + " 문 수는 : " + door + " 기어종류는 : " + geartype);
	}
}
public class Ex20_this2 {
	public static void main(String[] args) {
		Zcar2 zcar = new Zcar2(); 
		// 나중에 오버로딩된 메소드가 가장 먼저 실행된다. 그리고 기본생성자는 무조건 실행된다.
		zcar.print(); // 3
	}
}
