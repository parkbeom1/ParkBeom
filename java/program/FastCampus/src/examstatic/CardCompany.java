package examstatic;

public class CardCompany {
	public static int  cardNumber = 10001;
		
	public Card createCard() {
		System.out.println(cardNumber);
		cardNumber++;
		return new Card();
	}
}
