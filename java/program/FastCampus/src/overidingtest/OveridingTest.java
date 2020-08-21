package overidingtest;

public class OveridingTest {
	public static void main(String[] args) {
		Customer customerKim = new Customer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		
		VIPCustomer customerJam = new VIPCustomer(10020,"김유신");
		customerJam.bonusPoint = 10000;
		
		int priceKim = customerKim.calcprice(10000); // 물건구입
		int priceJam = customerJam.calcprice(10000);
		
		System.out.println(customerKim.showCustomerInfo() + "지불 금액은 : " + priceKim + " 원 입니다.");	
		System.out.println(customerJam.showCustomerInfo() + "지불 금액은 : " + priceJam + " 원 입니다.");	
	
		// 업캐스팅  타입을 부모타입으로 하면 부모것만 보인다. 
		Customer customerNo = new VIPCustomer(10010,"나몰라");
		customerNo.bonusPoint = 10000;
		// 오버라이딩된 인스턴스의 메소드가 불렸다 (가상함수 : 메소드의 이름과 메소드 주소를 가진 가상 메소드 테이블에서
		// 호출될 메소드의 주소를 참조한다. 
		// 결국 생성된 인스턴스의 메소드로 재정의된 메소드가  불리게된다. 
		// 메소드끼리 이름이 같다고 같은 주소값을 가지지않는다 서로 다른 주소값을 가진다.
		
		System.out.println(customerNo.showCustomerInfo() + "지불 금액은 : " + customerNo.calcprice(10000) + " 원 입니다.");	
		
	}
}
