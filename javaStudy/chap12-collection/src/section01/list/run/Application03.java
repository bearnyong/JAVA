package section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application03 {

	public static void main(String[] args) {
		
		/* ★★★ 자료구조 잘 선택하기 ★★★*/
		/* LinkedList
		 * ArrayList 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안되었따.
		 * 내부는 이중 연결리스트로 구현되어 있다.
		 * 
		 * 단일 연결 리스트
		 * 	 : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소들 사이를 링크로 연결하며 구성하며
		 *   마치 연결된 리스트 형태인 것 처럼 만든 자료구조이다.
		 *   요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하면 되기 때문에
		 *   요소의 저장과 삭제가 빈번히 일어나는 경우 ArrayList보다 성능면에서 우수하다.
		 *  
		 * 하지만 단일 연결 리스트느느 다음 요소만 링크하기 떄문에 이전 요소로 접근하기가 어렵다.
		 * 이를 보완하고자 만든 것이 이중 연결 리스트 이다.
		 *  
		 * 이중 연결 리스트
		 *   : 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하며
		 *   이전 요소로 접근하기 쉽게 고안된 자료구조이다.
		 *   
		 *   LinkedList는 이중 연결 리스트를 구현한 거싱며 역시 List 인터페이스를 상속받아서 ArrayList와 사용하는 방법이 거의 유사하다
		 *   
		 *   하지만 내부적으로 요소를 저장하는 방법에 차이가 있는 것이다.
		 *   각 컬렉션 프레임워크 클래스들의 특징으 ㄹ파악하고 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는 것이다 좋다.*/

		List<String> linkedList = new LinkedList<>();
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("orange");
		linkedList.add("mango");
		linkedList.add("grape");
		
		System.out.println(linkedList.size());
		
		/* for문과 size()를 이용해서 반복문을 활용할 수도 있따.
		 * 요소를 꺼내올떄는 get을 사용하며ㅡ 인자로 전달하는 정수는 인덱스처럼 사용하면 된다.*/
		
		for(int i=0; i<linkedList.size(); i++) {
			System.out.println(i + " : " + linkedList.get(i));
		}
		
		linkedList.remove(1);
		
		for(String s : linkedList) {
			System.out.println(s);
		}
		
		/* set() 메소드를 이용해서 요소를 수정할 수 있다*/
		linkedList.set(0,  "fineapple");
		
		/* toString() 메소드가 오버라이딩 되어 있어서 모든 요소를 볼 수 있따.*/
		System.out.println(linkedList);
		
		/* isEmpty() 메소드를 이용해서 list가 비어있는지 확인 할 수 있다.*/
		System.out.println(linkedList.isEmpty());
		
		/* 리스트 내 요소를 모두 제거하는 clear() 메소드를 이용할 수 있다.*/
		linkedList.clear();
		System.out.println(linkedList.isEmpty());
		
	}

}
