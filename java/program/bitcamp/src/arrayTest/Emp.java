package arrayTest;
// DTO , VO = 데이터 를 담을수있는 클래스 

// 설계도
public class Emp {
	private int empno; // 사번
	private String name; // 이름
	
	// 캡슐화를 불러오기 위해 getter , setter 
	public Emp() {
	}
	public Emp(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// 기능(정보 출력)
	public void empinfoPrint() {
		System.out.println(this.empno + " / " + this.name);
	}
}
