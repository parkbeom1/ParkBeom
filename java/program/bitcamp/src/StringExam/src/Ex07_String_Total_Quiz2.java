import java.util.Scanner;

public class Ex07_String_Total_Quiz2 {

	static boolean checkJumin(String jumin) {
		if(jumin.length() == 14) {
			System.out.println("14�ڸ� ok");
		} else {
			System.out.println("14�ڸ� �ƴϴ�.");
		} 
		return false;
	}
	
	static boolean checkBackFirst(int jumin) {
		if(jumin >= 1 && jumin <= 4) {
			System.out.printf("�� ��ȣ ù��° �ڸ� : [%d] so Ok\n", jumin);
			return true;
		} else {
			System.out.printf("�� ��ȣ ù��° �ڸ� : [%d] so NO\n", jumin);
			return false;
		} 
	}
	
	static boolean checkGender(String jumin) {
		
		int num = Integer.parseInt(jumin);
		if(num % 2 == 0) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("�ֹι�ȣ �Է� " );
			String jumin = s.nextLine();
			int firstNumber = Integer.parseInt(jumin.substring(7,8));
			
		if(checkJumin(jumin)) {
			if(checkJumin(jumin)) {
				checkGender(jumin);
				break;
				} else {
					System.out.println("�ֹι�ȣ ���ڸ��� �ùٸ��� �Է����ּ���.");
				}
			} else {
				System.out.println("14�ڸ��� ��Ȯ�� �Է����ּ���.");
			}
		}
	}
}
