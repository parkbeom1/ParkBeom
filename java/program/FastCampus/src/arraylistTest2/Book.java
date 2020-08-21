package arraylistTest2;

public class Book {
	
	// 읽은 책이름 , 책 저자
	private String title;
	private String author;
	
	public Book(String title) {
		this.title = title;
	}	
	public void showBookInfo() {
		System.out.println(title + " " + author);
	}
	public Book() {}

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
}
