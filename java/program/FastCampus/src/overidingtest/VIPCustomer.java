package overidingtest;

public class VIPCustomer extends Customer {
	
// �Ӽ��� ����� Ȯ�� 
	/*
	// ���̵� , �̸� , ��� , ���ʽ�����Ʈ , ���ʽ�����Ʈ ���� ����
	private int customerID;
	private String customerName; // �̸�
	private String customergrade;  // ���
	int bonusPoint; // ���ʽ�����Ʈ
	double bonusRatio; // ���ʽ�������
	*/
	
	// ������ Customer �� �������� �� �������� �ִ�.
	double salesRatio;
	private int agentID;
	
	// customer�� �������ִ� ��ɿ� ���ؼ� VIPCustomer �� ����°��̹Ƿ�
	// ����� ����Ѵ�.
	/*
	public VIPCustomer() {
		// private�� ��Ӱ��迡�� �ٷ� �����Ҽ�����. ���ٱ����� �ְ������ protected 
	
//		super(); // �θ��� �⺻�����ڸ� �������������� �ٸ� �����ڸ� ȣ����Ѿ��Ѵ�
		// �θ� �ƹ� �����ڰ� ������ �θ�� �⺻�����ڸ� �ڵ����� ������ �ִ�. 
		// ��������� �ҷ��ֱ�

		
		customergrade = "VIP"; // ���  protected�� ����
		bonusRatio = 0.05; // 5��������
		salesRatio = 0.1; // 10���� ����
		
		System.out.println("VIPCustomer() ������ ȣ��");
	*/
	
	// �ڽ��� �����ڰ� ������ �θ��� �����ڸ� ��������� �ҷ��ü��ִ�. 
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		// ����Ŭ������ �⺻�����ڰ� ������ ��������� ȣ���ؾ��Ѵ�.
		
			// TODO Auto-generated constructor stub
		customergrade = "VIP"; // ���  protected�� ����
		bonusRatio = 0.05; // 5��������
		salesRatio = 0.1; // 10���� ����
		
		// ����Ŭ������ �޼ҵ� ������ ����Ŭ������ �޼ҵ忡 ���� �������
		// ����Ŭ�������� ������ �Ҽ��ִ�. 
		}

	@Override // �������̼� ( �����Ͽ��� �� �޼ҵ�� �������̵� �޼ҵ带 �˷��ش� �����Ϸ����� ������ ������
	public int calcprice(int price) {
//		return super.calcprice(price); // super�� �θ��� ����Ŭ������ �����Ѵ�
		bonusPoint += price * bonusRatio;  // ����Ʈ = ����Ʈ + ���� * ������ 
		 return price - (int)(price * bonusRatio);// ���� - ���� *������
	}
}

