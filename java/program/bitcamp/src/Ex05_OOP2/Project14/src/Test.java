
class Product {
	int price;
	int bonuspoint;
	
	public Product (int price) {
		this.price = price;
		this.bonuspoint = (int)(price / 0.5);
	}
	public Product () {}
}

class Computer extends Product {
	
	public Computer() {
		super(500);
	}
	public String toString() {
		return "Computer 구입";
	}
}
class Tv extends Product {
	
	public Tv() {
		super(450);
	}
	public String toString() {
		return "Tv 구입";
	}
}

class Radio extends Product {
	public Radio() {
		super(300);
	}
	public String toString() {
		return "라디오 구입";
	}
}
class Buyer {
	int money;
	int bonuspoint;
	Product[] cart; 
	int index = 0;
	
	public Buyer(int money,int bonuspoint) {
		this.money = this.money;
		this.bonuspoint = this.bonuspoint;
		
		cart = new Product[10]; // Product 의 객체 주소값 할당 
	}
	
	public void Buy(Product product) {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist = "";
			
		if(this.money < product.price) {
			System.out.println("잔액이 부족합니다.");
		}
		
		if(this.index >= 10) {
			System.out.println("더이상 담을수 없습니다.");
		}
		
		// 장바구니에 넣는다
		cart[index++] = product;
		
		// 실제 구매 행위
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("구매한 물건은 " + product.toString());
		System.out.println("잔액 : " + this.money);
		System.out.println("포인트 : " + this.bonuspoint);
		
		}
	// 계산대 (장바구니)
	public  void summary() {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist = "";
		
		for(int i = 0; i < index; i ++) {
			totalprice += cart[i].price;
			totalbonuspoint += cart[i].bonuspoint;
			productlist += cart[i].toString();
		}
		
	}
	
	
}


public class Test {
	public static void main(String[] args) {
	
	}

}