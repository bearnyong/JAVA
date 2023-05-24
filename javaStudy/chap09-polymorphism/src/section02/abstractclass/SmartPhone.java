package section02.abstractclass;

public class SmartPhone extends Product{
	
	/* smartPhone 클래스는 Product 클래스를 상속받아서 구현한다.
	 * extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속하지 못한다.(모호성 제거)
	 * 추상클래스가 가지는 추상 메소드를 반드시 오버라이딩 해야 하낟. (강제성 부여)*/

	public SmartPhone() {
		
	}
	
	@Override
	public  void absMethod() {
		System.out.println("Product 클래스의 abstMethod를 오버라이딩 한 메소드 호출함...");
	}
	
	public void printSmartPhone() {
		System.out.println("Smart Phone 클래스의 printPhone 메소드 호출함...");
	}
}
