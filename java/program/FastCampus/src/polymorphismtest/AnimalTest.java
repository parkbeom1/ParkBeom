package polymorphismtest;

import java.util.ArrayList;

class Animal {
	
	public void move() {
		System.out.println("�������� �����δ�.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("�׹߷� �Ƚ��ϴ�.");
	}	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("�׹߷� �Ƚ��ϴ�");
	}
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("�ϴ��� ���ƴٴմϴ�.");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal hanimal = new Human(); // ��ĳ����  �����ϰ��־ 
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();
	
		// �������̵��Ǹ� �ν��Ͻ��� �޼ҵ尡 �Ҹ�����
		
		
		AnimalTest animal = new AnimalTest();
		// ������ : �ϳ��� �ڵ尡 �����ڵ���� ����ȴ�.(�θ� ��Ӱ��� ��ĳ���� ��)
		animal.move(hanimal);
		animal.move(tanimal);
		animal.move(eanimal);
	
		// ��ü �迭 �� ����� Ÿ���� �ֻ����θ��� Animal
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hanimal);
		animalList.add(tanimal);
		animalList.add(eanimal);
		
		for(Animal animal2 : animalList) {
			animal2.move(); // ������ �ڵ�� �ϳ����� hanimal tanimal eanimal �ٽ����
				// ����޼ҵ��� ���εǴ� �Լ��� ������
		}
	}
	
	public void move(Animal animal) {
		animal.move(); // ������ ���� 
	}
}
