import java.util.Scanner;

public class Ex07_String_Total_Quiz4 {

	
	static  boolean juminLengthCheck(String jumin) {
		
		return (jumin.length() == 14) ? true : false; // ���� ������ ���
	}
	
	static boolean juminBackFirst(String jumin) {
		
		return "1234".contains(jumin.substring(7, 8));
	}
	
	static void showGender(String jumin) {
		String juminBackFirst = jumin.substring(7, 8);
		
		String gender = "13".contains(juminBackFirst) ? "����" : "����";
		System.out.println(gender);
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("�ֹι�ȣ 14�ڸ��� �Է��ϼ��� ( ��:123456-1234567)");
			String jumin = s.nextLine();
			if(!juminLengthCheck(jumin)) System.out.println("14�ڸ��� �Է��Ͻÿ�");
			else if (!juminBackFirst(jumin)) System.out.println("�޹�ȣ ù������ 1~4�� �����ϴ�");
			else {
				showGender(jumin); // �������� �������� 
				break;
			}
		}
	}

}
