
public class Ex08_Inherit_protected {

/* 접근 제어자 public protected default private 	
	protected : 상속관계에서의 재정의 상속이 없으면 오버라이딩이 없다. 상속이 없으면 procted 가 없다.
	설계자한테 유연성을 부여하고 양면성을 지니고 있다.  박쥐 >> default , public  약간 양면성을 가진다.
	>> 상속이 없는 클래스 안에서 protected 접근자는 default 와 같다. 
	>> 결국 상속관계에서만 의미가 있다.
	

*/
class Dclass {
	
	private int p; // 다른 패키지에서 사용할수없다. 무조건 같은 클래스에서 
	public int i; // 다른패키지에서 사용할수있다. 
	int s; // default 같은 패키지에서 사용할수있다. 
	protected int k; // default 와 똑같다. 안써도 default 여기서 사용할 이유가 없다. >> 일반 클래스는 사용할 이유가 없다. >> 상속관계에 빠지면 달라진다.
}

class Child2 extends Pclass {
	
	public void method() {
//		this.j;
		this.k = 1000; // 노란색 protected 이 보인다. >> 상속 관계에서 자식은 부모의 protected 자원의 접근이 가능하다. >> public 처럼 사용할수 있다. >> 양면성 
						// 상속관계에서 자식은 부모의 protected 접근 
		System.out.println(this.k);
		
	}
	
	// 강제하지 않으면서 유연성을 확보 할수있다.
	
}

class Inherit {
	
}
	public static void main(String[] args) {
		Pclass p = new Pclass();
		int num = p.j; // 퍼블릭 이니까 >> 참조 변수 입장에서는 public 만 접근이 가능하다. 
		System.out.println(num);
		
		Pclass p2 = new Pclass();
		
		
		
	}

}
