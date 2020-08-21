package arraytest;
// ��ü �迭

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
	
		book[0] = new Book("�¹���", "������");
		book[1]	= new Book("�Ѱ�","����Ʈ");
		book[2] = new Book("���","����");
		book[3] = new Book("ī��","¯¯");
		book[4] = new Book("����","����");
		
		for(int i = 0; i < book.length; i++) {
				book[i].showInfo();
		}
	}
}
