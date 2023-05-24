package section06.statickeyword;

public class Application01 {

	public static void main(String[] args) {
		/* staitc 키워드와 final 키워드에 대하여 알아본다.
		 * 
		 * static : 
		 * 정적 메모리 영역에 프로그램에 start될 때 할당을 하는 키워드이다.
		 * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버 (필드, 메소드)에 지정할 수 있다.
		 * 여러 인스턴스가 공유해서 사용할 목적의 공ㄱ낭이다.
		 * 하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피래야할 방식이다.
		 * 명확한 목적이 존재하지 않는 이상 static 키워드 사용을 자제하는 것이 좋다.
		 * 의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때이다.
		 * 
		 * final : 
		 * final은 종단의 의미를 가지는 키워드이다.
		 * final 키워드를 사용할 수 있는 위친ㄴ 다양한 펴니이며 의미가 약간 다르지만, 결국 변경 불가의 의미다.
		 * 1. 지역변수 : 초기화 이후 값 변경 불가능
		 * 2. 매개변수 : 호출시 전달한 인자 변경 불가능
		 * 3. 전역 변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가능
		 * 4. 클래스(static)변수 : 프로그램 start 이후 값 변경 불가
		 * 5. non-static 메소드 : 메소드 재작성(overriding)불가
		 * 6. static 메소드 : 메소드 재작성(overriding)불가
		 * 7. 클래스 : 상속 불가
		 * */
		
		/* static 키워드를 필드에서 사용하는 것을 ㅇ먼저 확인해 본다.*/
		StaticFiledTest sft1 = new StaticFiledTest();
		
		System.out.println("non-static filed : "+sft1.getNonStatiCount());
		System.out.println("static filed : "+sft1.getStaticCount());
		
		sft1.increaseNonStaiCount();
		sft1.incraseStatiCount();
		
		System.out.println("non-static filed : "+sft1.getNonStatiCount());
		System.out.println("static filed : "+sft1.getStaticCount());
		
		
		System.out.println("\n==다른 인스턴스 생성===");
		StaticFiledTest sft2 = new StaticFiledTest();
		
		System.out.println("non-static filed : "+sft2.getNonStatiCount());
		System.out.println("static filed : "+sft2.getStaticCount());
		
	}

}
