package abstractex;

public abstract class Computer {
	// ����Ŭ�������� ��ǻ�� ���� ������ Ŭ�������� �ִµ� ����Ű�°� ���°� ������ ����
	// ���������� ���� �޼ҵ�  �ٵ� display �� typing �� ����Ŭ������ ����
	// ����ũ�� ��Ʈ�� �Ѹ��� ���� �ٸ��� 
	// ����Ŭ������ �ݵ�� ��������� �ϴ� ����Ŭ�������� �����ϰ� ���� å����
	// ����Ŭ�������� �����Ѵ�.
	
	public abstract void display();
	// �����������ʰڴٴ� ���̴�. =  �߻� �޼ҵ� �� ����Ŭ�������� ��������
	// ���̻� ���� ���� 
	public abstract void typing(); 
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
