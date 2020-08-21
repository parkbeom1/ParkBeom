import java.io.IOException;

/*
	설계도를 만들때 설계도 (Class) ... 문제가 발생 ... 막는발생할수있는 부분에 프로그램이 강제로 죽지 않도록 해준다. 
	내 설계도를 사용하는 개발자가 예외를 강제로 처리 ... 안전 ...
	생성자 , 함수를 만들때 강제로 예외를 처리 하게 해준다. 
*/
public class ExClass   {
	
	// new ExClass("Temp");  Temp = String path 
	public ExClass (String path) throws IOException,NullPointerException { // 내 생성자를 사용하면 예외를 발생할수있어서 가져다가 쓰려면 예외를 처리해줘야 한다.
 		System.out.println(path); // 경로를 사용해본다 
	}
}
