package section01.polymorphism;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("고양이가 밥을 먹고 있습니다.");
	}

	@Override
	public void run() {
		System.out.println("고양이가 달려갑니다.");
	}

	@Override
	public void cry() {
		System.out.println("고양이가 울음소리를 냅니다. 미야옹~~!!");
	}

	public void scratch() {
		System.out.println("고양이 할큅니다.");
	}
	
}
