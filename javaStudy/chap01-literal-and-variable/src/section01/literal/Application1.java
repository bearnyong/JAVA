package section01.literal;

public class Application1 {

	public static void main(String[] args) {
		
		/* 리터럴이란? 
		 * 
		 * 리터럴은 12, "hello eclipse"와 같은 상수나
		 * 프로그래밍에서 상수 값을 한 번 저장하면 변경 할 수 없는 저장공간으로 정의를 하였기 때문에
		 * 이와 구분을 하기 위해서 리터럴이라는 용어를 사용하여  정의를 하고 있다. */ 
		
		
		/* 1. 숫자 형태의 값 출력
		 * 1-1. 정수 형태의 값  */
		System.out.println(123);
		
		/* 1-2. 실수 형태의 값 */
		System.out.println(123.23);
		
		
		/* 2. 문자 형태의 값 출력 */
		System.out.println('a');
		System.out.println('1');
		
		/* 2-1. 문자 형태의 에러 */
		// System.out.println(''); 문자는 공백이 올 수 없다.
		// System.out.println('df'); 두 개 이상은 문자로 취급하지 않고 문자열로 취급한다.
		
		
		/* 3. 문자열 형태의 값 출력 */
		System.out.println("안녕하세요");
		System.out.println("30살 이상우 입니다.");
		System.out.println("");
		System.out.println("1");
		
		
		/* 4. 논리 형태의 값을 출력 */
		System.out.println(true);
		System.out.println(false);
		
	}

}
