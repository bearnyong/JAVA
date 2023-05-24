package section03.interfaceimplements;

public interface InterProduct {
	
	// 인터페이스 : 추상클래스들의 모임
	
	/* 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 인용하며
	 * 이 떄 여러 인터페이스를 다중 상속 받을 수 있따.*/
	
	/* 인터페이스는 상수 필드만 작성 간으하다.
	 * public static final 제어자 조합을 상수 필드라고 부른다.
	 * 반드시 선언과 동시에 초기화 해줘야 한다.*/
	
	public static final int MAX_NUM = 100;
	
	// 상수 필드만을 가질 수 있기 떄문에 모든 필드는 묵시적으로 public static final이다.
	int MIN_NUM = 10;
	
	/* 인터페이스는 생성자를 가질 수 없다. */
//	public InterProduct() {}
	
	/* 인터페이스는 구현부({})가 있는 non-static 메소드를 가질 수 없다.*/
//	public void nonStaticMethod() {}
	
	public abstract void nonStaticMethod();
	void abstMethod();
	/* 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다.(다른 접근제한자 사용 불가)
	 * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우 반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다.*/
	
	/* 하지만 static 메소드는 작성이 가능하다 (jdk1.8 추가된 기능)*/
	public static void StaticMethod() {
		System.out.println("InterProduct 클래스이 staticMethod 호출됨..");
	}
	
	/* 또한 default 키워드를 사용하면 non-static 메소드도 작성 가능하다.(jdk1.8 추가된 기능)*/
	public default void defaultMethod() {
		System.out.println("InterProduct 클래스의 defaultMethod 호출됨");
	}
	
}

