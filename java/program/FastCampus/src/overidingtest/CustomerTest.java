package overidingtest;

public class CustomerTest {
	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000; // 보너스포인트 천점
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerPark = new Customer();
		customerPark.setCustomerName("박범");
		customerPark.setCustomerID(10030);
		customerPark.bonusPoint = 5000;
		System.out.println(customerPark.showCustomerInfo());
		*/
	
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());	
	
		
		Customer customerPark = new VIPCustomer(10030,"자링");
		// 하위클래스에서 상위클래스로의 변수타입으로 자동 형변환이 된다. ( 업캐스팅 )
		// 하지만 그 역은 성립하지 않는다. 
		// 변수의 타입이 Customer 이니까 Customer 것만 보인다.
		// 내포하고있기떄문에 대입이 가능하다
		
		Customer customerM = new VIPCustomer(10040,"오웅"); // 업캐스팅
		
		VIPCustomer customera =(VIPCustomer)customerM; // 다운캐스팅
		
		
		// 하위클래스 호출할떄 상위클래스의 생성자가 호출이 된다.
		// super()라는  자동으로 들어가는데 
		// 상위클래스의 메모리위치 참조값을 가지고 있다. 
		// this()는 다른생성자를 호출하는데 super()는 상위클래스의 참조주소를 가지는데
		// super()는  상위클래스의 기본생성자가 호출된다. 프리컴파일 단계에서는 자동으로 들어가게됨
		// 만약
		// 상위클래스의 기본생성자가 없는경우 하위클래스에서 명시적으로 생성자를 호출해야한다.
	}
}	
