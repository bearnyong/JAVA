package section07.kindsofvariable;

public class KindsOfVariable {
	/* 클래스 영역에 작성하는 변수를 필드라고 한다.
	 * 필드(속성) == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	 * 
	 * non-static field를 인스턴스 변수라고 한다.(인스턴스 생성 시점에 사용 가능한 변수라는 의미)*/
	private int globalNum; //자동으로 기본값이 저장되어 있음
	
	// static field를 정적필드(클래스 변수)라고 한다. (정적(클래스)영역에 생성되는 변수라는 의미이다.)
	private static int staticNum;
	
	public void testMethod(int num) {
		/* 메소트 여역에서 작성하는 변수를 지역변수라고 한다
		 * 메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
		 * 매개변수도 일종의 지역변수로 생각하면 된다.
		 * 지역변수와 매개변수 모두 메소드 호출 시 stack을 할당받아 stack에 생성된다.*/
		
		int localNum; //지역변수
		
		System.out.println(num);
//		System.out.println(localNum);
		
		System.out.println(globalNum); //전역 변수는 클래스 전역에서 사용 가능하다.
		System.out.println(staticNum);
		
	}
	
	public void testMethod2() {
//		System.out.println(localNum); // 지역변수의 해당 지역(블로그 스코프) 내에서만 사용 가능하다.
		System.out.println(globalNum); // 전역변수는 다른 메소드에서도 사용 가능하다.
		System.out.println(staticNum);
	}
	
	
	
}
