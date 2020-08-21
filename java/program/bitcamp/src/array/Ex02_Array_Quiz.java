package array;

public class Ex02_Array_Quiz {
	public static void main(String[] args) {
		// 수학과 학생들의 기말고사 시험점수 
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; // max 변수에는 >> 79
		int min = score[0]; // min 변수에도 79가 들어가있다.
		/*
			제어문을 사용해서 max 라는 변수에 시험 점수 최대값을 
			min 라는 변수에 시험 점수 최소값을 담으세요
			max > 97 , min > 54 
			단 , for문을 한번만 쓰시오 max,min 하나의 for문으로 구하시오 
		*/
		
		// 최대값과 최소값 구하기
//		for(int i = 0; i < score.length; i++) {		
			/*
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}
			*/
			/*
			max = (score[i] > max) ? score[i] : max;
			min = (score[i] < min) ? score[i] : min;
			}
			
			System.out.println("max : " + max);
			System.out.println("min : " + min);
			8/
			// 10개의 방의 값을 1~10까지 초기화 해라
			/*
			int[] array = new int[10];
			for(int i = 0; i < array.length; i++ ) {
				array[i] = i + 1;
			}
			for(int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			*/
			// 어느 학생의 기말고사 시험점수(5과목)
			int sum = 0;
			float average = 0f;
			int[] jumsu = {100,55,90,60,78};
			
			// 1. 총과목의 수
			// 2. 과목의 합 
			// 3. 과목의 평균
			// 단, 2,3번 문제는 하나의 for문으로 해결하시오		
			for(int i = 0; i < jumsu.length; i++) {
				System.out.println(jumsu[i]);
				sum += jumsu[i];	
				if(i == jumsu.length-1) { // i가 마지막번까지 같으면 
				average =(float)sum / jumsu.length;
			}
			/*
			System.out.println("과목의 수는 : " + jumsu.length);
			System.out.println("과목 의 합은 : " + sum);
			System.out.println("과목 의 평균은  : " +  average);
			*/
		} 
	}
}
