package section01.extend;

public class FireCar extends Car { /* extends Car : 자동차를 상속받는다.*/
	
	/* Car 클래스를 부모클래스로 FireCar를 자식클래스로 사용할 것 이다.
	 * 클래스 선언부에 extends Car를 추가해서 Car 클래스를 상속 받을 것이다.
	 * 그러면 firCar는 부모클래스인 Car가 가지고 있는 모든 멤버를 상속받는다
	 * 하지만 생성자는 상속받지 못한다.
	 * 또한 부모가 가지고 있는 private 멤버는 접근이 불가능하다.*/
	
	public FireCar() {
		/* 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다
		 * 부모의 기본 생성자를 호출하는 구문이다.
		 * 해당 생성자가 호출 될 시 가장 먼저 Car 클래스로 후출 내용이 출력될 것이다.
		 * 명사적, 묵시적 전부 사용 가능하다.*/
		super(); // 부모클래스의 기본 생성자 호출.
		System.out.println("FireCar 클래스의 기본 생성자가 호출됨");
	}
	
	
	/* @Override 어노테이션
	 * jdk 1.5추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
	 * (오버라이딩이 정상적으로 체크해주는 기능을 한다.*/

	@Override
	public void soundHorn() {	//부모 메서드를 그대로 받아와 수정이 가능하다.
		/* 여기서 부모가 가지고 있는 멤버인 isRunning() 메소드를 사용해야
		 * 주행중인 상태인지를 확인할 수 있는데 확인할 수 있는 방법이 없다.
		 * car 클래스의 isRunning 메소드 접근제한자를 protected로 변경하고 확인해 본다.*/
		//protected : 자기 속한 거시기와 호출된이ㅏㅁ러ㅣㅏㅓㅁㅇ니
		
		if(isRunning()) {
			System.out.println("빠아아아아아아앙아!!! 뻥뻥~~!~!~! 뻥!!@@");
		} else {
			System.out.println("소방차가 앞으로 갈 수 없습니다. 비켜주세요~~!!");
		}
		
	}
	
	public void sprayWater() {
		System.out.println("불이난 곳을 발견하였습니다. 물을 뿌립니다!~!~!@#~#@#@#!");
	}
	
}
