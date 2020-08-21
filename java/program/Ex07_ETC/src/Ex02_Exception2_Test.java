
public class Ex02_Exception2_Test {
	public static void main(String[] args) {
		
		int num = 100;
		int result = 0;
		System.out.println("main start");
		try {
			for(int i = 0; i < 10; i++) {
				result = num /(int)(Math.random()*10);
			}
		} catch(ArithmeticException e) { // 0으로 나눴을 경우
			if(Math.random() == 0) {
				System.exit(0);
				System.out.println("문제가 발생 관리자에게 메일 발송");
				System.out.println(e.getMessage());
			}
		} catch(NullPointerException e) {
			
		} catch(Exception e) {
			// 연산 예외 , null 예외를 제외한 나머지를 내가 처리 한다. 
		}
		System.out.println("main end");
	}		
}

