package arrayTest;

public class Ex06_Array_Object {
	public static void main(String[] args)  {
		// 1. 사원 3명 단 배열 사용
		// 1000 , 홍길동
		// 2000 , 김유신
		// 각각의 사번과 이름을 출력하세요.
		Emp emp = new Emp();
		Emp[] emparr = new Emp[3]; // 배열 공간을 만들고 
		/*
		for(int i = 0; i <emparr.length; i++) {
			emparr[i] = new Emp(); // 각각 생성자의 객체가  i에 할당된다. 
		}
		*/
		emparr[0] = new Emp(1000,"홍길동");
		emparr[1] = new Emp(2000,"라면");
		emparr[2] = new Emp(3000,"개깅");
		
		for(int i = 0; i < emparr.length; i++ ) {
			emparr[i].setEmpno(emparr[i].getEmpno() * 100);
			System.out.println(emparr[i].getEmpno());
		}
		
		for(Emp emp2 : emparr) { // 개선된 for문으로 출력 
			System.out.println("사원 이름은 : "  + emp2.getName() + "  " + " 사원 번호는  : "  + emp2.getEmpno());
			}	
		}
	}