package arraytest;

public class ObjectCoppy {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1]	= new Book("한강","데이트");
		library[2] = new Book("어썸","블래인");
		library[3] = new Book("카인","짱짱");
		library[4] = new Book("만세","대한");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); // 주소만 복사 
		// 얕은 복사 : 복사된거랑 복사한거랑 같은 주소값을 지님 
		
		// 향상된 for문 으로 복사된거 확인하기 
		for(Book book : copyLibrary) { // 어떤객체로 꺼내올것인가. 타입도 선언 
			// 하나씩 꺼내와서 book 변수에 넣는다
			book.showInfo();
			// 향상된for문 : 배열 요소의 처음부터 끝까지 모든 요소를 참조 할때 편리한 반복문이다. 
		}
		System.out.println("-------------------");
		// 책 바꾸기   태백산맥 -> 나목  , 조정래 -> 박완서 
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showInfo();
		}
		System.out.println("-------------------");
		for(Book book : copyLibrary) {
			book.showInfo();
		}
		// 깊은복사는 일리리 넣어서 복사해줘야 한다. 
		
		
	}
}
