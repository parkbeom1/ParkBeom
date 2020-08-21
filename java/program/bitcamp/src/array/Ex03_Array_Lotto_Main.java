package array;

/*
 *1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
 *3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
 *4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
​*/
import java.util.Arrays;

public class Ex03_Array_Lotto_Main {

	public static void main(String[] args) {
		int[] array = new int[6];

		// 중복값 제거
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*50+1);
				for(int j = 0; j < i; j++) {
					if(array[j] == array[i]) { // j = i 같으면 
						array[i] = (int)(Math.random()*50+1); // i를 다시 랜덤 추출 			
						}
					}	
				}	
		// 내림차순 
		int temp = 0; 
		for(int i = 0; i < array.length; i++) {
				for(int j = i+1; j < array.length; j++) {
						if(array[i] < array[j]) {  			
							temp = array[i];  // 작은값을  temp 에다가 담음
							array[i] = array[j]; // 큰  값을  i에다가 담음 
							array[j] = temp;  // 작은값은 j에다가 담음 
							}
						}
					}
		// 배열 추출 
		System.out.println();
			for(int i = 0; i < array.length; i++) {
				 System.out.print(array[i] + " ");
					}
				}
			}