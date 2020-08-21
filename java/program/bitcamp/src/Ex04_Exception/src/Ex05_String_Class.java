
/* 
 * String 클래스 ( 문자열 )
String 수 많은 함수 ... 문자열을 조작 ( 자르고 , 합치고  )
subString , replace ,split 
String >> static 함수  + 일반 함수(new해서쓸수있는)
subString - 부분적으로 뽑아옴 
*/
public class Ex05_String_Class {
	public static void main(String[] args) {
		String str = ""; // 문자열의 초기화 >> null 도 가능 ( String 이 클래스이니까 )
		// 사용방법 : int , double 처럼 쓰세요 
		String[] starr = new String[] {"aaa","bbb","ccc"};
			for(String s : starr){
			System.out.println(s);
		}
		//////////////////////////////////////////////////
		String str2 = "홍길동";
		System.out.println(str2.length()); // 3
		System.out.println(str2.toString());	// 홍길동
		System.out.println(str2); // 홍길동  주소값이 나와야 정상이지만 값이 나온다 왜 ?  toString를 재정의해서
		// object 가지는 toString를 재정의했기 때문이다.(값을 출력하도록) 
		
		// 1. String name = "가나다라마바"; >>
		// String 내부적으로 메모리를 갖는데  char[] 메모리를 사용한다. >> char[] >> [가][나]][다] [라]  String자료구조는 char 배열이다.  
		//                                                            0  1   2   3
		// class String extends Object(char[]) ... 열어보면 String 를 상속해주는 object에 char[] 이 있을거고 @override toString() {...} length() }
		
		String stra = new String("홍길동"); // String은 클래스라서 new를 해서 만드는데 계속 new를 하는데 힘들다 
		String str1 = "AAA"; // String 의 비교는 equals 
		String str3 = "AAA";

		System.out.println(str1);
		System.out.println(str1 == str3); // true 
		// == 연산자 값을 비교(str1(주소값) , str2(주소값))
		// 같은 주소로 판명됨 그 이유는 ? 
		// 메모리에 실제로 같은 문자열이 있으면 재사용 ....
		
		System.out.println(str1.equals(str3)); // true 주소를 찾아가서 그 안에 있는 값을 비교한다.
		/// AAA = AA
		
		// 그런데 반전...
		String str4 = new String("BBB");
		String str5 = new String("BBB");	
		System.out.println(str4 == str5); // false  다른 주소값에 형성되니까 ? 
		System.out.println(str4.equals(str5)); // true
	
		// 넌센스
		String s = "A";
		s += "B";
		s += "C";
		System.out.println(s);		
		s = "A";
		System.out.println(s);
		
	}
}
