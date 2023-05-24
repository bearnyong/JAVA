package section01.user_type;

public class Application {

	public static void main(String[] args) {
		/* 지금까지는 자바에서 제공되는 자료들을 취급하는 자료형에 대해 학습햇다.
		 * 이제 조금 더 복잡한 자료를 취급할 수 있는 방법을 생각해보자
		 * 회원 정보를 관리하기 위해 여러 정보 (아이디, 비밀번호,  이름, 나이, 성별, 취미)를 취급하여 관리하려고 한다.
		 * 지금까지배운 내용들을 가지고 한 번 값을 저장하고 출력해보자*/
		
		/* 회원의 정보를 관리하고자 하며 갑은 아래와 같다.
		 * 1. 아이디
		 * 2. 비밀번호
		 * 3. 이름
		 * 4. 나이
		 * 5. 성별
		 * 6. 취미*/

		/* 데이터 필드 정리 */
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		String[] hobby = {"축구", "볼링", "테니스"};
		
		System.out.println("id : "+ id);
		System.out.println("pwd : " +pwd);
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("gender : "+gender);
		System.out.print("hobby : ");
		for(String ho : hobby) {
			System.out.print(ho+" ");
		}
		
		/* 이렇게 각각의 변수로 관리하게 되면 여러가지 단점이 있다.
		 * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
		 * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값들을 인자로 전달해야 해서 한눈에 보기 어렵다.
		 * 3. 리턴은 1개의 값만 가능하기 떄문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.(서로 다른 자료형들이기 떄문)
		 *
		 * 그래서 자바에서는 서로 다른 자료형의 데이터를 사용자(개발자) 정의로 하나로 묶어서 새로운 타입을 정의할 수 있는 방법을 제공해준다.
		 * 필요로 하는 자료형이 추가로 존재하는 경우 자바에서는 클래스라는 매커니즘을 이용해서 사용자 정의의 자료형을 만들 수 있게 한다.
		 * 이러한 공통점을 고려하여 그룹화 할 수 있는 명사 형태로 클래스를 작성할 것이다. */
		
		/* 사용자 정의의 자료형 사용하기
		 * 1. 변수 선언 및 객체 생성
		 * 자료형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객제(instance)를 생성하는 구문이다
		 * 사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당을 해야한다.
		 * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance(가 생성된다.
		 * 아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들었다.
		 * */
		
		Member member = new Member();
		/* 이렇게 객체를 생성하고 나면 서로 다른 자료형들을 하나의 membr라는 이름으로 관리할 수 있도록 공간을 생성한 것이다.
		 * heap에 생성되기 떄문에 jvm 기본값이 초기화 된다.
		 * 
		 * 필드에 접근하기 위해서는 래퍼런스변수명 필드명으로 접근한다.
		 * '.'은 참조연산자라고 하는데 래퍼런스 변수가 참조하고 있는 주소로 접근한다는 의미를 가진다.
		 * 각 공간은 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근이다.)
		 * */
		System.out.println();
		System.out.println(member.id);
		System.out.println("member.kpwd : "+member.pwd);
		System.out.println("member.name : "+member.name);
		System.out.println("member.gge : "+member.age);
		System.out.println("member.gender : "+member.gender);
		System.out.println("member.hobby : "+member.hobby);
		System.out.println();
		
		
		member.id = "user01";
		member.pwd = "pass01";
		member.name = "홍길동";
		member.age = 20;
		member.gender = '남';
		member.hobby = new String[] {"축구", "볼링", "테니스"};
		
		
		
		System.out.println("member.id : "+member.id);
		System.out.println("member.pwd : "+member.pwd);
		System.out.println("member.name : "+member.name);
		System.out.println("member.gge : "+member.age);
		System.out.println("member.gender : "+member.gender);
		System.out.print("member.hobby : ");
		for(String ho : hobby) {
			System.out.print(ho+ " ");
		}
		System.out.println();
		
		
		Member Isw = new Member();
		Isw.id = "lee";
		Isw.pwd = "123";
		Isw.name = "이상우";
		Isw.gender = '남';
		Isw.hobby = new String[] {"공부", "헬스"};
		
		
		System.out.println();
		System.out.println("Isw.id " + Isw.id);
		System.out.println("Isw.pwd " + Isw.pwd);
		System.out.println("Isw.name " + Isw.name);
		System.out.println("Isw.gender " + Isw.gender);
		System.out.println("Isw.hobby ");
		for(String x :Isw.hobby) {
			System.out.println(x+" ");
		}
		
	}

}
