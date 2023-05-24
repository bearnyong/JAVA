package section01.exception;

public class Application01 {

	public static void main(String[] args) throws Exception {
		/* 예외 처리
		 * 
		 * 자바 프로그램 작성 시 자바 문법에 맞지 않는 경우
		 * 코드를 컴파일 하려고 할 떄 컴파일 에러를 발생시킨다. 엄밀히 말하면 문법상의 오류(Stntax Error)이다.
		 * 혹은 자바 문법에 맞게 작성하여 컴파일에 문제가 없더라도, 실행되면서 예상치 못하게 오류가 발생할 수 있다.
		 * 
		 * 컴퓨터 프로그램이 동작하는 도중에 예상치 못한 사태가 발생하여
		 * 실행중인 프로그램이 영향을 받는 것을 오류(Error)와 예외(Exception) 두 가지로 구분할 수 있다.
		 * 
		 * 오류 (Error)
		 * 시스템 상에서 프로그램에 심각한 문제를 발생하여 실행중인 프로그램이 종료되는 것을 말한다.
		 * 이러한 오류는 개발자가 미리 예측하여 처리하는 것이 불가능하며ㅡ 오류에 대한 처리는 할 수 없다.
		 * 
		 * 예외(Exception)
		 * 오류와 마찬가지로 실행중인 프로그램을 비정상적으로 종료시키지만
		 * 발생할 수 있는 상황을 미리 예측하고 처리할 수 있는 미약한 오류를 말하낟.
		 * 개발자는 이러한 예외에 대한 예외처리를 통해 예외 상황을 적절히 처리하여 코드의 흐름을 컨트롤할 수 있따.
		 * 
		 * 강제로 예외를 발생
		 * throw new 예외클래스();
		 * 
		 * 예외 처리 방법
		 * 1. thorws로 위임
		 * 2. try-catch()로 처리*/
		
		ExceptionTest et = new ExceptionTest();
		
		/* 예외처리가 강제화된 메소드를 호출하는 경우 반드시 예외처리를 해야 한다.
		 * 그 중 첫 번째 방법인 throws로 예외를 위임할 것이다.
		 * main 메소드의 헤드 부분에 Throws Exception을 확인해 본다.*/
		
		et.checkEnounghMoney(10000, 5000);
		et.checkEnounghMoney(50000, 10000);
		
		System.out.println("프로그램 종료");

	}

}
