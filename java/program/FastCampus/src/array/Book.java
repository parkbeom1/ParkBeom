package array;

public class Book {
	
	private String Title;
	private String author;
	
	public Book() {}
	
	public Book(String title,String author) { 
		this.Title = title;
		this.author = author;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(Title + "," + author);
	}
}
