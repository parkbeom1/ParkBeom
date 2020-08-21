package myPackage;

public class Screen {
	// 이름 좌석열수  좌석번호
	private String name; 
	private int rowNum; // 열번호
	private int seatNum; // 좌석번호 
	
	public Screen(String name,int rowNum,int seatNum) {
		this.name = name;
		this.rowNum = rowNum;
		this.seatNum = seatNum;
	}

	@Override
	public String toString() {

		return "Screen [name = "+ name + ", rowNum " + rowNum +",seatNum= " + seatNum + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
}
