
class Pbase {
	int p = 100;
	
}
class Cbase extends Pbase {	
}
class Dbase extends Pbase {
}
public class Ex11_Inherit_Poly {
	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase); // �ּҰ� 
		Pbase p = cbase; // �θ�Ÿ���� ����Ÿ���� �ڽ��� ����Ÿ���� �������ִ�. 
		Dbase dbase = new Dbase();
		Dbase dbase2 = new Dbase();
		p = dbase; // �θ�Ÿ���� ����Ÿ���� �ڽ��� ����Ÿ���� �������ִ�. 
		Cbase c = (Cbase)p; // ū�������� ���������� ������ ����� ��� �Ѵ�. - �ٿ�ĳ����
		
		
	}
}
