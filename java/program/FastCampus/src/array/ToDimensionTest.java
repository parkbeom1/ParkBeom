package array;

public class ToDimensionTest {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5},{6,7,8,9,10}}; // 2행 
		// 1 2 3
		// 4 5 
		// 6,7,8,9,10
		
		/*
		for(int i = 0; i < array.length; i++) { // 행
			for(int j = 0; j < array[i].length; j++ ) { // i = 1행,2행
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		*/		
		for(int i = 0; i <  array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]); // 행과 열이 출력됨
			}
			System.out.println(); // 개행문자 
		}
	}
}
