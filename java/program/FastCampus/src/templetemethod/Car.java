package templetemethod;

public abstract class Car { // �߻�Ŭ����
	
	public abstract void drive(); // �߻� �޼ҵ�
	public abstract void stop();
	public void startCar() {
		System.out.println("�õ��� ŵ�ϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ����.");
	}	
	
	public void washCar() {
		// abstract �޼ҵ�� �ϸ� ����Ŭ������ �ݵ�ñ����ؾ��Ѵ�.
		// ������ �Ϲ� �޼ҵ�� �ϸ� 
		// ����Ŭ������ ������ �ص��ǰ�  ������ �����ϴ�
		System.out.println("������"); 
	}
	
	// ���ø��޼ҵ� ( �̸� ������ ������ ���� �޼ҵ� )
	// Ʋ�̵Ǵ� �޼ҵ�� �������ϸ� �ȵǼ� final �� �س��´�.
	// �޸��� �ó����� ���� 
	// �޸��� �޴����� ����Ŭ�������� �������ش�.
	
	final public void run() { // final�� �������Ҽ����� 
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
