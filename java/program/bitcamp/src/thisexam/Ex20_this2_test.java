package thisexam;

class Zcar3 {
	String color;
	String geartype;
	int door;
	
	public Zcar3() { // 기본설정 
		System.out.println("기본 생성자");
	}
	
	public Zcar3(String color,String gertype) {
		this.color = color;
		this.geartype = geartype;
		System.out.println("Overloading constructor param 2개");
	}
	
	public Zcar3(String color, String geartype, int door) {
		super();
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("Overloading constructor param 3개");
	}
	void print() {
		System.out.println("색깔은 : " + color + " 문 수는 : " + door);
	}
}
public class Ex20_this2_test {
	public static void main(String[] args) {
		Zcar zcar = new Zcar();
		
		zcar.print();
	}
}
