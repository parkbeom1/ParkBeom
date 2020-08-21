
class Product {
	int price; // 제품 가격 
	String name; // 제품 이름

	Product(int price) {
		this.price = price;
	}
}

class Buyer {
	int money; // 초기구매금액 설정	
	Cart[] cartlist;
	
	public Buyer() {
		new Cart[10];
	}
	
	public Buyer(int money) {
		this.money = money;
	}
	
	void Buy() { // Buy 실행시 구매행위 및 카트에 담는다.
			
	}
}
public class Counter {
	public static void main(String[] args) {
		
	}
}
