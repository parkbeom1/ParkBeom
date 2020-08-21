package array;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] arr = new int[10];  // 참조자료형과 기본자료형이 크기가 다르다. 
		int[] arr2 = new int[] {1,2,3}; // 선언과 동시에 초기화 
		int[] arr3 = {1,2,3};
	
		int[] arr4;
		arr4 = new int[] {1,2,3};
		int total = 0;
		// 10 숫자가 변할수있으므로 length로 하면 배열의 길이가 변해도 length값으로 속성을가져온다
		for(int i = 0 , num=1; i < arr.length; i++ , num++) {
			arr[i] = num;  // 배열의 길이만큼 1부터 값을 채워넣는다. 
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
		
		// 5개의 공간에 3개만 넣었으면 나머지 double 2개의 요소는 0.0으로 초기화된다.
		// 이러면 count 를 하나두고 하나씩 넣을떄마다 count를 ++ 해준다.
		
		double mtotal  = 1;
		for(int i = 0; i < count; i++) { // count 개수만큼 돌리면된다.
									// 생성된공간에 들어간 요소만큼 돌릴수있다. 
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);
	}
}
