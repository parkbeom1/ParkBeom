import java.util.Scanner;

public class Ex07_String_Total_Quiz {
	//	14�ڸ� �Է¹޾Ҵ��� Ȯ��	
	static boolean juminLengthCheck(String jumin) {	
		return (jumin.length() == 14); // 
	}
	//	�Է¹��� �ֹι�ȣ ��ü �ڸ����� '-' ���� ���ڸ� �и��ϱ�
	static boolean juminBackFirstCheck(String jumin) {	
		return "1234".contains(jumin.substring(7, 8));
	}
	//	�� 7�ڸ� ���ڿ� �� �� ó�� �� ���ڰ� 1 ~ 4���� Ȯ��
	static boolean juminGenderCheck(String jumin) {
		String juminBackFirst = jumin.substring(7,8);
		String gender = "13".contains(juminBackFirst) ? "����":"����";
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�ֹι�ȣ 14�ڸ��� �Է��ϼ��� (��: 123456-1234567)");
			String jumin = sc.nextLine();
			if(!juminLengthCheck(jumin))
				System.out.println("14�ڸ��� �Է��ϼ���.");
			else if(!juminBackFirstCheck(jumin)) 
				System.out.println("�޹�ȣ ù��°�� 1~4 �Է��� �����մϴ�.");
			else {
				juminGenderCheck(jumin);
				break;
			}
		}
	}
}
