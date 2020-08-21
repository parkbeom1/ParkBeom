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
		
	public int getSum() { // 총점 
		return score.getKor() + score.getEng() + score.getMath();
		}
	public double getAvg() { // 평균 
		return this.getSum() /3.0;
		}
	public String printAll() { // 모든 점수 와 총점 평균 출력 
		return " 이름 :" + name.getName() +
				"국어 :" +score.getKor() +
				"영어 :" +score.getEng() +
				"수학:" +score.getMath() +
				"총점:" + this.getSum() +
				"평균:" + this.getAvg()+"\n";
		}
	}
}
public class GradeManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] st = new Student[50]; // 50명을 동적 할당 받음
		String who;
		int i = 0,j;
		int num = 0;
		
		while(num<=6) {
			System.out.printf("1.입력  2.전체출력  3.검색  4.수정  5.삭제  6.종료");
			int number= sc.nextInt();
			switch(number) {
			case 1: // 1 입력 (name,kor,mat,eng)
				st[i] = new Student();
				System.out.print("이름 입력 :");
				st[i].name.setName(sc.next());
				System.out.print("국어점수 입력 :");
				st[i].score.setKor(sc.nextInt());
				System.out.print("영어점수 입력 :");
				st[i].score.setEng(sc.nextInt());
				System.out.print("수학점수 입력 :");
				st[i].score.setMath(sc.nextInt());
				i++;
				break;
				
			case 2: // 2전체 출력 (오름차순으로 정렬해서 총점,평균을 출력)
				Student temp = new Student();
				for(j=0; j<st.length; j++) {
					if(st[i]==null) 
						break;
				}
				// 버블정렬
				for(int a=0; a<j-1; a++) {
					for(int b=0; b<j-1; b++) {
						// 작은것부터 차례대로 정렬
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
			case 3 : // 3. 검색 이름을 입력하면 성적순으로 출력 된다. 
				System.out.print("검색할 사람의 이름 :");
				who = sc.next();
				for(j=0; j < st.length; j++) {
					if(st[j].name.getName().equals(who)) {
						break;
					}
				}			
			case 4 : // 수정(이름을 입력하면 성적으로 출력한다.
				System.out.print("수정할 사람의 이름");
				 who = sc.next();
				 for(j=0; j<st.length; j++) {
					 if(st[j].name.getName().equals(who)) {
						 break;
					 }
					 System.out.print("수정할 내용은? 1.국어 2. 영어 3. 수학 :");
					 int k = sc.nextInt();				 
			if(k==1) {
				System.out.print("국어점수 수정 :");
				st[j].score.setKor(sc.nextInt());	
			} else if(k==2) {
				System.out.print("영어점수 수정:");
				st[j].score.setEng(sc.nextInt());
			} else if(k==3) {
				System.out.print("수학 점수 수정:");
				st[j].score.setMath(sc.nextInt());
			} else 
				System.out.println("잘못된 입력 입니다.");
				break;
		    }
			
			case 5: // 5 삭제	
				System.out.println("삭제할 사람의 이름 :");
				who = sc.next();
				for(j=0; j<st.length; j++) {
					if(st[j].name.getName().equals(who)) {
						break;
					}
				}
			st[j] = null; // 지운다 // st.length-1-j
			for(int shift=j; shift<st.length-1; shift++) {
				st[shift] = st[shift+1];
				}
			st[st.length-1] = null; // 지울게 없으면 
			break;
			
			case 6:
				System.out.println("종료!!");
				break;
			}
		}
			sc.close();
		}
	}
