package transport;

public class Taxi {
	private int taxinumber; // �ýù�ȣ
    int taximoney = 1200; // �ý� �̿���
	int taxigetmoney; // �ý� ����
	
	
	// �ý� ������ �����´�.
	public Taxi(int taxinumber) {
		this.taxinumber = taxinumber;
	}
	public int getTaxinumber() {
		return taxinumber;
	}
	public int getTaximoney() {
		return taximoney;
	}
	public int getTaxigetmoney() {
		return taxigetmoney;
	}
}
