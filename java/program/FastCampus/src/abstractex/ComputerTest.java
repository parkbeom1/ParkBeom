package abstractex;

public class ComputerTest {
//	Computer computer = new Computer();
//	추상메도르를 불러올수없으므로  인스턴스화 할수없다.
	public static void main(String[] args) {
	
//	computer.display();
	
	Computer computer = new DeskTop(); 
	// 업캐스팅(묵시적) 추상클래스에서도 적용됨
	computer.display(); 
	// 오버라이딩된 자식의 구현된 display() 메소드가 호출된다.
	computer.turnOff(); // 전원을 끕니다.
	
	Computer mynote = new MyNoteBook(); // 업캐스팅
	
	}
}