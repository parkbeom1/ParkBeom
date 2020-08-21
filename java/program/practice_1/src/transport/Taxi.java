package transport;

public class Taxi {
	private int taxinumber; // 택시번호
    int taximoney = 1200; // 택시 이용요금
	int taxigetmoney; // 택시 매출
	
	
	// 택시 정보를 가져온다.
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
