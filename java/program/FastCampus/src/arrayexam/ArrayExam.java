package arrayexam;
/*
 	���� �迭�� �����ϰ� ����غ���
 	�빮�ڸ� A-Z ���� �迭�� �����ϰ� �̸� �ٽ� ����ϴ� ���α׷� �����
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
