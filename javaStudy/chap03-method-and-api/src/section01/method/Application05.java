package section01.method;

/** 
 * <pre>
 * class : Application05
 * Comment : 메소드 리턴 테스트
 * History
 * 2023/04/17
 * </pre>
 * @author 고민영
 * @version 1.0.0
 * **/

public class Application05 {

	public static void main(String[] args) {
		
		/* 메소드 리턴 테스트
		 * 모든 메소드는 내부에 return이 존재한다.
		 * void 메소드의 경우 return을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
		 * return은 현재 메소드를 강제로 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
		 * */
		
		// main() 메소드가 시작하는지 확인하기 위한 구문
		System.out.println("main() 메소드 시작함...");
		
		Application05 app5 = new Application05();
		app5.testMethod();
		
		System.out.println("main 메서드 종료됨...");
	}

	
	public void testMethod() {
		System.out.println("testMethod 동작");
		System.out.println("sdfsdfsd");
		
		//컴파일러에 의해 자동으로 추가되는 구문으로 가장 마지막에 작성해야되며 작성하지 않을 경우 에러가 발생된다.
		return;
	}
}
