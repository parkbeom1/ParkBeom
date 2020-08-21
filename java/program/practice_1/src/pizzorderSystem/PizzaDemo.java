package pizzorderSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaDemo {
	ArrayList<Pizza> pizza = new ArrayList<Pizza>();
	ArrayList<Order> order = new ArrayList<Order>();
	
	double lastServing = 1.0;
	public static void main(String[] args) {
		PizzaDemo start = new PizzaDemo();
	}

	void doit() {
		Scanner sc = new Scanner(System.in);
		
	}
	
	void inputPizza(Scanner sc) {  // ���� �Է�
		while(true) {
			 int number = sc.nextInt();
			 if(number == 0) {
				 break;
			 }
			 pizza.add(new Pizza(number,sc));
		}
	}
	
	void inputOrder(Scanner sc) {  // �ֹ��Է� 
		while(true) {
			int number = sc.nextInt();
			if(number == 0) {
				break;
			}
			order.add(new Order(number,sc));
		}
	}
	
	void process() {
		for(Order i : order) {
			pizza.get(i.pizzaNum - 1).order(i);
			if(lastServing < i.servingTime) {
				lastServing = i.servingTime;
			}
		}
	}
	void printInfo() {
		System.out.println("===�޴���===");
		for(Pizza i : pizza) {
			i.print();
		}
		System.out.printf("\n\n%15s %10s %10s %10s\n","�ֹ�����Ʈ","�ֹ�","�丮����","����");
		for(Order i : order) {
			String pizzaName = pizza.get(i.pizzaNum - 1).name;
			i.print(pizzaName);
		}
	}
	void printResult() {
		System.out.println("\n =====���� �丮 ��Ȳ =====");
		for(Pizza i : pizza) {
			System.out.printf("%s (�丮�ð� %d��) \n" , i.name,i.time);
			for(Order j : i.o) {
				System.out.printf("[%d] %d�� �ֹ� %d~%d (%d�� ���) \n"
						,j.number,j.orderTime,j.startTime);
			}
			double operatingRate = (i.o.size() * i.time / lastServing) * 100;
			System.out.println(lastServing);
			System.out.printf("%d�� �Ϸ�(��� %.1f�� ���) [������ %.1f%%] \n\n",i.o.size
					(), i.average(),operatingRate);
		}
	}
}
// ����Ŭ����
class Pizza {
	int number; // ���ڼ�?
	String name;
	int time;
	ArrayList<Order> o = new ArrayList<Order>(); // �ֹ��� ������ ���ڸ� �����.
	
	Pizza(int number,Scanner sc) { 
		this.number = number; // ���ڼ��� ���� �ʱ�ȭ ��Ű�� 
		name = sc.next();   //�̸��� �ð��� �Է¹޴´�.
		time = sc.nextInt(); 
	}	
	void order(Order order) {
		o.add(order); // ArrayList�� �ֹ���ü�� �߰�
		if(o.size() > 1) { // �ֹ����� 1���� ũ�� 
			Order prev = o.get(o.size() - 2); // ������
			if(prev.servingTime > order.orderTime) { // �����ð��� �ֹ��ð����� ũ��?
				order.startTime = prev.servingTime; // �ֹ� ���� = �����ð�?
			}
		}
		order.servingTime = order.startTime + time;
		// �����ð� ? = �ֹ����� + �ð� 
	}
	void print() {
		System.out.printf("%-10s (�丮�ð� %d��)\n", name,time);
	}
	double average() { // ���?
		int sum = 0;
		if(o.size() == 0) { // 0�̸�
			return 0.0; // 0.0
		} for(Order i : o) { // �迭�� ���� Ǭ��?
			sum += i.servingTime - i.orderTime;
		}
		return (double)sum/o.size();
	}
}
// �ֹ� Ŭ���� 
class Order{
	int number; // �ֹ� ��? 
	int orderTime; // �ֹ� �ð�
	int pizzaNum; // ���� ����
	int startTime; // ���� �ð�
	int servingTime; // ���� �ð�
	
Order(int number,Scanner sc) {
		this.number = number;
		orderTime = startTime = sc.nextInt(); //�ֹ��ð� = �����ð� = �Է¹���
		pizzaNum = sc.nextInt(); // ���� ���� �Է¹���
	}
	void print(String pizzaName) {
		System.out.printf("[%d] %-10s %2d�� -- %2d�� -- %2d��\n", 
		number,pizzaName,orderTime,startTime,servingTime);
	}
}

// �ֹ�Ŭ����
