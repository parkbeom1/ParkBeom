package arrayTest;

public class Ex06_Array_Object {
	public static void main(String[] args)  {
		// 1. ��� 3�� �� �迭 ���
		// 1000 , ȫ�浿
		// 2000 , ������
		// ������ ����� �̸��� ����ϼ���.
		Emp emp = new Emp();
		Emp[] emparr = new Emp[3]; // �迭 ������ ����� 
		/*
		for(int i = 0; i <emparr.length; i++) {
			emparr[i] = new Emp(); // ���� �������� ��ü��  i�� �Ҵ�ȴ�. 
		}
		*/
		emparr[0] = new Emp(1000,"ȫ�浿");
		emparr[1] = new Emp(2000,"���");
		emparr[2] = new Emp(3000,"����");
		
		for(int i = 0; i < emparr.length; i++ ) {
			emparr[i].setEmpno(emparr[i].getEmpno() * 100);
			System.out.println(emparr[i].getEmpno());
		}
		
		for(Emp emp2 : emparr) { // ������ for������ ��� 
			System.out.println("��� �̸��� : "  + emp2.getName() + "  " + " ��� ��ȣ��  : "  + emp2.getEmpno());
			}	
		}
	}