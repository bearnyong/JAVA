package section01.method;

public class Application02 {

	public static void main(String[] args) {
		/* 메소드 호출 흐름 연습
		 * application01 에서 했던 것과 비슷하지만 호출 흐름을 메인 메소드에서 제어해보자*/
		
		/* 1. methodA(). methodB(), methodC() 를 차례대로 작성한다.
		 * 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 작성하고 다시 현재 위치로 되돌아온다.
		 * 3. 메인메소드 시작을 확인하기 위한 출력 구문을 작성한다.*/
		
		System.out.println("main() 시작함");
		Application02 app2 = new Application02();
		app2.methodA();
		app2.methodB();
		app2.methodC();
		
		System.out.println("main()종료...");

	}
	
	public void methodA() {
		System.out.println("mehtodA 호출됨");
		System.out.println("mehtodA 종료됨");
	}
	
	public void methodB() {
		System.out.println("mehtodB 호출됨");
		System.out.println("mehtodB 종료됨");
	}

	public void methodC() {
		System.out.println("mehtodC 호출됨");
		System.out.println("mehtodC 종료됨");
	}

}
