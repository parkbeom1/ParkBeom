package coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu,in,out = 0; // �޴� , �������� , ��ȯ
		int coffee = 200;
		int cocoa = 250;
		boolean run = true; // while���� ���������� boolean 
		System.out.print("����� �����ϼ��� >>>");
		in = sc.nextInt(); // in = ������� 
		
	while(run) { // boolean �� �༭ true�� �޾� while�� �� �����
		System.out.println("====Ŀ�� ���Ǳ�====");
		System.out.println("1. Ŀ��(200) \t 2. ���ھ�(250)\t 3. ��ȯ  4. ����");
		System.out.print("�޴��� �����ϼ���.");
		menu = sc.nextInt();
		if(menu == 1) { // Ŀ��
			 out = in - coffee; // ��ȯ�� = ������ - Ŀ�ǰ�;
			 System.out.println("���ְ� �弼��.");
			 if(coffee > out) {
				 System.out.println("����� �����մϴ�.");
			 	} 
			} else if(menu == 2) { // ���ھ�
			 out = in - cocoa; // ��ȯ�� = ������ - ���ھ�
			 System.out.println("���ְ� �弼��.");
			 if(coffee > out) {
				 System.out.println("����� �����մϴ�.");
			 	}
			} else if(menu == 3) { // ��ȯ
				System.out.println("�Ž��� �� : " + out);
				in = out;
			} else if(menu == 4) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
	}
}
