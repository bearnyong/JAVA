package section01.exception;

public class Application02 {

	public static void main(String[] args) {
		/* 2. try-catch를 이용한 방법(예외 발생하지 않음)
		 * 
		 * ExceptionTest 인스턴스 작성*/
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.checkEnounghMoney(100000, 50000);
			System.out.println("상품이 구매되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("상품 구입이 불가능 합니다.");
		}
		System.out.println("프로그램을 종료 합니다.");

	}

}
