package arrayarraySystem;

import java.util.Scanner;

public class Reservation {
	private Scanner scanner;
	private String[][] seat; // �¼�
	private int[][] bookingnum; // ���Ź�ȣ
	
	public Reservation() {
		scanner = new Scanner(System.in);
		seat = new String[4][5];
		bookingnum = new int[4][5];
	}
	public int showmenu() {
		System.out.println("********************");
		System.out.println("*****��ȭ ���� �ý���*****");
		System.out.println("********************");
		System.out.println("1. �¼� ��ȸ �ϱ�");
		System.out.println("2. ���� �ϱ�");
		System.out.println("3. ���� ��ȸ �ϱ�");
		System.out.println("4. ���� ��� �ϱ�");
		System.out.println("5. �����ϱ�");
		int selectnum = Integer.parseInt(scanner.nextLine());
		return selectnum;
	}
	// �޴� ����
	public void selectMenu() {
		loop_p : while(true) {
			int selectnum = showmenu();
		switch(selectnum) {
			case 1: seatinfo();
				// �¼� ��ȸ
				break;
			case 2: selectSeat();
				// ���� �ϱ�
				break;
			case 3: Reservconfirm();
				// ���� ��ȸ
				break;
			case 4: cancel();
				// ���� ���
				break;
			case 5:
				// �����ϱ�	
				break loop_p; // 
			}
		}
	}
	// �޴�1. �¼� ��ȸ
	private void seatinfo() {
		for(int i = 0; i < seat.length; i++) {
			for(int j =0; j < seat[i].length; j++) {
				seat[i][j] = i + "-" + j;
				System.out.printf("[%s]",seat[i][j]); //String �̴ϱ� %s ����
			}
			System.out.println();
		}
	}	
	// �޴�2. ���� �ϱ�
	private void selectSeat() {
		 System.out.println("�¼��� �������ּ���. ��)1-1 ");
		 System.out.println("�̹� ����� �¼���  ���� ��� ǥ���մϴ�.");
		 String select1 = scanner.nextLine();
		 System.out.println("���� �����մϴ� ���� �Ͻðڽ��ϱ�?");
		 System.out.println("��(1) , �ƴϿ�(2) , �ʱ�ȭ��(0) �� �ϳ��� �Է����ּ���.");
		 int choice = Integer.parseInt(scanner.nextLine());
		 switch(choice) {
		 case 1:
			 for(int i = 0; i < seat.length; i++) {
				 for(int j = 0; j < seat[i].length; j++) {
					 if(select1.equals(seat[i][j])) { // String�� .equals��
						 seat[i][j] = "����";
						 	// ���Ź�ȣ �� ���� �ο����ش�.
						 bookingnum[i][j] = (int)(Math.random()*1000000);
						 System.out.println("���Ű� �Ϸ�Ǿ����ϴ�");
					System.out.printf("������ �¼���ȣ : [%d-%d] / ���Ź�ȣ : [%d]" , i , j , bookingnum[i][j]);
			    }
			 }
		 }
	 break;
		 case 2:	
			 System.out.println("�ٽ� �������ּ���.");
			 break;
		 case 3:
			 break;
  
		 } 
	}
	// �޴�3. ���� ��ȸ
	private void Reservconfirm() {
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		int select1 = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < bookingnum.length; i++) {
			for(int j = 0; j < bookingnum[i].length; j++) {
				if(select1 == bookingnum[i][j]) {
					System.out.printf("������ �����Ͻ� �¼��� [%d-%d �̴�.]",i,j);
				}
			}
		}
	}
	// �޴�4. ���� ���
	public void cancel () {
		System.out.println("���Ź�ȣ�� �Է����ּ���.");
		int select1 = Integer.parseInt(scanner.nextLine());	
		System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
		System.out.println("��(1) , �ƴϿ�(2) �� �ϳ��� �Է����ּ���.");
		int choice1 = Integer.parseInt(scanner.nextLine());
		switch(choice1) {
		case 1:
			for(int i = 0; i < bookingnum.length; i++ ) {
				for(int j = 0; j < bookingnum[i].length; j++) {
					if(select1 == bookingnum[i][j]) {
						seat[i][j] = i+ "-" +j; // �ʱ�ȭ
						 bookingnum[i][j] = 0; // �ʱ�ȭ
						 System.out.println("���Ű� ��ҵǾ����ϴ�. �����մϴ�.");
					}
				}
			}
		case 2:
			System.out.println("�ٽü����Ͻÿ�");
			break;
		default :
			break;
		}
	}	
}	
	
	
	
