package array;

public class ToDimension {
	public static void main(String[] args) {
		int[][] arr = { {1,2,3} , {4,5,6}}; // 2행 3열 
		
		System.out.println(arr.length);  // 2  행의 개수
		System.out.println(arr[0].length); // 1행의  1열의 개수 
		// 총 개수를 구할때  행의 기준으로 열을 돌리면 된다. 이중for문
		
		System.out.println("-------------------------");
		for(int i = 0; i < arr.length; i++ ) {
			for(int j = 0; j < arr[i].length; j++ ) { //  i = 행  0 , 1 
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 한행을 출력할대 마다 개행 
		}		
	}
}
