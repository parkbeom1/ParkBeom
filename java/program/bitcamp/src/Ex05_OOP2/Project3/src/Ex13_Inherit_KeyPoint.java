
class Product2 {
	int price;
	int bonusPoint;
	
	public Product2(int price) { // 초기 금액 설정 
		this.price = price; // 초기금액 설정
		this.bonusPoint = (int)(this.price/10.0); 
	}
}
class KtTv2 extends Product2 {
	KtTv2() {
		super(500);
	}
	public String toString() {
		return "KtTv2";
	}
}
class Audio2 extends Product2 {
	Audio2() {
		super(300);
	}
	public String toString() {
		return "Audio2";
	}
}
class NoteBook2 extends Product2 {
	NoteBook2() {
		super(250);
	}
	public String toString() {
		return "NoteBook2";
	}
}

class Buyer2 {
	int money;
	int bonuspoint;
	
	// 장바 구니 생성 ( 모든 전자제품 )
	Product2[] Cart; // Product2를 객체 배열로 생성 과 하나의 카트 
	int index = 0;   // 0부터 시작 
	
	Buyer2(){  // 내가 가지고있는돈 초기금액 설정 
		this(1000,0); // money,bonuspoint  
	}
	Buyer2(int money,int bonuspoint) {
		Cart = new Product2[10]; // 장바구니10칸배열에 하나의 카트
		this.money = money;
		this.bonuspoint = bonuspoint;
	}
	
	// 구매 기능 안에 장바구니 (cart) 넣는 기능 같이 포함하세요 -  cart는 참조배열 
	void Buy(Product2 product) { // 다형성 Product2 product = 
		if(this.money < product.price) {  // 내 돈 < 물품 가격
			System.out.println("고객님 잔액이 부족합니다.^^" + this.money);
			return;
		}
		// Cart 범위 제한
		if(this.index >= 10) { // this.index >> 전역 ... > 모든 함수에서 사용가능
			// 배열 인덱스 번호가 10 이상이면 
			System.out.println("[고객님 그만 사세요 ^^ ]");
			return;
		}
		// 장바구니 담기  
		Cart[index++] = product; // product 물품들을 집어넣으면 Cart의 인덱스 번호가 1씩 증가한다.   
		
		// 실재 구매 행위
		this.money -= product.price; // 잔액   내돈 = 내돈 - 물품가격 
		this.bonuspoint += product.bonusPoint; // 보너스포인트 = 물품 보너스포인트 
		System.out.println("구매한 물건은 : " + product.toString());
		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.bonuspoint);
	}
	
	// 계산대 (장바구니)
	// 장바구니에 담긴 물건 계산
	// 물건 총액
	// 물건의 목록 출력
	void Summary() {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist="";
		
		for(int i = 0; i < index; i++) {
			totalprice += Cart[i].price; //장바구니에 담긴 물건 총액 
			totalbonuspoint += Cart[i].bonusPoint; // 물건 총액  
			productlist += Cart[i].toString() +" "; // 물건의 목록 출력
		}
		System.out.println("*************");
		System.out.println("구매한 물건 총액 : " + totalprice);
		System.out.println("포인트 총액 : " + totalbonuspoint);
		System.out.println("구매한 물건 목록 :" + productlist);
	}
}
public class Ex13_Inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv2 kttv = new KtTv2();
		Audio2 audio = new Audio2();
		NoteBook2 notebook = new NoteBook2();
		
		Buyer2 buyer = new Buyer2(10000,0); // 고객
		buyer.Buy(kttv);
		buyer.Buy(audio);
		buyer.Buy(kttv);
		buyer.Buy(kttv);
		buyer.Buy(notebook);
		buyer.Summary();
	}
}
