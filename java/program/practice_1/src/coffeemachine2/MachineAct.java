package coffeemachine2;

// 자판기 메소드 구현을 위한 인터페이스 부분
public interface MachineAct {
	public void insert_Coin(); // 동전투입
	public void return_Coin(); // 잔돈반환
	public void enter_Menu(); //메뉴등록
	public void delete_Menu(); // 메뉴삭제
	public void update_Menu(); // 메뉴수정
	public void enter_Stock(); // 재고등록
	public void print_Menu(); // 메뉴보기
	public void choice_Menu(); // 메뉴선택
	
}
