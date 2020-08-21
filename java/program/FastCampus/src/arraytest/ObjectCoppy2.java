package arraytest;

public class ObjectCoppy2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���", "������");
		library[1]	= new Book("�Ѱ�","����Ʈ");
		library[2] = new Book("���","����");
		library[3] = new Book("ī��","¯¯");
		library[4] = new Book("����","����");
		
		// ���� ���� (�����ּҰ��� ������ �ʾƼ� ������ �ٲ��� �ٸ����� �ٲ��� �ʴ´�.)
		// ���� �ٸ� �ν��Ͻ��� ���ؼ� 
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		// �������� ( �ϸ��� �ϳ��ϳ��� �����Ѵ�. ) 
		for(int i = 0; i < library.length; i++ ) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		System.out.println("-------------------");
		// å �ٲٱ�   �¹��� -> ����  , ������ -> �ڿϼ� 
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showInfo();
		}
		System.out.println("-------------------");
		for(Book book : copyLibrary) {
			book.showInfo();
		}
		// ��������� ���� �ٸ����� �迭�� ���� �ȹٲ���� �����ִ�. 
		
		
	}
}
