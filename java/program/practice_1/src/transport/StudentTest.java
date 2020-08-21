package transport;

import java.util.Scanner;

public class StudentTest {
	static Scanner sc = new Scanner(System.in);
	static int displayMenu() {
		System.out.println("***대중교통을 선택하세요 ***");
		System.out.println(" 1. 택시 이용하기 천이백원" );
		System.out.println();
		System.out.println(" 2. 버스 이용하기 천원 " );
		System.out.println();
		System.out.println(" 3. 지하철 이용하기 2천원" );
		System.out.println();
		System.out.println(" 4. 종료하기 ");		
		int menu = 0; // menu 초기값 설정 	
		do {
		try {
			menu = Integer.parseInt(sc.nextLine());
			if(menu >= 1 && menu <= 4) {
				break;
			} else {
				throw new Exception("메뉴 선택 번호가 잘못 되었습니다.");
			} 
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("메뉴 선택 문제 발생");
			System.out.println("메뉴 1~4번 까지 입력 해라");
			}
		} while(true);
	 return menu;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student("홍길동",20);
		Taxi taxi = new Taxi(5050);
		Bus bus = new Bus(11);
		Subway sub = new Subway(2);	
		System.out.println();
		while(true) {
			switch(displayMenu()) {
			case 1: student.takeby(taxi);
			break;
			case 2: student.takeby(bus);
			break;
			case 3: student.takeby(sub);
			break;
			case 4: 
				System.exit(0);
			}
		}		
	}
}

