package section3.stingbuilder;

public class Application02 {

	public static void main(String[] args) {

		/* StirngBuilder의 자주 사용되는 메소드*/
		StringBuilder sb1 = new StringBuilder();
		
		/* capcity() : 용량(현재 버퍼의 크기)을 정수형으로 반환하는 메소드(문자열 길이 +16기본용량)*/
		System.out.println(sb1.capacity());
		
		/* append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
		 * 기본 용량을 초과하는 경우 (기존 문자열 +1) *2를 하여 용량을 확장시킨다.*/
		String a = "";
		for(int i=0; i<50; i++) {
			sb1.append(i);
			a = i+"";
			System.out.println("sb1 : " + sb1);
			System.out.println("capacity : " + sb1.capacity());
			System.out.println("hashCode : " + sb1.hashCode());
			System.out.println();
			System.out.println("a : " + a);
			System.out.println("a의 hashCode : " + a.hashCode() + "\n");
			
		}
		
		

	}

}
