package task;

public class AirPlane {
	private String airname;
	private int airnum;
	public static int total = 0;
	
	// �����ڿ��� �ʱ�ȭ �Ѵ�.
	public AirPlane() {
		this.airname = airname;
		this.airnum = airnum;
		total++; // �����ڸ� ���鶧���� static �������� ������Ų��.
		// �� ����� ���鶧���� ����� ���� ������Ų��.
	}
	public void showInfo() {
		System.out.println(" ������� �̸��� : " + airname +"  ������� ��ȣ�� : " + airnum);
	}
	public static void countInfo() {
		System.out.println(" ������� ���� : " + total);
	}
	public static void main(String[] args) {
		AirPlane air1 = new AirPlane();
		air1.airname = "�ƽþƳ�";
		air1.airnum = 5050;
		
		air1.showInfo();
		AirPlane.countInfo();
	}
}
