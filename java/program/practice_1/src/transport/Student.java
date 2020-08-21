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
	// �ýø� ������� , ������ ���� ��� , ����ö�� ���� ���
	public void takeby(Taxi t) {
	        this.money -= t.taximoney; 
	        t.taxigetmoney += 1200;
	        if(this.money < 0) {
	        		System.out.println(" ���̻� �̿� �� ���� �����ϴ�.");
	        		System.exit(0);
	        }
	        System.out.println(" ���� �ܾ��� " + this.money + "  " +
	        		t.getTaxinumber() + " ��  �ý� ������ " + t.taxigetmoney);
	}
	public void takeby(Bus b) {
			this.money -= b.busmoney;
			b.busgetmoney += 1000;
		    	if(this.money < 0) {
		    		System.out.println(" ���̻� ���� �����ϴ�.");
		    		System.exit(0);
		    }
			System.out.println(" ���� �ܾ��� " + this.money + "  " +
					b.getBusnumber()  + " ��  ���� ������ " + b.busgetmoney);
	}
	public void takeby(Subway s) {
			this.money -= s.subwaymoney;
			s.subwaygetmoney += 2000;
			   if(this.money < 0) {
		        	System.out.println(" ���̻� ���� �����ϴ�.");
		        	System.exit(0);
		        }
			System.out.println(" ���� �ܾ��� " + this.money + "  " +
					s.getSubwaynumber() + " ��  ����ö ������ " + s.subwaygetmoney);
	}	
}