package myPackage;

import java.util.Scanner;

public class ScreenManager {
	private Screen[] screens; // ��ũ�� �迭 ���� 
	private int maxCount; // ���� ��ũ�� ����
	private int count; // ��ũ�� ����
	
	public ScreenManager(int maxCount) {
		
		this.maxCount = maxCount;
		this.screens = new Screen[maxCount];
		count = 0;
	}
	
	public void add() {
		
		String name = null;
		int rowNum = 0 , seatNum = 0;
		Scanner s = new Scanner(System.in);
		if(count == maxCount) 
			System.out.println("�� ������ ��ũ�� ���� ��� ���ֽ��ϴ�.");
		else{
		System.out.print("�󿵰� ��Ī : ");
		name = s.next();
		System.out.print("�¼� ���� : ");
		rowNum = s.nextInt();
		System.out.print("�ѿ��� �¼� �� : ");
		seatNum = s.nextInt();
		System.out.println("# " + name + "�� �����Ǿ����ϴ�.");
		System.out.println();
		screens[count] = new Screen(name,rowNum,seatNum);
		count++;
		}
	}	
		
	public void list() {
		for(int i = 0; i < count; i++) {
			System.out.println(
				screens[i].getName() + "[" + screens[i].getRowNum() + "�� /" + screens[i].getSeatNum() +"�¼�]");
		}
		System.out.println();
	}
			
	
	public void remove() {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �󿵰� ��Ī ? ");
		String input = s.next();
		boolean isfound = false;
		for (int i = 0; i < count; i++) {
			if(input.equals(screens[i].getName())) {
				System.out.println("# " + input + "�� ���� �Ǿ����ϴ�.");		
				for(int j = i; j < count; j++) {
					screens[j] = screens[j+1];
				}
				isfound = true;
				count--;
				break;
			}
		}
		if (!isfound) { // true�Ͻ�
			System.out.println("������ �󿵰� ��Ī�� �߸��ȰͰ����ϴ�. �ٽ� �õ����ּ���.");
		}
		System.out.println();
	}
	
	public void screenManagerMain() {
		Scanner s = new Scanner(System.in);
		int input = -999;
		while(input != -1) {
			System.out.print("�󿵰� �޴� (1. ��� 2. ��� 3 ���� 4 ���θ޴� >>");
			input = s.nextInt();
			switch(input) {
			case 1:
				add();
				break;
			case 2:
				list();
				break;
			case 3:
				remove();
				break;
			case 0:
				input = -1;
				break;
			default :
				System.out.println("�Է� ���� �Դϴ�.");
				break;
			}
		}
	}
	public Screen[] getScreens() {

		if(count == 0) {
			return null;
		} else 
			return screens;
	}
	public void setScreens(Screen[] screens) {
		this.screens = screens;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
