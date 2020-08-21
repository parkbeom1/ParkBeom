package FruitSystem;

// 과일파는 사람 클래스
class FruitSeller {
	int numOfApple; // 사과갯수
	int myMoney; // 내가 가진 돈
	final int APPLE_PRICE; // 사과 1개 가격 , final 선언 함부로 못바꿈

// 과일파는 사람 생성자
public FruitSeller (int apple,int money,int price) {
				// 위에 선언된 매개변수 3개를 초기화
	this.numOfApple=apple;
	this.myMoney=money;
	this.APPLE_PRICE=price;
	}

// 과일을판다(행위)
	public int saleApple(int money) { // 사과판개수를 result에 저장
		int result = money / APPLE_PRICE; // numOfApple -= result; 
		numOfApple = numOfApple - result; // 남은사과갯수 = 있던사과갯수 - 판사과갯수
		myMoney += money; // myMoney = myMoney + money ; 
		// 내가 가진돈 = 원래있던돈 + 사과팔아 받은돈
		return result; // 결과를 리턴
	}

// 정산(행위)
	public void showSaleResult() {
		System.out.println("남은 사과 갯수 : " + numOfApple);
		System.out.println("판매 이익 : " + myMoney);
	}
}
//과일사는 사람 클래스
class FruitBuyer {
	int myMoney; // 가진돈(속성/특징)
	int numOfApple; // 사과 갯수(속성/특징)

	// 과일사는사람 생성자 위에 선언된 변수를 초기화 한다.
	public FruitBuyer(int myMoney,int numOfApple) {
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
	}
	// 과일산다(행위)
	public void buyApple(FruitSeller sell,int money) { // 파라미터로 과일파는 사람과 돈을 받는다.
		// 사과갯수 = 원래가진사과갯수 + 과일파는사람의 saleApple메소드의 
		// result 값을 리턴받은 값 즉 원래 사과 가진 갯수 + 산갯수
		
		numOfApple += sell.saleApple(money); // 과일을파는행위의 result 값 money를받음
		myMoney -= money; // 내가가진돈 = 원래있던돈 - 사과샀던돈
	}
// 가계부(행위)
	public void showBuyResult() {
		System.out.println("남은 금액 : " + myMoney);
		System.out.println("구매한 사과 갯수 : " + numOfApple);
	}
}

//사과장수 메인
class FruitSaleMain {
	public static void main(String[] args) {
		System.out.println("E-마트");
		FruitSeller seller; // 과일파는사람 객체 생성
		seller = new FruitSeller(1000, 10000, 1000); // 사과가진 갯수 , 가진돈 , 1개당 가격
			
		FruitBuyer buyer; // 과일사는 사람 객체 생성
		buyer = new FruitBuyer(10000, 0); // 가진돈, 가진 사과갯수
		buyer.buyApple(seller, 3000); // 이마트에서 산다. 3천원어치
		//구매자의 가계부
		buyer.showBuyResult();
		//과일장수의 정산 내역
		seller.showSaleResult();
		
		System.out.println();
		System.out.println("동네 사과가게");
		FruitSeller seller2;
		seller2 = new FruitSeller(100,0,2000); // 가진 사과갯수 ,가진돈 ,1개당 가격
		
		buyer.buyApple(seller2, 4000); // 동네가게에서 산다 4천원어치
	
		// 과일장수의 가계부 
		buyer.showBuyResult();
		// 과일장수의 정산내역
		seller2.showSaleResult();
	}
}








public class FruitSystem {

}
