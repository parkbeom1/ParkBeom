package arraytest;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[11];
		
		int total = 0;
		for(int i = 1; i < arr.length; i++) {
				arr[i] = i;
				total += arr[i];
				System.out.println(arr[i]);	
		}
		System.out.println(total);
	}
}
