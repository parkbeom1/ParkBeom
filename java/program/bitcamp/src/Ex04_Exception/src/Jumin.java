import java.util.Scanner;

//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ... �ϴ� ����

//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ�     ��:7�ڸ�
//�Է°� : 123456-1234567 
//1. �ڸ��� üũ (���)�Լ� (14 ok)  return true , false 
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�  return true, false
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�  void  ���
//3���� �Լ� static 
public class Jumin {
	
	static boolean Jumincheck(String jumin) { // �ڸ��� üũ
		System.out.println("�ֹι�ȣ 14�ڸ��� ������ true");
		if(jumin.length() == 14) return true;
		 else 	return false;
	}
	// ���ڸ� ù�ڸ� 1~4�� ��� result.substring(2, 3))
	static boolean numbercheck(String jumin) {
		// �Է��� ���� ���ڿ��� ��ȯ
		System.out.println("�ֹι�ȣ ���ڸ� ù�ڸ��� 1~4�� ����մϴ�. ������ true");
		int intjumin = jumin.charAt(7) - '0'; // 1 
		 if(intjumin >= 1 && intjumin <= 4) return true;
		 			else return false;
		 }
	// �޹�ȣ ù��° �ڸ����� 1�Ǵ�3 �̸� ����  2�Ǵ� 4 �̸� ���� 
	static boolean sexcheck(String jumin) {
		System.out.println("�޹�ȣ ù��° �ڸ����� 1�Ǵ�3 �̸� ����  2�Ǵ� 4 �̸� ���� ");	
		int intjumin = jumin.charAt(7) - '0';
		if(intjumin == 1 || intjumin == 3) {
			System.out.println("����");
			return true;
		} else if (intjumin == 2 || intjumin == 4){
			System.out.println("����");
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
