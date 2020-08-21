package arraytest;

public class ObjectCoppyTest {
	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] bookcopy = new Book[5];
		
		book[0] = new Book("�ϴôٶ���", "�ڿϼ�");
		book[1] = new Book("�ôٶ���", "������");
		book[2] = new Book("����","�޻�");
		book[3] = new Book("�޴�","�޴�");
		book[4] = new Book("�̶�","ȱ��");
		
		// ���� for�� 
		for(Book book2 : book) {
			System.out.println(book2.getTitle() + " , " + book2.getAuthor());
		}
		System.out.println("-------------------------------------");
		// ���� ����(�ּҰ� �����)
		System.arraycopy(book, 0, bookcopy, 0, 5);
		for(Book book3 : bookcopy) {
			System.out.println(book3.getTitle() + " , " + book3.getAuthor());
		}	
		// ���� ���� (���� �ν��Ͻ��� ���� ?)
		bookcopy[0] = new Book("����" , "����"); 
		bookcopy[1] = new Book("ȭ��" , "����"); 
		bookcopy[2] = new Book("�ƾ�" , "����"); 
		bookcopy[3] = new Book("ŰŰ" , "����"); 
		bookcopy[4] = new Book("ļ" , "����"); 
		System.out.println("-----------------------------------------");
		// �ϸ��� �ϳ��� ���� 
		for(int i = 0; i < book.length; i++) {
			bookcopy[i].setTitle(book[i].getTitle()); // �ϸ��� �����Ѵ�.
			bookcopy[i].setAuthor(book[i].getAuthor());
			System.out.println(bookcopy[i].getTitle() + " , " + bookcopy[i].getAuthor());
		}
		System.out.println("-----------------------------------------");
		for(Book book3 : bookcopy) {
			book3.showInfo();
		}
	}
}
