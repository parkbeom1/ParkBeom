// �ΰ��� ������ ����

class Tv { // 
	boolean power;
	int ch;
	
	void power() { // ��۸�   true false �� turn on turn off �����ʿ䰡����
		this.power = !this.power; 
	}
	void chUp() {
		this.ch++;
		
	}
	void chDown() {
		this.ch--;
	}
}
class Vcr { // ���� �÷��̾� 
	boolean power;
	
	void power() { // �������̵�
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("����ϱ�");
	}
	void stop() {
		System.out.println("�����ϱ�");
	}
	
	void rew() {}
	void ff() {}
	
}
// Tv ���赵
// Vcr ���赵
// tv�� Vcer ����� ���Ե� ��ǰ�� ����� �޶�� �Ѵ�. 
// �ΰ������� �Ǵµ� ��� �̶� ����  class TvVcr extends Tv,Vcr ���߻�� ���� 
// ������ ����� �ؾߵǴµ�  ���� VCR�� extends �ؼ� .... TvVcr extends Vcr
// class TvVcr extends { Vcr v;} // Tv�� Vcr���� ������ ���� �ָ� ����ϰ� ���¾ֵ��� �������� ������.
// class TvVCR {
//  	Tv t;
//		Vcr v;  
// }

// class TvVcr extends {
//}
class TvVcr extends Tv {  // ��ü��    tv�� Vcr ����ȱ���� ����ٰ� �ϸ�   Tv�� ��ӹް�    Vcr ��  �������� ���ش� 
	Vcr vcr; 
	TvVcr(){ //��ü������ ���� 
		vcr = new Vcr(); 
	}
}

public class Ex03_inherit {
	public static void main(String[] args) {
		TvVcr t= new TvVcr();
		t.power();
		System.out.println("tv ����   :" + t.power);
		t.chUp();
		t.chDown();
		System.out.println("tv ä������ : " + t.ch);
		
		
		// ���� ����� ���������
		t.vcr.power();
		System.out.println("������ ���� : " + t.vcr.power);
		
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("Tv���� : " + t.power);
		System.out.println(" ���� ���� ���� Ȯ�� " + t.vcr.power);
	}
}
