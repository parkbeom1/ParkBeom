package arrayarrayTest;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
	private Scanner scanner;
	private String[][] seat;
	private int[][] ticketnumber;
	
	public Cinema() {
		scanner = new Scanner(System.in);
		seat = new String[4][5];	
		ticketnumber = new int[4][5];
	}	
	// 1. 메뉴 선택 
	public void selectMovieNumbers() {
		while(true) { 
			String selectnum = showMenu();
			switch (selectnum) {
			case "1": 
				ShowSeat1(); // 예매하기
				break;
			case "2": 
				seatInfo(); // 조회하기
			 	break;
			case "3":  
				cancelReserve(); // 예매 취소
				break;
			case "4":  
				System.exit(0); // 종료 하기
			}		
		 }
	  } 
	// 2. 메뉴 선택
	private String showMenu() {
		System.out.println("***************************");
		System.out.println("1. 예매 하기");
		System.out.println("2. 예매 조회");
		System.out.println("3. 예매 취소");
		System.out.println("4. 종료 하기");
		String selectnum = scanner.nextLine();	 
		return selectnum;
	}	
	// 3. 좌석 출력 
	public void ShowSeat1() {
		System.out.println("좌석 현황");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i) + "-" + (j);
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}	
	// 4. 좌석 선택	
		System.out.println("좌석을 선택해주세요. 예 1-1");
		String inputseat = scanner.nextLine();
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(inputseat.equals(seat[i][j])) {
					seat[i][j] = "예매";
					ticketnumber[i][j] = (int)(Math.random()*999999+100000);
					System.out.println("예매 번호는  : " + ticketnumber[i][j] + " 지정좌석은  : " + seat[i][j] );
				} 
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}		
	}
	// 예매 조회
	Scanner scanner1 = new Scanner(System.in);
	public void seatInfo() {
		System.out.println("찾으시려는 예매 번호를 입력하세요 :");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				int choice = scanner1.nextInt();
				if(choice == ticketnumber[i][j]) {
					System.out.println("선택하신 좌석은  :" + i + " - " + j + " 입니다.");
					break;
				} else {
					showMenu();
				}
			}
		}	
	}
	
}
