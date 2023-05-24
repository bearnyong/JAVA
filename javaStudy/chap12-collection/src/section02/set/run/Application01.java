package section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {

	public static void main(String[] args) {
		/* Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null값도 중복하지 않게 하나의 null만 저장한다.)
		 * 
		 * HashSet 클래스
		 * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나나이다.
		 * jdk1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.*/

		HashSet<String> hset = new HashSet<>();
		
		hset.add(new String("java"));
		hset.add(new String("oracle"));
		hset.add(new String("jdbc"));
		hset.add(new String("html"));
		hset.add(new String("css"));
		
		/* 저장 순서 유지 안됨 */
		System.out.println("hset : " + hset);
		
		/* java를 추가했지만 똑같이 1회만 출력됨 */
		hset.add(new String("java"));
		System.out.println("hset : " + hset);
		
		System.out.println("저장된 객체수 : " + hset.size());
		System.out.println("포함 확인 : " + hset.contains(new String("oracle")));
		
		/* 저장된 객체를 하나 꺼내는 기능이 없음
		 * 반복문을 이용한 연속처리 하는 방법
		 * 1. ToArray()배열로 바꾸고 for loop를 사용*/
		Object[] arr = hset.toArray();
//		String[] arr = (String[]) hset.toArray(); //위랑 같은 문법임
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		Iterator<String> iter = hset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		hset.clear(); /* 다 비워줌 */
		
		System.out.println("empty? : " + hset.isEmpty()); /* 원본 자료에 영향을 주는가? */
		
		
	}

}
