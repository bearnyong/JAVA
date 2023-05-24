package section01.constant;

public class Application01 {
	public static void main(String[] args) {
		
		/* 상수란?
		 * 변하지 않는 값을 저장해두기 위한 메모리상의 공간을 의미한다.
		 * 
		 * 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
		 * 초기화 이후 값 대입 시 컴파일 에어를 발생시켜 값이 수정되지 못하도록 한다.
		 * 예) 수학 공식에 사용되는 수치 PI -> 3.14 */
		
		/* 1. 상수 선언
		 *  상수 선언 시 자료형 앞에 final을 붙인다.*/ 
		final int AGE;
		final int age; // 권장되지 않음
		
		/* 2. 초기화 */ 
		AGE = 20;
		age = 10; 
		
		/* 3. 상수 사용 */
		System.out.println("AGE의 값 : " + AGE);
		System.out.println("AGE의 값 : " + (AGE + 10));
		
		System.out.println("age의 값 : " + age );
		System.out.println("age의 값 : " + (age + 10));
		
	}
}
