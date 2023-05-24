package section01.method;

public class Application06 {

	public static void main(String[] args) {
		
		/* 메소드 리턴값 테스트
		 * 메소드는 항상 마지막에 return명령어가 존재한다.
		 * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
		 * 복귀를 할 떄 그냥 복귀를 할 수 있지만 값을 가지고 복귀할 수 이싿.
		 * 이때 가지고 가는 값을 리턴 값이라고 한다.
		 * 
		 * return값은 반환받기 위해서는 메소드 선언부에 리턴 타입을 명시해 주어야 한다.
		 * void는 아무 반환값도 가지지 않겠다는 리턴 타입에 사용할 수 있는 키워드이다.
		 * 반환값이 없는 return 구문은 생략해도 컴파일러가 자동으로 추가해 주지만
		 * 반환값이 있는 경우는 return 구문을 반드시 명시적으로 작성해야 한다.
		 * 또한 메소드 선언부에 선언한 리턴값과 반환값의 자료형은 반드시 일치해야 한다.
		 * */

		
		Application06 app6 = new Application06();
		String returnText = app6.testMethod();
		System.out.println(returnText);
		
		
	}

	/**
	 * <pre>
	 * 문자열 형태의 반환값을 확인하기 위한 메소드
	 * </pre>
	 * 
	 * @return 안녕하세요 라는 문자열을 반환함
	 * @author 고민영
	 * **/
	 
	public String testMethod() {
		
		return "안녕하세요";
	}
	 
}
