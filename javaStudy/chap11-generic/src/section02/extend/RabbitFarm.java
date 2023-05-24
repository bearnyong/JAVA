package section02.extend;

/* public class RabbitFarm<T extends Animla>
 * 제네릭에서 interface를 상속 받는 경우 implemens가 아닌 extends를 사용한다.*/

public class RabbitFarm<T extends Rabbit> {
	/* 참고로 클래스와 인터페이스 상속 시 &를 사용한다.
	 * 대신 앞에는 클래스가 와야 하고 인터페이슨ㄴ 뒤에 온다.
	 * &로 여러 타입을 동시에 가지는 경우에만 타입변수에 맞는 타입으로 여긴다.(둘 중 하나)
	 * 여러개를 이어서 작성할 떄는 계속&를 쓰면 되지만 해당 타입을 모두 가지는 타입만 사용 가능하다
	 * 클래스 여러개는 &사용 불가하며 ',' 사용시 컴파일 에러는 발생하지 않지만 뒤에 작성한 클래스를 또 다른 타입변수로 본다.
	 * 즉 하나의 클래스만 상속받아 구현 할 수 있다.
	 * public class RabbitFram<T extends Rabbit & Animal>
	 * 
	 * Reptile 자체를 타입 변수로 본다.
	 * public class RabbitFarm<t extends Rabbit, Reptile>{*/

	/* 1. 해당 클래스는 타입 변수를 작성하여 제네릭 클래스로 만들 것이다.
	 * 하지만 제네릭스를 설정할 떄 extends Rabbit 이라고 추가해본다.*/
	
	private T animal;
	
	public RabbitFarm() {}
	
	public RabbitFarm(T animal) {
		this.animal = animal;
	}
	
	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	public T getAnimal() {
		return this.animal;
	}
	
}
