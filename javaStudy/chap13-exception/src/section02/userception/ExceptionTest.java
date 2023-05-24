package section02.userception;

import section02.userception.exception.MoneyNegativeException;
import section02.userception.exception.NotEnoughMoneyException;
import section02.userception.exception.PriceNegativeException;

public class ExceptionTest {
	
	/* 우리는 그동안 Exception으로 예외를 발생시켰으나 이것은 그냥 예외라는 의미이다.
	 * 예외클래스의 이름만으로도 어떠한 예ㅗ이가 발생했는지를 알 수 있도록 하기 위해서는 명명이 중요하다.
	 * 클래스의 이름은 NotEnoughMoneyException 이라는 클래스를 만들어 exception 패키지를 만들고
	 * 그 내부에 클래스를 추가할 것이다.*/

	public void checkEnoughMoeny(int price, int money) 
			throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
		
		if(price < 0) {
			throw new PriceNegativeException("상품 가격이 0보다 작을 수 없습니다.");
		}
		
		if(money < 0) {
			throw new MoneyNegativeException("가지고 있는 돈이 음수이면 쇼핑을 할 수 없습니다.");
		}
		
		if(money < price) {
			throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비싸네요");
		}
		
		System.out.println("제품을 구매하였습니다.");
		/* 참고 throws로 쭉 세개의 클래스를 나열해도되지만 저 3개의 예외 클래스의 공통점은 Exception이라는 것으로 
		 * Exception만 던져도 문제가 없다.*/
		
	}
	
	
}
