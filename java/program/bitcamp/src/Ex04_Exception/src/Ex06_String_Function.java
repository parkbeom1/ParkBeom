import java.util.StringTokenizer;

public class Ex06_String_Function {
	
	public static void main(String[] args) {
		String str = "hello";
		str.concat(str); // 기존의 문자에 합친다. 리턴은 문자열 를 돌려준다.
		System.out.println(str.concat("world")); // hello wrold 
		boolean bo = str.contains("ell"); // true 리턴타입이  boolean 내가 입력한 문자가 있으면 true , 없으면 false
		System.out.println(bo);
		String str2 = "a b c d"; // [a][][b][][c][][d] 빈문자도 문자이다.
		System.out.println(str2.length()); // 7 
		String filename ="hello java world"; //[h][e][l][l][o][][j] // 0 1 2 3 4 5 6 7
		System.out.println(filename.indexOf("h")); // h가 있는  인덱스 번호를 알려준다.
		System.out.println(filename.indexOf("java")); // 이 시작의 시작 위치값 6
		System.out.println(filename.indexOf("개폭망")); // 배열방에 없으면 -1
		// 신문 사설 검색 .... 폭망 .... 이 값이 0보다 크면 한단어라도 들어있으므로 내가 찾고자하는 indexof는 내가 원하는 문자열이 포함되어 있는지
		// ... 0보다 큰 값이면 1개는 포함....
		
		if(filename.indexOf("wo") != -1) {
			// 정수타입이면 비교 해야됨  0보다 큰값이면 값을 가지고 있다 , -1이 아니면 값을 가지고 있다
			System.out.println("wo을 하나라도 가지고 있습니다.");
		}
		System.out.println(filename.lastIndexOf("a")); // 9 ? 
		
		// length() , indexOf() , substring() , replace() , split()
		String result = "supermane";
		// beginIndex the beginning index, inclusive.
		// endIndex the ending index, exclusive.
		// 부분적인 문자 추출  substring(int beginIndex,int endIndex) // endIndex 에서 -1 한자리까지 
		
		// substring은 시작과 끝을 찾을수있다. 
		System.out.println(result.substring(0)); 
		System.out.println(result.substring(1,2)); // 자기 자신이 나온다  u endindex -1 를해서 p가 삭제됨
		System.out.println(result.substring(0, 0));// -1까지 가서 아무것도 안나온다.
		System.out.println(result.substring(2, 3)); 
		
		//Quiz 
		String filename2="aaaa.zip"; // 또는 hong.png 또는 h.jpeg 가 올수있는데
		// 여기서 파일명과 확장명을 분리해서 출력하세요.
		
		// 1. 파일명 >> aaaa
		// 2. 확장자 >> zip
		// 위에서 배운 함수만 가지고 문제를 풀기 
		
		// substring 은  firstindex 와 lastindex 가 있다.
		System.out.println("파일명은 " + filename2.substring(0,filename2.indexOf(".")));
		System.out.println("확장명은 " + filename2.substring(filename2.indexOf(".")));
	
		int position = filename2.indexOf("."); // 인덱스를 찾아줌 (기준점)
		String file = filename2.substring(0,position);
		String extention2 = filename2.substring(position+1,filename2.length());
		String extention = filename2.substring(++position); // 포지션 다음으로 뽑을수있게 
	
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
	
		// replace (치환함수)
		String str3 = "ABCDDDDDDA";
		String result3 = str3.replace("DDDDD", "오늘은 목요일");
		System.out.println(result3);
		
		result3 = str3.replace("A", "a"); // 대문자 A를 소문자 a로 다 바꿈
		System.out.println(result3); 
		
		// ETC 
		System.out.println();
		// 인덱스를 주면 문자를 찾아냄
		System.out.println(str3.charAt(0)); // A
		System.out.println(str3.charAt(3));  // D 
		// 특정 문자열로 끝나는지 
		System.out.println(str3.endsWith("DDDA")); // true  
		System.out.println(str3.endsWith("BDDDA")); // false
		
		System.out.println(str3.equalsIgnoreCase("aBCDddDDDa")); // 대소문자 구분없이 비교 한다. 같으면 true
		
		// Today Point (Split)
		//String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		
		// 분리된걸 배열방에 너놓는다. 배별에 너놓고 떨어뜨린다.
		//String[] namearray = str4.split(","); 
		
		
		// split - . 구분점을 띄운다. 
		String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
		String[] namearray = str4.split("\\.");  
		for(String s : namearray) {
			System.out.print(s + " ");
		}
		/*
		 정규 표현식 표준 ( java , javascript , Oracle , c#) 공통적인 규칙을 사용한다. 
		어떠한 문자를 만들때 규칙을 부여한다. >> 유효한 판단 근거 
		주민번호는  정수 6자리  - 라는 특수문자와  정수 7자리  {\d6} - {\d7} 요 규칙에 맞게 입력을 했는지  
		핸드폰  12345-1234567 >> false 로 받음 
		차량번호
		우편번호
		도메인주소 
		이메일 주소 등을 검증 정규 표현식으로 개발해둠 
		// https://regexper.com/#%5E%28%3F%3A%5B0-9%5D%7B2%7D%28%3F%3A0%5B1-9%5D%7C1%5B0-2%5D%29%28%3F%3A0%5B1-9%5D%7C%5B1%2C2%5D%5B0-9%5D%7C3%5B0%2C1%5D%29%29-%5B1-4%5D%5B0-9%5D%7B6%7D%24
		 * 
		많이 쓰는 정규표현식 
		조별과제로 나중에 나갈것이다. -> 주민번호가 있으면 해석을 해야한다 첫문자가 머가 와야 하는지 
		5개 할것이다 
		split 다음으로 정규표현식을 쓸수있다. 
		 . 이라는게 정규표현식 문법 이라서 split이 인지를 안하느것 그래서 이스케이프 문자 그대로 \. 하면 이것도 정규표현식이라 앞에또 \ 붙인다. 
		 주민번호값이 맞는지  -  정규표현식 검증이다. 
		 */	
		System.out.println();
		String filename3 = "bit.hwp";
		// split 사용해서 파일명과 확장명 출력
		// 파일명
		String[] str5 = filename3.split("\\.");
		
		for(String s : str5) {
			System.out.println(s);
		}
		
		// 어느 문자 기준으로 여러가지 문자를 분리하려면 
		
		String str10 = "a/b.c-d.f";
		StringTokenizer sto = new StringTokenizer(str10,"/-.");
		while(sto.hasMoreElements()) {
			System.out.print(sto.nextToken());
		}
		System.out.println();
		// 넌센스
		
		String str6 = " 홍     길      동";
		// 저장 >> 공백제거 >> "홍길동"
		
		StringTokenizer sto2 = new StringTokenizer(str6," ");
		
		
		while(sto2.hasMoreElements()) {
			System.out.print(sto2.nextToken());
		}
		
		System.out.println();
		String str7 = "홍  길    동";
		System.out.println(str7.replace(" ",""));// 공백을 공백이 아닌문자로 변환
		
		String str8 = "    홍길동      ";
		System.out.println(">" + str8 + "<");
		// 공백제거 "홍길동"
		System.out.println(">"+str8.trim() + "<"); // 양쪽 공백을 잘라버린다.
		String str9 = "  홍   길     동";
		// 홍길동
		String str11 = str9.replace(" ", ""); // 공백제거
		String str12 = str11.trim(); // 제거
		System.out.println(str12); // 무식한 인간...
		// *********** 여러개의 함수를 적용할때는 (method chain 기법 ) 
		System.out.println(str9.trim().replace(""," ").substring(2));
		// 나온결과에 다음결과로 Chain 이라고 한다  .  . .  으로 가는걸  어자피 결과가 String 이니까
		
		
		// Quiz - 1
		int sum = 0;
		String[] number = {"1","2","3","4","5"};
		// 문제 : 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력  결과 15		
		for(String s : number) {  // 값들만  뽑힌다.
			int i = Integer.parseInt(s);
			sum += i;
		}
		System.out.println(sum); // 15
		
		// Quiz - 2
		int sum2 = 0;
		String jumin = "123456-1234567"; //주민번호 합 구하기
		String[] number2 = jumin.replace("-", "").split("");
		for(String s : number2) {
			int i = Integer.parseInt(s); 
			sum2 += i;
			}
		System.out.println(sum2); // 49
		}
	}

