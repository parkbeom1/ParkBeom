package arrayTest;
// DTO , VO = ������ �� �������ִ� Ŭ���� 

// ���赵
public class Emp {
	private int empno; // ���
	private String name; // �̸�
	
	// ĸ��ȭ�� �ҷ����� ���� getter , setter 
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
	// ���(���� ���)
	public void empinfoPrint() {
		System.out.println(this.empno + " / " + this.name);
	}
}
