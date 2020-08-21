package array;

import java.util.Arrays;

/*
	배열은 객체다(Array)
	1. new 를 통해서 만든다.
	2. 힙메모리에 생성된다.
	3. 고정배열(정적배열) : 배열의 크기가 한번 정해지면 변경이 불가하다.
	4. 자료구조 기본...
	
*/
public class Ex04_Array {
	public static void main(String[] args) {
		// int s , s1 ,s2 (x) 같은 타입을 굳이 ?
		
	int[] score = new int[3]; // 0 ~ 3-1  3개  
	// int 방 3개를 생성 - 힙메모리에 생성된다.>> 방번호를 인덱스 or 첨자 라고 부른다.
		System.out.println(score[0]);
		score[0] = 101; // 방에 접근  write
		score[1] = 20; 
		score[2] = 300;
		System.out.println(score[0]); // 101 read
		
		// 방에 개수는  항상 인덱스 값보다 1 크다. ( n-1 것이 마지막 index 번호이다.)
//		score[3] = 50; // java.lang.ArrayIndexOutOfBoundsException 
					   // 인덱스의 번호를 벗어난 오류이다.
					   // 이경우 try-catch 문을 쓴다.
		// Array 배열 와 궁합이 가장 잘맞는 제어문은  for문 이다.
		
		for(int i = 0; i < score.length; i++ ) { 
		// length는 배열의 개수(길이) 를 알수 있다. 실제 개수는  -1 하나작으니 < 작은것으로 방이 개수가 정해지니까
		System.out.printf("[%d] = %d \t",i,score[i]);
		}
		// Tip Array 도와주는 클래스 ( 이거 쓰지 말아라 for문 써라 - 처음하시는분은 금기 왜? 실력이 준다 나중에 써라) 
		String result = Arrays.toString(score);  // Arrays - static , toString - 오버로딩
		System.out.println(result);
		// 데이터를 정렬하라고 했는데  처음 하시는 분은 금기... 실력이 줄어요 
		Arrays.sort(score);
		String resultarray = Arrays.toString(score);
		System.out.println(resultarray);
		
		// 입사 시험
		// 12,8,1,20, 정렬해라 낮은값 순으로 정렬해라
		// Arrays.sort(score) : 10점 
		
		// Today point
		// 배열 생성의 3가지 방법
		// 내일 가장 늦게 들어오시는 분이 칠판에...
		int[] arr = new int[5]; // 기본...
		int[] arr2 = new int[] {100,200,300}; // 방번호를 값으로 초기화 시킨다.
											  // 초기값을 통해서 방이 만들어진다.
		// 컴파일러가 int[] {100,200,300} 생성
		int[] arr3 = {11,22,33,44,55}; // javascript let cararr = [1,2,3,4,5];자바스크립트는 대괄호를 씀
		// arr3 방에 있는 값을 출력
		for(int i = 0; i < arr3.length; i++ ) {
			System.out.println(arr3[i]);
		}
		// 배열은 객체다(new ... memory ... heap)
		int [] arr4; // 선언 과 할당을 분리할수있다.
		arr4 = new int[] {21,22,23,24,25}; // 할당
		System.out.println(arr4); // 주소값이 나온다.
		
		int[] arr5 = arr4; // 주소값 할당
		System.out.println(arr5 == arr4); // true 같은 주소값을 공유하게 된다.
		
		// 배열의 타입은 : 7가지 기본 + String 
		// 클래스(사용자 정의 타입) >> Array 타입으로 ,,, 
		
		String[] strarr = new String[] {"가","나","다라마"};
		for(int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		char[] charr = new char[10]; // char는  default 값 : 빈문자  \u0000 
		for(int i = 0; i < charr.length; i++ ) {
			System.out.println(">" + charr[i] + "<"); 
		}
		
		// 객체 배열
		// Car
		// Car[] cars = new Car[10];
		
	}
}
