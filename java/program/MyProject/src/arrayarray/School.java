package arrayarray;

import java.util.Scanner;

public class School {
	private Scanner scanner;
	private String[][] subject; // ����,�л�
	private String[][] student; // �л�
	private int[][] studentid;
	private int[][] subscore;
	
	public School() {
		scanner = new Scanner(System.in);
		subject = new String[5][4]; // ���� �迭
		student = new String[5][4]; // ���� �迭
		studentid = new int[5][4]; // �л� ��ȣ
		subscore = new int[5][4]; // ���� ����
	}
	// ��� ��ȸ ���
	public String showMenu() {
		System.out.println("********************");
		System.out.println("***�л� ���� ���� �ý���***");
		System.out.println("1. �л���  ���� ��� ");
		System.out.println("2. ���� �Է�");
		System.out.println("3. �й� ��ȸ");
		System.out.println("4. ���� ��ȸ");
		System.out.println("5. ��� ���");
		String select = scanner.nextLine();
		return select;
	}
	public void selectMenu() {
		while(true) {
		  String choice = showMenu(); // return �� String�̴� String���� �޴´�.
		  switch(choice) {
		  case "1":
			  register();         // 1.  �л� �� ���� ���
			  break;
		  case "2": 
			  scoreinput();    	  // 2.  ���񸶴� ���� �Է� 
			  break;
		  case "3": 
			  studentidinfo();    // 3. �й� ��ȸ
			  break;
		  case "4": 
			  scoreinfo() ; 	  // 4. �л��� �й� ��ȸ��  ������ �̸��� ���� ���   
			  break;
		  case "5":
			  registercancel();   // 5. ��� ��� 
			  break;
		  default :
			  break;
		   }
		}	
	}
	// 1. �л��� ���� ��� 
	public void register() {
		System.out.println("�л� �̸��� �Է����ּ���. : ");
		String studentname = scanner.nextLine();
		System.out.println("���� �̸��� ������ּ��� . : ");
		String subjectname = scanner.nextLine();
		
		for(int i = 0; i < student.length; i++ ) {
			for(int j = 0; j < student[i].length; j++) {
					student[i][j] = studentname; // �л� ��� 
					studentid[i][j] = (int)(Math.random()*100+1);
					subject[i][j] = subjectname; 
					System.out.println("�л� ����� �Ϸ�Ǿ����ϴ�.");
					System.out.printf("�л��� �̸���  : [%s] �л��� �й���  [%d] \n",student[i][j],studentid[i][j]);
					System.out.printf("��ϵ� ������� : [%s]" , subject[i][j]);	
			}
		}	
	}	
	// 2. ���� ����  �л��� ���� �Է�
	public void scoreinput() {
		System.out.println("�л� �� �̸��� ���� ���ּ���.");
		String studentname = scanner.nextLine();
		System.out.println("������ �̸��� ���� ���ּ���.");
		String subjectname = scanner.nextLine();
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(studentname.equals(student[i][j])) 
					if(subjectname.equals(subject[i][j])){
						System.out.println("������ �Է����ּ���");
						subscore[i][j] = scanner.nextInt(); 
					} else {
						System.out.println("��ϵ��� �ʴ� �л� �̰ų� ���� ���� �Դϴ�.");
					}
				}
			}
		}
	// 3. �й� ��ȸ 
	public void studentidinfo() {
		System.out.println("�й��� ��ȸ�մϴ�.");
		System.out.println("�л��� �̸��� �������ּ���.");
		String studentname = scanner.nextLine();
		for(int i = 0; i < studentid.length; i++) {
			for(int j = 0; j < studentid[i].length; j++) {
				if(studentname.equals(student[i][j])) {
					System.out.printf("�л��� �й��� [%d] �Դϴ�.",studentid[i][j]);
				}
			}
		}
	}
	// 4. �л��� �й� ��ȸ�� ������ ���� , �й� ��� 
	public void scoreinfo() {
		System.out.println("�л��� �й��� �Է����ּ���.");
		int inputid = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(inputid == studentid[i][j]) {
					System.out.printf("�� �л��� �й��� [%d] �л��� ��� ������ [%s] ������ [%d] �Դϴ�.",studentid[i][j], subject[i][j] , subscore[i][j]);
				}
			}
		}
	}
	// 5. �л� ��� ���
	public void registercancel() {
		System.out.println("�л��� �й��� �Է����ּ���.");
		int inputid = scanner.nextInt();
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(inputid == studentid[i][j]) {
					student[i][j] = null;
					System.out.printf("[%d] �л��� ���� �Ǿ����ϴ�." , student[i][j]);
				}
			}	
		}
	}
}
