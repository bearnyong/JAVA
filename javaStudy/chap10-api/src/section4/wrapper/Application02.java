package section4.wrapper;

public class Application02 {

	public static void main(String[] args) {
		
		/* parsing : 문자열(String) 값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다.*/
		String a = "1";
		byte b = Byte.parseByte("1");
		short s = Short.parseShort(a);
		int i = Integer.parseInt(a); /*★★★*/
		long l = Long.parseLong(a);
		float f = Float.parseFloat(a);
		double d =Double.parseDouble(a);
		boolean bl = Boolean.parseBoolean("true");
		
		char c = "abc".charAt(0);
		System.out.println(c);
		
		
	}

}
