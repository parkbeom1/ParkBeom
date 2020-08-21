package arrayarraySystem;

import java.util.Scanner;

public class Reservation {
	private Scanner scanner;
	private String[][] seat; // 좌석
	private int[][] bookingnum; // 예매번호
	
	public Reservation() {
		scanner = new Scanner(System.in);
		seat = new String[4][5];
		bookingnum = new int[4][5];
	}
	public int showmenu() {
		System.out.println("********************");
		System.out.println("*****영화 예매 시스템*****");
		System.out.println("********************");
		System.out.println("1. 좌석 조회 하기");
		System.out.println("2. 예매 하기");
		System.out.println("3. 예매 조회 하기");
		System.out.println("4. 예매 취소 하기");
		System.out.println("5. 종료하기");
		int selectnum = Integer.parseInt(scanner.nextLine());
		return selectnum;
	}
	// 메뉴 선택
	public void selectMenu() {
		loop_p : while(true) {
			int selectnum = showmenu();
		switch(selectnum) {
			case 1: seatinfo();
				// 좌석 조회
				break;
			case 2: selectSeat();
				// 예매 하기
				break;
			case 3: Reservconfirm();
				// 예매 조회
				break;
			case 4: cancel();
				// 예매 취소
				break;
			case 5:
				// 종료하기	
				break loop_p; // 
			}
		}
	}
	// 메뉴1. 좌석 조회
	private void seatinfo() {
		for(int i = 0; i < seat.length; i++) {
			for(int j =0; j < seat[i].length; j++) {
				seat[i][j] = i + "-" + j;
				System.out.printf("[%s]",seat[i][j]); //String 이니까 %s 대입
			}
			System.out.println();
		}
	}	
	// 메뉴2. 예매 하기
	private void selectSeat() {
		 System.out.println("좌석을 선택해주세요. 예)1-1 ");
		 System.out.println("이미 예약된 좌석은  예매 라고 표시합니다.");
		 String select1 = scanner.nextLine();
		 System.out.println("예매 가능합니다 예매 하시겠습니까?");
		 System.out.println("네(1) , 아니오(2) , 초기화면(0) 중 하나를 입력해주세요.");
		 int choice = Integer.parseInt(scanner.nextLine());
		 switch(choice) {
		 case 1:
			 for(int i = 0; i < seat.length; i++) {
				 for(int j = 0; j < seat[i].length; j++) {
					 if(select1.equals(seat[i][j])) { // String은 .equals비교
						 seat[i][j] = "예매";
						 	// 예매번호 도 같이 부여해준다.
						 bookingnum[i][j] = (int)(Math.random()*1000000);
						 System.out.println("예매가 완료되었습니다");
					System.out.printf("예매한 좌석번호 : [%d-%d] / 예매번호 : [%d]" , i , j , bookingnum[i][j]);
			    }
			 }
		 }
	 break;
		 case 2:	
			 System.out.println("다시 선택해주세요.");
			 break;
		 case 3:
			 break;
  
		 } 
	}
	// 메뉴3. 예매 조회
	private void Reservconfirm() {
		System.out.println("예매번호를 입력해주세요.");
		int select1 = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < bookingnum.length; i++) {
			for(int j = 0; j < bookingnum[i].length; j++) {
				if(select1 == bookingnum[i][j]) {
					System.out.printf("고객님이 선택하신 좌석은 [%d-%d 이다.]",i,j);
				}
			}
		}
	}
	// 메뉴4. 예매 취소
	public void cancel () {
		System.out.println("예매번호를 입력해주세요.");
		int select1 = Integer.parseInt(scanner.nextLine());	
		System.out.println("예매를 취소하시겠습니까?");
		System.out.println("네(1) , 아니오(2) 중 하나를 입력해주세요.");
		int choice1 = Integer.parseInt(scanner.nextLine());
		switch(choice1) {
		case 1:
			for(int i = 0; i < bookingnum.length; i++ ) {
				for(int j = 0; j < bookingnum[i].length; j++) {
					if(select1 == bookingnum[i][j]) {
						seat[i][j] = i+ "-" +j; // 초기화
						 bookingnum[i][j] = 0; // 초기화
						 System.out.println("예매가 취소되었습니다. 감사합니다.");
					}
				}
			}
		case 2:
			System.out.println("다시선택하시오");
			break;
		default :
			break;
		}
	}	
}	
	
	
	
