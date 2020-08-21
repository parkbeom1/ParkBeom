package transport;

import java.util.Scanner;

public class StudentTest {
	static Scanner sc = new Scanner(System.in);
	static int displayMenu() {
		System.out.println("***���߱����� �����ϼ��� ***");
		System.out.println(" 1. �ý� �̿��ϱ� õ�̹��" );
		System.out.println();
		System.out.println(" 2. ���� �̿��ϱ� õ�� " );
		System.out.println();
		System.out.println(" 3. ����ö �̿��ϱ� 2õ��" );
		System.out.println();
		System.out.println(" 4. �����ϱ� ");		
		int menu = 0; // menu �ʱⰪ ���� 	
		do {
		try {
			menu = Integer.parseInt(sc.nextLine());
			if(menu >= 1 && menu <= 4) {
				break;
			} else {
				throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�.");
			} 
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("�޴� ���� ���� �߻�");
			System.out.println("�޴� 1~4�� ���� �Է� �ض�");
			}
		} while(true);
	 return menu;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student("ȫ�浿",20);
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

