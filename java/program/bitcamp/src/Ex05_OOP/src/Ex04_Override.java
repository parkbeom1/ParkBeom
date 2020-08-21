import kr.or.bit.Emp;

/*
 상속관계 오버라이딩 < 외워라 >  
 상속관계에서 자식이 부모의 함수를 재정의한다.
[상속관계에서 ] 에서 자식 클래스가  [부모 클래스]의 메서드를 재정의 하는것  ( 내용을 바꾼다 ) 
재정의 : 틀의 변화가 없고 함수의 이름 타입 하는것이 아니라 내용만 { 요기만 변화 } 

문법 ) 
1. 부모함수이름이 동일해야한다.
2. 부모함수 parameter 동일해야 한다.
3. 부모함수 return type 과 형식이 동일해야 한다. 


4. 결국 ( 실행 블럭 안에 코드만 변경이 가능하다 )
*/

class Point2 { // 한점을 가지는 클래스 
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + " / " + this.y; // 한점을 표현하는 클래스 
	}
}

class Point3D extends Point2 {
	int z = 6;
	// 출력 ...
	// 방법 새롭게 함수를 추가한다.
	// Annotation  은 자바 코드만으로 전달할수없는 부가적인 정보를 컴파일러,개발툴 에게 알려줘 컴파일러가 읽어서 당신이 만든 함수가 재정의 된지 읽어준다. 
	// 맞지 않으면 Error ..... 컴파일러나 개발툴에게 
	// @Override 지금 이함수가 정말 재정의 된지 확인해바  ( 런타임 오류를 차단한다 ) 
	
	@Override //  어노테이션을 썻으니까 컴파일러가 재정의 된지 읽어준다.
	 String getPosition() { // 오버라이딩 됨  z만 추가됨 
		return this.x + " / " + this.y + " / " + this.z; // 재정의 부모가 가지고 있는 함수를 자식이 상속관계에서 확장하는 것 내용을 늘리거나 줄이는 것 
														 // 
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}	
}
class Love {
	public void point() {
		int x , y;
	}
	
	public void Love() {
		
	}	
}
class Happy extends Love {
	int x; 
	Love love;
	public Happy(Love love) {
		love = new Love();
		
	}
	
	public Happy() {
		this(new Love());
	}
}
public class Ex04_Override {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		String str = p.getPosition(); // 재정의된 함수 호출 .... 
		System.out.println(str);
		Emp emp = new Emp(1000,"홍길동");
		System.out.println(emp.toString()); // 주소값이 출력됨   kr.or.bit.Emp@15db9742  ->  emp 뒤에 toString 이 생략되어있다 이걸 재정의하면 사번과 이름을 출력하는 메소드...로 구현이 가능
		// 고민 사번 이름 담긴 정보를 출력
		// 누구나 동일한 함수
		// emp .... 사실은 emp.toString() 생략
		// Object 클래스가 toString() 를 구현해놔서 내가 재정의해서 내가 당신의 것을 toString를 내 마음대로 쓰고싶다 
		// Java API 가 제공하는 수많은 클래스가 OBject 클래스의 toString() 재정의
		
	}
}
