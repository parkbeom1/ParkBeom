
public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("0으로 나눕니다.");
		try {
			// 연산  문제가 발생해도 일단 프로그램은 강제로 종료되지 않았으면 좋겠다
			System.out.println(0/0); 
			// 문제가 발생하면 그 문제를 담을수 있는 객체가 자동으로 생성
			// 컴파일러가 문제에 맞는 객체를 new java.lang.ArithmeticException
			// 발생한 문제에 정보를 ArithmeticException 전달한다. 
			// 근데 Exception으로 다받을수있는 큰놈으로 쓴다.
			// e.printStackTrace 로 예외내용을 본다.
		} catch(Exception e) { //예외에 대한 수습부분 (정보를 알려주는 부분)
			// 무슨 문제가 발생했고 원인은 ..정보를 보는 것(고치는게아니다)
			e.printStackTrace(); // 전체정보를 보여줌
			System.out.println(e.getMessage());
		} finally {
			System.out.println("무조건 실행하는 코드");
		}
	}
}
