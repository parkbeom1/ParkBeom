package staticexam;

public class Card {
	// 카드는 카드의 번호를 가지고 있고 그리고 모양을 가지고 있다.
	// 53장의 카드를 만드는데 높이 넓이를 한군대서 관리해야한다면?
	// static 은 모든 공통사항을 묶어준다.
	public int number;
	public String kind;
	
	public static int h = 70;
	public static int w = 50;
	
	// 기능(카드의 정보)
	public void cardInfo() {
		System.out.printf("현재 카드의 번호 %d 카드의 모양 %s 높이는 %d 넓이는 %d ", 
				number,kind,h,w);
	}
	
}
