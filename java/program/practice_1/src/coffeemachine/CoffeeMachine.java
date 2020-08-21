package coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu,in,out = 0; // 메뉴 , 돈을넣음 , 반환
		int coffee = 200;
		int cocoa = 250;
		boolean run = true; // while문을 돌리기위한 boolean 
		System.out.print("요금을 투입하세요 >>>");
		in = sc.nextInt(); // in = 요금투입 
		
	while(run) { // boolean 을 줘서 true을 받아 while문 이 실행됨
		System.out.println("====커피 자판기====");
		System.out.println("1. 커피(200) \t 2. 코코아(250)\t 3. 반환  4. 종료");
		System.out.print("메뉴를 선택하세요.");
		menu = sc.nextInt();
		if(menu == 1) { // 커피
			 out = in - coffee; // 반환돈 = 돈투입 - 커피값;
			 System.out.println("맛있게 드세요.");
			 if(coffee > out) {
				 System.out.println("요금이 부족합니다.");
			 	} 
			} else if(menu == 2) { // 코코아
			 out = in - cocoa; // 반환값 = 돈투입 - 코코아
			 System.out.println("맛있게 드세요.");
			 if(coffee > out) {
				 System.out.println("요금이 부족합니다.");
			 	}
			} else if(menu == 3) { // 반환
				System.out.println("거스름 돈 : " + out);
				in = out;
			} else if(menu == 4) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
}
