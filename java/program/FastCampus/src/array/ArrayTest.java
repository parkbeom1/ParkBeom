package array;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] arr = new int[10];  // �����ڷ����� �⺻�ڷ����� ũ�Ⱑ �ٸ���. 
		int[] arr2 = new int[] {1,2,3}; // ����� ���ÿ� �ʱ�ȭ 
		int[] arr3 = {1,2,3};
	
		int[] arr4;
		arr4 = new int[] {1,2,3};
		int total = 0;
		// 10 ���ڰ� ���Ҽ������Ƿ� length�� �ϸ� �迭�� ���̰� ���ص� length������ �Ӽ��������´�
		for(int i = 0 , num=1; i < arr.length; i++ , num++) {
			arr[i] = num;  // �迭�� ���̸�ŭ 1���� ���� ä���ִ´�. 
			total += arr[i];
		}
		System.out.println(total);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		// 5���� ������ 3���� �־����� ������ double 2���� ��Ҵ� 0.0���� �ʱ�ȭ�ȴ�.
		// �̷��� count �� �ϳ��ΰ� �ϳ��� ���������� count�� ++ ���ش�.
		
		double mtotal  = 1;
		for(int i = 0; i < count; i++) { // count ������ŭ ������ȴ�.
									// �����Ȱ����� �� ��Ҹ�ŭ �������ִ�. 
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
	}
}
