package overidingtest;

public class OveridingTest {
	public static void main(String[] args) {
		Customer customerKim = new Customer(10020,"������");
		customerKim.bonusPoint = 10000;
		
		VIPCustomer customerJam = new VIPCustomer(10020,"������");
		customerJam.bonusPoint = 10000;
		
		int priceKim = customerKim.calcprice(10000); // ���Ǳ���
		int priceJam = customerJam.calcprice(10000);
		
		System.out.println(customerKim.showCustomerInfo() + "���� �ݾ��� : " + priceKim + " �� �Դϴ�.");	
		System.out.println(customerJam.showCustomerInfo() + "���� �ݾ��� : " + priceJam + " �� �Դϴ�.");	
	
		// ��ĳ����  Ÿ���� �θ�Ÿ������ �ϸ� �θ�͸� ���δ�. 
		Customer customerNo = new VIPCustomer(10010,"������");
		customerNo.bonusPoint = 10000;
		// �������̵��� �ν��Ͻ��� �޼ҵ尡 �ҷȴ� (�����Լ� : �޼ҵ��� �̸��� �޼ҵ� �ּҸ� ���� ���� �޼ҵ� ���̺���
		// ȣ��� �޼ҵ��� �ּҸ� �����Ѵ�. 
		// �ᱹ ������ �ν��Ͻ��� �޼ҵ�� �����ǵ� �޼ҵ尡  �Ҹ��Եȴ�. 
		// �޼ҵ峢�� �̸��� ���ٰ� ���� �ּҰ��� �������ʴ´� ���� �ٸ� �ּҰ��� ������.
		
		System.out.println(customerNo.showCustomerInfo() + "���� �ݾ��� : " + customerNo.calcprice(10000) + " �� �Դϴ�.");	
		
	}
}
