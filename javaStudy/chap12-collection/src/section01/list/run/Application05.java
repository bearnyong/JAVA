package section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application05 {

	public static void main(String[] args) {
		
		/* Queue
		 * Queue는 선형 메모리 공간에 데이터를 저장하는 
		 * 선입선출(FIFO = First Input First Out) 방식의 자료구조이다.
		 * Queue 인터페이스를 상속받는 하위 인터페이스들은
		 * Deque, bolckingQueue, BlockingDeque, TransferQueue등 다양하지만
		 * 대부분의 큐는 LinkedList를 이용한다.*/

		/* Queue 자체로는 인터페이스이기 떄문에 인스턴스 생성이 불가능하다.*/
//		Queue<String> que = new Queue<>();
		Queue<String> que1 = new LinkedList<>();
		
		/* 큐에 데이터를 넣을 때는 offer()를 이용한다.*/
		que1.offer("first");
		que1.offer("second");
		que1.offer("thrid");
		que1.offer("fourth");
		que1.offer("fifth");
		System.out.println(que1);
		
		/* 큐에서 데이터를 꺼낼 떄는 2가지가 있다.
		 * peek() : 해당 큐의 가장 앞에 있는 요소(먼저 들어온 요소)를 반환한다.
		 * poll() : 해당 큐의 가장 앞에 있는 요소 (먼저 들어온 요소)를 반환하고 제거한다.*/
		
		System.out.println();
		
		System.out.println("peek() : " + que1.peek());
		System.out.println("peek() : " + que1.peek());
		System.out.println("peek() : " + que1.peek());
		System.out.println(que1);
		
		System.out.println();
		
		System.out.println("poll() : " + que1.poll());
		System.out.println("poll() : " + que1.poll());
		System.out.println("poll() : " + que1.poll());
		System.out.println(que1);
		
	}

}
