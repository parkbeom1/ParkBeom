package array;
// 객체 배열 
public class BookArrayTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // 책이 5권 생긴게 아니라 5개배열이 생긴것이다.
		
		// 책 객체 생성 
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("태백산맥1", "조정래");
		library[2] = new Book("태백산맥2", "조정래");
		library[3] = new Book("태백산맥3", "조정래");
		library[4] = new Book("태백산맥4", "조정래");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //1글자당 4비트 총8글자  32비트 16진수
			
			// 정보 출력
			library[i].showBookInfo();
		}

	}
}
