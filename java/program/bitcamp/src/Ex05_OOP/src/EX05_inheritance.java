class Test2 {
	int x = 100;
	
	void print() {
		System.out.println("부모함수 Test2");
		
	}
}


class Test3 extends Test2 {

	int x = 300; // C# 부모 무시하기  // 쓰지마세요....
	
	@Override
	void print() {
		System.out.println("자식이 부모 함수를 재정의");
	}

	void print(String str) { // 오버로드
		System.out.println("나는 오버로딩 함수야 ");
	}
}	
public class EX05_inheritance {
	public static void main(String[] args) {
		Test3 t = new Test3();
		System.err.println(t.x); // int x  재정의된 x가 호출됨 
		t.print(); // 자식껄 재호출
		t.print("오버로딩 호출"); // 오버로딩 
		
	}
}
