import java.util.Scanner;

public class Ex07_String_Total_Quiz4 {

	
	static  boolean juminLengthCheck(String jumin) {
		
		return (jumin.length() == 14) ? true : false; // 삼항 연산자 사용
	}
	
	static boolean juminBackFirst(String jumin) {
		
		return "1234".contains(jumin.substring(7, 8));
	}
	
	static void showGender(String jumin) {
		String juminBackFirst = jumin.substring(7, 8);
		
		String gender = "13".contains(juminBackFirst) ? "남자" : "여자";
		System.out.println(gender);
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("주민번호 14자리를 입력하세요 ( 예:123456-1234567)");
			String jumin = s.nextLine();
			if(!juminLengthCheck(jumin)) System.out.println("14자리를 입력하시오");
			else if (!juminBackFirst(jumin)) System.out.println("뒷번호 첫번쨰는 1~4만 가능하다");
			else {
				showGender(jumin); // 남자인지 여자인지 
				break;
			}
		}
	}

}
