package section01.extend;

public class RacingCar extends Car {
	
	public RacingCar() {
		super();
		System.out.println("RacingCar 클래스의 기본 생성자가 호출됨");
	}
	
	@Override   //부모에 있는 기능을 재정의 하려고 할 때 무조건 작성해줘야함
	public void run() {
		System.out.println("레이싱카가 전속력으로 질주합니다!!!");
	}
	
	@Override
	public void stop() {
		System.out.println("레이싱카가 멈춥니다.");
	}
	
	/* */
	
}
