package section01.polymorphism;

public class Application04 {

	public static void main(String[] args) {
		/* 리턴 타입에도 다형성을 적용할 수 있다.*/

		Animal randomAnimal = getRandomAnimal();
		randomAnimal.cry();
		
	}
	
	public static Animal getRandomAnimal() { //반환타입 Animal!!
		int random = (int)(Math.random()*2);
		return random == 0? new Rabbit() : new Tiger();
		
	}

}
