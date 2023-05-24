package section01.method;

public class Application08 {

	public static void main(String[] args) {
		/* static 메소드 호출
		 * 우리가 지금 작성하고 있는 메소드를 보면 public과 void 사이에 static이라고 하는 키워드가 있다.
		 * static 키워드에 대해서는 뒤에서 다시 다루게 될 예정이지만,
		 * static 메소드를 호출하는 방법부터 먼저 학습해본다.
		 * static이 있는 메소드이건 non-static 메소드 이건 메소드의 동작 흐름은 동일하다.
		 * */

		System.out.println("10과 20의 합 : " + Application08.sumTwoNumbers(10,20));
		//Application08의 sumTwoNumbers 메서드 (공유킥보드 느낌)
		System.out.println("10과 20의 합 : " + sumTwoNumbers(10,20));
		
		
		
		System.out.println("10과 20의 합 : " + Application07.plusTwoNumbers11(10,20));
		//(다른 파일 메서드 참조하기) Application07의 plusTwoNumbers11 메서드 가져온다. !!!??
		
	}

	public static int sumTwoNumbers(int first, int second) {
		return first+second;
		
	}
}
