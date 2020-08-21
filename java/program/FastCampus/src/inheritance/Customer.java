package inheritance;

public class Customer {
	// 아이디 , 이름 , 등급 , 보너스포인트 , 보너스포인트 적립 비율
	private int customerID; 
	private String customerName; // 이름
	protected String customergrade;  // 등급 , 자식관계에서도 private를 주고싶으면
								  // protected로 준다.
	int bonusPoint; // 보너스포인트
	double bonusRatio; // 보너스할인율
/*	
	public Customer() { // 멤버변수 초기화 : 기본설정 
		customergrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 생성자 호출 ");

	}
*/	// 
	
	public Customer(int customerID,String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customergrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer (int,String) 생성자 호출 ");
	}

	
	// 가격 계산
	public int calcprice(int price) {// 가격을 받으면
	     bonusPoint += price * bonusRatio; 
	     // 보너스포인트 적립 ,  보너스포인트  = 가격 * 보너스할인율 
		 return price; // 지불할 가격 반환 
	}
	
	// 등급 확인
	public String showCustomerInfo() {
		return customerName+"등급은" + customergrade + " 이며 적립된 보너스 포인트는 "
				+ bonusPoint + "점 입니다.";
	}
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomergrade() {
		return customergrade;
	}

	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}	
	
	
}
