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
	// 1. �޴� ���� 
	public void selectMovieNumbers() {
		while(true) { 
			String selectnum = showMenu();
			switch (selectnum) {
			case "1": 
				ShowSeat1(); // �����ϱ�
				break;
			case "2": 
				seatInfo(); // ��ȸ�ϱ�
			 	break;
			case "3":  
				cancelReserve(); // ���� ���
				break;
			case "4":  
				System.exit(0); // ���� �ϱ�
			}		
		 }
	  } 
	// 2. �޴� ����
	private String showMenu() {
		System.out.println("***************************");
		System.out.println("1. ���� �ϱ�");
		System.out.println("2. ���� ��ȸ");
		System.out.println("3. ���� ���");
		System.out.println("4. ���� �ϱ�");
		String selectnum = scanner.nextLine();	 
		return selectnum;
	}	
	// 3. �¼� ��� 
	public void ShowSeat1() {
		System.out.println("�¼� ��Ȳ");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i) + "-" + (j);
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}	
	// 4. �¼� ����	
		System.out.println("�¼��� �������ּ���. �� 1-1");
		String inputseat = scanner.nextLine();
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(inputseat.equals(seat[i][j])) {
					seat[i][j] = "����";
					ticketnumber[i][j] = (int)(Math.random()*999999+100000);
					System.out.println("���� ��ȣ��  : " + ticketnumber[i][j] + " �����¼���  : " + seat[i][j] );
				} 
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}		
	}
	// ���� ��ȸ
	Scanner scanner1 = new Scanner(System.in);
	public void seatInfo() {
		System.out.println("ã���÷��� ���� ��ȣ�� �Է��ϼ��� :");
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				int choice = scanner1.nextInt();
				if(choice == ticketnumber[i][j]) {
					System.out.println("�����Ͻ� �¼���  :" + i + " - " + j + " �Դϴ�.");
					break;
				} else {
					showMenu();
				}
			}
		}	
	}
	
}
