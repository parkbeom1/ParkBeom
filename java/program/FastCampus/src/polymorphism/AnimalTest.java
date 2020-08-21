package polymorphism;

import java.util.ArrayList;



// 다형성 : 하나의 코드가 여러 코드로 구현됨
class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	// 상위클래스는  공통적으로 쓰이는 메소드를 정의 - polymorphism 다형성이 구현이 된다.
}
class Human extends Animal { // 상속 
	
	// 오버라이딩
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readbook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	
	// 오버라이딩
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	
	// 오버라이딩
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
	}
}

class Rabit extends Animal {

	@Override
	public void move() {
		System.out.println("껑충껑충 뜁니다");
	}
	public void run() {
		System.out.println("토끼는 굉장히 빠릅니다.");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human(); // 형변환 업캐스팅
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		Animal rAnimal = new Rabit();
		
		// 다운캐스팅 해서 인스턴스의 메소드를 호출하고 싶으면
		Human human = (Human)hAnimal;
		human.readbook();
		
		Tiger tiger = (Tiger)tAnimal;
		if(hAnimal instanceof Tiger) { // 이 객체가 Human 타입이면
			Eagle human2 = (Eagle)hAnimal; // false 니까 실행이 안됨 
		} else if(hAnimal instanceof Human) {
			Human human3 = (Human)hAnimal;
		}
		
		
		AnimalTest test = new AnimalTest();
		// 다형성 : 하나의 코드가 여러자료형이 구현이되서 다른실행이 이루어진다. 
		test.moveAnimal(hAnimal); //여러클래스가 Animal 타입이기때문에 참조변수를 호출할수있다.
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		test.moveAnimal(rAnimal); // 토끼 추가 
		
		// 객체 배열 에 저장시 타입은 최상위부모의 Animal
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test2 = new AnimalTest();
		test2.testDownCasting(animalList); // (ArrayList<Animal> list)
		
	}
	public void moveAnimal(Animal animal) { // 모두 Animal 타입
		animal.move();
	}
	
	public void testDownCasting(ArrayList<Animal> list) { // 아까넣었던객체배열 ArrayList 를 매개변수로 가져온다.
		
		// 하나씩 꺼내기 
		// size 는 있는 요소만 꺼내기 , length 는 전체 길이 만큼 꺼내기 
		for(int i = 0; i < list.size(); i ++) {
			Animal animal = list.get(i); // Animal타입으로 꺼내짐
			// 다운캐스팅 을 통해 자식클래스의 메소드에 접근함 
			// 안정적으로 다운캐스팅 하기 위해서 instanceof를 이용한다.
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readbook();
			} 
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} 
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}	
			else if(animal instanceof Rabit) { 
				Rabit rabit = (Rabit)animal; // 다운캐스팅 
				rabit.run();
			}
			else {
				System.out.println("error");
			}
		}
	}
	// 오버로딩 으로 하면 각각 3개를 만들어야 됨  하지만 위에서 매개변수로 Animal animal 를 주고
	// animal.move()를 실행하면 상속받은 자식클래스의 move()메소드들이 실행된다. 
	public void moveAnimal(Human animal) {
		animal.move();
	}

}
