import java.util.StringTokenizer;

public class Ex06_String_Function {
	
	public static void main(String[] args) {
		String str = "hello";
		str.concat(str); // ������ ���ڿ� ��ģ��. ������ ���ڿ� �� �����ش�.
		System.out.println(str.concat("world")); // hello wrold 
		boolean bo = str.contains("ell"); // true ����Ÿ����  boolean ���� �Է��� ���ڰ� ������ true , ������ false
		System.out.println(bo);
		String str2 = "a b c d"; // [a][][b][][c][][d] ���ڵ� �����̴�.
		System.out.println(str2.length()); // 7 
		String filename ="hello java world"; //[h][e][l][l][o][][j] // 0 1 2 3 4 5 6 7
		System.out.println(filename.indexOf("h")); // h�� �ִ�  �ε��� ��ȣ�� �˷��ش�.
		System.out.println(filename.indexOf("java")); // �� ������ ���� ��ġ�� 6
		System.out.println(filename.indexOf("������")); // �迭�濡 ������ -1
		// �Ź� �缳 �˻� .... ���� .... �� ���� 0���� ũ�� �Ѵܾ�� ��������Ƿ� ���� ã�����ϴ� indexof�� ���� ���ϴ� ���ڿ��� ���ԵǾ� �ִ���
		// ... 0���� ū ���̸� 1���� ����....
		
		if(filename.indexOf("wo") != -1) {
			// ����Ÿ���̸� �� �ؾߵ�  0���� ū���̸� ���� ������ �ִ� , -1�� �ƴϸ� ���� ������ �ִ�
			System.out.println("wo�� �ϳ��� ������ �ֽ��ϴ�.");
		}
		System.out.println(filename.lastIndexOf("a")); // 9 ? 
		
		// length() , indexOf() , substring() , replace() , split()
		String result = "supermane";
		// beginIndex the beginning index, inclusive.
		// endIndex the ending index, exclusive.
		// �κ����� ���� ����  substring(int beginIndex,int endIndex) // endIndex ���� -1 ���ڸ����� 
		
		// substring�� ���۰� ���� ã�����ִ�. 
		System.out.println(result.substring(0)); 
		System.out.println(result.substring(1,2)); // �ڱ� �ڽ��� ���´�  u endindex -1 ���ؼ� p�� ������
		System.out.println(result.substring(0, 0));// -1���� ���� �ƹ��͵� �ȳ��´�.
		System.out.println(result.substring(2, 3)); 
		
		//Quiz 
		String filename2="aaaa.zip"; // �Ǵ� hong.png �Ǵ� h.jpeg �� �ü��ִµ�
		// ���⼭ ���ϸ�� Ȯ����� �и��ؼ� ����ϼ���.
		
		// 1. ���ϸ� >> aaaa
		// 2. Ȯ���� >> zip
		// ������ ��� �Լ��� ������ ������ Ǯ�� 
		
		// substring ��  firstindex �� lastindex �� �ִ�.
		System.out.println("���ϸ��� " + filename2.substring(0,filename2.indexOf(".")));
		System.out.println("Ȯ����� " + filename2.substring(filename2.indexOf(".")));
	
		int position = filename2.indexOf("."); // �ε����� ã���� (������)
		String file = filename2.substring(0,position);
		String extention2 = filename2.substring(position+1,filename2.length());
		String extention = filename2.substring(++position); // ������ �������� �������ְ� 
	
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
	
		// replace (ġȯ�Լ�)
		String str3 = "ABCDDDDDDA";
		String result3 = str3.replace("DDDDD", "������ �����");
		System.out.println(result3);
		
		result3 = str3.replace("A", "a"); // �빮�� A�� �ҹ��� a�� �� �ٲ�
		System.out.println(result3); 
		
		// ETC 
		System.out.println();
		// �ε����� �ָ� ���ڸ� ã�Ƴ�
		System.out.println(str3.charAt(0)); // A
		System.out.println(str3.charAt(3));  // D 
		// Ư�� ���ڿ��� �������� 
		System.out.println(str3.endsWith("DDDA")); // true  
		System.out.println(str3.endsWith("BDDDA")); // false
		
		System.out.println(str3.equalsIgnoreCase("aBCDddDDDa")); // ��ҹ��� ���о��� �� �Ѵ�. ������ true
		
		// Today Point (Split)
		//String str4 = "���۸�,��Ƽ,�����,������,������";
		
		// �и��Ȱ� �迭�濡 �ʳ��´�. �躰�� �ʳ��� ����߸���.
		//String[] namearray = str4.split(","); 
		
		
		// split - . �������� ����. 
		String str4 = "���۸�.��Ƽ.�����.������.������";
		String[] namearray = str4.split("\\.");  
		for(String s : namearray) {
			System.out.print(s + " ");
		}
		/*
		 ���� ǥ���� ǥ�� ( java , javascript , Oracle , c#) �������� ��Ģ�� ����Ѵ�. 
		��� ���ڸ� ���鶧 ��Ģ�� �ο��Ѵ�. >> ��ȿ�� �Ǵ� �ٰ� 
		�ֹι�ȣ��  ���� 6�ڸ�  - ��� Ư�����ڿ�  ���� 7�ڸ�  {\d6} - {\d7} �� ��Ģ�� �°� �Է��� �ߴ���  
		�ڵ���  12345-1234567 >> false �� ���� 
		������ȣ
		�����ȣ
		�������ּ� 
		�̸��� �ּ� ���� ���� ���� ǥ�������� �����ص� 
		// https://regexper.com/#%5E%28%3F%3A%5B0-9%5D%7B2%7D%28%3F%3A0%5B1-9%5D%7C1%5B0-2%5D%29%28%3F%3A0%5B1-9%5D%7C%5B1%2C2%5D%5B0-9%5D%7C3%5B0%2C1%5D%29%29-%5B1-4%5D%5B0-9%5D%7B6%7D%24
		 * 
		���� ���� ����ǥ���� 
		���������� ���߿� �������̴�. -> �ֹι�ȣ�� ������ �ؼ��� �ؾ��Ѵ� ù���ڰ� �Ӱ� �;� �ϴ��� 
		5�� �Ұ��̴� 
		split �������� ����ǥ������ �����ִ�. 
		 . �̶�°� ����ǥ���� ���� �̶� split�� ������ ���ϴ��� �׷��� �̽������� ���� �״�� \. �ϸ� �̰͵� ����ǥ�����̶� �տ��� \ ���δ�. 
		 �ֹι�ȣ���� �´���  -  ����ǥ���� �����̴�. 
		 */	
		System.out.println();
		String filename3 = "bit.hwp";
		// split ����ؼ� ���ϸ�� Ȯ��� ���
		// ���ϸ�
		String[] str5 = filename3.split("\\.");
		
		for(String s : str5) {
			System.out.println(s);
		}
		
		// ��� ���� �������� �������� ���ڸ� �и��Ϸ��� 
		
		String str10 = "a/b.c-d.f";
		StringTokenizer sto = new StringTokenizer(str10,"/-.");
		while(sto.hasMoreElements()) {
			System.out.print(sto.nextToken());
		}
		System.out.println();
		// �ͼ���
		
		String str6 = " ȫ     ��      ��";
		// ���� >> �������� >> "ȫ�浿"
		
		StringTokenizer sto2 = new StringTokenizer(str6," ");
		
		
		while(sto2.hasMoreElements()) {
			System.out.print(sto2.nextToken());
		}
		
		System.out.println();
		String str7 = "ȫ  ��    ��";
		System.out.println(str7.replace(" ",""));// ������ ������ �ƴѹ��ڷ� ��ȯ
		
		String str8 = "    ȫ�浿      ";
		System.out.println(">" + str8 + "<");
		// �������� "ȫ�浿"
		System.out.println(">"+str8.trim() + "<"); // ���� ������ �߶������.
		String str9 = "  ȫ   ��     ��";
		// ȫ�浿
		String str11 = str9.replace(" ", ""); // ��������
		String str12 = str11.trim(); // ����
		System.out.println(str12); // ������ �ΰ�...
		// *********** �������� �Լ��� �����Ҷ��� (method chain ��� ) 
		System.out.println(str9.trim().replace(""," ").substring(2));
		// ���°���� ��������� Chain �̶�� �Ѵ�  .  . .  ���� ���°�  ������ ����� String �̴ϱ�
		
		
		// Quiz - 1
		int sum = 0;
		String[] number = {"1","2","3","4","5"};
		// ���� : �迭�� �ִ� ���ڰ����� ���� sum ������ ��Ƽ� ���  ��� 15		
		for(String s : number) {  // ���鸸  ������.
			int i = Integer.parseInt(s);
			sum += i;
		}
		System.out.println(sum); // 15
		
		// Quiz - 2
		int sum2 = 0;
		String jumin = "123456-1234567"; //�ֹι�ȣ �� ���ϱ�
		String[] number2 = jumin.replace("-", "").split("");
		for(String s : number2) {
			int i = Integer.parseInt(s); 
			sum2 += i;
			}
		System.out.println(sum2); // 49
		}
	}

