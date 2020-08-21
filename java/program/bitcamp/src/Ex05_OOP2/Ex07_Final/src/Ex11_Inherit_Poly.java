
class Pbase {
	int p = 100;
	
}
class Cbase extends Pbase {	
}
class Dbase extends Pbase {
}
public class Ex11_Inherit_Poly {
	public static void main(String[] args) {
		Cbase cbase = new Cbase();
		System.out.println(cbase); // 주소값 
		Pbase p = cbase; // 부모타입은 참조타입은 자식의 참조타입을 가질수있다. 
		Dbase dbase = new Dbase();
		Dbase dbase2 = new Dbase();
		p = dbase; // 부모타입은 참조타입은 자식의 참조타입을 가질수있다. 
		Cbase c = (Cbase)p; // 큰범위에서 작은범위로 가려면 명시해 줘야 한다. - 다운캐스팅
		
		
	}
}
