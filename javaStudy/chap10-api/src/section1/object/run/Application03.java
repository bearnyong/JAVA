package section1.object.run;

import java.util.HashMap;
import java.util.Map;

import section1.object.book.Book;

public class Application03 {

	public static void main(String[] args) {
		/* Object 클래스의 명세에 작성되는 일반 규약에 따르면
		 * equals() 메소드를 재정의 하는 경우 반드시 hashcode() 메소드도 재정의 하도록 되어있다.
		 * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는 
		 * 같은 해시코드값을 가져야 한다는 규약에 위반되게 된다(강제성은 없지만 규약대로 작성하는 것이 좋음)*/

		Book book1 = new Book(1, "홍길동전", "허균", 50000);
		Book book2 = new Book(1, "홍길동전", "허균", 50000);
		
		System.out.println("book1의 hashcode : " + book1.hashCode());
		System.out.println("book2의 hashcode : " + book2.hashCode());
		/* 동일한 필드값을 가지는 동등객체를 인스턴스를 구분하는 hashcode가 같은 통일객체로 취급하기 위해서는
		 * hashcode 메소드를 재정의하여 동일한 필드값을 가지는 경우 동일한 hashcode를 반환하며
		 * 동일객체로 취급해야 하는 경우가 종종 존재한다.
		 * */
		
		/* key와 value를 쌍으로 저장하는 자료구조인 hashMap에 key로 홍길동전 정보를 가지는 book 타입의 인스턴스를 사용해본다.
		 * HashMap에서 홍길동전 정보를 가지는 인스턴스로 값을 꺼내오려 할 떄
		 * hashcode가 재정의되어 동일한 필드인 경우 동일한 hashcode가 반환되도록 작성되어 있지 않다면
		 * 예상한 결과값과 다르게 null을 반환받는다.*/
		
		Map<Book, String> map = new HashMap<>();
		map.put(new Book(1, "홍길동전", "허균", 50000), "selled");
		
		String str = map.get(new Book(1, "홍길동전", "허균", 50000));
		
		System.out.println(str);
	}

}
