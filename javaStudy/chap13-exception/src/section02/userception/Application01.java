package section02.userception;

public class Application01 {

	public static void main(String[] args) {
		
		/* 사전에 정의 되어 있는 Exception의 종류는 굉장히 많이 있다.
		 * 하지만 RuntimeException의 후손 대부분은 예외처리를 강제화 하지 않는다.
		 * 간단한 조건문들으로 처리가 가능하기 때문에 따로 강제화 하지 않았따.
		 * 자세한 내용은 PPT의 내용을 참조한다.
		 * 
		 * 사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의 예외클래스를 작성하는 것이 가능하다
		 * extends Exception으로 예외처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다.
		 * 여기서는 사용자 정의의 예외처리로 어제 만든 프로그램을 조금 더 업그레이드 시켜보겠다.*/

		ExceptionTest et = new ExceptionTest();
		
		try {
			/* 상품 가격보다 가진 돈이 적은 경우
			 * 실행해보면 예외 종류와 에러 메세지가 출력된다. */
//			et.checkEnoughMoeny(50000, 30000);
//			et.checkEnoughMoeny(-50000, 30000);
//			et.checkEnoughMoeny(50000, -30000);
			et.checkEnoughMoeny(30000, 50000);
		}	catch(Exception e) {
			e.printStackTrace();
		}
		
		/* 예외의 명칭과 메세지로 로그를 확인하여 무슨 예외가 발생했는지 구체적으로 정보를 알 수 있게 된다
		 * 이제 조금 더 구체적인 처리를 할 수 있도록 application2에서 다루어 볼 것이다.*/
		
	}

}
