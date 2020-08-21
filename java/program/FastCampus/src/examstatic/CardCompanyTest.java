package examstatic;

public class CardCompanyTest {
	public static void main(String[] args) {
		
		CardCompany compnay = new CardCompany();

		Card myCard = compnay.createCard();
		Card yourCard = compnay.createCard();
		
		System.out.println(myCard.getCardNumber()); // 10002
		System.out.println(yourCard.getCardNumber()); // 10003 
	}
}
