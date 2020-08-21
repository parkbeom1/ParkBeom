package constructor;
/*
	생성자 함수(Constructor)
	1. 함수(특수한 목적)
	2. 특수한 목적(member field 초기화)
	Tip { 일반 초기자 } static { 초기자 함수 }
	3. 일반 함수와 다른점은 이름이 다르다 함수 이름이 고정되어 있다.
	 함수 이름이 클래스이름과 똑같다
	3.2 실행 시점 : 객체 생성 new 가 됐을때 힙 메모리에 공간을 만들고
	 두번째에 변수(인스턴스변수) 가 올라가고 나서 자동으로 호출되는 함수이다.
	3.3 실행 시점 때문에 return 타입이 없다. 다 void 라는 것이다. 
	void >> public void 클래스 이름
	4. 목적 : 생성되는 객체마다 강제적으로 다른 멤버 member field 값을 초기화 할수있다
	class Car {String color;}
	자동차를 만들면 자동차는 무조건 색상을 하나 가져야 한다(요구사항) -= 강제적
	class Car {String color ,public Car(String color) 
	{ this.color = color }}
	자동차를 만들면 무조건 하나의 색상을 가지는데 다른 색을 가질수도 있다.
	5. 생성자 함수는 하나의 이름으로 여러가지 기능인 오버로딩이 가능하다
	6. 당신이 만약 오버로딩 생성자를 생성자 함수를 하나라도 구현 했다면 
	* 디폴트 생성자 함수는 반드시 구현해 줘야 한다. ( 중요 ) 	
*/
// 당신이 만약 자동차를 만들면 반드시 자동차에 이름을 부여해주세요.
class Car{
	String carname;
	/*어자피 생성자는 모든 타입이 void 라서 생략이 가능하다. 접근자 하고 클래스는 바로 나온다
	  private도 올수도 있는데 싱글톤 으로 바꾼다.
	*/
}
class Car2 {
	String carname;
	
	Car2(){ // 기본생성자에서 초기화 한다.
		carname = "포니"; 
		}
	}

class Car3 {
	String carname;
    Car3() {
		carname = "포니";
		}
    Car3(String name) {
    	this.carname = name;
    	}
	}
class Car4 {
	String carname;
	/* default constructor 코드가 없다
	default constructor 생략되면
	예외적으로 overloading 생성자를 구현했다면 ... default 는 자동으로 만들어주지 않는다
	설계자의 의도는 자동차를 생산할때 무조건 이름을 넣으라는 강제성을 띄운다.
	*/
	public Car4(String carname) {
		this.carname = carname;
		}
	}
public class Ex16_Constructor {
	public static void main(String[] args) {
		
		Car car = new Car(); // 개발자가 직접 생성자를
							 // 만들지 않으면 컴파일러가 자동으로 아래 코드(기본생성자를 생성한다)
		car.carname = "현대";
		
		Car2 c2 = new Car2();
		System.out.println(c2.carname); // 포니
		
		Car3 c3 = new Car3("카니발");
		System.out.println(c3.carname);
		
		Car4 c4 = new Car4("K7");
		System.out.println(c4.carname);
	}
}
