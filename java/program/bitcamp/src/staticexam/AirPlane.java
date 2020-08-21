package staticexam;

public class AirPlane {
	private String name; // �̸�
	private int number; // ��ȣ
	public static int total; // ��Ż����  (����)
	
	AirPlane(String name,int number){
		this.name = name;
		this.number = number;
		total++;  // ����Ⱑ ������ ������ ���� ��Ų��.
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
