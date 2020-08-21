package transport;

public class Subway {

	int subwaynumber; // 지하철번호
	int subwaymoney = 2000; // 지하철 이용요금
	int subwaygetmoney; // 지하철 매출
	
	public Subway(int subwaynumber) {
		this.subwaynumber = subwaynumber;
	}
	public int getSubwaynumber() {
		return subwaynumber;
	}
	public int getSubwaymoney() {
		return subwaymoney;
	}
	public int getSubwaygetmoney() {
		return subwaygetmoney;
	}
}
