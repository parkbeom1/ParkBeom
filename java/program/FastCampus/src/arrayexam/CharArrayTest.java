package arrayexam;

public class CharArrayTest {
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		// 다시 잘 들어갔나 확인 
		for(int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
		/* 빠른 for문 
		for(char i : alphabets) {
			System.out.println(i);
		}
		*/
	}
}
