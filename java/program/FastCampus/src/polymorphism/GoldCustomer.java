package polymorphism;

public class GoldCustomer extends Customer {
	
	double salesRatio; 
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// TODO Auto-generated constructor stub
		
		salesRatio = 0.1;
		bonusRatio = 0.02;
		customergrade = "GOLD";
		
	}
	
	// 오버라이딩 해서 재구현
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
}
