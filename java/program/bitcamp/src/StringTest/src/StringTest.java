import java.util.Scanner;

public class StringTest {
/*	
	����ڷκ��� �̸��� �Է� �޾����� ���� �̸��� �������� �и����Ѽ� �Է� ���� 
	�Է� : ȫ �浿 > ��� : �� = ȫ / �̸� = �浿
	�Է� : ȫ�浿 >> ��� : ������ ������ �ٽ� �Է����ּ���.
*/	
	public static void main(String[] args) {
		
		String firstName="";
		String lastName="";
		
		while(true) {
			String msg = "���� �̸��� �������� �и��Ͽ� �Է����ּ���.";
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			name = name.trim(); // ������ ����
			
			if(name.contains(" ")) {
				 int idx = name.indexOf(" "); // ���鿡�� �����Ѵ�.
				 firstName = name.substring(0,idx);
				 lastName = name.substring(idx + 1);
				 break;
			} else {
				msg = "������ �����ϴ�. �ٽ� �Է����ּ���.";
			}
		}	
		System.out.println(" ���� : " + firstName + " �̸��� : " + lastName);
	}
}


