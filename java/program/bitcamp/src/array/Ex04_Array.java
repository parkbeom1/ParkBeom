package array;

import java.util.Arrays;

/*
	�迭�� ��ü��(Array)
	1. new �� ���ؼ� �����.
	2. ���޸𸮿� �����ȴ�.
	3. �����迭(�����迭) : �迭�� ũ�Ⱑ �ѹ� �������� ������ �Ұ��ϴ�.
	4. �ڷᱸ�� �⺻...
	
*/
public class Ex04_Array {
	public static void main(String[] args) {
		// int s , s1 ,s2 (x) ���� Ÿ���� ���� ?
		
	int[] score = new int[3]; // 0 ~ 3-1  3��  
	// int �� 3���� ���� - ���޸𸮿� �����ȴ�.>> ���ȣ�� �ε��� or ÷�� ��� �θ���.
		System.out.println(score[0]);
		score[0] = 101; // �濡 ����  write
		score[1] = 20; 
		score[2] = 300;
		System.out.println(score[0]); // 101 read
		
		// �濡 ������  �׻� �ε��� ������ 1 ũ��. ( n-1 ���� ������ index ��ȣ�̴�.)
//		score[3] = 50; // java.lang.ArrayIndexOutOfBoundsException 
					   // �ε����� ��ȣ�� ��� �����̴�.
					   // �̰�� try-catch ���� ����.
		// Array �迭 �� ������ ���� �߸´� �����  for�� �̴�.
		
		for(int i = 0; i < score.length; i++ ) { 
		// length�� �迭�� ����(����) �� �˼� �ִ�. ���� ������  -1 �ϳ������� < ���������� ���� ������ �������ϱ�
		System.out.printf("[%d] = %d \t",i,score[i]);
		}
		// Tip Array �����ִ� Ŭ���� ( �̰� ���� ���ƶ� for�� ��� - ó���Ͻôº��� �ݱ� ��? �Ƿ��� �ش� ���߿� ���) 
		String result = Arrays.toString(score);  // Arrays - static , toString - �����ε�
		System.out.println(result);
		// �����͸� �����϶�� �ߴµ�  ó�� �Ͻô� ���� �ݱ�... �Ƿ��� �پ�� 
		Arrays.sort(score);
		String resultarray = Arrays.toString(score);
		System.out.println(resultarray);
		
		// �Ի� ����
		// 12,8,1,20, �����ض� ������ ������ �����ض�
		// Arrays.sort(score) : 10�� 
		
		// Today point
		// �迭 ������ 3���� ���
		// ���� ���� �ʰ� �����ô� ���� ĥ�ǿ�...
		int[] arr = new int[5]; // �⺻...
		int[] arr2 = new int[] {100,200,300}; // ���ȣ�� ������ �ʱ�ȭ ��Ų��.
											  // �ʱⰪ�� ���ؼ� ���� ���������.
		// �����Ϸ��� int[] {100,200,300} ����
		int[] arr3 = {11,22,33,44,55}; // javascript let cararr = [1,2,3,4,5];�ڹٽ�ũ��Ʈ�� ���ȣ�� ��
		// arr3 �濡 �ִ� ���� ���
		for(int i = 0; i < arr3.length; i++ ) {
			System.out.println(arr3[i]);
		}
		// �迭�� ��ü��(new ... memory ... heap)
		int [] arr4; // ���� �� �Ҵ��� �и��Ҽ��ִ�.
		arr4 = new int[] {21,22,23,24,25}; // �Ҵ�
		System.out.println(arr4); // �ּҰ��� ���´�.
		
		int[] arr5 = arr4; // �ּҰ� �Ҵ�
		System.out.println(arr5 == arr4); // true ���� �ּҰ��� �����ϰ� �ȴ�.
		
		// �迭�� Ÿ���� : 7���� �⺻ + String 
		// Ŭ����(����� ���� Ÿ��) >> Array Ÿ������ ,,, 
		
		String[] strarr = new String[] {"��","��","�ٶ�"};
		for(int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		char[] charr = new char[10]; // char��  default �� : ����  \u0000 
		for(int i = 0; i < charr.length; i++ ) {
			System.out.println(">" + charr[i] + "<"); 
		}
		
		// ��ü �迭
		// Car
		// Car[] cars = new Car[10];
		
	}
}
