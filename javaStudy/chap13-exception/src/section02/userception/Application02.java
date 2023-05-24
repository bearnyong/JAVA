package section02.userception;

import section02.userception.exception.MoneyNegativeException;
import section02.userception.exception.NotEnoughMoneyException;
import section02.userception.exception.PriceNegativeException;

public class Application02 {

	public static void main(String[] args) {

		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoeny(20000, 30000);
		}catch (NotEnoughMoneyException e) {
			System.out.println("NotEnoughMoneyException 발생!!!");
			System.out.println(e.getMessage());
		}catch (PriceNegativeException e) {
			System.out.println("PriceNegativeException 발생!!!");
			System.out.println(e.getMessage());
		}catch (MoneyNegativeException e) {
			System.out.println("MoneyNegativeException 발생!!!");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally 블럭의 내용 정의함");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		/* 디테일한 예외 상황별로 처리 로직을 다르게 할 수 있따.
		 * 이 떄 주의할 점은 catch 블럭은 위에서 부터 아래로 자신의 타입과 맞는 경우 동작하기 떄문에
		 * 상위 타입이 우쪽으로 오게 되는 경우에는 
		 * 하단에 작성한 코드는 절대 도달할 수 없는 코드가 됨으로 컴파일 에러를 발생하게 된다.
		 * jdk1.7부터 추가된 멀티캐치를 이용할 수 있도록 하는 application3을 만들어 본다.*/
	}

}
