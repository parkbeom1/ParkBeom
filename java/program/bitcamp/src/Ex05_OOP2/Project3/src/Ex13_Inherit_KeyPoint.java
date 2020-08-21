
class Product2 {
	int price;
	int bonusPoint;
	
	public Product2(int price) { // �ʱ� �ݾ� ���� 
		this.price = price; // �ʱ�ݾ� ����
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
	
	// ��� ���� ���� ( ��� ������ǰ )
	Product2[] Cart; // Product2�� ��ü �迭�� ���� �� �ϳ��� īƮ 
	int index = 0;   // 0���� ���� 
	
	Buyer2(){  // ���� �������ִµ� �ʱ�ݾ� ���� 
		this(1000,0); // money,bonuspoint  
	}
	Buyer2(int money,int bonuspoint) {
		Cart = new Product2[10]; // ��ٱ���10ĭ�迭�� �ϳ��� īƮ
		this.money = money;
		this.bonuspoint = bonuspoint;
	}
	
	// ���� ��� �ȿ� ��ٱ��� (cart) �ִ� ��� ���� �����ϼ��� -  cart�� �����迭 
	void Buy(Product2 product) { // ������ Product2 product = 
		if(this.money < product.price) {  // �� �� < ��ǰ ����
			System.out.println("���� �ܾ��� �����մϴ�.^^" + this.money);
			return;
		}
		// Cart ���� ����
		if(this.index >= 10) { // this.index >> ���� ... > ��� �Լ����� ��밡��
			// �迭 �ε��� ��ȣ�� 10 �̻��̸� 
			System.out.println("[���� �׸� �缼�� ^^ ]");
			return;
		}
		// ��ٱ��� ���  
		Cart[index++] = product; // product ��ǰ���� ��������� Cart�� �ε��� ��ȣ�� 1�� �����Ѵ�.   
		
		// ���� ���� ����
		this.money -= product.price; // �ܾ�   ���� = ���� - ��ǰ���� 
		this.bonuspoint += product.bonusPoint; // ���ʽ�����Ʈ = ��ǰ ���ʽ�����Ʈ 
		System.out.println("������ ������ : " + product.toString());
		System.out.println("�ܾ� : " + this.money);
		System.out.println("����Ʈ : " + this.bonuspoint);
	}
	
	// ���� (��ٱ���)
	// ��ٱ��Ͽ� ��� ���� ���
	// ���� �Ѿ�
	// ������ ��� ���
	void Summary() {
		int totalprice = 0;
		int totalbonuspoint = 0;
		String productlist="";
		
		for(int i = 0; i < index; i++) {
			totalprice += Cart[i].price; //��ٱ��Ͽ� ��� ���� �Ѿ� 
			totalbonuspoint += Cart[i].bonusPoint; // ���� �Ѿ�  
			productlist += Cart[i].toString() +" "; // ������ ��� ���
		}
		System.out.println("*************");
		System.out.println("������ ���� �Ѿ� : " + totalprice);
		System.out.println("����Ʈ �Ѿ� : " + totalbonuspoint);
		System.out.println("������ ���� ��� :" + productlist);
	}
}
public class Ex13_Inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv2 kttv = new KtTv2();
		Audio2 audio = new Audio2();
		NoteBook2 notebook = new NoteBook2();
		
		Buyer2 buyer = new Buyer2(10000,0); // ��
		buyer.Buy(kttv);
		buyer.Buy(audio);
		buyer.Buy(kttv);
		buyer.Buy(kttv);
		buyer.Buy(notebook);
		buyer.Summary();
	}
}
