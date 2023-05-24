package section01.literal;

public class Application3 {

	public static void main(String[] args) {
		
		/* 문자열 합치기 테스트
		 * 문자열 합치기 결과를 미리 예측하며 코드를 작성해보자*/
		System.out.println(9+9); // 18
		System.out.println("9"+9);// 99
		System.out.println(9+"9"); // 99
		System.out.println("9"+"9"); //99
		 
		/* 세 개의 문자열 합치기 */
		System.out.println("9"+9+9); //999
		System.out.println(9+"9"+9); //999
		
		/* 대괄호 기호를 이용해서 숫자 연산을 묶어주게 되면 괄호 안에 있는 연산이 우선적으로 수행된다. */
		System.out.println("9"+(9+9));//918
		
	}

}
