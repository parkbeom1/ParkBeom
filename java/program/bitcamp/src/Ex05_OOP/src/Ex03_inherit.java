// 두개의 설개도 만듬

class Tv { // 
	boolean power;
	int ch;
	
	void power() { // 토글링   true false 로 turn on turn off 만들필요가없다
		this.power = !this.power; 
	}
	void chUp() {
		this.ch++;
		
	}
	void chDown() {
		this.ch--;
	}
}
class Vcr { // 비디오 플레이어 
	boolean power;
	
	void power() { // 오버라이딩
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("재생하기");
	}
	void stop() {
		System.out.println("정지하기");
	}
	
	void rew() {}
	void ff() {}
	
}
// Tv 설계도
// Vcr 설계도
// tv와 Vcer 기능이 포함된 제품을 만들어 달라고 한다. 
// 두개를쓰면 되는데 상속 이랑 포함  class TvVcr extends Tv,Vcr 다중상속 금지 
// 계층적 상속을 해야되는데  누가 VCR를 extends 해서 .... TvVcr extends Vcr
// class TvVcr extends { Vcr v;} // Tv랑 Vcr둘중 비중이 높은 애를 상속하고 남는애들은 포함으로 빠진다.
// class TvVCR {
//  	Tv t;
//		Vcr v;  
// }

// class TvVcr extends {
//}
class TvVcr extends Tv {  // 일체형    tv와 Vcr 공통된기능을 만든다고 하면   Tv를 상속받고    Vcr 를  포함으로 해준다 
	Vcr vcr; 
	TvVcr(){ //일체형으로 만듬 
		vcr = new Vcr(); 
	}
}

public class Ex03_inherit {
	public static void main(String[] args) {
		TvVcr t= new TvVcr();
		t.power();
		System.out.println("tv 전원   :" + t.power);
		t.chUp();
		t.chDown();
		System.out.println("tv 채널정보 : " + t.ch);
		
		
		// 비디오 기능을 쓰고싶으면
		t.vcr.power();
		System.out.println("비디오의 전원 : " + t.vcr.power);
		
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("Tv전원 : " + t.power);
		System.out.println(" 비디오 전원 상태 확인 " + t.vcr.power);
	}
}
