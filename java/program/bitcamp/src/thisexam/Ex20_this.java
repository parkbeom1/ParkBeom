package thisexam;
/*
	원칙 : 생성자는 객체 생성시 한개만 호출할수있다. (Car() 또는 Car(10,20) or...)
	this 객체 주소
	아래 코드를 보고 마음에 안드는 부분이 있으면 이야기...
	해결 : 생성자
*/
class Zcar {
	String color;
	String geartype;
	int door;
	
	public Zcar() { // 기본생성자에서 초기화를 한다.
		this("Red","Auto",4);
		System.out.println("default constructor");
	}
	
	Zcar(String color,String geartype,int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
		// 오버로딩이 먼저 찍힌다 왜?
		// 리팩토링 : 기존에 만든 코드를 재수정 한다.
	}
	void print() {
		System.out.print(this.color +" , " + this.geartype + " , " + this.geartype);
	}
}
public class Ex20_this {
	public static void main(String[] args) {
		Test5 t = new Test5(20,20);
		System.out.println(t.i + " , " + t.j);
		Book2 book = new Book2("홍길동전");
		
		Socar socar = new Socar();
		socar.print();  // 기본 생성자 호출
		
		Socar socar2 = new Socar("color", "auto", 5); 
		socar2.print(); // 오버로딩 호출(수정된 코드가 찍힌다 - 리팩토링 )
	}
}
