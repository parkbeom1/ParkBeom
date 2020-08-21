import java.util.Scanner;

public class StringTest {
/*	
	사용자로부터 이름을 입력 받았을때 성과 이름을 공백으로 분리시켜서 입력 받자 
	입력 : 홍 길동 > 출력 : 성 = 홍 / 이름 = 길동
	입력 : 홍길동 >> 출력 : 공백이 없군요 다시 입력해주세요.
*/	
	public static void main(String[] args) {
		
		String firstName="";
		String lastName="";
		
		while(true) {
			String msg = "성과 이름을 공백으로 분리하여 입력해주세요.";
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			name = name.trim(); // 공백을 제거
			
			if(name.contains(" ")) {
				 int idx = name.indexOf(" "); // 공백에서 구분한다.
				 firstName = name.substring(0,idx);
				 lastName = name.substring(idx + 1);
				 break;
			} else {
				msg = "공백이 없습니다. 다시 입력해주세요.";
			}
		}	
		System.out.println(" 성은 : " + firstName + " 이름은 : " + lastName);
	}
}


