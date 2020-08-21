/*
	Bird�� ��� �޾Ƽ� ������ �Ұ��̴�.
	Protected : ��� ���迡�� �����Ǹ� ���൵ �ǰ� �����൵ �ȴ�. ( ���� ����  )
*/
class Bi extends Bird2 {
	// ������ ������ ���ھ�  �� protected �� �޳�? default �� �����ϱ� 
	@Override
	protected void moveFast() {
		super.moveFast(); // �θ����� �����Ѱ��� �ҷ��´�.
		}
	}
	class Ostrich extends Bird2 { // ���� ���������� ? 
		// ��üȭ Ư��ȭ
		void run() {
			System.out.println("run ^^");	
		}
		@Override 	// �������ؼ� ���� ���� �ʿ信 ���� ������ ���ټ��ִ�. ��Ӱ��迡�� ������ �ϸ� �ȴ�. protected��  
					// �Ⱦ��ٰ� �ؼ� ���� ������ �ʴ´�. 
		protected void moveFast() {
			run(); 	// run �ϱ⶧���� �����ٰ� �����ִ�.
		}
	}
public class Ex09_Protected {
	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();
		Ostrich o = new Ostrich();
		o.run();
	}
}
