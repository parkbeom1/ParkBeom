import java.util.Scanner;

//�ֹι�ȣ : �޹�ȣ ù�ڸ� : 1,3 ���� , 2,4 ���� ��� ��� ...
//main �Լ� Scanner  ��� �ֹι�ȣ �Է¹ް�
//��:6�ڸ� ��:7�ڸ�
//�Է°� : 123456-1234567 
//1. �ڸ��� üũ (���)�Լ� (14 ok)	return true or false
//2. �޹�ȣ ù��° �ڸ��� 1~4������ ���� ��� ����Լ�	return true or false
//3. �޹�ȣ ù��° �ڸ����� ������ 1,3 ���� , 2,4 ���� ��� ����Լ�	void ���
//3���� �Լ� static 

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
			System.out.println("����"); 
			return false;
		}
		else {
			System.out.println("����");
			return true;
		}
	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է����ּ���.");
		String juminnumber = s.nextLine();
		if(juminCheck(juminnumber) && juminBackFirst(juminnumber)) {
			juminGenderCheck(juminnumber);
		} else {
			System.out.println("�ٽ� �Է����ּ���.");
		}
	}

}
