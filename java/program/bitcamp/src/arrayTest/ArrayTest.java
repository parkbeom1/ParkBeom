package arrayTest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ���ڸ� ������������ ����");
		System.out.println("���� 5�� �Է�");
		
		for(int i = 0; i < num.length; i++) {
			 num[i] = sc.nextInt();
		}
	}
}
