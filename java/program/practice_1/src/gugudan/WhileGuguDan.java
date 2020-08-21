package gugudan;

public class WhileGuguDan {
	
	public static void main(String[] args) {
	/*
		int i = 1;
	while(i <= 9) {
		int j = 1;
			while(j <= 9) {				
				System.out.println(i + " X " + j + " = " + i * j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	*/
		int i = 2; // 첫번쨰 while문 초기값 설정 
		while(i <= 9) { // 1번쨰 while문 조건
			int j = 1; // 2 x 1 로 만듬  
			while(j <= 9) { // 2번째 while문 조건 
			System.out.println(i + " X " + j + " = " + i * j);	
			j++;
			}
			System.out.println();
			i++;
		}
	} // end main
}// end class whileMulti
