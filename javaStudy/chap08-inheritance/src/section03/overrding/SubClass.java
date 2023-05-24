package section03.overrding;

public class SubClass extends SuperClass {
	
	/* extends SuperClass를 추가해야 오버라이딩이 가능하다. */
	// 1. 메소드의 이름을 변경하면 에러 발생
	// 2. 메소드의 리턴타입을 변경하면 에러발생
	// 3. 매개변수 갯수나, 타입이 변경되면 에러 발생
	
	@Override
	public void method(int num) {}
	
//	// private 메소드는 오버라이딩이 불가능하다.
//	
//	@Override
//	public void privateMethod() {}
//	
//	// 5. final 메소드 오버라이딩 불가
//	@Override
//	public final void finalMethod() {}
//	
//	// 6. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩이 간으하다.
//	@Override
//	void protectedMethod() {}
	
	@Override
	protected void protectedMethod() {}
	
//	?@Override
//	public void protectedMethod() {}
	

}
