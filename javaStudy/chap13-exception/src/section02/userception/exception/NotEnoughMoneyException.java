package section02.userception.exception;

public class NotEnoughMoneyException extends Exception {

	/* 사용자 정의의 예외클래스를 만들기 위해서는 Exception 클래스를 상속받으면 된다.
	 * extends Exception을 추가하면 된다.
	 * 
	 * Exception 클래스는 Thorwable 클래스를 상속받아서 구현되어 있다.
	 * Throwable은 Error와 Exception두 가지를 추상화 해서 만들었다.
	 * 예외는 Exception을 가장 최 상위 클래스로 여긴다.
	 * 따라서 우리는 오류 상황을 만들 것은 아니기 떄문에 Exception클래스를 상속 반는다.*/
	
	public NotEnoughMoneyException() {
		
	}
	
	public NotEnoughMoneyException(String message) {
		/*예외 인스턴스 생성 시점에 전달한 예외 메세지를 ㅁ부모 생성자쪽으로 전달해서 인스턴스를 생성한다.*/
		super(message);
	}
	
	/* 예외를 재정ㅇ의 하는 것은 생각보다 복잡하지는 않으나 이것을 복잡하게 재정의 하여 사용하게 된다.
	 * 우선 money와 price가 각각 음수로 입력되는 경우 일반적인 상식에서 벗어나는 프로그램이 된다.
	 * 만약 각각 음수로 입력되는 경우 예외를 던지고ㅡ 그 예외 이름을 이용해서 예외의 이유를 구체적으로 알 수 있도록 할 것이다.
	 * 먼저 NegativeException클래스를 만들고 이를 상속받는 PriceNegativeException과 MoneyNagativeException을
	 * 순서대로 만들어 볼 것이다.*/
	
}
