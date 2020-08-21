package arrayarrayTest;

import java.util.Scanner;

public class Cinema2 {
	private Scanner scanner; // �Է�
	private String[][] seat;
	private int[][] reservedNumber;
	
	public Cinema2() {
		scanner = new Scanner(System.in);
		seat = new String[4][5];
		reservedNumber = new int[4][5];
	}
	
	// �޴� ���� 
	
	public void selectSeatStart() {
	
		loop_1:while(true) {	
		String selectnum = showMenu();
	
		switch(selectnum) {
		case "1":
			selectSeat(); // �¼� ����
			break;
		case "2":
			seatInfo();   // �¼� ��ȸ 
			break;
		case "3":
			reservedConfirm(); 	  // ���� ��ȸ		
			break;
		case "4":
			cancel(); // ���� ���
			break;
		case "5":
			break loop_1; // break���� while �� ��ġ�� �� 
			
			}
		}
	}
	// �¼� �ʱ�ȭ
	public void seatInit() {
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] =(i+1) + "-" + (j+1);
			}
		}
	}
	// �޴� ����
	public String showMenu() {
		System.out.println("*************");
		System.out.println("1. ���� �ϱ�");
		System.out.println("2. �¼� ��ȸ");
		System.out.println("3. ���� ��ȸ");
		System.out.println("4. ���� ���");
		System.out.println("5. ���� �ϱ�");
		String selectnum  = scanner.nextLine();
		return selectnum;
	}
	
	public void selectSeat() {
		System.out.println("�¼��� �������ּ��� ��)1-1");
		System.out.println("�̹� ���ŵ� �¼��� \"����\"��� ǥ���մϴ�.");
		String select1 = scanner.nextLine(); // �¼� ���� 
		
		System.out.println("���� �����մϴ�. ���� �Ͻðڽ��ϱ�?");
		System.out.println("��(1) �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
		int select2 = Integer.parseInt(scanner.nextLine()); // �� �ƴϿ� 
		
		switch(select2) {
		case 1:
			for(int i = 0; i < seat.length; i++) {
				for(int j = 0; j < seat[i].length; j++) {
					if(select1.equals(seat[i][j])) { 
						seat[i][j] = "����";
						reservedNumber[i][j] =(int)(Math.random()*10000000);
						System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
						System.out.printf("������ �¼���ȣ : [%d-%d] / ���Ź�ȣ[%d]\n",i+1,j+1,reservedNumber[i][j]);
					} else if(seat[i][j] == "����") { // �̹� ���ŷ� �Ǿ��ִ� ���
						System.out.println("�̹� ������ �Դϴ�.");
					} 
				}
			} 
			break;
		case 2:
			System.out.println("�ٽ� �������ּ���.");
			break;
		default:
			break;
		}	
	}
	// 2�� �¼� ��ȸ
	public void seatInfo() {
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		} 
	}
	// 3�� ���� ��ȸ
	private void reservedConfirm() { 
		System.out.println("���� ��ȣ�� �Է����ּ���.");
		int select = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(select == reservedNumber[i][j]) {
					// ���ڳ����� == �� �� 
					System.out.printf("������ �����Ͻ� ��ȣ�� [%d-%d] �Դϴ�." , i+1 , j+1);
				}
			}
		}		
	}	
	// 4�� ���� ��� - ���Ź�ȣ�� �Է¹ް� ������ ���Ź�ȣ �����  ��������ϰڳ� �������� ���Ź�ȣ�� ���� ������ ��ȣ�� ������
	// �ٽ� �ʱⰪ 0 ���� �ǵ�����.
	private void cancel() {
		System.out.println("���� ��ȣ�� �Է����ּ���.");
		int select1 = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(select1 == reservedNumber[i][j]) {
					System.out.printf("������ �����Ͻ� �¼��� [%d-%d] �Դϴ�.\n", i+1,j+1);
				}
			}
		}
		
		System.out.println("���Ÿ� ��� �Ͻðڽ��ϱ� ?");
		System.out.println("��(1) , �ƴϿ�(2) �� �ϳ��� �Է��ϼ���.");
		int select2 = (int)Integer.parseInt(scanner.nextLine());
		switch(select2) {
		case 1:
			for(int i = 0; i < reservedNumber.length; i++) {
				for(int j = 0; j < reservedNumber.length; j++) {
					if(reservedNumber[i][j] == select1) {
						seat[i][j] = (i+1) + "-" +(j+1);
						reservedNumber[i][j] = 0;
						System.out.println("���Ű� ��ҵǾ����ϴ�.");
					}
				}
			}
			break;
		case 2:
			System.out.println("�ٽ� �����ϼ���.");
			break;
		default :
			break;
		}	
	}	
}
