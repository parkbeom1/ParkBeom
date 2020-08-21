import java.util.Scanner;

public class Ex07_String_Total_Quiz {
	//	14자리 입력받았는지 확인	
	static boolean juminLengthCheck(String jumin) {	
		return (jumin.length() == 14); // 
	}
	//	입력받은 주민번호 전체 자리에서 '-' 뒤의 숫자만 분리하기
	static boolean juminBackFirstCheck(String jumin) {	
		return "1234".contains(jumin.substring(7, 8));
	}
	//	뒷 7자리 문자열 중 맨 처음 한 글자가 1 ~ 4인지 확인
	static boolean juminGenderCheck(String jumin) {
		String juminBackFirst = jumin.substring(7,8);
		String gender = "13".contains(juminBackFirst) ? "남자":"여자";
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("주민번호 14자리를 입력하세요 (예: 123456-1234567)");
			String jumin = sc.nextLine();
			if(!juminLengthCheck(jumin))
				System.out.println("14자리로 입력하세요.");
			else if(!juminBackFirstCheck(jumin)) 
				System.out.println("뒷번호 첫번째는 1~4 입력이 가능합니다.");
			else {
				juminGenderCheck(jumin);
				break;
			}
		}
	}
}
