import java.util.StringTokenizer;

public class Ex07_String_Test {

	public static void main(String[] args) {
		String str = "hello";
		String str2 = "hello";
		String bo = str.concat("Hello");
		System.out.println(bo);
		
		boolean bo2 = str.contains("ell"); // contains - true,false 리턴값이니 boolean으로 반환타입
		System.out.println(bo2);
		String str3 = "a b c d"; // [a][][b][][c][][d];
		int number = str3.length();
		String filename ="hello java world";
		System.out.println(filename.indexOf("h")); // h의 인덱스값
		System.out.println(filename.indexOf("java")); // 6 java의 시작인덱스값
		System.out.println(filename.indexOf("world"));
	
		String str4 = "Hi My Name is parkbeom";
		String str5 = str4.substring(6,10); // Name
		String str6 = str4.substring(6); // Name is parkbeom
		System.out.println(str5);
		System.out.println(str6);
	
		if(filename.indexOf("wo") != -1 ) {
			// -1 이 아니면 값을 가지고 있다. 
			System.out.println("wo를 가지고 있습니다."); // 실행됨
		}
		System.out.println(filename.lastIndexOf("a")); // 7
	
		
		String result = "supermane";
		// 부분적인 문자 추출 subString
		
		System.out.println(result.substring(0)); // 0번째 인덱스부터 출력
		System.out.println(result.substring(1,2)); // u 만 출력
		System.out.println(result.substring(0,0)); // -1 이되서 출력x
		System.out.println(result.substring(2,3)); // 
		
		
		// Quiz
		String filename2 = "aaaa.zip";
		// 파일명과 확장명을 분리하시오
		System.out.println("파일명은 : " + filename2.substring(0,filename2.indexOf(".")));
		System.out.println("확장명은 : " + filename2.substring(filename2.indexOf(".")));
		
		int position = filename2.indexOf("."); // 인덱스 번호를 찾아준다.
		String file = filename2.substring(0,position); // 파일명
		String extention2 = filename2.substring(position+1,filename2.length());
		String extention = filename2.substring(++position); // position 다음 부터 끝까지 즉 확장명
		
		System.out.println(file);
		System.out.println(extention2);
		System.out.println(extention);
		
		// replace (치환함수) 
		String str7 = "DDDAAABBBCCC";
		String result2 = str7.replace("DDD", "AAA");
									// 전문자 , 바꾸려는문자
		System.out.println(result2);
		
		// ETC
		System.out.println();
		System.out.println(str7.charAt(2)); // D
		System.out.println(str7.charAt(3)); // A
		System.out.println(str7.endsWith("BCCC")); // 특정문자열로 끝나는지 반환타입 boolean
		
		System.out.println(str7.equalsIgnoreCase("dddaaabbbccc")); // 대소문자 비교없이 비교 반환타입 boolean
		
		
		String str8 = "슈퍼맨.팬티.노란색.우하하.우하하";
		String[] strarray = str8.split("\\."); // 스플릿 문자 기준으로 나뉨
		for(String s : strarray) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		String filename3 = "bit.hwp";
		// split 사용해서 파일명과 확장명 출력
		String[] str9 = filename3.split("\\.");
		for(String s : str9) {
			System.out.println(s + " ");
		}
		
		String str10 = "a/b.c-d.f";
		StringTokenizer sto = new StringTokenizer(str10,"/b.c");
		// 문자열을 지정된 구분자로 나누는 
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		System.out.println();
		String str11 ="홍 길 동 ";
		System.out.println(str11.replace(" ", "")); // 공백을 공백없음 으로 바꿈
		
		String str12 ="  홍 길 동    ";
		System.out.println(">" + str12 + "<");
		String str13 = str12.trim();
		System.out.println(str13);
	
		System.out.println(str13.trim().replace(" ", "").substring(2));
		// 공백을 제거후 공백이있으면 공백이 없는 것으로 2번 인덱스 부터 출력된다.
		
		// 나온 결과에 다음 결과로 Chain 이라고 한다. ... 역으로 가는걸 어자피 결과가 String 이니까
		
		// Quiz - 1
		int sum = 0;
		String[] number2 = {"1","2","3","4"};
		// 문제 : 배열에 있는 문자 값들의 합을 sum 변수에 담아서 출력하시오
		
		for(String s : number2) {
			// s를 int형 타입으로 변환
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


