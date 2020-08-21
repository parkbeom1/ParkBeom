/*
	Bird를 상속 받아서 구현을 할것이다.
	Protected : 상속 관계에서 재정의를 해줘도 되고 안해줘도 된다. ( 선택 사항  )
*/
class Bi extends Bird2 {
	// 재정의 했으면 좋겠어  왜 protected 로 받나? default 와 같으니까 
	@Override
	protected void moveFast() {
		super.moveFast(); // 부모쪽의 구현한것을 불러온다.
		}
	}
	class Ostrich extends Bird2 { // 새가 날수없으면 ? 
		// 구체화 특수화
		void run() {
			System.out.println("run ^^");	
		}
		@Override 	// 재정의해서 내가 따로 필요에 따라 구현을 해줄수있다. 상속관계에서 재정의 하면 된다. protected를  
					// 안쓴다고 해서 문제 되지는 않는다. 
		protected void moveFast() {
			run(); 	// run 하기때문에 빠르다고 볼수있다.
		}
	}
public class Ex09_Protected {
	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();
		Ostrich o = new Ostrich();
		o.run();
	}
}
