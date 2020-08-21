package arraytest;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		
		System.arraycopy(arr, 0, arr2, 0, 2); // 10 , 20 , 3 , 4 ,5
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}
