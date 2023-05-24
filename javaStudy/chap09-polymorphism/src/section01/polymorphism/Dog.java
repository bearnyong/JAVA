package section01.polymorphism;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("강아지가 밥을 뇸뇸하고 있습니다.");
	}

	@Override
	public void run() {
		System.out.println("강아지가 달려갑니다. 와다당!");
	}

	@Override
	public void cry() {
		System.out.println("강아지가 울음소리를 냅니다. 망! 망!");
	}
	
	public void yawn() {
		System.out.println("강아지가 하품을 합니다.");
	}
}
