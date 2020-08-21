package arraytest;

public class ObjectCoppyTest {
	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] bookcopy = new Book[5];
		
		book[0] = new Book("하늘다람쥐", "박완서");
		book[1] = new Book("늘다람쥐", "김정현");
		book[2] = new Book("강시","햇살");
		book[3] = new Book("햇님","달님");
		book[4] = new Book("미라","홧팅");
		
		// 향상된 for문 
		for(Book book2 : book) {
			System.out.println(book2.getTitle() + " , " + book2.getAuthor());
		}
		System.out.println("-------------------------------------");
		// 얕은 복사(주소값 복사됨)
		System.arraycopy(book, 0, bookcopy, 0, 5);
		for(Book book3 : bookcopy) {
			System.out.println(book3.getTitle() + " , " + book3.getAuthor());
		}	
		// 깊은 복사 (직접 인스턴스를 생성 ?)
		bookcopy[0] = new Book("오늘" , "러뷰"); 
		bookcopy[1] = new Book("화이" , "러뷰"); 
		bookcopy[2] = new Book("아아" , "러뷰"); 
		bookcopy[3] = new Book("키키" , "러뷰"); 
		bookcopy[4] = new Book("캬" , "러뷰"); 
		System.out.println("-----------------------------------------");
		// 일리리 하나씩 대입 
		for(int i = 0; i < book.length; i++) {
			bookcopy[i].setTitle(book[i].getTitle()); // 일리리 대입한다.
			bookcopy[i].setAuthor(book[i].getAuthor());
			System.out.println(bookcopy[i].getTitle() + " , " + bookcopy[i].getAuthor());
		}
		System.out.println("-----------------------------------------");
		for(Book book3 : bookcopy) {
			book3.showInfo();
		}
	}
}
