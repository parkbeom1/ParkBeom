/*
	������ �ݴ븻 ���
	��� : �ѹ� ���� ��������(�ʱ�ȭ �Ǹ�) ���� �Ұ��� �ϴ�.
	����ڿ� : ������(�ֹι�ȣ) , ����(PI = 3.141592 ... , ������ȣ �ý��� ������ȣ)  
	����� ���������� �빮�ڷ� ����.
	java : final int NUM = 10;  // final = �ʰ� ������ ���̾� �ٲٸ� �ȵ�
	
	final Ű���� 
	Ŭ���� �տ� >> final class Car{} >> final math >> ��� ����
	�Լ� �տ�  public final >> ��Ӱ��迡�� �������̵� ������ ������  (override ����)
	public static final void print() >> ��ü�� �����Լ� 
*/
// final �� ���� �ϸ� �ȵȴ�. 
class Vcard {
	final String KIND = "10"; // ����� ������ Ÿ�� �����ϸ� �ٷ� �ʱ�ȭ ����� �Ѵ�.(������ ������ Ÿ���̴ϱ� ���� �־�����Ѵ�.) 
	final int NUM; // �����ڿ��� �ʱ�ȭ 
	
	public Vcard() {
		NUM = 20;
	}
	void method() {
		System.out.println(Math.PI);	
	}
}
class Vcard2 {
	final String KIND; // ����ʵ忡�� �ݵ�� �ʱ�ȭ�� ����������� ������  �����ڿ��� �ʱ�ȭ�� ����������Ѵ� -> �⺻ ���� �ȴ�. 
	final int NUM;
	// �����ڿ��� �ʱ�ȭ�� ���ش�.
	/*
	public Vcard2() {
		this.KIND ="heart";
		this.NUM = 10;
	}
	*/
	public Vcard2(String KIND,int NUM) {  // �⺻���� �ȴ�.
		// �����ε��� ����� �ʱ�ȭ�� ����� �Ѵ�. �����ε� ������ �ʱ�ȭ�� ���ִ� 
		// �䱸���� : ī�� 35���� ���� ���ڴ� �ٸ��� �ѹ� �������� ������ �Ұ��� �ϴ�
		// ��ü�� ��������� �ѹ��� �ʱ�ȭ �ϴϱ�  �����̽��� 1�� �����̽��� 2��  �����̽��� 3�� ��ü���� �ʱ�ȭ �Ҽ��ִ�.  
		// 35���� ī�带 ����鼭 �ѹ������� ī����� ��ȣ�� ������ �Ұ��ϴ� 
		this.KIND = KIND;
		this.NUM = NUM;
	}
	public String toString() {
		return KIND + NUM;
	}
}
public class Ex07_Final {	
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		vcard.method();
		Vcard2 vcard2 = new Vcard2("space",1); // �ѹ��������� ���ٲ۴�. �� ? final �� �޼ҵ�� �Ǿ������ϱ� 
		System.out.println(vcard2);
	}
}
