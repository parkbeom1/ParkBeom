package arraytest;
// 객체 배열

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + " , " + author);
	}
	public static void main(String[] args) {
		Book[] book = new Book[5];
	
		book[0] = new Book("태백산맥", "조정래");
		book[1]	= new Book("한강","데이트");
		book[2] = new Book("어썸","블래인");
		book[3] = new Book("카인","짱짱");
		book[4] = new Book("만세","대한");
		
		for(int i = 0; i < book.length; i++) {
				book[i].showInfo();
		}
	}
}
