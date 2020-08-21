import java.util.StringTokenizer;

public class Ex07_String_Test {

	public static void main(String[] args) {
		String str = "hello";
		String str2 = "hello";
		String bo = str.concat("Hello");
		System.out.println(bo);
		
		boolean bo2 = str.contains("ell"); // contains - true,false ���ϰ��̴� boolean���� ��ȯŸ��
		System.out.println(bo2);
		String str3 = "a b c d"; // [a][][b][][c][][d];
		int number = str3.length();
		String filename ="hello java world";
		System.out.println(filename.indexOf("h")); // h�� �ε�����
		System.out.println(filename.indexOf("java")); // 6 java�� �����ε�����
		System.out.println(filename.indexOf("world"));
	
		String str4 = "Hi My Name is parkbeom";
		String str5 = str4.substring(6,10); // Name
		String str6 = str4.substring(6); // Name is parkbeom
		System.out.println(str5);
		System.out.println(str6);
	
		if(filename.indexOf("wo") != -1 ) {
			// -1 �� �ƴϸ� ���� ������ �ִ�. 
			System.out.println("wo�� ������ �ֽ��ϴ�."); // �����
		}
		System.out.println(filename.lastIndexOf("a")); // 7
	
		
		String result = "supermane";
		// �κ����� ���� ���� subString
		
		System.out.println(result.substring(0)); // 0��° �ε������� ���
		System.out.println(result.substring(1,2)); // u �� ���
		System.out.println(result.substring(0,0)); // -1 �̵Ǽ� ���x
		System.out.println(result.substring(2,3)); // 
		
		
		// Quiz
		String filename2 = "aaaa.zip";
		// ���ϸ�� Ȯ����� �и��Ͻÿ�
		System.out.println("���ϸ��� : " + filename2.substring(0,filename2.indexOf(".")));
		System.out.println("Ȯ����� : " + filename2.substring(filename2.indexOf(".")));
		
		int position = filename2.indexOf("."); // �ε��� ��ȣ�� ã���ش�.
		String file = filename2.substring(0,position); // ���ϸ�
		String extention2 = filename2.substring(position+1,filename2.length());
		String extention = filename2.substring(++position); // position ���� ���� ������ �� Ȯ���
		
		System.out.println(file);
		System.out.println(extention2);
		System.out.println(extention);
		
		// replace (ġȯ�Լ�) 
		String str7 = "DDDAAABBBCCC";
		String result2 = str7.replace("DDD", "AAA");
									// ������ , �ٲٷ��¹���
		System.out.println(result2);
		
		// ETC
		System.out.println();
		System.out.println(str7.charAt(2)); // D
		System.out.println(str7.charAt(3)); // A
		System.out.println(str7.endsWith("BCCC")); // Ư�����ڿ��� �������� ��ȯŸ�� boolean
		
		System.out.println(str7.equalsIgnoreCase("dddaaabbbccc")); // ��ҹ��� �񱳾��� �� ��ȯŸ�� boolean
		
		
		String str8 = "���۸�.��Ƽ.�����.������.������";
		String[] strarray = str8.split("\\."); // ���ø� ���� �������� ����
		for(String s : strarray) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		String filename3 = "bit.hwp";
		// split ����ؼ� ���ϸ�� Ȯ��� ���
		String[] str9 = filename3.split("\\.");
		for(String s : str9) {
			System.out.println(s + " ");
		}
		
		String str10 = "a/b.c-d.f";
		StringTokenizer sto = new StringTokenizer(str10,"/b.c");
		// ���ڿ��� ������ �����ڷ� ������ 
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		System.out.println();
		String str11 ="ȫ �� �� ";
		System.out.println(str11.replace(" ", "")); // ������ ������� ���� �ٲ�
		
		String str12 ="  ȫ �� ��    ";
		System.out.println(">" + str12 + "<");
		String str13 = str12.trim();
		System.out.println(str13);
	
		System.out.println(str13.trim().replace(" ", "").substring(2));
		// ������ ������ ������������ ������ ���� ������ 2�� �ε��� ���� ��µȴ�.
		
		// ���� ����� ���� ����� Chain �̶�� �Ѵ�. ... ������ ���°� ������ ����� String �̴ϱ�
		
		// Quiz - 1
		int sum = 0;
		String[] number2 = {"1","2","3","4"};
		// ���� : �迭�� �ִ� ���� ������ ���� sum ������ ��Ƽ� ����Ͻÿ�
		
		for(String s : number2) {
			// s�� int�� Ÿ������ ��ȯ
			 int i = Integer.parseInt(s);
			 sum += i;
			}
			System.out.println(sum); // 10
			
			// Quiz - 2
			int sum2 = 0;
			String jumin = "123456-1234567";
			String[] number3 = jumin.replace("-", "").split("");
			for(String s : number3) {
				int i = Integer.parseInt(s);
				sum2 += i;
			}
			
		}
	}


