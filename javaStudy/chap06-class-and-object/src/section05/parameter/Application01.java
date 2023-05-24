package section05.parameter;

public class Application01 {

	public static void main(String[] args) {
		// ★★★ 얕은 복사 개념, 가변인자 개념, 클래스를 인자로 전달 가능★★★
		
		/* 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하며 호출할 수 있따.
		 * 
		 * 매개변수(parameter)로 사용 가능한 자료형
		 * 1. 기본자료형
		 * 2. 기본자료형 배열
		 * 3. 클래스자료형
		 * 4. 클래스자료형 배열
		 * 5. 가변인자*/
		
		ParameterTest pt = new ParameterTest();
		
		/* 1. 기본 자료형을 매개변수로 전달 받는 메소드 호출 확인
		 * 기본 자료형 8가지 모두 가능하다.
		 * */

		int num = 20;
		pt.testPrimaryTypeParameter(num);
		
		/* 기본 자료형은 인자로 전달하는 값과 매개변수로 전달하는 값과 자료형이 동일하다.*/
		
		/* 2. 기본 자료형 배열을 매개변수로 전달 받는 메소드 호출 확인*/
		int[] iarr = new int[] {1,2,3,4,5};
		System.out.println("인자로 전달하는 값 : "+iarr);
		pt.testPrimaryTypeArrayParameter(iarr);
		
		System.out.print("변경 후 원본 배열의 값 출력 : ");
		for(int x : iarr) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
		/* 3. 클래스 자료형*/
		RectAngle r1 = new RectAngle(12.5, 22.5);
		System.out.println("인자로 전달하는 값 : "+r1);
		pt.testClassTypeParameter(r1);
		
		System.out.println("변경 후 사각형의 넓이와 둘레 =======");
		r1.calcArea();
		r1.calcRound();
		
		/* 4. 클래스 자료형 배열은 뒤에서 클래스 자료형 배열을 다룰 떄 사용한다.*/
		
		/* 5. 가변인자
		 * 인자로 전달하는 값의 갯수가 정해지지 않는 경우 가변배열을 활용할 수 있따.*/
		
//		pt.testVariableLengthArrayParameter();
		pt.testVariableLengthArrayParameter("홍길동");
		pt.testVariableLengthArrayParameter("유관순", "볼링");
		pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");
		pt.testVariableLengthArrayParameter("신사임당", new String[] {"테니스","서예","떡썰기"});
		
		/* 가변인자는 메소드 오버라이딩 시 유의해야 할 점이 있따.
		 * 가변배열은 런타임 시점에 배열의 크기를 지정하게 되는데 가변배열을 오버라이딩 하게 되면
		 * 해당 배열의 메모리 공간을 다른 형식의 데이터로 덮어쓰는 것을 말하며 가변 배열은 고정된 크기의 배열과 달리
		 * 메모리 공간이 동적으로 할당되기 때문에, 배열의 크기가 변경되는 경우 메모리의 공간의 위치가 변경된다.
		 * 
		 * 따라서 가변 배열을 오버라이딩 하는 것은 메모리 공간의 위치기 변경되는 것으로 인해 예상하지 못한
		 * 동작이 발생될 수 있으며 이러한 이유로 가변 배열을 오버라이딩 하는 것은 권장되지 않는다.
		 * */
		
	}

}
