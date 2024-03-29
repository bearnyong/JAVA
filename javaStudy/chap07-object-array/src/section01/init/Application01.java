package section01.init;

public class Application01 {

	public static void main(String[] args) {
		
		/* 객체배열은 레퍼런스변수에 대한 배열이다.
		 * 생성한 인스턴스도 배열을 이용해서 관리하면
		 * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
		 * 또한 반환값은 1개의 값만 반환할 수 있기 떄문에 동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체 배열을 이용할 수 있다.*/
		
		
		/* Car 클래스를 먼저 만들어 본다. */
		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람보르기니", 350);
		Car car3 = new Car("폴스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 5000);
		
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		
		/* 동일한 타입의 인스턴스를 여러 개 사용해야 할 때 객체배열을 이요하면 보다 효율적으로 사용이 가능하다.
		 * car 타입의 인스턴스 주소를 보관할 5칸짜리 배열을 할당*/
		Car[] carArray = new Car[5];
		
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("폴스로이스", 250);
		carArray[3] = new Car("부가티베이론", 400);
		carArray[4] = new Car("포터", 5000);
		
		for(int i=0; i<carArray.length; i++) {
			carArray[i].driveMaxSpeed();
		}
		
		Car[] carArray2 = {new Car("페라리", 300),
						   new Car("람보르기니", 350),
						   new Car("폴스로이스", 250),
					   	   new Car("부가티베이론", 400),
						   new Car("포터", 5000)};
		
		for(Car c :carArray2) {
			c.driveMaxSpeed();
		}
		
	}

}
