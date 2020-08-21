package arrayexam;
/*
 	문자 배열을 생성하고 출력해보기
 	대문자를 A-Z 까지 배열에 저장하고 이를 다시 출력하는 프로그램 만들기
*/
public class ArrayExam {
	
	public static void main(String[] args) {
		int[] arr = new int[100];
	
		for(int i = 65; i <= 90; i++ ) {
			arr[i] = i;
			System.out.print((char)arr[i] + " ");
		}
	}
}
