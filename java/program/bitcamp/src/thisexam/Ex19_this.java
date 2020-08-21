package thisexam;
/*
	this를 사용하여 여러개의 생성자를 호출한다.
	 1. 객체 자신을 가르키는 this(앞으로 생성될 주소를 담을 곳이라고 가정)
	 2. this 객체 자신(생성자 호출) >> 원칙 : 여러개의 생성자를 호출한다.
*/
class Test5{
	int i;
	int j;
	
	Test5(int i,int j) {
		// 그런데 가독성 문제.. member field 같이
		// Test(int i,int j){} 만약 this를 하지않으면 둘다 파라미터가 i가 된다.
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
	public Socar() { // 생성자에서 기본설정 한다.
		this.color = "red";
		this.geartype = "auto";
		this.door = 4;
	}
	// 값을 바꾸기 ( 즉 초기화)
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
		
		Socar socar = new Socar(); // 기본 생성자 호출
		socar.print();
		
		//오버 로딩을 호출하여 내가 원하는 값으로 초기화 할수 있다.
		Socar socar2 = new Socar("Color", "Auto", 5);
		socar2.print();
	}
}
