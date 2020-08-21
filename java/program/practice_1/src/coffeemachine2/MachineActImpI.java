package coffeemachine2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MachineActImpI implements MachineAct {

	Scanner sc = new Scanner(System.in);
	ArrayList<MachineVO> list = new ArrayList<>();
	private int remain_money=0; // 가지고있는 돈 
	
	// 인터페이스 구현 부분 
	@Override
	public void insert_Coin() {
		int ch; // 돈?
		System.out.println("돈을 넣으세요");
		System.out.println("1 : 5000원 , 2 : 1000원  , 3 : 500원 , 4 : 100원");
				
		ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			remain_money = remain_money + 5000;
			System.out.println("투입 금액 : 5000");
			break;
		case 2:
			remain_money = remain_money + 1000;
			System.out.println("투입금액 : 1000");
			break;
		case 3:
			remain_money = remain_money + 500;
			System.out.println("투입금액 : 1000");
			break;
		case 4:
			remain_money = remain_money + 100;
			System.out.println("투입금액 : 100");
			break;	
		}
		
		System.out.println("사용 가능 금액 : " + remain_money);
	}
	
	@Override
	public void return_Coin() {
		if(remain_money == 0) { // 남은 돈이 0원이면
			System.out.println("반환 할 돈이 없습니다.");
		}
		else {
			remain_money = 0; // 남은돈이 0원이 아니면 0을 주고 반환완료
			System.out.println("반환 완료");
			System.out.println("사용 가능 금액 : " + remain_money);
		}
	}

	@Override
	public void enter_Menu() { // 메뉴에 입력?
		MachineVO vo = new MachineVO();
		System.out.println("자판기 메뉴 등록");
		System.out.println("메뉴 이름 ? ");
		vo.setDrink_name(sc.next());
		System.out.println("메뉴 가격? (숫자만 입력)");
		vo.setDrink_price(sc.nextInt());
		System.out.println("재고 등록(채울 개수)");
		vo.setDrink_stock(sc.nextInt());
		list.add(vo);
		System.out.println("등록 완료");
	}
	@Override // 메뉴 선택
	public void choice_Menu() {
		System.out.println("메뉴선택");
		
		print_Menu(); // 메뉴 보여줌
		System.out.println();
		
		String s;
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		System.out.println("원하는 제품명 입력");
		
		s = sc.next();
		while(it.hasNext()) {
			vo = it.next();
			if(s.equals(vo.getDrink_name())) { 
				if(vo.getDrink_stock() == 0){ // 재고가 0 이면 
				System.out.println("재고가 없습니다.");
				break;
			}
			if(remain_money - vo.getDrink_price() < 0 ) { 
				// 남아있는돈에서 음료수가격을 뻇을떄 0보자 작으면 
				System.out.println("잔액이 부족하다.");
				
				break;
			}
			remain_money = remain_money - vo.getDrink_price();
			// 정상적으로 샀을경우 재고가 하나 감소 
			vo.setDrink_stock(vo.getDrink_stock()-1); 
			System.out.println(vo.getDrink_name() +
					"출력 완료 , 남은돈:"+ remain_money + "재고:" 
					+ vo.getDrink_stock());
			}
		}
	}
	@Override
	public void enter_Stock() { // 재고 충전 
		System.out.println("재고 충전");
		
		String s;
		int stock;
		MachineVO vo = new MachineVO();
		print_Menu();
		System.out.println();
		System.out.println("충전할 음료 명 입력");
		s = sc.next();
		
		Iterator<MachineVO> it = list.iterator();
		System.out.println("충전할 재고 수량 입력");
		stock = sc.nextInt();
		while(it.hasNext()) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				vo.setDrink_stock(vo.getDrink_stock() + stock);
				System.out.println(vo.getDrink_name() + "충전 완료 재고:"+vo.getDrink_stock());
				break;
			}
		}
	}
	@Override
	public void print_Menu() {
	System.out.println("메뉴");
		
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {	
			vo = it.next();
		
			System.out.print("제품명 : " + vo.getDrink_name() + " ");
			System.out.print("가격 : " + vo.getDrink_price() + " ");
			System.out.print("재고 개수 : " + vo.getDrink_stock() +" ");
			
			System.out.println();
		}
	}
	@Override
	public void delete_Menu() { // 메뉴를 보여준다.
		System.out.println("삭제할 제품명 입력");
		
		String s;
		MachineVO vo = new MachineVO();
		print_Menu();
		
		s = sc.next();
		Iterator<MachineVO> it = list.iterator();
		
		while(it.hasNext()) {
			vo = it.next();
			if(s.equals(vo.getDrink_name())) {
				
				list.remove(vo);
				System.out.println("삭제 완료");
				
				break;
			}
		}
	}
	@Override
	public void update_Menu() {
	System.out.println("수정 할 제품 명 입력");
	String s;
	MachineVO vo = new MachineVO();
	print_Menu();
	s = sc.next(); // 수정 메뉴 이름 받음
	
	Iterator<MachineVO> it = list.iterator();
	
	while(it.hasNext()) {
		vo = it.next();
			if(s.equals(vo.getDrink_name())) {
				System.out.println("(수정) 메뉴 이름 ?");
				vo.setDrink_name(sc.next());
				System.out.println("(수정) 메뉴 가격?(숫자만 입력)");				
				vo.setDrink_price(sc.nextInt());
				System.out.println("(수정) 재고 입력");
				vo.setDrink_stock(sc.nextInt());
				System.out.println("수정 완료");
				break;
			}
		}
	}
}

