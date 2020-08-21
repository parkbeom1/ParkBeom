package transport;

public class Bus {

	int busnumber; // 버스번호
	int busmoney = 1000; // 버스 이용요금
	int busgetmoney; // 버스 매출	
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
