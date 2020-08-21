package polymorphismtest;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("동물들은 움직인다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("네발로 걷습니다.");
	}	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("네발로 걷습니다");
	}
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("하늘을 날아다닙니다.");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal hanimal = new Human(); // 업캐스팅  내포하고있어서 
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();
	
		// 오버라이딩되면 인스턴스의 메소드가 불리어짐
		
		
		AnimalTest animal = new AnimalTest();
		// 다형성 : 하나의 코드가 여러코드들이 실행된다.(부모 상속관계 업캐스팅 후)
		animal.move(hanimal);
		animal.move(tanimal);
		animal.move(eanimal);
	
		// 객체 배열 에 저장시 타입은 최상위부모의 Animal
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hanimal);
		animalList.add(tanimal);
		animalList.add(eanimal);
		
		for(Animal animal2 : animalList) {
			animal2.move(); // 다형성 코드는 하나지만 hanimal tanimal eanimal 다실행됨
				// 가상메소드의 매핑되는 함수가 구현됨
		}
	}
	
	public void move(Animal animal) {
		animal.move(); // 다형성 구현 
	}
}
