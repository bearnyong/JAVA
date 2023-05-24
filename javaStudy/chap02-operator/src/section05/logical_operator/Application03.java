package section05.logical_operator;

public class Application03 {

	public static void main(String[] args) {
		/* And 연산과 or 연산의 특징
		 * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행하지 않음
		 * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행하지 않음
		 * */
		
		/* 1. 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행하지 않음
		 * 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리false가 나오게 되면
		 * 뒤의 조건을 확인할 필요 없이 false를 반환하다.
		 * 따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 것이 좋다.*/
		
		int num1 =10;
		int num2 =9;
		/* 앞에 조건이 false로 강제화 해 두고 && 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건시그로 만들어 놓았다.
		 * num1 선치 증가 코드가 등장했다면 result1 은 11일 것이고, 동작하지 않았다면 결과는 10일 것디아.*/
		
		int result1 = (false && ++num1>0) ? num1: num2;
		// ? num1: num2; 앞의 논리식이 참일 경우 왼쪽 값(num1)을, 거짓일 경우 오른쪽 값(num2)
		
		System.out.println("&&실행확인 : " +result1);
		
		
		/* 2. 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행하지 않음
		 * 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
		 * 뒤의 조건을 확인할 필요 없이 true를 반환한다.
		 * 따라서 연산 횟수를 줄이기 위해서는 || 연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
		 * */
		
		int num3=10;
		int num4=9;
		
		/* 앞에 조건을 true로 강제화 해 두고 || 뒤의 조건을 선치 증가로 값을 중가시킨 후 별 의미 없는 조건시긍로 만들어 놓당.
		 * num3 선치 증가 코드가 등장했다면 result2값은 11이 될 것이고, 동작하지 않았다면 10일 것이다.
		 * */
		
		int result = (false || num3++ == 10) ? num3:num4;
		int result2 = (false || ++num3 == 10) ? num3:num4;
		
		System.out.println("||실행확인 : " +result);
		System.out.println("||실행확인 : " +result2);
		
		

	}

}
