package section03.dto;

public class MemberDTO {
	
	/* 취급하려고 하는 회원정보를 구상해서 필드를 우선 작성해본다.
	 * 회원번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부(활성화여부)를 관리할 것이다.
	 * 값 객체가 가지는 속성(필드)를 추출하는 과정 또한 추상화라고 볼 수 있다.
	 * VO 클래스를 만들기 위해서는 모든 필드를 private로 만든다.*/
	
	/* 필드명은 어떠한 속성으 로간리하는 필드인지를 명확하게 명명하는 게 좋다.
	 * 하지만 예를 들어 회원명이 memberName이라고 해야 의미가 정확하지만
	 * Member.memberName은 member의 의미가 중복되므로 name이라고 명명하는 게 좋다.*/
	
	private int number;
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	private boolean isActivated;
	
	/* 이렇게 필드만 만들고 나면 pivate로 접근이 제한되어 있기 떄문에 각 영역에 접근 할 수 없다.
	 * public으로 접근을 허용하는 설정자/ 접근자를 이용해 필드에 간접적으로 접근할 수 있도록 할 것이다.
	 * 
	 * 설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
	 * 
	 * 설정자(setter) 작성규칙
	 *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고 호출 당시 전달되는
	 *  매개변수의 값을 이용하여 필드의 값을 변경한다.
	 *  
	 * [표현식]
	 * public void set필드명(매개변수){
	 * 	필드 = 매개변수;
	 * }
	 * 
	 * 접근제어자(getter) 작성 규칙
	 *  : 필드의 값을 반환받을 목적의 메소드 집합을 의미한다.
	 *  각 접근자는 하나의 필드에만 접근하도록 한다.
	 *  필드에 접근해서 기록된 겂을 return을 이용하여 반환하며, 이 때 반환 타입은 반환하려는 값의 자료형과 일치시킨다.
	 *  
	 * [표현식]
	 * public 반환형 get필드명(){
	 * 	return 반환값;
	 * }
	 * 
	 * */
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setweight(double weight) {
		this.weight = weight;
	}
	
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public double getHight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public boolean isActivated() {
		return isActivated;
	}

	@Override
	public String toString() {
		return "MemberDTO [number=" + number + ", name=" + name + ", age=" + age + ", gender=" + gender + ", height="
				+ height + ", weight=" + weight + ", isActivated=" + isActivated + "]";
	}
	
	

}
