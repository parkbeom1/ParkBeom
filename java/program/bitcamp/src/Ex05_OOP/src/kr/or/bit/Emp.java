package kr.or.bit;

// 데이터를 담을수 있는 클래스 = 목적상  DTO ,VO ,DOMAIN 
// 데이터를 담아서 이동할수있는 객체 = DTO 

public class Emp { // extends Object 가 생략되어 있다
	private int empno;
	private String ename;
	
	public Emp(int empno,String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	/////////////////////////////////////////////////////////////
	public String toString() { // toString : Object 클래스가 가지는 메소드
		// 사번과 이름을 출력하는 메소드...
		return this.ename + " , " + this.empno; // 멤버 필드값을 찍어볼때 쓰인다.
	}

	@Override
	public int hashCode() {
		return this.empno;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException  {
		return super.clone();
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
}
