package transport;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	public int money = 3000;
	Scanner sc = new Scanner(System.in);
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	// 택시를 탔을경우 , 버스를 탔을 경우 , 지하철을 탔을 경우
	public void takeby(Taxi t) {
	        this.money -= t.taximoney; 
	        t.taxigetmoney += 1200;
	        if(this.money < 0) {
	        		System.out.println(" 더이상 이용 할 돈이 없습니다.");
	        		System.exit(0);
	        }
	        System.out.println(" 남은 잔액은 " + this.money + "  " +
	        		t.getTaxinumber() + " 번  택시 수입은 " + t.taxigetmoney);
	}
	public void takeby(Bus b) {
			this.money -= b.busmoney;
			b.busgetmoney += 1000;
		    	if(this.money < 0) {
		    		System.out.println(" 더이상 돈이 없습니다.");
		    		System.exit(0);
		    }
			System.out.println(" 남은 잔액은 " + this.money + "  " +
					b.getBusnumber()  + " 번  버스 수입은 " + b.busgetmoney);
	}
	public void takeby(Subway s) {
			this.money -= s.subwaymoney;
			s.subwaygetmoney += 2000;
			   if(this.money < 0) {
		        	System.out.println(" 더이상 돈이 없습니다.");
		        	System.exit(0);
		        }
			System.out.println(" 남은 잔액은 " + this.money + "  " +
					s.getSubwaynumber() + " 번  지하철 수입은 " + s.subwaygetmoney);
	}	
}