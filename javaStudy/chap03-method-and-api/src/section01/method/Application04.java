package section01.method;

public class Application04 {

	public static void main(String[] args) {
		/* 여러 개의 전달인자를 이용한 메소드 호출 테스트
		 * 1. 여러 개의 매개변수를 가진 메소드 호출*/
		Application04 app4 = new Application04();
		app4.testMethod("홍길동", 20, '남');
		
		// 2. 변수에 저장된 값을 전달하며 호출할 수 있따.
		String name = "유관순";
		int age = 20;
		char gender = '여';
		app4.testMethod(name,age,gender);
		//app4.testMethod(20,'남',"디지몬");
		
		
	}
	
	/**
	 * 이름과 나이와 성별을 전달받아 한 번에 출력해주는 기능을 제공한다.
	 * </pre>
	 * @param name 출력할 이름을 전달해주세요
	 * @param age 출력할 나이를 전달해주세요
	 * @param gender 출력할 성별을 전달해주세요
	 * 
	 * **/
	
	public void testMethod(String name, int age, char gender) {
		System.out.println("당신의 이름은 " + name + "이고, 나이는 "+age+"세 이며, 성별은 "+gender +"입니다.");
	}
	
}
