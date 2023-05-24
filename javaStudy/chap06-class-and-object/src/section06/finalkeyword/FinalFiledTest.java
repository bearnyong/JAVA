package section06.finalkeyword;

public class FinalFiledTest {
	
	/* non-static fied에 final 사용
	 * 
	 * final은 변경 불가의 의미를 가진다
	 * 따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가게 되는데
	 * 그 초기화를 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해주어야 한다.
	 * 그렇지 않으면 compile error가 발생한다.*/
	
//	private final int nonStaticnum;
	
	/* 이를 해결할 수 있는 방법은 2가지가 있다.
	 * 1. 선언과 동시에 초기화 한다.*/
	private final int NON_STATIC_NUM = 1;
	
	//2. 생성자를 이용해서 초기화 한다.
	private final String NON_STATIC_NAME;
	
	public FinalFiledTest(String nonStaticName) {
		this.NON_STATIC_NAME = nonStaticName;
	}
	
	
	/* static filed에 사용
	 * static에도 자바에서 지정한 기본값이 초기에 대입되기 떄문에
	 * final 키워드를 사용 시 초기화를 하지 않으면 에러가 발생한다.*/
	
	private static final int STATIC_NUM;
	private static final int STATIC_NUM=1;
	
	/* 생성자를 이용한 초기화는 불가능한다.
	 * 생성자는 인스턴스가 생성되는 시점에 호출이 되기 때문에 그 전에는 초기화가 일어나지 못한다.
	 * 하지만 static은 프로그램 start될 때 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
	 * 기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다*/

	private static final double STATIC_DOUBLE;
	
	// 생성자로 초기화 불가능 테스트
	public FinalFiledTest(double staticDouble) {
		FianlFildTest.STATIC_DOUBLE = staticDouble;
	}
	
	/* 초기화 블럭 사용하기 */
	static {
		STATIC_DOUBLE = 0.5;
	}
	
	
}
