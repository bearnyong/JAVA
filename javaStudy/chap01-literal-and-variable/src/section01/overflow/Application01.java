package section01.overflow;

public class Application01 {

	public static void main(String[] args) {
		
		/* 오버플로우
		 * 자료형 별 값의 최대 범위를 벗어나는 경우 
		 * 발생한 carry(올림자리)를 버림처리하고 sign bit를 반전시켜 최솟값으로 순환시킴*/ 
		byte num1 = 127;
		System.out.println("num1 : " + num1);
		num1++;
		System.out.println("num1 : " + num1);
		
		
		/* 언더 플로우 */ 
		byte num2 = -128;
		System.out.println("num2 : "+ num2);
		System.out.println("num2 : " + (--num2));
		
		int firstNum = 1_000_000;
		int secondNum = 700_000;
		
		int multi = firstNum * secondNum;
		
		System.out.println("firstNum * secondNum = " + multi);
		
		long longMulti = firstNum* secondNum;
		System.out.println("longMulti1 : " + longMulti);
		

		long longMulti2 = (long)firstNum* secondNum;
		System.out.println("longMulti2 : " + longMulti2);
		
	}

}
