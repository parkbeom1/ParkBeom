
/* 
 * String Ŭ���� ( ���ڿ� )
String �� ���� �Լ� ... ���ڿ��� ���� ( �ڸ��� , ��ġ��  )
subString , replace ,split 
String >> static �Լ�  + �Ϲ� �Լ�(new�ؼ������ִ�)
subString - �κ������� �̾ƿ� 
*/
public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = ""; // ���ڿ��� �ʱ�ȭ >> null �� ���� ( String �� Ŭ�����̴ϱ� )
		// ����� : int , double ó�� ������ 
		String[] starr = new String[] {"aaa","bbb","ccc"};
			for(String s : starr){
			System.out.println(s);
		}
		//////////////////////////////////////////////////
		String str2 = "ȫ�浿";
		System.out.println(str2.length()); // 3
		System.out.println(str2.toString());	// ȫ�浿
		System.out.println(str2); // ȫ�浿  �ּҰ��� ���;� ���������� ���� ���´� �� ?  toString�� �������ؼ�
		// object ������ toString�� �������߱� �����̴�.(���� ����ϵ���) 
		
		// 1. String name = "�����ٶ󸶹�"; >>
		// String ���������� �޸𸮸� ���µ�  char[] �޸𸮸� ����Ѵ�. >> char[] >> [��][��]][��] [��]  String�ڷᱸ���� char �迭�̴�.  
		//                                                            0  1   2   3
		// class String extends Object(char[]) ... ����� String �� ������ִ� object�� char[] �� �����Ű� @override toString() {...} length() }
		
		String stra = new String("ȫ�浿"); // String�� Ŭ������ new�� �ؼ� ����µ� ��� new�� �ϴµ� ����� 
		String str1 = "AAA"; // String �� �񱳴� equals 
		String str3 = "AAA";

		System.out.println(str1);
		System.out.println(str1 == str3); // true 
		// == ������ ���� ��(str1(�ּҰ�) , str2(�ּҰ�))
		// ���� �ּҷ� �Ǹ�� �� ������ ? 
		// �޸𸮿� ������ ���� ���ڿ��� ������ ���� ....
		
		System.out.println(str1.equals(str3)); // true �ּҸ� ã�ư��� �� �ȿ� �ִ� ���� ���Ѵ�.
		/// AAA = AA
		
		// �׷��� ����...
		String str4 = new String("BBB");
		String str5 = new String("BBB");	
		System.out.println(str4 == str5); // false  �ٸ� �ּҰ��� �����Ǵϱ� ? 
		System.out.println(str4.equals(str5)); // true
	
		// �ͼ���
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s);		
		s = "A";
		System.out.println(s);
		
	}
}
