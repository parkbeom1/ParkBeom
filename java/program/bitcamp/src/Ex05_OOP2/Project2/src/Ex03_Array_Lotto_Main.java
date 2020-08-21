



public class Ex03_Array_Lotto_Main {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			//System.out.println(lotto[i]);
			for(int j=0;j<i;j++) {
				while(lotto[i]==lotto[j]) {
					lotto[i]=(int)(Math.random()*45 + 1);
				}
			}
		}
		
		
		for(int i = 0 ; i < lotto.length ;i++) {
			for(int j=i+1 ; j < lotto.length ; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+ "  ");
		}
    }
}

