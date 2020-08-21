import java.util.ArrayList;

class Animal {
	
	// �������� �޼ҵ� ����
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	// final �޼ҵ� �ڽ�Ŭ�������� �������̵��� ���´�. 
	final void eating() { 
		System.out.println("������ �Խ��ϴ�.");
	}
}
class Human extends Animal {	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
class Pig extends Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	public void hunting() {
		System.out.println("������ ��ϴ�.");
	}
}
class Dog extends Animal {
	public void move() {
		System.out.println("�������� �����Դϴ�.");
	}
	
	public void dogcry() {
		System.out.println("�۸� �Ҹ��� ���ϴ�.");
	}
}
public class AnimalTest {
	public void moveTest(Animal animal) { // �Ű������� Ŭ������ Ÿ���̴ϱ� �ü��ִ�.
		animal.move(); // ��ü �ּҷ� ���� �Ҽ��ִ�.
	}
	public static void main(String[] args) {
		Animal panimal = new Pig(); // ��ĳ����
		Animal danimal = new Dog();
		Animal hanimal = new Human(); 
	// hauman �� readbooks �� �����ϰ������ 
		
//		Human human = (Human)hanimal; // �ٿ�ĳ���� ���� ����ȯ �Ͽ� �ٽ� ���� �Ѵ�. 
//		human.readBook();
		if(panimal instanceof Pig ) { // �������� instanceof Ŭ���� �� �ν��Ͻ� �̸� ?
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
			// animalList �� ���鼭 for�� �ٿ�ĳ���� ���� �Ǹ鼭 �޼ҵ尡 �Ҹ���. 
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
//		// �ϳ��� �ڵ�� �������� �ڵ尡 ���ư����ִ� - ������   ������ Ŭ���������� Animal �̱� ������ �� �޼ҵ�� ������ �Ѵٰ� �ص� ������ �޼ҵ�� ȣ���Ҽ��ִ�. 
//		AnimalTest animal = new AnimalTest();
//		animal.moveTest(panimal); // Animal animal = panimal
//		animal.moveTest(danimal);
		
		/*
		for(Animal animal1 : animalList) {
				animal1.move(); // �ڵ尡 �ϳ����� �ڽ��� move() �޼ҵ� �������� �ڵ尡 ����ȴ�.
		}
		*/
		


