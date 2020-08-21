package method_Overload;
/*
  OOP(객체지향 프로그래밍)
  1. 상속 
  2. 캡슐화(은닉화) : private -> getter(읽기) setter(쓰기)
  : 직접할당,간접할당 을 통해  직접접근을 막고 간접할당을 통해서 데이터를 보호
  >> method overloading 스타크래프트 오버로드 처럼 괴물들을 운송한다. 
  중요) 메소드 하나의 이름으로 여러가지 기능을 하는 함수이다.
  1. 오버로딩 성능항상에 영향을 안준다. 사용자(개발자) 에게 편하게 사용하라고 
  설계자가 배려했다.
  2. 편하게 사용하라고 설계자 배려(개발자)
  3. 오버로딩 모르면 20개 다른 이름을 만들어야 된다는 불편함이 있다.
  
  문법) 함수 이름은 같고 파라미터의 개수가 달라야 한다.
  1. 함수 이름은 같아야 한다.
  2. 파라미터의 개수 또는 타입은 달라야 한다.
  3. 리턴타입은 상관이 없다.(오버로딩의 판단기준이 아니다)
  4. 컴퓨터는 순서를 인지한다.(int ,s) 와 (s ,int) 를 다르게 한다. 순서가 다름으로 본다
*/
class Human {
	String name;
	int age;
}
class OverTest2 {
	int add(int i) {
		return 100 + 100;
	}
	
	int add(int i,int j) {
		return i + j;
	}
	
	String add(String s) {
		return s;
	}
	String add(int i , String s) {
		
		return null;
	}
	void add(Human human) {
		human.name="홍길동";
		human.age=100;
		System.out.println(human.name+" , "+human.age);
	}
	Human add1(Human human) {
		human.name="길철중";
		human.age = 500;
		
		return human;
	}
}
public class Ex14_method_Overloading {
	public static void main(String[] args) {
		OverTest ot = new OverTest();
		Human h = new Human();
		Human h2 = new Human();
		String result = ot.add("world");
		System.out.println(result);
		
		String str = ot.add("world");
		ot.add(str); // 참조변수로 참조 한다. 
		ot.add(h.name);
		ot.add(h2.name);
	}
}
