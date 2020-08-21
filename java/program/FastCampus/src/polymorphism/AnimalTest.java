package polymorphism;

import java.util.ArrayList;



// ������ : �ϳ��� �ڵ尡 ���� �ڵ�� ������
class Animal {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	// ����Ŭ������  ���������� ���̴� �޼ҵ带 ���� - polymorphism �������� ������ �ȴ�.
}
class Human extends Animal { // ��� 
	
	// �������̵�
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readbook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	
	// �������̵�
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	
	// �������̵�
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ ��� �ָ� ���ư��ϴ�.");
	}
}

class Rabit extends Animal {

	@Override
	public void move() {
		System.out.println("���沱�� �ݴϴ�");
	}
	public void run() {
		System.out.println("�䳢�� ������ �����ϴ�.");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human(); // ����ȯ ��ĳ����
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		Animal rAnimal = new Rabit();
		
		// �ٿ�ĳ���� �ؼ� �ν��Ͻ��� �޼ҵ带 ȣ���ϰ� ������
		Human human = (Human)hAnimal;
		human.readbook();
		
		Tiger tiger = (Tiger)tAnimal;
		if(hAnimal instanceof Tiger) { // �� ��ü�� Human Ÿ���̸�
			Eagle human2 = (Eagle)hAnimal; // false �ϱ� ������ �ȵ� 
		} else if(hAnimal instanceof Human) {
			Human human3 = (Human)hAnimal;
		}
		
		
		AnimalTest test = new AnimalTest();
		// ������ : �ϳ��� �ڵ尡 �����ڷ����� �����̵Ǽ� �ٸ������� �̷������. 
		test.moveAnimal(hAnimal); //����Ŭ������ Animal Ÿ���̱⶧���� ���������� ȣ���Ҽ��ִ�.
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		test.moveAnimal(rAnimal); // �䳢 �߰� 
		
		// ��ü �迭 �� ����� Ÿ���� �ֻ����θ��� Animal
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		AnimalTest test2 = new AnimalTest();
		test2.testDownCasting(animalList); // (ArrayList<Animal> list)
		
	}
	public void moveAnimal(Animal animal) { // ��� Animal Ÿ��
		animal.move();
	}
	
	public void testDownCasting(ArrayList<Animal> list) { // �Ʊ�־�����ü�迭 ArrayList �� �Ű������� �����´�.
		
		// �ϳ��� ������ 
		// size �� �ִ� ��Ҹ� ������ , length �� ��ü ���� ��ŭ ������ 
		for(int i = 0; i < list.size(); i ++) {
			Animal animal = list.get(i); // AnimalŸ������ ������
			// �ٿ�ĳ���� �� ���� �ڽ�Ŭ������ �޼ҵ忡 ������ 
			// ���������� �ٿ�ĳ���� �ϱ� ���ؼ� instanceof�� �̿��Ѵ�.
			
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
				Rabit rabit = (Rabit)animal; // �ٿ�ĳ���� 
				rabit.run();
			}
			else {
				System.out.println("error");
			}
		}
	}
	// �����ε� ���� �ϸ� ���� 3���� ������ ��  ������ ������ �Ű������� Animal animal �� �ְ�
	// animal.move()�� �����ϸ� ��ӹ��� �ڽ�Ŭ������ move()�޼ҵ���� ����ȴ�. 
	public void moveAnimal(Human animal) {
		animal.move();
	}

}
