package arraylistTest;

// �迭 ��ü�� ���϶� ArrayList �� ���ϴ� 



import java.util.ArrayList;
public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// <> ?�Ÿ���� ��ü�� �迭�� ������ΰ�
		
		// � ��ü�� ���� ���� �ȿ��ٰ� �ִ´�.
		// ��Ҹ� �����ö� ����ȯ�� �ϰԵ� 	
		// add , size , get �̿��غ��� 
		list.add("aaa"); // String�� new�� �����ʾƵ� �������ִ�.
		list.add("bbb");
		list.add("ccc");	
		// list.add�� size�� �����ִµ�.
		// length�� �迭�� ���� ��Ұ� 3���� ��� 10�̳��Դµ�
		// size�� ��Ұ� ���͸� üũ�Ѵ�. 
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i); // String���� �P���� string���� �־��ش�.
			System.out.println(str);
		}
		System.out.println("-----------------------");	
		// ó������ ������ ��ȸ�ϱ�
		for(String s : list) {
			// <String>�� ���� �ʾ����� Object �� ��ȯ�Ѵ�.
			System.out.println(s);
		}
	}
}
