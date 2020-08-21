
public class Ex02_Exception {
	public static void main(String[] args) {
	
		int num = 100;
		int result = 0;
		System.out.println("main start");

			try {
				for(int i = 0; i < 10; i++ ) {	
					// if 로 조건을 줘서 예외를 처리한다.
				result = num/(int)(Math.random()*10); // 0 ~ 9 
				System.out.println("결과  result:"+ result + " i ");				
					}
			} catch (ArithmeticException e) {
				// 문제가 발생되면 ..문제가 맞는 객체가 자동생성되고 주소값 전달
				// catch(Exception e) >> 가독성 >> (x)
				// catch( ArithmeticException e )>> 좋은 코드(가독성이 좋다)				
				// 여러개의 catch >> 작은 것 먼저 > 큰것 (나머지를처리)
				System.out.println("문제가 발생 관리자에게 메일 발송");
				System.out.println("원인 : " + e.getMessage());
			} catch (NullPointerException e) {
				  // NullPointerException 처리
			} catch (Exception e) {	
				  // 연산 예외 , null 예외를 제외한 나머지를 내가 처리
			}
			System.out.println("main end");
		}		
	}

