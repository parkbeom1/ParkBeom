package task;

public class AirPlane {
	private String airname;
	private int airnum;
	public static int total = 0;
	
	// 생성자에서 초기화 한다.
	public AirPlane() {
		this.airname = airname;
		this.airnum = airnum;
		total++; // 생성자를 만들때마다 static 공유값을 증가시킨다.
		// 즉 비행기 만들때마다 비행기 수를 증가시킨다.
	}
	public void showInfo() {
		System.out.println(" 비행기의 이름은 : " + airname +"  비행기의 번호는 : " + airnum);
	}
	public static void countInfo() {
		System.out.println(" 비행기의 수는 : " + total);
	}
	public static void main(String[] args) {
		AirPlane air1 = new AirPlane();
		air1.airname = "아시아나";
		air1.airnum = 5050;
		
		air1.showInfo();
		AirPlane.countInfo();
	}
}
