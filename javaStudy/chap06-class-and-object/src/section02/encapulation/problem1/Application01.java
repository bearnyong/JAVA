package section02.encapulation.problem1;

public class Application01 {

	public static void main(String[] args) {
		/* 필드에 바로 접근할 때 발생할 수 있는 문제점1
		 * 필드에 올바르지 않는 값이 들어가도 통제가 불가능해진다.
		 * 확인해보기 위해 Monster 클래스를 하나 추가해보자*/
		
		/* 1번 몬스터 생성 */
		Monster monster = new Monster();
		
		monster.name = "두치";
		monster.hp = 200;
		
		System.out.println("monster name : "+monster.name);
		System.out.println("monster hp : "+monster.hp);
		
		
		/* 2번 몬스터 생성 */
		Monster monster2 = new Monster();
		
		monster2.name = "뿌꾸";
		monster2.hp = -200;
		
		System.out.println("monster2 name : "+monster2.name);
		System.out.println("monster2 hp : "+monster2.hp);
		
		
		/* 3번 몬스터 생성 */
		Monster monster3 = new Monster();
		
		monster3.name = "드라큘라";
		monster3.setHp(200);
		
		
		/* 메소드를 이용해서 객체의 hp값을 변경할 수 있다. */
		System.out.println("monster3 name : "+monster3.name);
		System.out.println("monster3 hp : "+monster3.hp);
		
		Monster monster4 = new Monster();
		monster4.name = "프랑켄슈타인";
		monster4.setHp(-1000);
		
		System.out.println("monster4.name : "+monster4.name);
		System.out.println("monster4.hp : "+monster4.hp);
		
		
	}

}
