package computertest;

import java.util.Scanner;

public class Computer {
	public int price;
	public String brand;
	public int serialnum;
	public String color;
	public Kybord kybord;
	public Monitor monitor;
	public MainBody mainbody;
	public Scanner scanner;
	
	public Computer() {
		price = 10000;
		brand = "�Ｚ";
		serialnum = 505050;
		color = "���";
		kybord = new Kybord();
		monitor = new Monitor();
		mainbody = new MainBody();
		scanner = new Scanner(System.in);
	}
	
	// �޴� ����
	public void showMenu() {
		System.out.println("****************");
		System.out.println("��ǻ�Ͱ� �����մϴ�.");
		System.out.println();
		System.out.println("1. ");
		
	}
}
