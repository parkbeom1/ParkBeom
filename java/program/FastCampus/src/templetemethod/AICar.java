package templetemethod;

public class AICar extends Car { // �߻�Ŭ���� ��� ����
	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("������ �ڵ����� ����ϴ�.");
	}
	@Override
	public void washCar() {
		System.out.println(" �ڵ� ���� �մϴ�.");
	}
	
}
