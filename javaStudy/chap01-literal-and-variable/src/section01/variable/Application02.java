package section01.variable;

public class Application02 {
	public static void main(String[] agrs) {
		
		/* 변수를 사용하기 위한 방법
		 * 1. 변수를 준비한다. (선언) 
		 * 2. 변수에 값을 대입한다. (값 대입 및 초기화)
		 * 3. 변수를 사용한다. (호출) */
		
		/* 1. 변수의 선언
		 * 자료형 변수명;
		 * 
		 * 자료형이란?
		 * 다양한 값의 형태로 어느 정도 크기를 하나의 값으로 취급할 것인지를 미리 compiler와 약속한 키워드이다.
		 * 예) int 자료형은 정수 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
		 * 
		 * 이러한 자료형은 기본자료형(primitive type)과 참조자료형(reference type)으로 나누어진다.
		 * 자바의 기본 자료형은 8가지이다. 
		 * (boolean, char, byte, short, int , long, float, double) */
		
		/* 1-1. 숫자를 취급하는 자료형
		 * 1.1.1 정수(Integer)를 취급하는 자료형*/
		byte bnum;	 // 1byte
		short snum;  // 2byte
		int inum; 	 // 4byte
		long lnum;	 // 8byte
		
		/* 1.1.2 실수(float)를 취급하는 자료형 */
		float fnum; // 4byte
		double dnum; //8byte
		
		/* 1.2 문자를 취급하는 자료형 */
		char ch; // 2byte
		char ch2; 
		
		/* 1.3 논리값을 취급하는 자료형 */
		boolean isTrue; //1 byte
		
		
		/* 변수에 값 대입 및 초기화 */ 
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f; 
		dnum = 8.0;
		
		ch = 'a';
		ch2 = 97;
		
		isTrue = true;
		isTrue = false;
		
		String str = "안녕하세요";
		
		
		/* 선언과 동시에 초기화 */ 
		int point = 100;
		int bonus = 10;
		
		
		/* 변수 사용(호출) */
		System.out.println("===== 변수에 저장된 값 출력 =====");
		System.out.println("bnum의 값 :" + bnum);
		System.out.println("snum의 값 : " + snum);
		System.out.println("inum의 값 : " + inum);
		System.out.println("lnum의 값 : " + lnum);
		
		System.out.println();
		System.out.println("fnum의 값 :" + fnum);
		System.out.println("dnum의 값 :" + dnum);
		
		System.out.println();
		System.out.println("ch의 값 : " + ch);
		System.out.println("ch2의 값 :" + (1+ch2));
		
		System.out.println();
		System.out.println("isTrue의 값 : "+ isTrue);
		
		System.out.println("str의 값 : "+ str);
	
		System.out.println();
		System.out.println("포인트와 보너스의 합 : "+ (point + bonus));
		
	}
}
