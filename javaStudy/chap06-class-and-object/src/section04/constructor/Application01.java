package section04.constructor;

public class Application01 {

	public static void main(String[] args) {
		
		/* 지금까지 우리가 객체를 생성했던 코드를 다시 한 번 살펴 볼 것이다.
		 * 클래스명 레퍼런스 변수 = new 클래스명(); // 객체를 생성하였다.
		 * 하지만 new 뒤에 클래스명은 생성자(constructor)라 불리는 메소드를 호출하는 구문이다.
		 * 정확히 말하자면 클래스명 레퍼런스 변수 = new 생성자(); 라고 표현한다.
		 * */
		
		/* 생성자란?
		 * 인스턴스를 생성할 떄 초기 수행할 명령이 있는 경우, 미리 작성해두고, 신스턴스를 생성할 때 호출된다.
		 * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
		 * 기본 생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
		 * (즉, 인스턴스 생성 시 별도로 수행할 명령이 없ㄷ었기 떄문에 아무것도 작성하지 않은 것이다..)
		 * 
		 * 이렇게 기본생성자를 이용해 인스턴스를 생성하게 되면 자바에서는 자료형별 초기값을 이용해 필드를 초기화 한다.
		 * 필드의 초기값을 사용자가 원하는 대로 설정하고 싶은 경우 생성자의 호출 시 인자로 값을 전달하려 호출할 수 있다.
		 * 이러한 인자를 받아 필드를 초기화 할 목적의 생성자를 매개변수 있는 생성자라고 한다.
		 * 하지만 매개변수 있는 생성자가 한개라도 존재하는 경우 Compiler는 기본생성자를 자동으로 추가해주지 않는다.
		 * 사용시 주의해야 한다.
		 * 매개변수있는 생성자는 주로 인스턴스 생성 시점에 필드의 값을 사용자가 원하는대로 초기화 할 목적으로 사용한다.
		 * 
		 * */
		
		User user1 = new User("123", "124", "고민영");
		System.out.println(user1.getInformation()+"\n");
		
		User user2 = new User("user02", "pass02", "홍길동");
		System.out.println(user2.getInformation()+"\n");
		
		User user3 = new User("user03", "pass03", "이순신", new java.util.Date());
		System.out.println(user3.getInformation()+"\n");
		
		User user4 = new User(user3);
		System.out.println(user4.getInformation()+"\n");
		
		/* 인스턴스를 생성할 수 있는 다양한 방법을 제공하며, 제공되는 생성자 외에는 인스턴스를 생서ㅇ하는 방법을 제한한다.
		 * 또한 여러 개의 setter 메소드를 호출한 것과 같은 효과를 가질 수 있다.(한번의 여러 개 필드 초기화)
		 * 생성자를 이용한 초기화와 setter를 이용한 초기화 모두 장.단점을 가지고 있다.
		 * dto 패키지를 추가해서 dto 클래스르 하나 생성하며 두 가지 방법을 비교해 본다.*/
		
		
	}

}
