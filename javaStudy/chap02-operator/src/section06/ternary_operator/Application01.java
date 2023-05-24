package section06.ternary_operator;

public class Application01 {

	public static void main(String[] args) {
		
		/* 삼항 연산자
		 * 자바에서 ㅣ유일하게 피연산자 항목이 3개인 연산자이다.
		 * 항목이 3개임 : (조건식)? 참 : 거짓
		 * 조건식이 참이면 왼쪽의 결과가 거짓이면 오른쪽의 결과가 나옴
		 * 조건식의 결과는 반드시 boolean type의 true 혹은 false가 나오도록 작성행야 한다.
		 * 비교 논리 연산자가 주로 사용됨
		 * */
		
		int num1 =10;
		int num2=-10;
		String result1 = (num1>0)? "양수이다." : "양수가 아니다.";
		String result2 = (num2>0)? "양수이다." : "양수가 아니다.";
		
		System.out.println("num1은 : " + result1);
		System.out.println("num1은 : " + result2);
		
		
		// 중첩 사용도 가능하다.
		// ** 하지만 권장 x
		int num3 = 5;
		int num4 = 0;
		int num5 =-5;
		
		String result3 = (num3>0) ? "양수다." : (num3 == 0) ? "0이다." : "음수이다.";
		String result4 = (num4>0) ? "양수다." : (num4 == 0) ? "0이다." : "음수이다.";
		String result5 = (num5>0) ? "양수다." : (num5 == 0) ? "0이다." : "음수이다.";
		
		System.out.println("num3은 : " + result3);
		System.out.println("num4은 : " + result4);
		System.out.println("num5은 : " + result5);
		
	}

}
