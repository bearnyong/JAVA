package section01.generic;

public class Application01 {

	public static void main(String[] args) {
		
		/* 제네릭(generic) ★★★
		 * 제네릭의 사전적인 의미는 일반적인 이라는 의미이다.
		 * 자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다.
		 * 
		 * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
		 * 컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며
		 * (잘못된 타입인 경우 컴파일 에러를 발생시킴)
		 * 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다,
		 * (instanceOf 비교 및 다우내스팅 작성 불필요)
		 * 
		 * jdk1.5 버전부터 추가된 문법이다.
		 * 
		 * 제네릭 프로그래밍
		 * 데이터의 형식에 의존하지 않고 하느이 값이 여러 다른 데이터 타입을 가질 수 있는 기술에 중점을 두어
		 * 재사용성을 높일 수 있는 프로그래밍 방식이다.*/
		
		// <T>	//type의 약자 T... 데이터 형식을 일반화 시킨다. 다양한 타입 받기 가능.
		
		GenericTest<Integer> gt1 = new GenericTest<Integer>();
		
		gt1.setValue(new Integer(20));
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue() instanceof Integer);
		gt1.typeMethod();
		
		/* 타입을 String으로 인스턴스를 생성하는 경우*/
		System.out.println();
		GenericTest<String> gt2 = new GenericTest<String>();
		
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
		System.out.println(gt2.getValue() instanceof String);
		gt2.typeMethod();
		
		/* jdk7부터 타입선언 시 타입변수가 작성되면 타입 추론이 가능하기 때문에
		 * 생성자쪽의 타입을 생략하고 사용할 수 있게 되었따.
		 * 단, 타입이 명시되지 않은 빈 다이아몬드 연산자는 사용해야 한다.
		 * */
		
		GenericTest<Double> gt3 = new GenericTest<>();
		
		gt3.setValue(0.5);
		System.out.println(gt3.getValue());
		System.out.println(gt3.getValue() instanceof Double);
		gt3.typeMethod();
		
		/* 사용된 제네릭은 컴파일 시점 타입 변환이 된 후에 사라지게 된다.
		 * 컴파일이 완료된 코드에는 제네릭코드가 제거되어 있는데
		 * 제네릭 이전에 작성된 코드와 하위호환성을 위해서이다.*/
	}

}
