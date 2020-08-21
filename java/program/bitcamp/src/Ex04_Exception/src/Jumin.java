import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제

//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false 
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력
//3개의 함수 static 
public class Jumin {
	
	static boolean Jumincheck(String jumin) { // 자리수 체크
		System.out.println("주민번호 14자리가 맞으면 true");
		if(jumin.length() == 14) return true;
		 else 	return false;
	}
	// 뒷자리 첫자리 1~4만 허용 result.substring(2, 3))
	static boolean numbercheck(String jumin) {
		// 입력한 값을 문자열로 변환
		System.out.println("주민번호 뒷자리 첫자리가 1~4만 허용합니다. 맞으면 true");
		int intjumin = jumin.charAt(7) - '0'; // 1 
		 if(intjumin >= 1 && intjumin <= 4) return true;
		 			else return false;
		 }
	// 뒷번호 첫번째 자리값이 1또는3 이면 남자  2또는 4 이면 여자 
	static boolean sexcheck(String jumin) {
		System.out.println("뒷번호 첫번째 자리값이 1또는3 이면 남자  2또는 4 이면 여자 ");	
		int intjumin = jumin.charAt(7) - '0';
		if(intjumin == 1 || intjumin == 3) {
			System.out.println("남자");
			return true;
		} else if (intjumin == 2 || intjumin == 4){
			System.out.println("여자");
			return false;
		} else {
		return false;			
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Jumin jumin3 = new Jumin();
		String jumin = sc.nextLine();
		System.out.println(Jumin.Jumincheck(jumin));
		System.out.println(Jumin.numbercheck(jumin));
		System.out.println(Jumin.sexcheck(jumin));
	}
}
