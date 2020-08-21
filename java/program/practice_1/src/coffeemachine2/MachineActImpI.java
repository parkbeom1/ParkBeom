package coffeemachine2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MachineActImpI implements MachineAct {

	Scanner sc = new Scanner(System.in);
	ArrayList<MachineVO> list = new ArrayList<>();
	private int remain_money=0; // �������ִ� �� 
	
	// �������̽� ���� �κ� 
	@Override
	public void insert_Coin() {
		int ch; // ��?
		System.out.println("���� ��������");
		System.out.println("1 : 5000�� , 2 : 1000��  , 3 : 500�� , 4 : 100��");
				
		ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			remain_money = remain_money + 5000;
			System.out.println("���� �ݾ� : 5000");
			break;
		case 2:
			remain_money = remain_money + 1000;
			System.out.println("���Աݾ� : 1000");
			break;
		case 3:
			remain_money = remain_money + 500;
			System.out.println("���Աݾ� : 1000");
			break;
		case 4:
			remain_money = remain_money + 100;
			System.out.println("���Աݾ� : 100");
			break;	
		}
		
		System.out.println("��� ���� �ݾ� : " + remain_money);
	}
	
	@Override
	public void return_Coin() {
		if(remain_money == 0) { // ���� ���� 0���̸�
			System.out.println("��ȯ �� ���� �����ϴ�.");
		}
		else {
			remain_money = 0; // �������� 0���� �ƴϸ� 0�� �ְ� ��ȯ�Ϸ�
			System.out.println("��ȯ �Ϸ�");
			System.out.println("��� ���� �ݾ� : " + remain_money);
		}
	}

	@Override
	public void enter_Menu() { // �޴��� �Է�?
		MachineVO vo = new MachineVO();
		System.out.println("���Ǳ� �޴� ���");
		System.out.println("�޴� �̸� ? ");
		vo.setDrink_name(sc.next());
		System.out.println("�޴� ����? (���ڸ� �Է�)");
		vo.setDrink_price(sc.nextInt());
		System.out.println("��� ���(ä�� ����)");
		vo.setDrink_stock(sc.nextInt());
		list.add(vo);
		System.out.println("��� �Ϸ�");
	}
	@Override // �޴� ����
	public void choice_Menu() {
		System.out.println("�޴�����");
		
		print_Menu(); // �޴� ������
		System.out.println();
		
		String s;
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		System.out.println("���ϴ� ��ǰ�� �Է�");
		
		s = sc.next();
		while(it.hasNext()) {
			vo = it.next();
			if(s.equals(vo.getDrink_name())) { 
				if(vo.getDrink_stock() == 0){ // ��� 0 �̸� 
				System.out.println("��� �����ϴ�.");
				break;
			}
			if(remain_money - vo.getDrink_price() < 0 ) { 
				// �����ִµ����� ����������� �P���� 0���� ������ 
				System.out.println("�ܾ��� �����ϴ�.");
				
				break;
			}
			remain_money = remain_money - vo.getDrink_price();
			// ���������� ������� ��� �ϳ� ���� 
			vo.setDrink_stock(vo.getDrink_stock()-1); 
			System.out.println(vo.getDrink_name() +
					"��� �Ϸ� , ������:"+ remain_money + "���:" 
					+ vo.getDrink_stock());
			}
		}
	}
	@Override
	public void enter_Stock() { // ��� ���� 
		System.out.println("��� ����");
		
		String s;
		int stock;
		MachineVO vo = new MachineVO();
		print_Menu();
		System.out.println();
		System.out.println("������ ���� �� �Է�");
		s = sc.next();
		
		Iterator<MachineVO> it = list.iterator();
		System.out.println("������ ��� ���� �Է�");
		stock = sc.nextInt();
		while(it.hasNext()) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				vo.setDrink_stock(vo.getDrink_stock() + stock);
				System.out.println(vo.getDrink_name() + "���� �Ϸ� ���:"+vo.getDrink_stock());
				break;
			}
		}
	}
	@Override
	public void print_Menu() {
	System.out.println("�޴�");
		
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {	
			vo = it.next();
		
			System.out.print("��ǰ�� : " + vo.getDrink_name() + " ");
			System.out.print("���� : " + vo.getDrink_price() + " ");
			System.out.print("��� ���� : " + vo.getDrink_stock() +" ");
			
			System.out.println();
		}
	}
	@Override
	public void delete_Menu() { // �޴��� �����ش�.
		System.out.println("������ ��ǰ�� �Է�");
		
		String s;
		MachineVO vo = new MachineVO();
		print_Menu();
		
		s = sc.next();
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {
			vo = it.next();
			if(s.equals(vo.getDrink_name())) {
				
				list.remove(vo);
				System.out.println("���� �Ϸ�");
				
				break;
			}
		}
	}
	@Override
	public void update_Menu() {
	System.out.println("���� �� ��ǰ �� �Է�");
	String s;
	MachineVO vo = new MachineVO();
	print_Menu();
	s = sc.next(); // ���� �޴� �̸� ����
	
	Iterator<MachineVO> it = list.iterator();
	
	while(it.hasNext()) {
		vo = it.next();
			if(s.equals(vo.getDrink_name())) {
				System.out.println("(����) �޴� �̸� ?");
				vo.setDrink_name(sc.next());
				System.out.println("(����) �޴� ����?(���ڸ� �Է�)");				
				vo.setDrink_price(sc.nextInt());
				System.out.println("(����) ��� �Է�");
				vo.setDrink_stock(sc.nextInt());
				System.out.println("���� �Ϸ�");
				break;
			}
		}
	}
}

