package arrayTest;

public class Lotto_Main_Test {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		// �ߺ��� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50+1);
			for(int j = 0; i < j; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = (int)(Math.random()*50+1);
				}
			}
	 	}
		int temp = 0;
		// �ζ� �� ���
		for(int i = 0; i < arr.length; i++ ) {
			for(int j =i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) { 
					temp = arr[i]; // �������� temp�� 
				    arr[i] = arr[j]; // ū���� i�� 
				    arr[j] = temp; // �������� j�� 
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
