package section01.method;

public class Application09 {

	public static void main(String[] args) {
		// **** JVM 메모리 구조 알아놓으면 좋음!!!!
		
		/* 다른 클래스에서 작성한 메소드 호출
		 * 동일한 패키지에 calculator라는 클래스를 하나 추가하고 */
		
		int first = 100;
		int second = 50;
		
		calculator calc = new calculator();
		int min = calc.minNumberOf(first,  second);
		System.out.println("두 수 중 최소 값은 : "+min);
		
		int max = calculator.maxNumberOf(first,  second);
		System.out.println("두 수 중 최대 값은 : "+max);
		
		/* static 메소드도 non-static 메소드처럼 호출은 가능하지만 권장되지 않는다.
		 * 이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다.
		 * 그 떄 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 떄무넹
		 * 사용을 제한해 달라고 경고한다. 시스템이 복잡해질수록 이런 에러를 찾기 힘들어지기 떄문에 하지 않은 것이 좋다.*/
		
		// int max2 = calc.maxNumberOf(first,  second);
		// System.out.println("두 수 중 더 큰 값은 : "+max2);
		
		
	}

}
