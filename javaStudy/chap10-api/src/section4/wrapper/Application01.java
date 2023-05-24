package section4.wrapper;

public class Application01 {

	public static void main(String[] args) {
		
		/* Wrapper클래스
		 * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
		 * 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
		 * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스(wapper class)라고 한다.
		 * (주방에서 사용하는 랩(wrap)과 같은 의미로 감싼다는 의미이다.*/

		/* 기본타입	래퍼클래스
		 * byte		Byte
		 * short	Short
		 * int		Integer
		 * long		Long
		 * flat		Float
		 * double	Double
		 * char		Character
		 * boolean	Boolean*/
		
		/* 박싱(Boxing)과 언박싱(UnBoxing)
		 * 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
		 * 래퍼클래스 타입의 인시턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.*/
		
		int intValue = 20;
		Integer boxingNumber1 = new Integer(intValue);
		Integer boxingNumber2 = Integer.valueOf(intValue);
		
		int unboxingNumber1 = boxingNumber1.intValue();
		
		Integer a = null;
		// int b = null;
		
		/* 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
		 * jdk1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
		 * 이런 자동화된 박싱과 언박싱을 오토방식, 오토 언박싱이라고 부른다.
		 * */
		
		Integer BoxingNumber3 = intValue;
		int unBoxingNumber2 = BoxingNumber3;
		
		//wrapper 클래스 값 비교
		int inum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		
		/* 기본 타입과 래퍼클래스 타입은 ==연산으로 비교 가능하다.*/
		System.out.println("int와 Interger 비교 : " + (inum == integerNum1));
		System.out.println("int와 Interger 비교 : " + (inum == integerNum3));
		
		//생성자를 이용해 생성한 인스턴스의 경우 == 비교하지 못한다.
		// 단 오토 박싱을 이요해서 생성한 값은 ==로 비교 가능하다.
		System.out.println("integer와 interger 비교 : " + (integerNum1.equals(integerNum2)));
		System.out.println("integer와 interger 비교 : " + (integerNum1.equals(integerNum3)));
		System.out.println("integer와 interger 비교 : " + (integerNum3.equals(integerNum4)));
		
	}

}
