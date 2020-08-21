package arrayTest;

public class Lotto_Main_Test {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		// 중복값 제거
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50+1);
			for(int j = 0; i < j; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = (int)(Math.random()*50+1);
				}
			}
	 	}
		int temp = 0;
		// 로또 값 출력
		for(int i = 0; i < arr.length; i++ ) {
			for(int j =i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) { 
					temp = arr[i]; // 작은값은 temp로 
				    arr[i] = arr[j]; // 큰값은 i로 
				    arr[j] = temp; // 작은값은 j로 
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
