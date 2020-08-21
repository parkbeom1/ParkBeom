package arrayscoremanagementsystem;

import java.util.Scanner;

import arrayscoremanagementsystem.Name.Student;

class Name {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
class Score {
	private int kor,eng,math;
	public void setKor(int kor) {
		this.kor = kor;
	}
	int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	int getMath() {
		return math;
	}
}
class Student { 
		Name name = new Name();
		Score score = new Score();
		
	public int getSum() { // ���� 
		return score.getKor() + score.getEng() + score.getMath();
		}
	public double getAvg() { // ��� 
		return this.getSum() /3.0;
		}
	public String printAll() { // ��� ���� �� ���� ��� ��� 
		return " �̸� :" + name.getName() +
				"���� :" +score.getKor() +
				"���� :" +score.getEng() +
				"����:" +score.getMath() +
				"����:" + this.getSum() +
				"���:" + this.getAvg()+"\n";
		}
	}
}
public class GradeManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[50]; // 50���� ���� �Ҵ� ����
		String who;
		int i = 0,j;
		int num = 0;
		
		while(num<=6) {
			System.out.printf("1.�Է�  2.��ü���  3.�˻�  4.����  5.����  6.����");
			int number= sc.nextInt();
			switch(number) {
			case 1: // 1 �Է� (name,kor,mat,eng)
				st[i] = new Student();
				System.out.print("�̸� �Է� :");
				st[i].name.setName(sc.next());
				System.out.print("�������� �Է� :");
				st[i].score.setKor(sc.nextInt());
				System.out.print("�������� �Է� :");
				st[i].score.setEng(sc.nextInt());
				System.out.print("�������� �Է� :");
				st[i].score.setMath(sc.nextInt());
				i++;
				break;
				
			case 2: // 2��ü ��� (������������ �����ؼ� ����,����� ���)
				Student temp = new Student();
				for(j=0; j<st.length; j++) {
					if(st[i]==null) 
						break;
				}
				// ��������
				for(int a=0; a<j-1; a++) {
					for(int b=0; b<j-1; b++) {
						// �����ͺ��� ���ʴ�� ����
						if(st[b].getSum() < st[b+1].getSum()) {
							temp = st[b];
							st[b] = st[b+1];
							st[b+1]	= temp;
						}
					}
				}
			for(int p=0; p<j; p++) {
				System.out.println(st[p].printAll());
			}
				break;
			case 3 : // 3. �˻� �̸��� �Է��ϸ� ���������� ��� �ȴ�. 
				System.out.print("�˻��� ����� �̸� :");
				who = sc.next();
				for(j=0; j < st.length; j++) {
					if(st[j].name.getName().equals(who)) {
						break;
					}
				}			
			case 4 : // ����(�̸��� �Է��ϸ� �������� ����Ѵ�.
				System.out.print("������ ����� �̸�");
				 who = sc.next();
				 for(j=0; j<st.length; j++) {
					 if(st[j].name.getName().equals(who)) {
						 break;
					 }
					 System.out.print("������ ������? 1.���� 2. ���� 3. ���� :");
					 int k = sc.nextInt();				 
			if(k==1) {
				System.out.print("�������� ���� :");
				st[j].score.setKor(sc.nextInt());	
			} else if(k==2) {
				System.out.print("�������� ����:");
				st[j].score.setEng(sc.nextInt());
			} else if(k==3) {
				System.out.print("���� ���� ����:");
				st[j].score.setMath(sc.nextInt());
			} else 
				System.out.println("�߸��� �Է� �Դϴ�.");
				break;
		    }
			
			case 5: // 5 ����	
				System.out.println("������ ����� �̸� :");
				who = sc.next();
				for(j=0; j<st.length; j++) {
					if(st[j].name.getName().equals(who)) {
						break;
					}
				}
			st[j] = null; // ����� // st.length-1-j
			for(int shift=j; shift<st.length-1; shift++) {
				st[shift] = st[shift+1];
				}
			st[st.length-1] = null; // ����� ������ 
			break;
			
			case 6:
				System.out.println("����!!");
				break;
			}
		}
			sc.close();
		}
	}
