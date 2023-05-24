package section02.extend.run;

import section02.extend.Bunny;
import section02.extend.DrunkekenBunny;
import section02.extend.Rabbit;
import section02.extend.RabbitFarm;
import section02.extend.WildCardFarm;

public class Application02 {

	public static void main(String[] args) {
		/* 와일드카드(wildCard)
		 * 제너릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
		 * 그 객체의 타입 변수를 제한할 수 있따.
		 * 
		 * <?> : 제한 없음
		 * <? extends Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
		 * <? super Type> : 와일드카드의 하한제한(Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능)*/
		
		WildCardFarm wildCardFarm = new WildCardFarm();
		
		//매개 변수의 타입제한이 없는 경우
		// 농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 있따.
		// wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
		// wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

		// 어떠한 토끼 농장이던 매개변수로 사용이 가능하다.
		wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.anyType(new RabbitFarm<DrunkekenBunny>(new DrunkekenBunny()));
		
		/* Bunny 이거나 Bunny의 후손 토끼농장만 매개변수로 사용이 가능하고
		 * 상위타입으로 만든 토끼농장은 매개변수로 사용이 불가능하다.*/
		// wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit())); //Bunny의 후손만 사용가능, Rabbit은 Bunny의 부모타입이기 떄문에 오류
		wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
		wildCardFarm.extendsType(new RabbitFarm<DrunkekenBunny>(new DrunkekenBunny()));
		
		/* Bunny 이거나 Bunny의 상위 타입 토끼 농장만 매개변수로 사용이 가능하고
		 * 하위타입으로 만든 토끼 농장은 매개변수로 사용이 불가능하다.*/
		wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
		// wildCardFarm.superType(new RabbitFarm<DrunkekenBunny>(new DrunkekenBunny())); //DrunkekenBunny는 Bunny의 자식타입이기 때문에 오류
		
	}

}
