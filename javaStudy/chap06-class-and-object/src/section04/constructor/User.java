package section04.constructor;

import java.util.Date;

public class User {
	
	private String id;
	private String pwd;
	private String name;
	
	private java.util.Date enrollDate;
	
	/* 생성자의 작성 위치
	 * 작성 위치는 문법으로는 클래스 내부에 작성하면 되지만.
	 * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 간례이다.
	 * 
	 * 생성자의 사용 목적
	 * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 상요한다.
	 * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값을 필드로 초기화하여 인스턴스를 생성할 목적으로 주로 사용된다.
	 * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않은다는 의미를 가진다.
	 * 따라서 인스턴스를 생성하느 ㄴ방법을 제한하기 위한 용도로 사용할 수도 있따.(초기값 전달 강제화)
	 * 
	 * 생성자 작성 방법
	 * [표현식]
	 * 	접근제한자 클래스명(매개변수{
	 * 	인스턴스 생성 시점에 수행할 명령 기술(주로 필드를 초기화)
	 * 	this.필드명 = 매개변수; //설정자(Setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
	 * }
	 * 
	 * 생성자 작성 방법은 메소드를 작성하는 방법과 매우 유사하다. 하지만 두 가지 사항을 조심해야 한다
	 * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다( 대.소문자까지 같아야 함)
	 * 2. 생성자 메소드는 반환형을 작성하지 않느다.(작성하는 경우 생성자가 아닌 메소드로 인식한다.)
	 * 
	 * 기본 생성자(매개변수 없는 생성자) 와 매개변수 있는 생성자
	 * 기본 생성자는 자바 Compiler가 자동으로 추가해주느 ㄴ구문이지만 명시적으로 작성할 수도 있다.
	 * 매개변수 있는 생성자가 한 개라도 존재하는 경우 기본생성자르 ㄹ자동으로 추가해주지 않기 때문이다.
	 * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.*/
	
	public User() {
		System.out.println("기본생성자");
	}
	
	public User(String id, String pwd, String name) {
		/* 분명 동일한 이름의 생성자는 작성하지 못한다고 했는데 작성이 가능하다.
		 * 매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 동일한 생성자 혹승 ㄴ메소드를
		 * 한 클래스 내에 여러개 작성할 수 있게 만든 기술이다.(오버로딩) */
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
	}
	
	public User(String id, String pwd, String name, Date enrollDate) {
		/* id, pwd, name를 초기화하는 기능을 가진 생성자를 바로 위에서 작성했다.
		 * 따라서 중복되는 초기화 내용이 발생하게 되는데, 이 중복되는 초기화 내용을 줄여서 작성할 수 있다.
		 * this() 메소드를 이용하는 것이다.
		 * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다...
		 * 괄호 안에 매개변수의 타입, 갯수 순서에 맞는생성자를 호출하고 복귀한다.(메소드와 동일함)
		 * 리턴되어 돌아오지만 리턴값은 존재하지 않는다.
		 * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우 compilerErro가 발생한다.*/
		
		this(id, pwd, name);
		this.enrollDate = enrollDate;
		
		System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함..");
		
	}
	
	/* 복사 생성자
	 * 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서 새로운 인스턴스 생성 시 초기화값으로 이요할 수 있따.
	 * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 떄문에 서로 다른 주소값을 가지게 된다. (깊은 복사)
	 * */
	
	public User(User otherUser) {
		this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
		System.out.println("User 클래스의 복사생성자 호출함...");
		
		System.out.println("this의 hashcode : "+this.hashCode());
		System.out.println("otherUser hashcode : "+otherUser.hashCode());
	}
	
	
	public String getInformation() {
		return "User [id="+this.id+", pwd="+this.pwd+", name="+this.name+
				", enrollDate="+this.enrollDate+"]";
	}
	
	
	
	
	
}
