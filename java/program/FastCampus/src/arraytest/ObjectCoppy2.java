package arraytest;

public class ObjectCoppy2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1]	= new Book("한강","데이트");
		library[2] = new Book("어썸","블래인");
		library[3] = new Book("카인","짱짱");
		library[4] = new Book("만세","대한");
		
		// 깊은 복사 (같은주소값을 지니지 않아서 한쪽이 바껴도 다른쪽은 바뀌지 않는다.)
		// 각각 다른 인스턴스로 인해서 
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		// 깊은복사 ( 일리리 하나하나씩 대입한다. ) 
		for(int i = 0; i < library.length; i++ ) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
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
		// 깊은복사로 인해 다른한쪽 배열은 값이 안바뀐것을 볼수있다. 
		
		
	}
}
