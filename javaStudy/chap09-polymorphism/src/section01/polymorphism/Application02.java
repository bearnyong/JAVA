package section01.polymorphism;

public class Application02 {

	public static void main(String[] args) {

		/* 다형성과 객체 배열을 이용해서 여러 인스턴스를 연속 처리할 수 있다.
		 * 상위 타입의 레퍼런스 배열을 만들고 각 인덱스에 인스턴스들을 생성해서 대입한다.*/
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Rabbit();
		animals[1] = new Tiger();
		animals[2] = new Rabbit();
		animals[3] = new Tiger();
		animals[4] = new Animal();
		
		for(int i = 0; i<animals.length; i++) {
			animals[i].cry();
			if(animals[i] instanceof Tiger) { //얘가 호랑이가 맞는가?
				((Tiger)animals[i]).bite();	  //그렇다면 bite()기능..어쩌구
			} else if(animals[i] instanceof Rabbit){
				((Rabbit)animals[i]).jump();
			} else {
				System.out.println("그냥 동물 입니다.");
			}
			System.out.println();
		}
		
	}

}
