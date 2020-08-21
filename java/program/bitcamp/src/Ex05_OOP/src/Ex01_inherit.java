/*
 OOP 특징
 상속 캡슐화 다형성 추상화 
오늘은 상속을 배울것이다.
1. 상속
JAVA : child extends Base
c# : child : Base

2. 특징
2.1 다중 상속은 불가
2.2 단일상속 (할아버지가 아버지에게 아버지는 다시 내개 - 계층적 상속은 가능 단, 계층적 상속을 통해 여러개의 클래스를 상속 )
2.3 다중상속을 지원 (유일 : interface)

3. 상속
3.1 진정한 의미는 재사용성

3.2 단점  - 초기의 설계비용이 든다 - 인터페이스 등 공동부분을 따로 만드는 초기비용이 듬 
3.3 재사용성 >> 설계 >> 비용 (시간... 공통 자원을 만든다.(분모,추상화,일반화))

4. 상속 관계 Memory ?
	Gand >> Father > child
	
	사용자가 만드는 모든 클래스는 default Object 클래스를 상속 한다.
	class Car extends Object ... 생략되어있다.
	Object 모든 클래스의 root(최상위) : 모든 클래스의 부모 클래스  
	
*/
class Car extends Object {
}
class GrandFather extends Object {
	public GrandFather(){
		System.out.println("할아버지 생성자");
	}
	public int gmoney = 5000;
	private int pmoney = 10000; // private 에는 접근 불가 (객체 ,상속관계) - 캡슐화 
	
	public int getmoney() { // getmoney 을 통해서 함수를 호출해서 가져올수있다. ( 보통 private 를 만들고 getter 와 setter 를 가지고 한다 ) 
		return pmoney;
	}
}
class Father extends GrandFather {
	public Father() {
		System.out.println("아버지 생성자");
	}
	public int fmoney = 3000;
}

class Child extends Father {
	public Child() {
		System.out.println("손자 생성자");
	}
	public int cmoney = 1000;
}
public class Ex01_inherit {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney); // 할아버지 돈도 내돈
		System.out.println(child.fmoney); // 아버지돈 내돈
		System.out.println(child.cmoney); 
		
		System.out.println(child.getmoney());
		
		Car car = new Car();
		
	}
}
