/*
	������(��Ӱ��迡���� ���� �Ѵ�) : �ϳ��� �ڵ尡 �������� 
	������ : �������� ���� ���¸� ������ �ִ� �ɷ��̴�.
	c# : ������ ( �츮�� ����� �����ε� �� ���������� ���� �������̵��� ���������� ���� )
	
	JAVA : [��Ӱ���] ���� �θ� �ϳ��� ���� ������ �������� �ڽİ�ü�� Ÿ���� ������ �ִ�.
	�ϳ��� ���� ���� >>  [ �θ� Ÿ�� ]
	�θ�Ŭ���� Ÿ���� ���� ������ �������� �ڽ� Ŭ���� ��ü�� ������ �ִ�.
	������ : ����) �θ�� �ڽĿ��� ���Ǿ��� ���� �ش�.
	�ڽ��� �θ𿡰� ���Ǿ��� �帰��. >> ������
*/
class Tv { // �θ�� ������̴�. �Ϲ�ȭ , �߻�ȭ , �����ڿ� , �и� 
	boolean power;// ������ ������ �ִ�.
	int ch; // ä��
	
	void power() { // ���� ų���ִ�.
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
public class Ex10_Inherit_Poly {	
	public static void main(String[] args) {
		
	}
}
// Tv�� ������� ������ CapTv
class CapTv extends Tv { // ĸ�� Ƽ�� ������ �ִ� Ư��ȭ �ǰ� ��üȭ �ǰ� ������ �ڿ��� ǥ�� �ϸ� �ȴ�. �츮�� �Ϲ�ȭ�ǰ� �߻�ȭ �Ȱ��� tv�� ���� ������ �ִ� 
	
	String text; // �ڸ�����
	
	String captionTest() { // �ڸ� ���� ����
		return this.text ="���� �ڸ� ó����.....";
	}
	
	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("���� :" + captv.power);
		
		captv.chUp();
		System.out.println("ä������ : " + captv.ch);
		System.out.println(captv.captionTest()); // �ڽ��� �ڸ� ó�� ���
		// ���� ��� ����
		
		// Car Ÿ�Կ�  c�� = new Car();
		// Car Ÿ�Կ� c2 = c; ���� ����Ÿ���̴ϱ�
		Tv tv2 = captv; // �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� �������ִ�. - ������  
						// �� �θ�� �ڽ��� �ڿ��� ���� �Ҽ� �ִ�.
						// �� �����Ǹ� �����ϰ� 
		// tv2. �θ𲨸� ���δ�. 
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		// ���� �ּ������� ���̴°��� �ٸ���.
		
		// ���� 601ȣ�� ���� �ڽ��� �� ���������� �θ�� �ڽ��� ���ذ͸� ���δ�
		Tv tv = new CapTv(); // ��ĳ���� 
		CapTv captv2 = (CapTv)tv; // �ٿ� ĳ����
	}
}
