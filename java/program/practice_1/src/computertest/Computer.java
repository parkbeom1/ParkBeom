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
		brand = "삼성";
		serialnum = 505050;
		color = "흰색";
		kybord = new Kybord();
		monitor = new Monitor();
		mainbody = new MainBody();
		scanner = new Scanner(System.in);
	}
	
	// 메뉴 선택
	public void showMenu() {
		System.out.println("****************");
		System.out.println("컴퓨터가 동작합니다.");
		System.out.println();
		System.out.println("1. ");
		
	}
}
