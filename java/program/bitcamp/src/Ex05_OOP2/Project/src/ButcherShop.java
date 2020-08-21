
import java.util.Scanner;
​
public class ButcherShop {
	Scanner scanner = new Scanner(System.in);
	
	// 메뉴 출력
	int displayMenu() {
		System.out.println("================");
		System.out.println("1. (구매자) 메뉴보기");
		System.out.println("2. (구매자) 주문하기");
		System.out.println("3. (구매자) 잔액확인");
		System.out.println("4. (판매자) 판매하기");
		System.out.println("5. (판매자) 매출확인");
		System.out.println("6. 프로그램 종료");
		System.out.println("================");
		System.out.printf(">메뉴 번호를 입력하세요:");
		
		int menu = 0;
		do {
			  try {
			      menu = Integer.parseInt(scanner.nextLine());
				  if(menu >= 1 && menu <= 6) {
					  break;
				  }else {
					  throw new Exception("번호가 잘못 선택되었습니다");
				  }
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("메뉴 1~6번까지 입력");
			  }
		}while(true);
		return menu;
	}
	
	
	public static void main(String[] args) {		
		Seller seller = new Seller();
		Buyer buyer = new Buyer();
		ButcherShop butcherShop = new ButcherShop();
		
		// 메뉴 선택 시 각 메서드 호출
		while(true) {
			switch (butcherShop.displayMenu()) {
				case 1 : seller.showMenu();
					break;
				case 2 : buyer.buyMeat(seller);
					break;
				case 3 : buyer.balance();
					break;
				case 4 : seller.saleMeat(buyer);
					break;
				case 5 : seller.salesResult();
					break;					
				case 6 : System.out.println("프로그램 종료");
					System.exit(0);
			}
		}
	}
}
