package array;

public class ToDimensionTest {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5},{6,7,8,9,10}}; // 2�� 
		// 1 2 3
		// 4 5 
		// 6,7,8,9,10
		
		/*
		for(int i = 0; i < array.length; i++) { // ��
			for(int j = 0; j < array[i].length; j++ ) { // i = 1��,2��
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		*/		
		for(int i = 0; i <  array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]); // ��� ���� ��µ�
			}
			System.out.println(); // ���๮�� 
		}
	}
}
