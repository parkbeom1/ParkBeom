package array;
// ��ü �迭 
public class BookArrayTest {
	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // å�� 5�� ����� �ƴ϶� 5���迭�� ������̴�.
		
		// å ��ü ���� 
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("�¹���1", "������");
		library[2] = new Book("�¹���2", "������");
		library[3] = new Book("�¹���3", "������");
		library[4] = new Book("�¹���4", "������");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //1���ڴ� 4��Ʈ ��8����  32��Ʈ 16����
			
			// ���� ���
			library[i].showBookInfo();
		}

	}
}
