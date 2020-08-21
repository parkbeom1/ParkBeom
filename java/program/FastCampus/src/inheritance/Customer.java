package inheritance;

public class Customer {
	// ���̵� , �̸� , ��� , ���ʽ�����Ʈ , ���ʽ�����Ʈ ���� ����
	private int customerID; 
	private String customerName; // �̸�
	protected String customergrade;  // ��� , �ڽİ��迡���� private�� �ְ������
								  // protected�� �ش�.
	int bonusPoint; // ���ʽ�����Ʈ
	double bonusRatio; // ���ʽ�������
/*	
	public Customer() { // ������� �ʱ�ȭ : �⺻���� 
		customergrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() ������ ȣ�� ");

	}
*/	// 
	
	public Customer(int customerID,String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customergrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer (int,String) ������ ȣ�� ");
	}

	
	// ���� ���
	public int calcprice(int price) {// ������ ������
	     bonusPoint += price * bonusRatio; 
	     // ���ʽ�����Ʈ ���� ,  ���ʽ�����Ʈ  = ���� * ���ʽ������� 
		 return price; // ������ ���� ��ȯ 
	}
	
	// ��� Ȯ��
	public String showCustomerInfo() {
		return customerName+"�����" + customergrade + " �̸� ������ ���ʽ� ����Ʈ�� "
				+ bonusPoint + "�� �Դϴ�.";
	}
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomergrade() {
		return customergrade;
	}

	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}	
	
	
}
