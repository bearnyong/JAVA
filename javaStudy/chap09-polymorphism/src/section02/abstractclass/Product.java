package section02.abstractclass;

public abstract class Product { //abstract : 추상메서드라는 것을 명시해줘야함 
	
	private int nonStaticField;
	private static int staticFiled;
	
	public Product() {}
	
	public void nonStaticMethod() {
		System.out.println("Product 클래스의 nonstaticMethod 호출함");
	}
	
	public static void staticMethod() {
		System.out.println("Product 클래스의 staticMethod 호출함...");
	}
	
	public abstract void absMethod(); //추상메서드

}
