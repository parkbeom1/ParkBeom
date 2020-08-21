package arrayarray;

import java.util.Scanner;

public class School {
	private Scanner scanner;
	private String[][] subject; // 과목,학생
	private String[][] student; // 학생
	private int[][] studentid;
	private int[][] subscore;
	
	public School() {
		scanner = new Scanner(System.in);
		subject = new String[5][4]; // 과목 배열
		student = new String[5][4]; // 성적 배열
		studentid = new int[5][4]; // 학생 번호
		subscore = new int[5][4]; // 과목 점수
	}
	// 등록 조회 취소
	public String showMenu() {
		System.out.println("********************");
		System.out.println("***학생 성적 관리 시스템***");
		System.out.println("1. 학생과  과목 등록 ");
		System.out.println("2. 점수 입력");
		System.out.println("3. 학번 조회");
		System.out.println("4. 점수 조회");
		System.out.println("5. 등록 취소");
		String select = scanner.nextLine();
		return select;
	}
	public void selectMenu() {
		while(true) {
		  String choice = showMenu(); // return 이 String이니 String으로 받는다.
		  switch(choice) {
		  case "1":
			  register();         // 1.  학생 과 과목 등록
			  break;
		  case "2": 
			  scoreinput();    	  // 2.  과목마다 점수 입력 
			  break;
		  case "3": 
			  studentidinfo();    // 3. 학번 조회
			  break;
		  case "4": 
			  scoreinfo() ; 	  // 4. 학생의 학번 조회시  과목의 이름과 점수 출력   
			  break;
		  case "5":
			  registercancel();   // 5. 등록 취소 
			  break;
		  default :
			  break;
		   }
		}	
	}
	// 1. 학생과 과목 등록 
	public void register() {
		System.out.println("학생 이름을 입력해주세요. : ");
		String studentname = scanner.nextLine();
		System.out.println("과목 이름을 등록해주세요 . : ");
		String subjectname = scanner.nextLine();
		
		for(int i = 0; i < student.length; i++ ) {
			for(int j = 0; j < student[i].length; j++) {
					student[i][j] = studentname; // 학생 등록 
					studentid[i][j] = (int)(Math.random()*100+1);
					subject[i][j] = subjectname; 
					System.out.println("학생 등록이 완료되었습니다.");
					System.out.printf("학생의 이름은  : [%s] 학생의 학번은  [%d] \n",student[i][j],studentid[i][j]);
					System.out.printf("등록된 과목명은 : [%s]" , subject[i][j]);	
			}
		}	
	}	
	// 2. 과목 마다  학생의 점수 입력
	public void scoreinput() {
		System.out.println("학생 의 이름을 기입 해주세요.");
		String studentname = scanner.nextLine();
		System.out.println("과목의 이름을 기입 해주세요.");
		String subjectname = scanner.nextLine();
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(studentname.equals(student[i][j])) 
					if(subjectname.equals(subject[i][j])){
						System.out.println("점수를 입력해주세요");
						subscore[i][j] = scanner.nextInt(); 
					} else {
						System.out.println("등록되지 않는 학생 이거나 없는 과목 입니다.");
					}
				}
			}
		}
	// 3. 학번 조회 
	public void studentidinfo() {
		System.out.println("학번을 조회합니다.");
		System.out.println("학생의 이름을 기입해주세요.");
		String studentname = scanner.nextLine();
		for(int i = 0; i < studentid.length; i++) {
			for(int j = 0; j < studentid[i].length; j++) {
				if(studentname.equals(student[i][j])) {
					System.out.printf("학생의 학번은 [%d] 입니다.",studentid[i][j]);
				}
			}
		}
	}
	// 4. 학생의 학번 조회시 과목의 점수 , 학번 출력 
	public void scoreinfo() {
		System.out.println("학생의 학번을 입력해주세요.");
		int inputid = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(inputid == studentid[i][j]) {
					System.out.printf("이 학생의 학번은 [%d] 학생이 듣는 과목은 [%s] 점수는 [%d] 입니다.",studentid[i][j], subject[i][j] , subscore[i][j]);
				}
			}
		}
	}
	// 5. 학생 등록 취소
	public void registercancel() {
		System.out.println("학생의 학번을 입력해주세요.");
		int inputid = scanner.nextInt();
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				if(inputid == studentid[i][j]) {
					student[i][j] = null;
					System.out.printf("[%d] 학생은 재적 되었습니다." , student[i][j]);
				}
			}	
		}
	}
}
