package myPackage;

import java.util.Scanner;

public class TimetableManager {
	private MovieTimetable[] table;
	private ScreenManager sm;
	private int pos;
	
	public TimetableManager(int n) {
		table = new MovieTimetable[n];
		pos = 0;
	}
	
	public void add() {
		Scanner s = new Scanner(System.in);
		String title,openDate,grade; // ���� ���� ���
		int playtime = 0;
		Screen sc[] = sm.getScreens();
		Movie m = null;
		int select = 0;
		int mArrayCnt = 1;
		title = openDate = grade = null;
		
		while(true) {
			if(sc == null) {
				System.out.println("��ϵ� �󿵰��� �����ϴ�. �ּ��� �ϳ��� �󿵰��� ����� �ּ���.");
				
				return;
			}
			if(pos == 0) {
				System.out.println("���� ��ϵ� ��ȭ�� �����ϴ�.");
			} else {
				Movie mArray[] = new Movie[pos];
				for(int i = 0; i < pos; i++) {
					if(i == 0) {
						mArray[i] = table[i].getMovie();
					}
					if(i > 0) {
						if(!table[i-1].getMovie().getTitle().equals(table[i].getMovie().getTitle())){
							mArray[i] = table[i].getMovie();
							mArrayCnt++;
						}
					}
				}
				for(int i = 0; i < mArrayCnt; i++) {
					System.out.println("[" + (i+1) +"] " +mArray[i].getTitle() + " " +mArray[i].getOpenDate());
					
				}
				System.out.print("0�� �Է��ϸ� ���ο� ��ȭ ��� ���ù�ȣ �Է��ϸ� ���ϴ� �� ���");
				select = s.nextInt();
				if(select != 0)
				{
					m = mArray[select - 1];
				}
				// ��ȭ ��� ���⼭ ����ϰ� ������ �Ѵ�. Ȥ��  0
			}
			// ó�� ����� �ƴҶ� 
			if(select == 0) {
				System.out.print("��ȭ���� : ");
				title = s.next();
				System.out.print("������ : ");
				openDate = s.next();
				System.out.print("�� �ð� : ");
				playtime = s.nextInt();
				System.out.print("���");
				grade = s.next();
				
				m = new Movie(title ,openDate ,playtime , grade);
				System.out.println("**�ű� ��ȭ (" + title + ")�� ��ϵǾ����ϴ�.");
			}
			String temp = null;
			boolean isFound = false;
			int k = 0;
			while(true) 
			{
				System.out.print("�󿵰� : ");
				temp = s.next();
				
				if(!temp.equals("#"))
				{
					for(int i = 0; i < pos; i++) 
					{
						if(table[i].getScreen().getName().equals(temp)) {
							System.out.println("**" + table[i].getScreen().getName()
									+"�� �̹� �������� ��ϵǾ��ֽ��ϴ�.");
							isFound = true;
							break;
						}
					}
				if(isFound) {
					isFound = false;
					continue;
				}
				// sm ��ũ�� �Ŵ��� 
				for(k = 0 ; k < sm.getCount(); k++) {
					if(sc[k].getName().equals(temp)) {
						break;
					}
				}
					if(k == sm.getCount()) {
						System.out.println("**" + temp + "�� �̵�ϵǾ��ֽ��ϴ�.");
						continue;
					}
				// ���� ó�� �� �˻� ��	
				} else {
					break;
				}
				s.nextLine();
				System.out.print("������ : ");
				temp = s.nextLine();
				String timeNumbering[] = temp.split(" ");
				table[pos] = new MovieTimetable(m,sc[k],timeNumbering.length);
				table[pos].addTime(temp);
				pos++;
				System.out.println("** �� ���� ����� �Ϸ�Ǿ����ϴ�.");
			}
		// ���� �˰���
		for(int i = 0; i < pos-1; i++) {
			for(int j = 0; j < pos - 1; i++ ) {
				if(table[j].getMovie().getTitle().compareTo(table[j+1].getMovie().getTitle())>0) {
					MovieTimetable temp1 = table[j];
					table[j] = table[j + 1];
					table[j + 1] = temp1;
				}
			}
		}
		System.out.println();
		break;
		}
	}
	
	// ����Ʈ 
	public void list() {
		int i = 0;
		String name = "";
		String isEqualName = null;
		
		int firstNumbering = 1;
		while(true) {
			if( i == pos) 
				break;
				isEqualName = table[i].getMovie().getTitle();
				if(!name.equals(isEqualName)) {
					System.out.print("[" + firstNumbering + "]");
					System.out.println(table[i].getMovie().getTitle());
					name = table[i].getMovie().getTitle();
					firstNumbering++;
				}
				System.out.print(table[i].getScreen().getName() + " : ");
				table[i].showTime();
				System.out.println();
				i++;
			}
		System.out.println();
		}

	// ����
	public void remove() {
		Scanner s = new Scanner(System.in);
		String title = null;
		String name = null;
		boolean isFound = false; // ���� ���� �ȵ� 
		
		System.out.print("������ ��ȭ ���� ? ");
		title = s.next();
		
		System.out.print("������ �󿵰� ? ");
		name = s.next();
		
		for(int i = 0; i < pos; i++) {
			if(table[i].getMovie().getTitle().equals(title) && table[i].getScreen().getName().equals(name))
			{
				for(int j = i; j < pos; j++) 
				{
					table[j] = table[j + 1];
				}
				System.out.println(title + "�� " + name + "�������� ���� �Ǿ����ϴ�");
				isFound = true;  
				pos--;
				break;
			}
		}
	if(!isFound) {
		System.out.println("��ȭ ���� �Ǵ� ��ȭ���� ��Ī�� ��ġ���� �ʾƼ� ���� ���� ���߽��ϴ�.");
	}
	System.out.println();
}
	
	
	public void TimetableManagerMain(ScreenManager sm) {
		this.sm = sm;
		
		if(sm.getCount() == 0) {
			System.out.println("�ּ��� �ϳ��� �󿵰��� ����Ͻʽÿ�");
			return;
		}	
		Scanner s = new Scanner(System.in);
		int input  = -999;
		while(input != -1)  {// �󿵰��� �ִ� ? 	
			System.out.print("������ �޴� (1.��� , 2.��� 3. ����  0.���θ޴�) >> ");
			input  = s.nextInt();
			
			switch(input) {
				case 1 :
					add();
					break;
				case 2 :
					list();
					break;
				case 3 :
					remove();
					break;
				case 0 :
					input = -1;
					break;
				default :
					System.out.println("�Է� ���� �Դϴ�.");
					break;
			}
		}
	}
	
	public int getPos() {
		return pos;
	}
	public MovieTimetable[] getMT() {
		return table;
	}
}