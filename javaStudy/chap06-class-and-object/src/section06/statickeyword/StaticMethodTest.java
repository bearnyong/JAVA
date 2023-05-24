package section06.statickeyword;

public class StaticMethodTest {
	
	private int count;
	private static int count2;
	
	public void nonStaticMethod() {
		this.count++;
		
		System.out.println("nonStaticMethod 호출됨...");
	}
	
	public static void staticMethod() {
//		this.count++;  //count라는 값이 생성되지 않았는데 증가시키려해서 오류임, 생성 시점이 달라서 오류!!
		StaticMethodTest.count2++;
		
		System.out.println("static method 호출됨...");
	}
	
	

}
