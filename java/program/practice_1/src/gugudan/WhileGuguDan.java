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
		int i = 2; // ù���� while�� �ʱⰪ ���� 
		while(i <= 9) { // 1���� while�� ����
			int j = 1; // 2 x 1 �� ����  
			while(j <= 9) { // 2��° while�� ���� 
			System.out.println(i + " X " + j + " = " + i * j);	
			j++;
			}
			System.out.println();
			i++;
		}
	} // end main
}// end class whileMulti
