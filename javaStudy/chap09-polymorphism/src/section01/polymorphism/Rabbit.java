package section01.polymorphism;

public class Rabbit extends Animal {
	
	/* 상속 is a -
	 * 동물은 토끼? x
	 * 토끼는 동물? o
	 * 
	 * */
	
	@Override
	public void eat() {
		System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
	}

	@Override
	public void run() {
		System.out.println("토끼가 달려갑니다. 우두두ㅜ두둗두두두!");
	}

	@Override
	public void cry() {
		System.out.println("토끼가 울음소리를 냅니다. 끼익!~ 끼익~!");
	}
	
	public void jump() {
		System.out.println("토끼가 점프합니다. 껑충~! 껑충~!");
	}
	
}
