package array;

class Person {
	String name;
	int age;
	
	/*
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	*/
	void print() {
		System.out.println(this.name + this.age);
	}
}
//Ŭ������ ������ Ÿ���̴�.
public class Ex05_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10]; // �� Ÿ�� �迭
		boolean[] boolarr = new boolean[5];
		
		// �� Ÿ�� �迭�� ������ �濡 �⺻���� ����ִ�
		Person p = new Person();
		p.name="ȫ�浿";
		p.age=27;
		
		// ��ü �迭
		Person[] personarr = new Person[3]; // 3���� ���� ��������µ� ���� ����ִ�.
		System.out.println("personarr : " + personarr);
		// ���� ����� ���̴� null �� ���´�.
		System.out.println("personarr[0] :" + personarr[0]);
	
		personarr[0] = new Person();
		personarr[1] = new Person();
		// new�� ���� ���� ��������� �ּ� ��� 
		System.out.println("personarr[0] :" + personarr[0]);
		personarr[0].age = 100; 
		
		// ��ü �迭�� ���� ����� �۾��� ���� ä��� �۾� 
		personarr[2] = personarr[0];  // �ּҰ� �Ҵ�  0��° �ּҿ� 2���� �ּҰ� ����.
		personarr[0].name = "������"; // 0��° �濡���� ���� �־��ش�.
		personarr[1].name = "�ƹ���";
	
		// ��ü �迭 ���� for�� 
		for(Person person : personarr) {
			System.out.println(person.name);
		}
		
		// ��ü �迭 3���� ������� �����
		// 1. int[] arr = new int[5]
			Person[] personarr2 = new Person[5]; 
			for(int i = 0; i < personarr2.length; i++) {
				personarr2[i] = new Person(); // �迭�� �ּҸ� ���´�.
				System.out.println(personarr2[i]); // ������ �迭�� �ּҰ��� �ٸ���
			}
		// 2. int[] arr = new int[]{10,20,30};
		// ������ ���� �ּҰ��� �־��ش�.
			Person[] personarr3 = new Person[] {new Person(),new Person(),new Person()};
				
		// 3. int[] arr = {10,20,30}
			Person[] personarr4 = {new Person(),new Person(),new Person()};
						// �̸��̶� �ּҸ� �ְ������ �����ڸ� �ش�.
	}
}
