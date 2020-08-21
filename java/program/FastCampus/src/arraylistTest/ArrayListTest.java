package arraylistTest;

// 배열 객체를 쓰일때 ArrayList 가 편리하다 



import java.util.ArrayList;
public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// <> ?어떤타입의 객체를 배열로 만들것인가
		
		// 어떤 객체를 쓸지 꺽새 안에다가 넣는다.
		// 요소를 꺼내올때 형변환을 하게됨 	
		// add , size , get 이용해보기 
		list.add("aaa"); // String은 new를 하지않아도 넣을수있다.
		list.add("bbb");
		list.add("ccc");	
		// list.add는 size를 쓸수있는데.
		// length는 배열의 길이 요소가 3개만 들어갔어도 10이나왔는데
		// size는 요소가 들어간것만 체크한다. 
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i); // String으로 뻇으니 string으로 넣어준다.
			System.out.println(str);
		}
		System.out.println("-----------------------");	
		// 처음부터 끝까지 순회하기
		for(String s : list) {
			// <String>을 적지 않았으면 Object 로 반환한다.
			System.out.println(s);
		}
	}
}
