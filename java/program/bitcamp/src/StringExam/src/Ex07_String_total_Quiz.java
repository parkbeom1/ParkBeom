import java.util.Scanner;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ...
//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리 뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok)	return true or false
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수	return true or false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수	void 출력
//3개의 함수 static 

public class Ex07_String_total_Quiz {
	
	static boolean juminCheck(String jumin) {
		return (jumin.length() == 14); 
	}
	static boolean juminBackFirst(String jumin) {
		
	return Integer.parseInt(jumin.substring(7, 8)) >= 1 && Integer.parseInt(jumin.substring(7, 8)) <= 4 ? true : false;
	}	
	static boolean juminGenderCheck(String jumin) {
		int num1 = Integer.parseInt(jumin.substring(7, 8));
		if( num1 % 2 == 0) {
			System.out.println("여자"); 
			return false;
		}
		else {
			System.out.println("남자");
			return true;
		}
	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요.");
		String juminnumber = s.nextLine();
		if(juminCheck(juminnumber) && juminBackFirst(juminnumber)) {
			juminGenderCheck(juminnumber);
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}

}
