package overidingtest;

public class VIPCustomer extends Customer {
	
// 속성과 기능이 확장 
	/*
	// 아이디 , 이름 , 등급 , 보너스포인트 , 보너스포인트 적립 비율
	private int customerID;
	private String customerName; // 이름
	private String customergrade;  // 등급
	int bonusPoint; // 보너스포인트
	double bonusRatio; // 보너스할인율
	*/
	
	// 기존의 Customer 에 담당상담원과 또 할인율이 있다.
	double salesRatio;
	private int agentID;
	
	// customer이 가지고있는 기능에 더해서 VIPCustomer 를 만드는것이므로
	// 상속을 사용한다.
	/*
	public VIPCustomer() {
		// private은 상속관계에서 바로 접근할수없다. 접근권한을 주고싶으면 protected 
	
//		super(); // 부모의 기본생성자를 정의하지않으면 다른 생성자를 호출시켜야한다
		// 부모가 아무 생성자가 없으면 부모는 기본생성자를 자동으로 가지고 있다. 
		// 명시적으로 불러주기

		
		customergrade = "VIP"; // 등급  protected를 받음
		bonusRatio = 0.05; // 5프로적립
		salesRatio = 0.1; // 10프로 할인
		
		System.out.println("VIPCustomer() 생성자 호출");
	*/
	
	// 자식이 생성자가 없으면 부모의 생성자를 명시적으로 불러올수있다. 
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// 상위클래스의 기본생성자가 없으면 명시적으로 호출해야한다.
		
			// TODO Auto-generated constructor stub
		customergrade = "VIP"; // 등급  protected를 받음
		bonusRatio = 0.05; // 5프로적립
		salesRatio = 0.1; // 10프로 할인
		
		// 상위클래스의 메소드 내용이 하위클래스에 메소드에 맞지 않은경우
		// 하위클래스에서 재정의 할수있다. 
		}

	@Override // 에너테이션 ( 컴파일에게 이 메소드는 오버라이딩 메소드를 알려준다 컴파일러에게 정보를 전해줌
	public int calcprice(int price) {
//		return super.calcprice(price); // super는 부모의 상위클래스를 참조한다
		bonusPoint += price * bonusRatio;  // 포인트 = 포인트 + 가격 * 할인율 
		 return price - (int)(price * bonusRatio);// 가격 - 가격 *할인율
	}
}

