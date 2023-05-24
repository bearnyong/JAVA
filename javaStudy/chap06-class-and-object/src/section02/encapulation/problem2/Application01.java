package section02.encapulation.problem2;

public class Application01 {

	public static void main(String[] args) {
		
		/* 필드에 바로 접근할 때 발생할 수 있는 문제점
		 * 필드의 이름이나 자료형을 변경할 떄 사용한 쪽 모두 코드를 수정해야 하는 경우가 생긴다.
		 * 즉, 작은 변경이 사용하는 다른 여러 곳의 변경도 함께 초래하게 된다.
		 * */
//
		Monster monster = new Monster();
		monster.name12 = "드라큘라";
		monster.hp = 200;
		
		Monster monster2 = new Monster();
		monster2.name12 = "프랑켄슈타인";
		monster2.hp = 300;
		
		Monster monster3 = new Monster();
		monster3.name12 = "미이라";
		monster3.hp = 400;
		
		System.out.println("monster1 name : "+monster.name12);
		System.out.println("monster1 hp : "+monster.hp);
		
		System.out.println("monster2 name : "+monster2.name12);
		System.out.println("monster2 hp : "+monster2.hp);
		
		System.out.println("monster3 name : "+monster3.name12);
		System.out.println("monster3 hp : "+monster3.hp);
		
		
		
	}

}
