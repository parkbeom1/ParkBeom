package myPackage;

import java.util.Scanner;

public class TicketManager {
	private static int serialCode = 10000;
	private TimetableManager tm;
	private Ticket[] tickets;
	int pos;
	
	public TicketManager(int n) {
		tickets = new Ticket[n]; // �迭 ���� 
		pos = 0;
	}
	
	public void add() { // add �϶� �߰� �ϱ�
		
		Movie p_movie = null;
		Screen p_screen = null;
		String playHour = null;
		String ticketNo = null;
		Seat[] p_seat = null;
		
		
		String title,screen,time;
		int selectRow;
		String selectSeat = null;
		String seats[] = null;
		int selectSeats[] = null;
		
		
		
		Scanner s = new Scanner(System.in);
		boolean switch1 , switch2 , switch3;
		switch1 = switch2 = switch3 = false;
		
		// tm.list(); ����׿� ���
		System.out.print("��ȭ ���� : ");
	    title = s.next();
		System.out.print("�󿵰� �� �� �ð� : ");
		screen = s.next();
		time = s.next();
		
		for(int i = 0; i < tm.getPos(); i++) {
			if(tm.getMT()[i].getMovie().getTitle().equals(title) && tm.getMT()[i].getScreen().getName().equals(screen))
			{
				switch1 = true;
				
				for(int j = 0; j < tm.getMT()[i].getTimes().length; j++) {
					if(tm.getMT()[i].getTimes()[j].equals(time))
					{
						p_movie = tm.getMT()[i].getMovie();
						p_screen = tm.getMT()[i].getScreen();
						playHour = tm.getMT()[i].getTimes()[j];
						
						
						switch2 = true;
						break;
					}
				}
			if(!switch2)  { // ��ġ���� ������ 
				System.out.println("��ȭ ���� , �󿵰� �� �� �ð��� ��ġ�ϴ� ���� �����ϴ�. �ٽ� �ѹ� Ȯ�����ּ���.");
				System.out.println("debug : " + p_movie + " " + title + " " + p_screen + " " + screen + " " +playHour + " " + time);
				break;
				}
			}
		}
		
		if(!switch1) { // ��ġ���� ������ 
			System.out.println("��ȭ ���� , �󿵰��� ��ġ�ϴ� ���� �����ϴ�. �ٽ� �ѹ� Ȯ�����ּ���.");
			System.out.println("debug : " + p_movie + " " + title + " " + p_screen + " " + screen);
			return;
		}
		System.out.println("**" + p_screen.getName() + "�� " +p_screen.getRowNum() + " �� " + p_screen.getSeatNum() + "�¼� �󿵰� �Դϴ�.");
		
		while(true) {
			System.out.print("����ȣ : ");
			selectRow = s.nextInt();
			System.out.print("�¼� : ");
			s.nextLine();
			selectSeat = s.nextLine();
			seats = selectSeat.split(" "); // �����ϸ� null �� �ʱ�ȭ
			selectSeats = new int[seats.length];
			
			for(int i = 0; i < seats.length; i ++) 
			{
				selectSeats[i] = Integer.parseInt(seats[i]);
			}
			if(pos > 0 ) 
			{
				for(int i = 0; i < pos; i++) {
					for(int j = 0; j < tickets[i].getSeats().length; j++)
					{
						for(int k = 0; k < selectSeats.length; k++) 
						{
							if(tickets[i].getSeats()[i].getRowNo() == selectRow
							&& tickets[i].getSeats()[j].getSeatNo() == selectSeats[k])
						{
								switch3 = true;
							}
								
						}
					}
				}
			if(switch3 == true) 
			{
				System.out.println("�̹� ����Ǿ��ִ� �¼��Դϴ�. �ٽ� �������ּ���.");
				seats = null;
				selectSeat = null;
				selectSeats = null;
				System.out.println();
				continue;
			} else {
				break;
			}
		} else {
			break;	
			}
		}
	
	System.out.print("����Ϸ�");	
	 ticketNo = s.next();
	 ticketNo += serialCode;
	 serialCode++; // 1001
	 
	 p_seat = new Seat[selectSeats.length];
	 
	 for(int i = 0; i < selectSeats.length; i++) {
		 p_seat[i] = new Seat(selectRow , selectSeats[i]);
	 }
	 	tickets[pos] = new Ticket(ticketNo,p_movie,p_screen,playHour,p_seat);
	 	pos++;
	 	System.out.print("**");
	 
	 	for(int i = 0; i < p_seat.length; i++) {
	 		System.out.print(p_seat[i].getRowNo() + "�� " + p_seat[i].getSeatNo() + "�� ");
	 	}
	 	System.out.println(p_seat[p_seat.length -1].getRowNo()+"�� " +p_seat[p_seat.length - 1].getSeatNo() + "�� �¼�");
	 	System.out.println();
	}
	
	public void list() {
		Scanner s = new Scanner(System.in);
		String ticketNo;
		boolean isFound = false;
		System.out.print("���� ��ȣ : ");
		ticketNo = s.next();
		
		for(int i = 0; i < pos; i++) {
			if(tickets[i].getTicketNo().equals(ticketNo))
			{
				System.out.println(tickets[i].getMovie().getTitle());
				System.out.println(tickets[i].getScreen().getName());
				System.out.println(tickets[i].getPlayHour());
				System.out.print("**");
				for(int j = 0; j < tickets[i].getSeats().length - 1; i++) {
					System.out.print(tickets[i].getSeats()[j].getRowNo() +" �� "
					+tickets[i].getSeats()[j].getSeatNo() + "�� ");	
				}
				System.out.println(tickets[i].getSeats()[tickets[i].getSeats().length - 1].getRowNo() + " ��"
						+ tickets[i].getSeats()[tickets[i].getSeats().length - 1].getSeatNo() + "�� �¼�");
				isFound = true;
				break;
			}
		}
		if(!isFound) {
			System.out.println("�ش� Ƽ���� �������� �ʰų� �߸��� �̸��� Ƽ���Դϴ�.");
		}
		System.out.println();
	}
	public void remove() {
		Scanner s = new Scanner(System.in);
		String ticketNo;
		boolean isFound = false;
		
		System.out.print("���� ��ȣ : ");
		ticketNo = s.next();
		
		for(int i = 0; i < pos; i++) {
			if(tickets[i].getTicketNo().equals(ticketNo)) 
			{
				for(int j = i; j < pos; j++) {
					tickets[j] = tickets[j + 1];
				}
				System.out.println("������ ��ҵǾ����ϴ�.");
				isFound = true;
				pos--;
				break;
		}
	}
	if(!isFound) {
		System.out.println("�ش� �����ȣ�� �������� �ʽ��ϴ�.");
	}
	System.out.println();
}
	public void ticketManagerMain(TimetableManager tm) {
		this.tm = tm;
		
		if(tm.getPos() == 0) {
			System.out.println("�ּ��� �ϳ��� �󿵰��� �� ��ȭ ������ ����Ͻʽÿ� ");
			return;
		}
		Scanner s = new Scanner(System.in);
		int input = -999;
		while(input != -1) {
			System.out.print("��ȭ Ƽ�� ���� �޴� 1. ���� 2. Ȯ��  3. ���  0. �������� >> ");
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
				System.out.println("���α׷��� �����մϴ�.");
				input = -1;
				break;
			default : // �ٸ���
				System.out.println("�Է� �����Դϴ�.");
				break;
			}
		}		
	}
}
