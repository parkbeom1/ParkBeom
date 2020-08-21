package staticexam;

public class AirPlane {
	private String name; // 이름
	private int number; // 번호
	public static int total; // 토탈개수  (공유)
	
	AirPlane(String name,int number){
		this.name = name;
		this.number = number;
		total++;  // 비행기가 생성시 개수를 증가 시킨다.
	}
	public static void main(String[] args) {
		AirPlane air = new AirPlane("A",1101);
		AirPlane air2 = new AirPlane("B",2202);
		AirPlane air3 = new AirPlane("C",3303);
		
		System.out.println(air.name + air.number);
		System.out.println(air2.name + air2.number);
		System.out.println(air3.name + air3.number);
		System.out.println(AirPlane.total);
	}
}
