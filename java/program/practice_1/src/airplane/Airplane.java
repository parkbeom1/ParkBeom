package airplane;

public class Airplane {
	String airname;
	int airnum;
	static int totalcount;
	
	public Airplane(String airname,int airnum) {
		this.airname = airname;
		this.airnum = airnum;
		totalcount++;
		System.out.println("비행기 종류 : " + airname + 
				" 비행기 번호 : " + airnum + " 총 : "
				+ totalcount + " 대");
	}
	public static void main(String[] args) {
		Airplane air1 = new Airplane("아시아나",1910);	
		Airplane air2 = new Airplane("대한항공",2910);
	}
}
