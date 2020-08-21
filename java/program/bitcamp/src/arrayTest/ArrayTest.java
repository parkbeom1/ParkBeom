package arrayTest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 숫자를 오름차순으로 정렬");
		System.out.println("숫자 5개 입력");
		
		for(int i = 0; i < num.length; i++) {
			 num[i] = sc.nextInt();
		}
	}
}
