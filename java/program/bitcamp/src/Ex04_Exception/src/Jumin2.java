import java.util.Scanner;

public class Jumin2 {
	
	static boolean juminlengthCheck(String jumin) {
		return (jumin.length() == 14) ? true : false;
	}
	// 뒷자리 첫자리 1~4만 허용 result.substring(2, 3)) 940114-1167621; 
	static boolean limitNumber(String jumin) {
		return "1234".contains(jumin.substring(7,8)); 
	}
	// 뒷자리 첫자리가 1 3 이면 남자  2 4 면 여자
	static String  showGender(String jumin) {
		int juminBackFirst = Integer.parseInt(jumin.substring(7, 8));
		return ((juminBackFirst % 2 == 0) ? "여자" :	"남자");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("주민번호 14자리를 입력하세요.");
			String jumin = sc.nextLine();
			if(!juminlengthCheck(jumin)) System.out.println("14자리로 입력하세요");
			else if(!limitNumber(jumin)) 
				System.out.println("1~4 범위내의 숫자가 아닙니다.");	
			else 
				showGender(jumin);
		}
	}

