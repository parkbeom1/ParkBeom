package array;

public class Ex04_Array_for {

	public static void main(String[] args) {
		// Today Point
		// for�� ... ���� ������ for�� 
		// JAVA : for ( Type ������ : �迭 or Collection { ���౸�� ������ ....}
		// C# : for(type ������ in 
		// JavaScript : for(Type ������ in �迭 or Collection ) {���� ���� ������ ... }
		
		int[] arr3 = {5,6,7,8,9};
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
		System.out.println();
		// ������ for�� 
		for(int value : arr3) {  // �豸����  �佺�� ���� 
			System.out.print(value);
		}
		
		// ���ڸ� ����ϴ� ������ for�� 
		String[] strarr = {"A","B","C","D","FFFF"};
		for(String str : strarr) {
			System.out.print(str + " ");
		}
	}
}
