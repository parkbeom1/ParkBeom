package abstractex;

public class ComputerTest {
//	Computer computer = new Computer();
//	�߻�޵����� �ҷ��ü������Ƿ�  �ν��Ͻ�ȭ �Ҽ�����.
	public static void main(String[] args) {
	
//	computer.display();
	
	Computer computer = new DeskTop(); 
	// ��ĳ����(������) �߻�Ŭ���������� �����
	computer.display(); 
	// �������̵��� �ڽ��� ������ display() �޼ҵ尡 ȣ��ȴ�.
	computer.turnOff(); // ������ ���ϴ�.
	
	Computer mynote = new MyNoteBook(); // ��ĳ����
	
	}
}