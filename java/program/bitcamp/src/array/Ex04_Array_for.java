package array;

public class Ex04_Array_for {

	public static void main(String[] args) {
		// Today Point
		// for문 ... 향상된 개선된 for문 
		// JAVA : for ( Type 변수명 : 배열 or Collection { 실행구문 변수명 ....}
		// C# : for(type 변수명 in 
		// JavaScript : for(Type 변수명 in 배열 or Collection ) {실행 구문 변수명 ... }
		
		int[] arr3 = {5,6,7,8,9};
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
		System.out.println();
		// 개선된 for문 
		for(int value : arr3) {  // 배구에서  토스만 전달 
			System.out.print(value);
		}
		
		// 문자를 출력하는 개선된 for문 
		String[] strarr = {"A","B","C","D","FFFF"};
		for(String str : strarr) {
			System.out.print(str + " ");
		}
	}
}
