package section03.dto;

public class Application01 {
	
	public static void main(String[] args) {
		
		/* 앞서 추상화를 이용해 객체를 설계하고 클래스를 이요해 프로그래밍을 해 보았다.
		 * 하지만 추상화라는 것은 매우 어려운 작업이다.
		 * 캡슐화의 원칙에는 일부 어긋나긴 하지만 매번 추상화를 하지 않아도 되는 객체도 존재한다.
		 * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우이다.
		 * 값 객체를 설계할 떄는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙을 준수하여
		 * 모든 필드를 private로 직접 접근을 막고, 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해 준다.
		 * 어떤 것을 쓸 줄 모르니 미리 다 준비해두는 종합선물세트 같은 개념이다.
		 * private 필드와 필드값을 수정하는 설정자(setter), 필드에는 접근하는 접근자(getter)들로 구성된다.*/
		
		/* 회원 정보를 담는 MemberDTO라는 클래스를 DTO클래스로 설계하고 작성해 볼 것이다
		 * 이번에는 회원이 할 수 있는 행동이 주체가 아닌, 관리하려는 회원의 데이터에 집중해서 필드부터 설계한다.
		 * MemberDTO 클래스부터 만들어 본다.*/
		
		MemberDTO member = new MemberDTO();
		
		member.setNumber(1);
		member.setName("홍길동");
		member.setAge(20);
		member.setGender('남');
		member.setHeight(180.0);
		member.setweight(80.6);
		member.setActivated(true);
		/* private로 작성해야 값을 맘대로 못바꾼다(?)*/
		
//		System.out.println("회원번호 : "+member.getNumber());
//		System.out.println("회원명 : "+member.getName());
//		System.out.println("나이 : "+member.getAge());
//		System.out.println("성별 : "+member.getGender());
//		System.out.println("키 : "+member.getHight());
//		System.out.println("몸무게 : "+member.getWeight());
//		System.out.println("회원활성화 상태 : "+member.isActivated());
		
		System.out.println(member.toString());
		
		/* 추상화의 원칙에 따라 작성을 하긴 하였으나 실제로는 캡슐화의 의미가 없을 정도로
		 * 필드명을 그대로 사용한 설정자와 접근자로 인해 캡슐화의 효과가 없다. (유지보수성 악화)
		 * 하지만 데이터를 주로 다루는 객체의 경우 행위를 추상화하지 않고
		 * 미리 모든 필드에 접근 가능성을 염두해두고 작성해두는 관례로 인해 현재도 많이 사용되고 있다.
		 * (엄밀히 말하자면 EJB의 bean 작성 규칙에 따르는 것이다.)
		 * DTO 클래스의 작성 방법은 익숙해져야 한다.
		 * 
		 * */
		
		
		
	}

	
	
}
