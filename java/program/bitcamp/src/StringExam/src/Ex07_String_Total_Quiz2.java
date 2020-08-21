import java.util.Scanner;

public class Ex07_String_Total_Quiz2 {

	static boolean checkJumin(String jumin) {
		if(jumin.length() == 14) {
			System.out.println("14자리 ok");
		} else {
			System.out.println("14자리 아니다.");
		} 
		return false;
	}
	
	static boolean checkBackFirst(int jumin) {
		if(jumin >= 1 && jumin <= 4) {
			System.out.printf("뒷 번호 첫번째 자리 : [%d] so Ok\n", jumin);
			return true;
		} else {
			System.out.printf("뒷 번호 첫번째 자리 : [%d] so NO\n", jumin);
			return false;
		} 
	}
	
	static boolean checkGender(String jumin) {
		
		int num = Integer.parseInt(jumin);
		if(num % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("주민번호 입력 " );
			String jumin = s.nextLine();
			int firstNumber = Integer.parseInt(jumin.substring(7,8));
			
		if(checkJumin(jumin)) {
			if(checkJumin(jumin)) {
				checkGender(jumin);
				break;
				} else {
					System.out.println("주민번호 뒷자리를 올바르게 입력해주세요.");
				}
			} else {
				System.out.println("14자리를 정확히 입력해주세요.");
			}
		}
	}
}
