package constructor;
/*
 	- 요구사항 -
	자동차 영업소 입니다.
	영업사원은 고객에게 자동차를 팔려고 합니다.
	고객은 자동차의 기본 사양을 살수도 있고 .. 여러 가지 선택 옵션을 선택할수없습니다.
	1. 자동차의 기본은 문의 개수가 4개 자동차 색상은 빨강 
	고객은 
	2. 문의 개수만 변경하고 자동차 색상은 4개 기본으로 할수 있고
	3. 문의 개수는 기본으로 하고 자동차의 색상은 변경 가능하고
	4. 문의 개수와 자동차 색상 모두를 변경하여 차를 구매하고 싶습니다.
*/
class Car1 {
	int door;
	String color;
	String carinfo;
	// 1. 생성자에서 초기화(기본설정)
	Car1(){
		door = 4;
		color = "red";
		carinfo = door + color;
	}
	// 2. 문의 개수만 변경하고 자동차 색상은 4개 기본
	Car1(int door){
		this.door = door;
		color = "red";
		carinfo = door + color;
	}
	// 3. 문의 개수는 기본으로 하고 자동차의 색상은 변경 가능하다
	Car1(String color) {
		this.color = color;
		door = 4;
		carinfo = door + color;
	}
	// 4. 문의 개수도 변경하고 자동차의 색상은 변경 가능하다
	Car1(String color,int door) {
		this.color=color;
		this.door=door;
		carinfo = door + color;
	}
}
public class Ex17_Constructor_Test {
	public static void main(String[] args) {
		Car1 car = new Car1(); // 기본설정
		System.out.println(car.carinfo);
		Car1 car1 = new Car1(5); // 문만 변경
		System.out.println(car1.carinfo);
		Car1 car2 = new Car1("blue"); // 색깔만 변경
		System.out.println(car2.carinfo);
		Car1 car3 = new Car1("green", 7); // 문과 색깔을 같이 변경한다.		
		System.out.println(car3.carinfo);
	}
}
