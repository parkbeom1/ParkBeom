package overidingtest;

public class CustomerTest {
	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000; // ���ʽ�����Ʈ õ��
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerPark = new Customer();
		customerPark.setCustomerName("�ڹ�");
		customerPark.setCustomerID(10030);
		customerPark.bonusPoint = 5000;
		System.out.println(customerPark.showCustomerInfo());
		*/
	
		VIPCustomer customerKim = new VIPCustomer(10020,"������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());	
	
		
		Customer customerPark = new VIPCustomer(10030,"�ڸ�");
		// ����Ŭ�������� ����Ŭ�������� ����Ÿ������ �ڵ� ����ȯ�� �ȴ�. ( ��ĳ���� )
		// ������ �� ���� �������� �ʴ´�. 
		// ������ Ÿ���� Customer �̴ϱ� Customer �͸� ���δ�.
		// �����ϰ��ֱ⋚���� ������ �����ϴ�
		
		Customer customerM = new VIPCustomer(10040,"����"); // ��ĳ����
		
		VIPCustomer customera =(VIPCustomer)customerM; // �ٿ�ĳ����
		
		
		// ����Ŭ���� ȣ���ҋ� ����Ŭ������ �����ڰ� ȣ���� �ȴ�.
		// super()���  �ڵ����� ���µ� 
		// ����Ŭ������ �޸���ġ �������� ������ �ִ�. 
		// this()�� �ٸ������ڸ� ȣ���ϴµ� super()�� ����Ŭ������ �����ּҸ� �����µ�
		// super()��  ����Ŭ������ �⺻�����ڰ� ȣ��ȴ�. ���������� �ܰ迡���� �ڵ����� ���Ե�
		// ����
		// ����Ŭ������ �⺻�����ڰ� ���°�� ����Ŭ�������� ��������� �����ڸ� ȣ���ؾ��Ѵ�.
	}
}	
