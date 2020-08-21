

import java.io.IOException;

/*
 >> CD ���� ���� ��ġ...
 >> 1. ��ġ���� >> C:Temp >> ���� 
 >> 2. ������ ���� >> ���α׷� ��ġ 
 >> 3. ���� ��ġ >> C:Temp >> ������ ���� ����
 >> 4. ������ ��ġ >> ���� ���� 	>> ������ ���� ����
 */
public class Ex03_finally {
	
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("FILE DELETE");
	}
	public static void main(String[] args)  {
//		copyFiles();
//		startInstall();
		// �����δ� ���ܰ� �ƴ�����
		// ������ ���� �߻� : �����ڰ� ���Ƿ� ������ �߻����Ѽ� ������ ���ܸ� ó���ϴ� ���
		// �ڵ� : ���� ��ü�� ���� �����ϴ� ���̴�. new ... �߻� ... ���� ... �˷�....> throw 
		// throw new IOException();
		fileDelete();
		
		try {
			copyFiles();
			startInstall();
//			throw new IOException("Install �߿� ������ �߻��߾�.");// ���ܸ� ������. ĳġ�� ��´�. // �����ڰ� ���Ƿ� ���ܸ� �߻���Ų ���̴�.
		} catch(Exception e) {
			System.out.println("���� �޽��� ��� : " + e.getMessage());
			return; // ������ �־ ������� �ʰ� finally ���� ����ȴ�.
			
		} finally {
			// ���� ���� ��� ���ܰ� �߻��ص� ���� , ���ܰ� �߻����� �ʾƵ� ���� ( ��? catch�� Ÿ�� �����ϰԲ� ���ش�.)
			// �ڿ�����...
			fileDelete(); 
		}
		System.out.println("main end");
		//****************************************************************************
		// �Լ��� ���� ����  : return; ������ ������ �������� �ִ� �ϴ��� finally �� ������ ����ȴ�.
	}
}
