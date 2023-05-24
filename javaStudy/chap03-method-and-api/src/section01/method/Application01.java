package section01.method;

public class Application01 {

	public static void main(String[] args) {
		/* 메소드란?
		 * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 * 자세한 메소드 사용법은 객체 부분에서 다루게 되니 지금은 호출의 흐름의 대해 이해할 수 있도록 한다*/
		
		
		// 1. 먼저 main() 메소드가 동작하는지 확인하기 위한 간략한 출력 구문을 작성한다.
		System.out.println("main() 시작됨...");
		/* 현재 우리가 작성하고 있는 소스 코드는 main 이라고 불리는 메소드 내에서 작성을 하고 있다.
		 * 또 다른 메소드를 하나 작성하고 호출을 해보자
		 * 2. main method 밖에 하단 methodA라는 메소드를 추가해보자*/
		
		
		/* 5. 작성한 메소드를 호출하는 부분
		 * 클래스명 사용할이름 = new 클래스명(); //객체 생성
		 * 사용할 이름.메소드명() //메소드 호출
		 * */
		Application01 app1 = new Application01(); ////객체 생성
		app1.methodA();
		
		
		// 6. 코드 동작 흐름을 더 이해하기 위해 main() 메소드가 종료할 때 출력하는 구문을 간단하게 작성한다.
		System.out.println("main() 함수 종료됨...");
		// 7. 메소드 실행 흐름을 확인하고 method ()를 추가한다.
		
	}
	
	
	// 3. 호출 확인을 위한 메소드
	public void methodA() {
		
		// 4. 호출 확인을 위해 간단히 출력 구문을 작성하고 다시 메인 메소드 내부에서 코드를 계속 작성한다.
		System.out.println("A함수 호출됨...");
		
		// 12. methodB() 작성 후 호출 구문 작성
		methodB(); //메소드 호출 방식이 다르다는 점을 유의한다.
		// 이제 method가 호출 된 것을 확인할 수 있다.
		
		System.out.println("A함수 종료됨...");
	}
	
	
	public void methodB() {
		// methodA와 같은 방식으로 동작하는 지 확인하는 용도의 출력 구문을 작성한다. 
		System.out.println("methodB를 호출함");
		
		int a = methodC();   //methodC()를 호출하고 반환되는 값을 a에 넣어라
		System.out.println("methodB가 종료됨..."+a);
		
	}
	
	public int methodC() {
		
		System.out.println("methodC를 호출함");
		System.out.println("methodC가 종료됨...");
		
		return 1;
	}
	
}
