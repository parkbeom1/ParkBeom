package abstractex;

public class DeskTop extends Computer {
	
	// �߻�޼ҵ带  �ݵ�� ��������� �Ѵ�. ������ �����Ϸ���
	// abstract(�����) Ŭ������ �����ϸ� �ȴ�.

	// �߻�޼ҵ带 �����ϱ�
	@Override
	public void display() { 
		System.out.println("DeskTop display");
	}
	@Override
	public void typing() {
		System.out.println("DeskTop typing");
	}
	
	// �߻�Ŭ�������� ������ �޼ҵ� �ٽ� �����ǰ� �����ϴ� 
	@Override
	public void turnOn() {
		System.out.println("desktop turnOn");
	}
	@Override
	public void turnOff() {
		System.out.println("desktop turnOff");
	}
}
