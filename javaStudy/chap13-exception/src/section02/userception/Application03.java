package section02.userception;

import section02.userception.exception.MoneyNegativeException;
import section02.userception.exception.NotEnoughMoneyException;
import section02.userception.exception.PriceNegativeException;

public class Application03 {

	public static void main(String[] args) {

		/* multi-catch
		 * jdk1.7에서 추가된 구문으로
		 * 동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭으로 다룰 수 있다.*/
		
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnoughMoeny(200000, 100000);
		}catch(NotEnoughMoneyException e) {
			/* 예외 클래스명, 예외 발생 위치, 예외메세지 등을 stack 호출 역순으로
			 * 발간색 글씨를 이용해서 로그 형태로 출력해주는 기능*/
			e.printStackTrace();
		}catch (PriceNegativeException | MoneyNegativeException e) {
			System.out.println(e.getClass()+"발생!!");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally 블럭의 내용이 동작함");
		}
		System.out.println("프로그램을 종료한다.");
		
		
	}

}
