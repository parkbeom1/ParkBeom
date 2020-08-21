
class Product {
	int price;
	int bonuspoint;

	public Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(price*0.5);
	}
	public Product() {}
}

class Tv extends Product {
	
	public Tv() {
		super(500);
	}
	public String toString() {
		return "Tv 구입";
	}
}

class Radio extends Product {
	
	public Radio() {
		super(250);
	}
	public String toString() {
		return "라디오 구입";
	}
}

class Audio extends Product {
	
	public Audio() {
		super(300);
	}
	public String toString() {
		return "오디오 구입";
	}
}

class Buyer {
	int money;
	int bonuspoint;
	Product[] Cart;
	int index = 0;
	
	public Buyer (int money,int bonuspoint) {
		this.money = money;
		this.bonuspoint = bonuspoint;
		Cart = new Product[10];
	}
	
	// 공통 기능 다형성
	public void Buy(Product product) {
		
		if(this.money < product.price) {
			System.out.println("잔액이 부족합니다.");

		}
		if(this.index >= 10) {
			System.out.println("더이상 물품을 담을수 없습니다.");
		}
		
		Cart[index++] = product;
		
		// 실제 구매행위 
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("구매한 물건은 " + product.toString());
		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.bonuspoint);
		
	}
	public void summary() { // 계산대
		// 전체 계산
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist = "";
		for(int i = 0; i < index; i++) {
			totalprice += Cart[i].price;
			totalbonuspoint += Cart[i].bonuspoint;
			productlist += Cart[i].toString() + "";
		}
		
		System.out.println("*******************");
		System.out.println("총 구매 비용은 : " + totalprice);
		System.out.println("총 보너스 : " + totalbonuspoint);
		System.out.println("총 물품 목록은 : " + productlist);
		
	}
}
public class Test {	
	public static void main(String[] args) {
		Tv tv = new Tv();
		Audio audio = new Audio();
		Buyer buyer = new Buyer(10000,0);
		//  Buy(Product product) 다형성 
		buyer.Buy(tv);
		buyer.Buy(tv);
		buyer.Buy(audio);
		
	}
}
