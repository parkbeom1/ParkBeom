package arraytest;

public class ObjectCoppy {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���", "������");
		library[1]	= new Book("�Ѱ�","����Ʈ");
		library[2] = new Book("���","����");
		library[3] = new Book("ī��","¯¯");
		library[4] = new Book("����","����");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); // �ּҸ� ���� 
		// ���� ���� : ����ȰŶ� �����ѰŶ� ���� �ּҰ��� ���� 
		
		// ���� for�� ���� ����Ȱ� Ȯ���ϱ� 
		for(Book book : copyLibrary) { // ���ü�� �����ð��ΰ�. Ÿ�Ե� ���� 
			// �ϳ��� �����ͼ� book ������ �ִ´�
			book.showInfo();
			// ����for�� : �迭 ����� ó������ ������ ��� ��Ҹ� ���� �Ҷ� ���� �ݺ����̴�. 
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
		// ��������� �ϸ��� �־ ��������� �Ѵ�. 
		
		
	}
}
