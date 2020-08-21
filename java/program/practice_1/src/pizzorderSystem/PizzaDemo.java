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
	
	void inputPizza(Scanner sc) {  // 피자 입력
		while(true) {
			 int number = sc.nextInt();
			 if(number == 0) {
				 break;
			 }
			 pizza.add(new Pizza(number,sc));
		}
	}
	
	void inputOrder(Scanner sc) {  // 주문입력 
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
		System.out.println("===메뉴판===");
		for(Pizza i : pizza) {
			i.print();
		}
		System.out.printf("\n\n%15s %10s %10s %10s\n","주문리스트","주문","요리시작","서빙");
		for(Order i : order) {
			String pizzaName = pizza.get(i.pizzaNum - 1).name;
			i.print(pizzaName);
		}
	}
	void printResult() {
		System.out.println("\n =====오븐 요리 현황 =====");
		for(Pizza i : pizza) {
			System.out.printf("%s (요리시간 %d분) \n" , i.name,i.time);
			for(Order j : i.o) {
				System.out.printf("[%d] %d분 주문 %d~%d (%d분 대기) \n"
						,j.number,j.orderTime,j.startTime);
			}
			double operatingRate = (i.o.size() * i.time / lastServing) * 100;
			System.out.println(lastServing);
			System.out.printf("%d개 완료(평균 %.1f분 대기) [가동률 %.1f%%] \n\n",i.o.size
					(), i.average(),operatingRate);
		}
	}
}
// 피자클래스
class Pizza {
	int number; // 피자수?
	String name;
	int time;
	ArrayList<Order> o = new ArrayList<Order>(); // 주문을 받으면 피자를 만든다.
	
	Pizza(int number,Scanner sc) { 
		this.number = number; // 피자수를 내가 초기화 시키고 
		name = sc.next();   //이름과 시간을 입력받는다.
		time = sc.nextInt(); 
	}	
	void order(Order order) {
		o.add(order); // ArrayList에 주문객체를 추가
		if(o.size() > 1) { // 주문수가 1보다 크면 
			Order prev = o.get(o.size() - 2); // 사이즈
			if(prev.servingTime > order.orderTime) { // 조리시간이 주문시간보다 크면?
				order.startTime = prev.servingTime; // 주문 시작 = 조리시간?
			}
		}
		order.servingTime = order.startTime + time;
		// 서빙시간 ? = 주문수간 + 시간 
	}
	void print() {
		System.out.printf("%-10s (요리시간 %d분)\n", name,time);
	}
	double average() { // 평균?
		int sum = 0;
		if(o.size() == 0) { // 0이면
			return 0.0; // 0.0
		} for(Order i : o) { // 배열의 값을 푼다?
			sum += i.servingTime - i.orderTime;
		}
		return (double)sum/o.size();
	}
}
// 주문 클래스 
class Order{
	int number; // 주문 수? 
	int orderTime; // 주문 시간
	int pizzaNum; // 피자 개수
	int startTime; // 시작 시간
	int servingTime; // 가동 시간
	
Order(int number,Scanner sc) {
		this.number = number;
		orderTime = startTime = sc.nextInt(); //주문시간 = 생성시간 = 입력받음
		pizzaNum = sc.nextInt(); // 피자 개수 입력받음
	}
	void print(String pizzaName) {
		System.out.printf("[%d] %-10s %2d분 -- %2d분 -- %2d분\n", 
		number,pizzaName,orderTime,startTime,servingTime);
	}
}

// 주문클래스
