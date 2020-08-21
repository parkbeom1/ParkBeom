package FruitSystem;

// �����Ĵ� ��� Ŭ����
class FruitSeller {
	int numOfApple; // �������
	int myMoney; // ���� ���� ��
	final int APPLE_PRICE; // ��� 1�� ���� , final ���� �Ժη� ���ٲ�

// �����Ĵ� ��� ������
public FruitSeller (int apple,int money,int price) {
				// ���� ����� �Ű����� 3���� �ʱ�ȭ
	this.numOfApple=apple;
	this.myMoney=money;
	this.APPLE_PRICE=price;
	}

// �������Ǵ�(����)
	public int saleApple(int money) { // ����ǰ����� result�� ����
		int result = money / APPLE_PRICE; // numOfApple -= result; 
		numOfApple = numOfApple - result; // ����������� = �ִ�������� - �ǻ������
		myMoney += money; // myMoney = myMoney + money ; 
		// ���� ������ = �����ִ��� + ����Ⱦ� ������
		return result; // ����� ����
	}

// ����(����)
	public void showSaleResult() {
		System.out.println("���� ��� ���� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
	}
}
//���ϻ�� ��� Ŭ����
class FruitBuyer {
	int myMoney; // ������(�Ӽ�/Ư¡)
	int numOfApple; // ��� ����(�Ӽ�/Ư¡)

	// ���ϻ�»�� ������ ���� ����� ������ �ʱ�ȭ �Ѵ�.
	public FruitBuyer(int myMoney,int numOfApple) {
		this.myMoney = myMoney;
		this.numOfApple = numOfApple;
	}
	// ���ϻ��(����)
	public void buyApple(FruitSeller sell,int money) { // �Ķ���ͷ� �����Ĵ� ����� ���� �޴´�.
		// ������� = ��������������� + �����Ĵ»���� saleApple�޼ҵ��� 
		// result ���� ���Ϲ��� �� �� ���� ��� ���� ���� + �갹��
		
		numOfApple += sell.saleApple(money); // �������Ĵ������� result �� money������
		myMoney -= money; // ���������� = �����ִ��� - ��������
	}
// �����(����)
	public void showBuyResult() {
		System.out.println("���� �ݾ� : " + myMoney);
		System.out.println("������ ��� ���� : " + numOfApple);
	}
}

//������ ����
class FruitSaleMain {
	public static void main(String[] args) {
		System.out.println("E-��Ʈ");
		FruitSeller seller; // �����Ĵ»�� ��ü ����
		seller = new FruitSeller(1000, 10000, 1000); // ������� ���� , ������ , 1���� ����
			
		FruitBuyer buyer; // ���ϻ�� ��� ��ü ����
		buyer = new FruitBuyer(10000, 0); // ������, ���� �������
		buyer.buyApple(seller, 3000); // �̸�Ʈ���� ���. 3õ����ġ
		//�������� �����
		buyer.showBuyResult();
		//��������� ���� ����
		seller.showSaleResult();
		
		System.out.println();
		System.out.println("���� �������");
		FruitSeller seller2;
		seller2 = new FruitSeller(100,0,2000); // ���� ������� ,������ ,1���� ����
		
		buyer.buyApple(seller2, 4000); // ���װ��Կ��� ��� 4õ����ġ
	
		// ��������� ����� 
		buyer.showBuyResult();
		// ��������� ���곻��
		seller2.showSaleResult();
	}
}








public class FruitSystem {

}
