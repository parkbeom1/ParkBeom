class Product {

		int price;
		int bonuspoint;

		Product(int price){ 
			this.price = price;
			this.bonuspoint =(int)(this.price / 10.0); 
		}
	}
	class Audio extends Product {
		Audio() {

			super(100); 
		}

		public String toString() {
			return "Audio"; 
		}
	}
	class KtTv extends Product {
		KtTv() {
		
			super(500); 
		}

		public String toString() {
			return "KtTv";
		}
	}
	class NoteBook extends Product {
		NoteBook() {
			super(150); 
		}
		public String toString() {
			return "NoteBook"; 
		}
	}
	class WashMachine extends Product {
		WashMachine() {
			super(250);
		}
	}
	class Computer extends Product {
		Computer() {
			super(300);
		}
		public String toString() {
			return "Computer"; 
		}
	}	

class Buyer {
	int money = 1000; // 돈
	int bonuspoint; // 포인트
	// 구매자는 구매행위를 할수 있다.
	// 구매행위 ( 잔액 - 제품의 가격 , 포인트 정보 갱신 ) 
	//  Key Point-> 구매자는 매장에 있는 모든 물건을 구매할수있다. <- Key Point
	// 1차 코드 물건이 3개니까 구매할수있는 함수도 3개 있어야 된다 
	void kttvBuy(KtTv tv) { // 객체의 주소를 파라미터로 받아줘야 이 함수 안에서 제품의 가격과 포인트를 알수 있다.
		if(this.money < tv.price) {
			System.out.println("고객님 잔액이 부족합니다.");
			return; // 구입할수없으면 함수를 빠져나감 ( 구매행위 종료   ) 
		} else {
			// 실 구매 행위
			this.money = (this.money - tv.price);
			this.bonuspoint = (this.bonuspoint + tv.bonuspoint);
			System.out.println("구매한 물건은 " + tv.toString());
		}
	}
	void audioBuy(Audio audio) { // 객체의 주소를 파라미터로 받아줘야 이 함수 안에서 제품의 가격과 포인트를 알수 있다.
		if(this.money < audio.price) {
			System.out.println("고객님 잔액이 부족합니다.");
			return; // 구입할수없으면 함수를 빠져나감 ( 구매행위 종료   ) 
		} else {
			// 실 구매 행위
			this.money = (this.money - audio.price);
			this.bonuspoint = (this.bonuspoint + audio.bonuspoint);
			System.out.println("구매한 물건은 " + audio.toString());	
		}
	}
	void notebookBuy(NoteBook notebook) { 		
		if(this.money < notebook.price) {
			System.out.println("고객님 잔액이 부족합니다.");
			return; // 구입할수없으면 함수를 빠져나감 ( 구매행위 종료   ) 
		} else {
			// 실 구매 행위
			this.money = (this.money - notebook.price);
			this.bonuspoint = (this.bonuspoint + notebook.bonuspoint);
			System.out.println("구매한 물건은 " + notebook.toString());
		}
	}
	// 1차 코드
	// 물건이 3개 
	// 1차 오픈
	// 재형 하와이 휴가 .... 
	// 공식 오픈 
	// 매장에 제품이 1000개 다른 제품이 추가됨 ( 마우스 , 토스추가) 제품 등록 POS 등록 자동화 )
	// 매장에 제품이 전시됨(1000개...)
	// 1. 매장에서 구매자가 3개 밖에 구매를 못한다..나머지 997개의 제품을 살수가 없다.  왜 ? 구매할수있는 기능이 3개만 해놨으니까
	
	// 관리자 >> pc방 >> 국내 전산망 >> 개발 서버 접속 >>  
	// End
	// 변화에 대응하는 코드를....
	// 즐거운 휴가를 보내기 위한 방법을 제시

	// 3차 개선
	// 제품이 추가 되더라도 구매행위 계속
	// 하나의 이름 , 중복 코드 제거...
	// 모든 제품이 pruduct 를 상속(부모)
	// Product p
	// Audio audio = new Audio();
	// p = audio;
	// p.toString() 에 접근이 가능 
	
	
	void Buy(Product product) { // 객체의 주소를 파라미터로 받아줘야 이 함수 안에서 제품의 가격과 포인트를 알수 있다.
		if(this.money < product.price) {
			System.out.println("고객님 잔액이 부족합니다.");
			return; // 구입할수없으면 함수를 빠져나감 ( 구매행위 종료   ) 
		} else {
			// 실 구매 행위
			this.money = (this.money - product.price);
			this.bonuspoint = (this.bonuspoint + product.bonuspoint);
			System.out.println("구매한 물건은 " + product.toString());		
		}
	}
 
}
// KtTv tv = new KtTv(500); 제품이 만들어질때 다른 가격을 가지고 있다.
public class Ex12_Inherit_ {
	public static void main(String[] args) {
		// 매장
		// 재사용하고 super 로 오버라이딩으로 부모 생성자 호출해봤음 
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		// 구매자가 buy 할수있어야 한다.
		Buyer buyer = new Buyer();
		
		/*
		buyer.kttvBuy(tv); // tv를 샀다
		System.out.println(buyer.money);
		System.out.println(buyer.bonuspoint);
		*/
		/*
		buyer.kttvBuy(tv);
		buyer.notebookBuy(notebook);
		buyer.kttvBuy(tv);
		buyer.audioBuy(audio);
		*/
		
		// 세탁기를 넣는다고 치면 
		//	// 3차 개선
		// 제품이 추가 되더라도 구매행위 계속
		// 하나의 이름 , 중복 코드 제거...
		// 모든 제품이 pruduct 를 상속(부모)
		// Product p
		// Audio audio = new Audio();
		// p = audio;
		// p.toString() 에 접근이 가능
		
		/*
		WashMachine washmachine = new WashMachine();
		Buyer product = (Buyer) Product(washmachine.price);
		buyer.Buy(washmachine);	
	    */
		
		// 사용자가 세탁기를 샀을 경우 
		WashMachine washmachine = new WashMachine();
		buyer.Buy(washmachine);
		System.out.println(buyer.money);
		System.out.println(buyer.bonuspoint);
		
		// 사용자가 컴퓨터를 샀을 경우 
		 Computer computer = new Computer();
		 buyer.Buy(computer);
		 System.out.println(buyer.money);
		 System.out.println(buyer.bonuspoint);
	}
}
