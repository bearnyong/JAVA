package section3.stingbuilder;

public class Application01 {

	public static void main(String[] args) {

		/* StingBuilder와 StringBuffer
		 * 
		 * 두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
		 * 
		 * STringBuilder :
		 * 스레드 동기화 기능 제공하지 않음
		 * 스레드 동기화처리를 고려하지 않은 상황에서 StringBuffer보다 성능이 좋음
		 * StingBuffer :
		 * 스레드 동기화 기능 제공함
		 * 성능면에서는 StringBuilder보다 느림
		 * 
		 * 두 개의 차이는 스레드 동기화 유무이고, 현재 우리는 스레드를 고려하지 않기 때문에 StringBuilder를 이용할 것이다.
		 * 
		 * <STring과 StringBuilder>
		 * 
		 * String :
		 * 불변이라는 특성을 가지고 있다
		 * 문자열에 +연산으로 합치기 하는 경우, 기존 인스턴스를 수정하는 것이 아닌 새로운 인스턴스를 반환한다.
		 * 따라서 문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않다.
		 * 
		 * StringBuilder:
		 * 가변이라는 특성을 가지고 있다.
		 * 문자열에 append()메소드를 이용하여 합치기 하는 경우
		 * 기존 인스턴스를 수정하기 떄문에 새로운 인스턴스를 생성하지 않는다.
		 * 따라서 잦은 문자열 변경이 일어나는 경우 String보다 성능이 좋다
		 * 
		 * 단, jdk1.5 버전에서는 문자열의 +연산이 stringBuilder의 append()로 컴파일 된다.
		 * 따라서 성능에 큰 차이를 보이지 않는다.
		 * 하지만 반복문에서 문자열의 +연산을 수행하는 경우 StringBuilder 인스턴스를
		 * 반복 루프 시 마다 생성하기 때문에 성능에는 좋지 않은 영향을 준다.
		 * 
		 * <역컴파일 결과 예시>
		 * 
		 * (원본코드)
		 * ---------------------------
		 * String str1 = "java";
		 * String str2 = "Oracle";
		 * 
		 * String str3 = str1 + str2;
		 * String str4 = 
		 * 
		 * 
		 * (jdk1.4 이하)
		 * ---------------------------
		 * string str1 = "java";
		 * String str2 = "Oracle";
		 * 
		 * String str3 = str1 + str2;
		 * String str4 = "";
		 * 
		 * for(int i=0; i<10; i++){
		 * 	str4 = str4+str1;
		 * }
		 * 
		 * 
		 * jdk1.5이상
		 * ---------------------------
		 * string str1 = "java";
		 * String str2 = "Oracle";
		 * 
		 * String str3 = str1 + str2;
		 * String str4 = "";
		 * 
		 * for(int i=0; i<10; i++){
		 * 	str4 = new StringBfuilder(str4).append(str1).toString();
		 * }
		 * 
		 * */
		
		StringBuilder sb = new StringBuilder("java");
		System.out.println("sb : " + sb);
		
		/* hashCode는 오버라이딩 되어 있지 않다.
		 * 즉 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는 것이 아닌
		 * 인스턴스가 동일해야 같은 해쉬코드를 반환한다.*/
		
		System.out.println("sb의 hashCode : " + sb.hashCode());
		
		sb.append("oracle");
		
		System.out.println("sb : " + sb);
		System.out.println("sb의 hashCode : " + sb.hashCode());
				

	}

}
