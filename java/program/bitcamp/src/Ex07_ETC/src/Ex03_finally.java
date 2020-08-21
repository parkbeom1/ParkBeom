

import java.io.IOException;

/*
 >> CD 한장 게임 설치...
 >> 1. 설치파일 >> C:Temp >> 복사 
 >> 2. 복사한 파일 >> 프로그램 설치 
 >> 3. 정상 설치 >> C:Temp >> 복사한 파일 삭제
 >> 4. 비정상 설치 >> 강제 종료 	>> 복사한 파일 삭제
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
		// 실제로는 예외가 아니지만
		// 강제로 예외 발생 : 개발자가 임의로 문제를 발생시켜서 강제로 예외를 처리하는 방법
		// 코드 : 예외 객체를 직접 생산하는 것이다. new ... 발생 ... 예외 ... 알려....> throw 
		// throw new IOException();
		fileDelete();
		
		try {
			copyFiles();
			startInstall();
//			throw new IOException("Install 중에 문제가 발생했어.");// 예외를 던진다. 캐치가 잡는다. // 개발자가 임의로 예외를 발생시킨 것이다.
		} catch(Exception e) {
			System.out.println("예외 메시지 출력 : " + e.getMessage());
			return; // 리턴이 있어도 종료되지 않고 finally 문이 실행된다.
			
		} finally {
			// 강제 실행 블록 예외가 발생해도 실행 , 예외가 발생하지 않아도 실행 ( 왜? catch를 타도 실행하게끔 해준다.)
			// 자원해제...
			fileDelete(); 
		}
		System.out.println("main end");
		//****************************************************************************
		// 함수의 강제 종료  : return; 던질게 없으면 강제종료 있다 하더라도 finally 는 강제로 실행된다.
	}
}
