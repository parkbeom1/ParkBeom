package staticexam;

// �ּҰ��� �Ҵ��ϱ� ���� �׽�Ʈ
public class Tv {
	
	int TvCount;
	String TvColor;
	
	public Tv tCall() {
		Tv t = new Tv();
		return t; // ���� ������ �����Ҽ��ִ�.(�ּҰ�)
	}
	public Tv tCall2() {
		return new Tv(); // ���� ���� ���� �Ҽ��ִ� �޸� ������ �����Ѵ�.
	}
	public void tCall3(Tv t) {
		System.out.println("t �ּҰ� : " + t);
	}
	public Tv tCall(Tv t) {
		TvCount = 5;
		TvColor = "red";
		return t; // ���ϰ� t�� �����ؼ� 
	}
	public static void main(String[] args) {
		Tv t = new Tv();
		Tv t2 = t.tCall(t); // ���ϰ��� t�� �޴´�. 
		System.out.println(t2.TvCount + t2.TvColor);
	}
}
