package staticexam;

public class Card {
	// ī��� ī���� ��ȣ�� ������ �ְ� �׸��� ����� ������ �ִ�.
	// 53���� ī�带 ����µ� ���� ���̸� �ѱ��뼭 �����ؾ��Ѵٸ�?
	// static �� ��� ��������� �����ش�.
	public int number;
	public String kind;
	
	public static int h = 70;
	public static int w = 50;
	
	// ���(ī���� ����)
	public void cardInfo() {
		System.out.printf("���� ī���� ��ȣ %d ī���� ��� %s ���̴� %d ���̴� %d ", 
				number,kind,h,w);
	}
	
}
