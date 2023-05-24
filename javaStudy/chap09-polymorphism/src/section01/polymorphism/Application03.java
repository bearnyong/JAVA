package section01.polymorphism;

public class Application03 {

	public static void main(String[] args) {
		/* 매개변수에도 다형성을 활용할 수 있다.*/

		Application03 app3 = new Application03();
		
		Animal animal1 = new Rabbit(); //부모는 자식의 기능들을 모두 상속받아 사용할 수 없다.
		Animal animal2 = new Tiger();
		
		System.out.println("------1------");
		app3.feed(animal1);	//동적 할당, 실행이 되고 나서야 오버라이딩 인식
		app3.feed(animal2);
		
		Rabbit animal3 = new Rabbit();
		Tiger animal4 = new Tiger();
		
		
		System.out.println("------2------");
		app3.feed((Animal)animal3);
		app3.feed((Animal)animal4);
		
		
		System.out.println("------3------");
		app3.feed(animal3);
		app3.feed(animal4);
		
		
		System.out.println("------4------");
		app3.feed(new Rabbit());
		app3.feed(new Tiger());
		
	}
	
	public void feed(Animal animal)
	{
		animal.eat();
	}
}
