import kr.or.bit.Emp;

/*
 ��Ӱ��� �������̵� < �ܿ��� >  
 ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� �������Ѵ�.
[��Ӱ��迡�� ] ���� �ڽ� Ŭ������  [�θ� Ŭ����]�� �޼��带 ������ �ϴ°�  ( ������ �ٲ۴� ) 
������ : Ʋ�� ��ȭ�� ���� �Լ��� �̸� Ÿ�� �ϴ°��� �ƴ϶� ���븸 { ��⸸ ��ȭ } 

���� ) 
1. �θ��Լ��̸��� �����ؾ��Ѵ�.
2. �θ��Լ� parameter �����ؾ� �Ѵ�.
3. �θ��Լ� return type �� ������ �����ؾ� �Ѵ�. 


4. �ᱹ ( ���� �� �ȿ� �ڵ常 ������ �����ϴ� )
*/

class Point2 { // ������ ������ Ŭ���� 
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + " / " + this.y; // ������ ǥ���ϴ� Ŭ���� 
	}
}

class Point3D extends Point2 {
	int z = 6;
	// ��� ...
	// ��� ���Ӱ� �Լ��� �߰��Ѵ�.
	// Annotation  �� �ڹ� �ڵ常���� �����Ҽ����� �ΰ����� ������ �����Ϸ�,������ ���� �˷��� �����Ϸ��� �о ����� ���� �Լ��� ������ ���� �о��ش�. 
	// ���� ������ Error ..... �����Ϸ��� ���������� 
	// @Override ���� ���Լ��� ���� ������ ���� Ȯ���ع�  ( ��Ÿ�� ������ �����Ѵ� ) 
	
	@Override //  ������̼��� �����ϱ� �����Ϸ��� ������ ���� �о��ش�.
	 String getPosition() { // �������̵� ��  z�� �߰��� 
		return this.x + " / " + this.y + " / " + this.z; // ������ �θ� ������ �ִ� �Լ��� �ڽ��� ��Ӱ��迡�� Ȯ���ϴ� �� ������ �ø��ų� ���̴� �� 
														 // 
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
}
class Love {
	public void point() {
		int x , y;
	}
	
	public void Love() {
		
	}	
}
class Happy extends Love {
	int x; 
	Love love;
	public Happy(Love love) {
		love = new Love();
		
	}
	
	public Happy() {
		this(new Love());
	}
}
public class Ex04_Override {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		String str = p.getPosition(); // �����ǵ� �Լ� ȣ�� .... 
		System.out.println(str);
		Emp emp = new Emp(1000,"ȫ�浿");
		System.out.println(emp.toString()); // �ּҰ��� ��µ�   kr.or.bit.Emp@15db9742  ->  emp �ڿ� toString �� �����Ǿ��ִ� �̰� �������ϸ� ����� �̸��� ����ϴ� �޼ҵ�...�� ������ ����
		// ��� ��� �̸� ��� ������ ���
		// ������ ������ �Լ�
		// emp .... ����� emp.toString() ����
		// Object Ŭ������ toString() �� �����س��� ���� �������ؼ� ���� ����� ���� toString�� �� ������� ����ʹ� 
		// Java API �� �����ϴ� ������ Ŭ������ OBject Ŭ������ toString() ������
		
	}
}
