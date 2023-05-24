package section02.typecasting;

public class Application1 {

	public static void main(String[] args) {
		
		/* 데이터 형변환이 필요한 이유
		 * 자바에서 다른 타입끼리 연산은 피연산자들이 모두 같은 타입인 경우에만 가능하다.
		 * 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.*/
		
		/* 형변환의 종류와 규칙
		 * 1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입변환
		 * 1-1, 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다.
		 * 1-2, 정수는 실수로 자동 형변환이 된다.
		 * 1-3, 문자형은 int형으로 자동 형변환이 된다.
		 * 1-4, 논리형은 형변환 규칙에서 제외된다.
		 *
		 * 2. 강제 형변환(명시적 형변환) : 형변환 연산자를 이용하여 강제적으로 수행하는 형변환
		 * 2-1. 자동 형변환이 적용되지 않는 경우 강제 형변환이 필요하다. */
		
		
		/* 1-1. 작은 자료형에서 큰 자료형으로 자동 형변환 된다.
		 * 1-1-1. 정수끼리의 자동 형변환 */
		byte bnum =1;
		System.out.println(((Object)bnum).getClass().getSimpleName());
		short snum = bnum;
		System.out.println(((Object)snum).getClass().getSimpleName());
		int inum = snum;
		System.out.println(((Object)inum).getClass().getSimpleName());
		long lnum = inum;
		System.out.println(((Object)lnum).getClass().getSimpleName());
		
		//연산 시에도 자동으로 큰 쪽 자료형으로 맞춰서 계산한다.
		int num1 = 10;
		long num2 = 20;
		long result = num1 * num2;
		System.out.println(((Object)result).getClass().getSimpleName());
		
		
		/* 1-1-2. 실수끼리의 자동 형변환 */ 
		float fnum = 4.0f;
		double dnum = fnum;
		System.out.println(((Object)fnum).getClass().getSimpleName());
		System.out.println(((Object)dnum).getClass().getSimpleName());
		
		double result2 = fnum * dnum;
		System.out.println(((Object)result2).getClass().getSimpleName());
		
		
		/* 1-2 정수는 실수로 자동 형변환 된다. */
		long eight = 8;
		float four= eight;
		System.out.println(four);
		
		//실수와 정수의 연산은 실수로 연산결과가 반환된다.
		float result3 = eight * four;
		System.out.println("reuslt3 : " + result3);
		
		
		/* 1-3. 문자형은  int형으로 자동 형변환된다. */ 
		char ch1 = 'a';
		// short sch = ch1; 
		int charNumber = ch1;
		System.out.println("charNumber : " + charNumber);
		
		char ch2 = 65;
		System.out.println("ch2 : " + ch2);
		
		
		/* int형에서 char형으로는 불가능하다. */
		// int a = 65; // 4byte
		// char ch3 = a; // 2byte
		
		
		// 1-4. 논리형은 형변환 규칙에서 제외된다.
		boolean isTrue = true;
		// byte b = isTrue;
		// short s = isTrue;
		// int i = isTrue;
		// char c  = isTrue;
		// float f = isTrue;
		// double d = isTrue;
		
	}

}
