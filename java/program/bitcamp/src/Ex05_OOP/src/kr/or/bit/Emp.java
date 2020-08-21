package kr.or.bit;

// �����͸� ������ �ִ� Ŭ���� = ������  DTO ,VO ,DOMAIN 
// �����͸� ��Ƽ� �̵��Ҽ��ִ� ��ü = DTO 

public class Emp { // extends Object �� �����Ǿ� �ִ�
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
	public String toString() { // toString : Object Ŭ������ ������ �޼ҵ�
		// ����� �̸��� ����ϴ� �޼ҵ�...
		return this.ename + " , " + this.empno; // ��� �ʵ尪�� ���� ���δ�.
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
