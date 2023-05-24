package section2.string;

public class Application02 {

	public static void main(String[] args) {
		
		// ★★★★★★★★★★★★★★★★★★★★★★★★★ 짱 중요!!
		
		/* 문자열 객체를 만드는 방법
		 * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (Stingleton)
		 * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
		 * */
		
		// ★★★★★★★★★★★★★★★★★★★★★★★★★ 짱 중요!! 차이 알기!!
		String str1 = "java";	//JVM 안의 String Pool 안에 생성됨.
		String str2 = "java";	//str1==str2 : 같은 주소값
		String str3 = new String("java");	//heap 영역 안에 !! 인스턴스 생성하여 주소값을 갖게됨
		String str4 = new String("java");
		
		/*리터럴 형태로 만든 문자열 인스턴스는 동일한 값을 가지는 인스턴스는 하나의 인스턴스로 관리한다.
		 * 따라서 주소값을 비교하는 == 연산으로 비교시 서로 동일한 stack에 저장된 주소를 비교하여 true를 반환한다.*/
		System.out.println("str1 == str2 : " + (str1==str2)); // == : 주소값을 비교하는 것임!!
		
		/* new로 새로운 인스턴스를 생성하게 되면 기존 인스턴스를 두고 새로운 인스턴스를 할당했기 때문에
		 * == 연산으로 비교 시 서로 다른 주소값을 가지고 있기 떄문에 false를 반환한다.*/
		System.out.println("str1 == str3 : " + (str1==str3));
		
		/* 동일한 방식으로 인스턴스를 생성하고 값 또한 같더라도
		 * 새로운 인스턴스를 생성하는 방식은 서로 다른 주소를 가지고 있기 떄무에 false를 반환한다.*/
		System.out.println("str3 == str4 : " + (str3==str4));
		
		/* 하지만 4개의 문자열 모두 동일한 hashcode 값을 가진다.
		 * 동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어있기 떄문이다*/
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		System.out.println("str4의 hashCode : " + str4.hashCode());
		
		/* 문자열은 불변이라는 특징을 가진다.
		 * 기존 문자열에 +연산을 수행하는 경우 문자열을 수정하는 것이 아닌 새로운 문자열을 할당하게 된다.*/
		str2 += "oracle";
		
		/* str1과 str2는 동일한 인스턴스였으나 수정 후에는 다른 인스턴스가 된다.*/
		System.out.println("str1 == str2 : " + (str1==str2));
		
		/* equals() : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌 문자열 값을 비교하여
		 * 동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록 Object의 equals()메소드를
		 * 재정의 해두었다.
		 * 따라서 무자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인지를 비교하기 위해 == 연산대신 equals()메소드를 사용해야 한다.*/
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		/* 참고로 new java.utkl.Scanner(System.in).nextLine();을 이용하여 문자열을 입력받는 경우
		 * subString 으로 잘라내기 해서 새로운 문자열 생성 후 반환하기 떄무넹 
		 * new String()으로 인스턴스를 생성한것과 동일한 것으로 볼 수 있따.
		 * 따라서 Scanner로 입력받은 문자열을 비교할 떄는 equals()를 써야 한다.
		 * 구분하기 힘들면 그냥 문자열은 다 equals()로 비교하는 것이 가장 좋은 방법이다.
		 * 
		 * 서로 다른 인스턴스이지만 동일한 문자열 값을 가지는 문자열 인스턴스는 동일한 해쉬코드 값을 가진다는 것을 기억한다.
		 * 나중에 컬렉션에서 사용하게 된다.*/ 
		
	}

}
