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
//클래스는 데이터 타입이다.
public class Ex05_Array_Object {
	public static void main(String[] args) {
		int[] intarr = new int[10]; // 값 타입 배열
		boolean[] boolarr = new boolean[5];
		
		// 값 타입 배열은 각각의 방에 기본값이 들어있다
		Person p = new Person();
		p.name="홍길동";
		p.age=27;
		
		// 객체 배열
		Person[] personarr = new Person[3]; // 3개의 방이 만들어지는데 방은 비어있다.
		System.out.println("personarr : " + personarr);
		// 방이 만들기 전이니 null 이 나온다.
		System.out.println("personarr[0] :" + personarr[0]);
	
		personarr[0] = new Person();
		personarr[1] = new Person();
		// new를 통해 방을 만들었으니 주소 출력 
		System.out.println("personarr[0] :" + personarr[0]);
		personarr[0].age = 100; 
		
		// 객체 배열은 방을 만드는 작업과 방을 채우는 작업 
		personarr[2] = personarr[0];  // 주소값 할당  0번째 주소와 2번쨰 주소가 같다.
		personarr[0].name = "김유신"; // 0번째 방에가서 값을 넣어준다.
		personarr[1].name = "아무개";
	
		// 객체 배열 빠른 for문 
		for(Person person : personarr) {
			System.out.println(person.name);
		}
		
		// 객체 배열 3가지 방법으로 만들기
		// 1. int[] arr = new int[5]
			Person[] personarr2 = new Person[5]; 
			for(int i = 0; i < personarr2.length; i++) {
				personarr2[i] = new Person(); // 배열이 주소를 갖는다.
				System.out.println(personarr2[i]); // 각각의 배열의 주소값은 다르다
			}
		// 2. int[] arr = new int[]{10,20,30};
		// 각각의 방은 주소값을 넣어준다.
			Person[] personarr3 = new Person[] {new Person(),new Person(),new Person()};
				
		// 3. int[] arr = {10,20,30}
			Person[] personarr4 = {new Person(),new Person(),new Person()};
						// 이름이랑 주소를 주고싶으면 생성자를 준다.
	}
}
