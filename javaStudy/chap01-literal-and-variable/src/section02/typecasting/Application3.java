package section02.typecasting;

public class Application3 {

	public static void main(String[] args) {
		
		/* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산 */
		int inum =10;
		long lnum = 100;

		// 방법 1. 두 수의 연산 결과를 int형으로 형변환 한 후  int 자료형 변수에 리턴 받는다.
		int sum = (int) (inum + lnum);
		System.out.println(sum);
		
		// 방법2. long형을 강제로 int로 변경 후 연산
		int sum2 = inum+ (int)lnum;
		System.out.println(sum2);
		
		// 방법 3. 결과 값을 long형 자료형으로 받는다. (자동형변환)
		long sum3 = inum + lnum;
		System.out.println(sum3);
		
		/* 주의 사항 : 정수 연산의 경우 int 미만의 연산 처리 결과는 항상 int형으로 반환된다.
		 * 이는 jvm에서 정수형의 기본자료형은 int로 취급하기 때문에 그렇다.*/ 
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
	
		int result = byteNum1 + byteNum2;
		System.out.println(result);
		
		int result2 = byteNum1 + shortNum1;
		System.out.println(result2);
		
		int result3 = shortNum1 + byteNum1;
		System.out.println(result3);
		
		int result4 = shortNum1 + shortNum2;
		System.out.println(result4);
		
		byte result5 = (byte) (shortNum1 + byteNum2);
		System.out.println(result5);
		
		short result6 = (short) (shortNum1 + byteNum2);
		System.out.println(result6);
		
	}

}
