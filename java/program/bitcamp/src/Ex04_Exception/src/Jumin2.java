import java.util.Scanner;

public class Jumin2 {
	
	static boolean juminlengthCheck(String jumin) {
		return (jumin.length() == 14) ? true : false;
	}
	// ���ڸ� ù�ڸ� 1~4�� ��� result.substring(2, 3)) 940114-1167621; 
	static boolean limitNumber(String jumin) {
		return "1234".contains(jumin.substring(7,8)); 
	}
	// ���ڸ� ù�ڸ��� 1 3 �̸� ����  2 4 �� ����
	static String  showGender(String jumin) {
		int juminBackFirst = Integer.parseInt(jumin.substring(7, 8));
		return ((juminBackFirst % 2 == 0) ? "����" :	"����");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("�ֹι�ȣ 14�ڸ��� �Է��ϼ���.");
			String jumin = sc.nextLine();
			if(!juminlengthCheck(jumin)) System.out.println("14�ڸ��� �Է��ϼ���");
			else if(!limitNumber(jumin)) 
				System.out.println("1~4 �������� ���ڰ� �ƴմϴ�.");	
			else 
				showGender(jumin);
		}
	}

