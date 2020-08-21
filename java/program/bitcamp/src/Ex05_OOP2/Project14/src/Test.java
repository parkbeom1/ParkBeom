
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
		return "Computer ����";
	}
}
class Tv extends Product {
	
	public Tv() {
		super(450);
	}
	public String toString() {
		return "Tv ����";
	}
}

class Radio extends Product {
	public Radio() {
		super(300);
	}
	public String toString() {
		return "���� ����";
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
		
		cart = new Product[10]; // Product �� ��ü �ּҰ� �Ҵ� 
	}
	
	public void Buy(Product product) {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist = "";
			
		if(this.money < product.price) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
		if(this.index >= 10) {
			System.out.println("���̻� ������ �����ϴ�.");
		}
		
		// ��ٱ��Ͽ� �ִ´�
		cart[index++] = product;
		
		// ���� ���� ����
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		System.out.println("������ ������ " + product.toString());
		System.out.println("�ܾ� : " + this.money);
		System.out.println("����Ʈ : " + this.bonuspoint);
		
		}
	// ���� (��ٱ���)
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