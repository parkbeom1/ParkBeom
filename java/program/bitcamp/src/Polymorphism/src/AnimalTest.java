import java.util.ArrayList;

class Animal {
	
	// 공통적인 메소드 선언
	public void move() {
		System.out.println("동물은 움직입니다.");
	}
	
	// final 메소드 자식클래스에서 오버라이딩을 막는다. 
	final void eating() { 
		System.out.println("음식을 먹습니다.");
	}
}
class Human extends Animal {	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Pig extends Animal {
	public void move() {
		System.out.println("돼지는 움직입니다.");
	}
	public void hunting() {
		System.out.println("으르렁 댑니다.");
	}
}
class Dog extends Animal {
	public void move() {
		System.out.println("강아지가 움직입니다.");
	}
	
	public void dogcry() {
		System.out.println("멍멍 소리를 냅니다.");
	}
}
public class AnimalTest {
	public void moveTest(Animal animal) { // 매개변수로 클래스는 타입이니까 올수있다.
		animal.move(); // 객체 주소로 참조 할수있다.
	}
	public static void main(String[] args) {
		Animal panimal = new Pig(); // 업캐스팅
		Animal danimal = new Dog();
		Animal hanimal = new Human(); 
	// hauman 의 readbooks 에 접근하고싶을때 
		
//		Human human = (Human)hanimal; // 다운캐스팅 강제 형변환 하여 다시 접근 한다. 
//		human.readBook();
		if(panimal instanceof Pig ) { // 참조변수 instanceof 클래스 의 인스턴스 이면 ?
			Pig pig = (Pig)panimal;
		}
		ArrayList <Animal> animalList = new ArrayList<Animal>();
		animalList.add(hanimal);
		animalList.add(danimal);
		animalList.add(panimal);
	
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		}
		public void testDownCasting(ArrayList<Animal> list) {
			// ArrayList<Animal> list = new ArrayList<Animal>()
			// animalList 가 들어가면서 for문 다운캐스팅 실행 되면서 메소드가 불린다. 
			for(int i = 0; i < list.size(); i++) {
				Animal animal = list.get(i);
			
				if( animal instanceof Human) {
					Human human = (Human)animal;
					human.readBook();
				} else if( animal instanceof Dog) { // 
					Dog dog = (Dog)animal;
					dog.dogcry();
				} else if( animal instanceof Pig) {
					Pig pig = (Pig)animal;
				} else {
					System.out.println("error");
				}
			}
		}		
	}		
//		// 하나의 코드로 여러가지 코드가 돌아갈수있다 - 다형성   각각의 클래스이지만 Animal 이기 때문에 그 메소드는 구현을 한다고 해도 동일한 메소드로 호출할수있다. 
//		AnimalTest animal = new AnimalTest();
//		animal.moveTest(panimal); // Animal animal = panimal
//		animal.moveTest(danimal);
		
		/*
		for(Animal animal1 : animalList) {
				animal1.move(); // 코드가 하나지만 자식의 move() 메소드 여러가지 코드가 실행된다.
		}
		*/
		


