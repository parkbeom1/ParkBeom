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
	int money = 1000; // ��
	int bonuspoint; // ����Ʈ
	// �����ڴ� ���������� �Ҽ� �ִ�.
	// �������� ( �ܾ� - ��ǰ�� ���� , ����Ʈ ���� ���� ) 
	//  Key Point-> �����ڴ� ���忡 �ִ� ��� ������ �����Ҽ��ִ�. <- Key Point
	// 1�� �ڵ� ������ 3���ϱ� �����Ҽ��ִ� �Լ��� 3�� �־�� �ȴ� 
	void kttvBuy(KtTv tv) { // ��ü�� �ּҸ� �Ķ���ͷ� �޾���� �� �Լ� �ȿ��� ��ǰ�� ���ݰ� ����Ʈ�� �˼� �ִ�.
		if(this.money < tv.price) {
			System.out.println("���� �ܾ��� �����մϴ�.");
			return; // �����Ҽ������� �Լ��� �������� ( �������� ����   ) 
		} else {
			// �� ���� ����
			this.money = (this.money - tv.price);
			this.bonuspoint = (this.bonuspoint + tv.bonuspoint);
			System.out.println("������ ������ " + tv.toString());
		}
	}
	void audioBuy(Audio audio) { // ��ü�� �ּҸ� �Ķ���ͷ� �޾���� �� �Լ� �ȿ��� ��ǰ�� ���ݰ� ����Ʈ�� �˼� �ִ�.
		if(this.money < audio.price) {
			System.out.println("���� �ܾ��� �����մϴ�.");
			return; // �����Ҽ������� �Լ��� �������� ( �������� ����   ) 
		} else {
			// �� ���� ����
			this.money = (this.money - audio.price);
			this.bonuspoint = (this.bonuspoint + audio.bonuspoint);
			System.out.println("������ ������ " + audio.toString());	
		}
	}
	void notebookBuy(NoteBook notebook) { 		
		if(this.money < notebook.price) {
			System.out.println("���� �ܾ��� �����մϴ�.");
			return; // �����Ҽ������� �Լ��� �������� ( �������� ����   ) 
		} else {
			// �� ���� ����
			this.money = (this.money - notebook.price);
			this.bonuspoint = (this.bonuspoint + notebook.bonuspoint);
			System.out.println("������ ������ " + notebook.toString());
		}
	}
	// 1�� �ڵ�
	// ������ 3�� 
	// 1�� ����
	// ���� �Ͽ��� �ް� .... 
	// ���� ���� 
	// ���忡 ��ǰ�� 1000�� �ٸ� ��ǰ�� �߰��� ( ���콺 , �佺�߰�) ��ǰ ��� POS ��� �ڵ�ȭ )
	// ���忡 ��ǰ�� ���õ�(1000��...)
	// 1. ���忡�� �����ڰ� 3�� �ۿ� ���Ÿ� ���Ѵ�..������ 997���� ��ǰ�� ����� ����.  �� ? �����Ҽ��ִ� ����� 3���� �س����ϱ�
	
	// ������ >> pc�� >> ���� ����� >> ���� ���� ���� >>  
	// End
	// ��ȭ�� �����ϴ� �ڵ带....
	// ��ſ� �ް��� ������ ���� ����� ����

	// 3�� ����
	// ��ǰ�� �߰� �Ǵ��� �������� ���
	// �ϳ��� �̸� , �ߺ� �ڵ� ����...
	// ��� ��ǰ�� pruduct �� ���(�θ�)
	// Product p
	// Audio audio = new Audio();
	// p = audio;
	// p.toString() �� ������ ���� 
	
	
	void Buy(Product product) { // ��ü�� �ּҸ� �Ķ���ͷ� �޾���� �� �Լ� �ȿ��� ��ǰ�� ���ݰ� ����Ʈ�� �˼� �ִ�.
		if(this.money < product.price) {
			System.out.println("���� �ܾ��� �����մϴ�.");
			return; // �����Ҽ������� �Լ��� �������� ( �������� ����   ) 
		} else {
			// �� ���� ����
			this.money = (this.money - product.price);
			this.bonuspoint = (this.bonuspoint + product.bonuspoint);
			System.out.println("������ ������ " + product.toString());		
		}
	}
 
}
// KtTv tv = new KtTv(500); ��ǰ�� ��������� �ٸ� ������ ������ �ִ�.
public class Ex12_Inherit_ {
	public static void main(String[] args) {
		// ����
		// �����ϰ� super �� �������̵����� �θ� ������ ȣ���غ��� 
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		// �����ڰ� buy �Ҽ��־�� �Ѵ�.
		Buyer buyer = new Buyer();
		
		/*
		buyer.kttvBuy(tv); // tv�� ���
		System.out.println(buyer.money);
		System.out.println(buyer.bonuspoint);
		*/
		/*
		buyer.kttvBuy(tv);
		buyer.notebookBuy(notebook);
		buyer.kttvBuy(tv);
		buyer.audioBuy(audio);
		*/
		
		// ��Ź�⸦ �ִ´ٰ� ġ�� 
		//	// 3�� ����
		// ��ǰ�� �߰� �Ǵ��� �������� ���
		// �ϳ��� �̸� , �ߺ� �ڵ� ����...
		// ��� ��ǰ�� pruduct �� ���(�θ�)
		// Product p
		// Audio audio = new Audio();
		// p = audio;
		// p.toString() �� ������ ����
		
		/*
		WashMachine washmachine = new WashMachine();
		Buyer product = (Buyer) Product(washmachine.price);
		buyer.Buy(washmachine);	
	    */
		
		// ����ڰ� ��Ź�⸦ ���� ��� 
		WashMachine washmachine = new WashMachine();
		buyer.Buy(washmachine);
		System.out.println(buyer.money);
		System.out.println(buyer.bonuspoint);
		
		// ����ڰ� ��ǻ�͸� ���� ��� 
		 Computer computer = new Computer();
		 buyer.Buy(computer);
		 System.out.println(buyer.money);
		 System.out.println(buyer.bonuspoint);
	}
}
