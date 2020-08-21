
// 새(공통자원)  일반 , 추상화 새는 날수있다 새는 빠르다 
public class Bird2 {
	// 공통 기능
	public void fly() {
		System.out.println("flying");
	}
	
	protected void moveFast() { // 새는 빠르다  필요에 따라 재정의를 해라 
		fly(); // 날수있으니까
	}
	// 설계자가 당신한테 protected 가 있다는건
	// 나를 상속하는 당신은 moveFast() 를 필요에 따라서 재정의 했으면 좋겠어 
	// 내가 잘 모르겠는데 때에 따라서 했으면 좋겠어 (안해도된다) - 강제성이 없다 
	// 날지 않는 새가 있으니 필요에 따라 재정의 할수있다.
}
