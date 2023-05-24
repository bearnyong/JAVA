package section01.variable;

public class Application03 {
	
	public static void main(String[] args) {
		
		/* 변수의 명명 규칙 */ 
		
		/* 1. 컴파일 에러를 발생시키는 규칙
		 * 1-1 동일한 범위 내에서는 동일한 변수명을 가질 수 없다 */
		int age = 20;
		// int age = 10; 
		// 같은 범위에 있는 곳에서는 동일한 변수명을 가질수 없다.
		
		age = 10;
		int b = 20;
		int c;
		
		/* 1-2 예약어는 사용이 불가능하다. */ 
		// int new = 1;
		
		/* 1-3 변수명은 대소문자를 구분한다. */ 
		int Age = 20;
		int True = 10;
		
		/* 1-4 변수명은 숫자로 시작할 수 없다. */
		// int 1age = 10;
		int age1 = 10;
		int a1g1e = 10;
		
		/* 1-5 특수 기호는 '_'와 $만 사용이 가능하다. */
		int _age = 10;
		int $harp = 10;
		// int #harp = 10;
		
		
		/* 2. 개발자들끼리의 암묵적인 규칙
		 * 2-1 변수명의 길이 제한은 없다.
		 * 아래의 경우는 가능하지만 권장되지 않는다.*/
		int sdfafasdfasdfsdafasdfasdfasdfsdfasdfsadfasfsdfasdfsadfs;
		
		/* 2-2 병수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 단어는 대문자로 시작한다.
		 * 단, 클래스명을 지을 때는 앞글자도 대문자로 한다.*/
		int maxAge = 10;
		int minAge = 10;
		
		/* 2-3 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. */ 
		String user_name;
		String userName;
		
		//단, 상수인 경우 전부 대문자로 작성하기 대문에 카멜케이스를 사용할 수 없어서 언더스코어로 연결한다.
		final int MAX_AGE= 10;
		
		/* 2-4 한글로 변수명을 짓는 것은 가능하지만 권장하지 않는다. */
		int 나이;
		
		/* 2-5 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 해야된다 */
		String a;
		String name;
		
		/* 2-6.전형적인 변수 이름이 있으면 가급적으로 사용하도록 한다. */
		int sum;
		int max;
		int min;
		int conut;
		
		//단, 예외적으로 모음은 생략할 수 있다.
		int cnt;
		
		/* 2-7 명사형으로 작성하도록 한다. */
		String goHome;
		String home; //권장
		
		/* 2-8 bolean형은 가급적 긍정형태로 네이밍한다. */
		boolean isAlive;
		boolean isDead;
		
	}

}
