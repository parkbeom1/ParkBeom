package airplane;

public class Airplane {
	String airname;
	int airnum;
	static int totalcount;
	
	public Airplane(String airname,int airnum) {
		this.airname = airname;
		this.airnum = airnum;
		totalcount++;
		System.out.println("����� ���� : " + airname + 
				" ����� ��ȣ : " + airnum + " �� : "
				+ totalcount + " ��");
	}
	public static void main(String[] args) {
		Airplane air1 = new Airplane("�ƽþƳ�",1910);	
		Airplane air2 = new Airplane("�����װ�",2910);
	}
}
