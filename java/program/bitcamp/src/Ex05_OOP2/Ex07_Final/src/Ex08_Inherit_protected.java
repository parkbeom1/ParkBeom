
public class Ex08_Inherit_protected {

/* ���� ������ public protected default private 	
	protected : ��Ӱ��迡���� ������ ����� ������ �������̵��� ����. ����� ������ procted �� ����.
	���������� �������� �ο��ϰ� ��鼺�� ���ϰ� �ִ�.  ���� >> default , public  �ణ ��鼺�� ������.
	>> ����� ���� Ŭ���� �ȿ��� protected �����ڴ� default �� ����. 
	>> �ᱹ ��Ӱ��迡���� �ǹ̰� �ִ�.
	

*/
class Dclass {
	
	private int p; // �ٸ� ��Ű������ ����Ҽ�����. ������ ���� Ŭ�������� 
	public int i; // �ٸ���Ű������ ����Ҽ��ִ�. 
	int s; // default ���� ��Ű������ ����Ҽ��ִ�. 
	protected int k; // default �� �Ȱ���. �Ƚᵵ default ���⼭ ����� ������ ����. >> �Ϲ� Ŭ������ ����� ������ ����. >> ��Ӱ��迡 ������ �޶�����.
}

class Child2 extends Pclass {
	
	public void method() {
//		this.j;
		this.k = 1000; // ����� protected �� ���δ�. >> ��� ���迡�� �ڽ��� �θ��� protected �ڿ��� ������ �����ϴ�. >> public ó�� ����Ҽ� �ִ�. >> ��鼺 
						// ��Ӱ��迡�� �ڽ��� �θ��� protected ���� 
		System.out.println(this.k);
		
	}
	
	// �������� �����鼭 �������� Ȯ�� �Ҽ��ִ�.
	
}

class Inherit {
	
}
	public static void main(String[] args) {
		Pclass p = new Pclass();
		int num = p.j; // �ۺ� �̴ϱ� >> ���� ���� ���忡���� public �� ������ �����ϴ�. 
		System.out.println(num);
		
		Pclass p2 = new Pclass();
		
		
		
	}

}
