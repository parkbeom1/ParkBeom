package gugudan;

public class ForGugudanClass {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "�� �Դϴ�.");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		} 
	}

}
