package transport;

public class Bus {

	int busnumber; // ������ȣ
	int busmoney = 1000; // ���� �̿���
	int busgetmoney; // ���� ����	
	public Bus(int taxinumber) {
		this.busnumber = taxinumber;
	}
	public int getBusnumber() {
		return busnumber;
	}
	public int getBusmoney() {
		return busmoney;
	}
	public int getBusgetmoney() {
		return busgetmoney;
	}
}
