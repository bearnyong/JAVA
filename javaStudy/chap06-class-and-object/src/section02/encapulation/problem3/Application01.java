package section02.encapulation.problem3;

public class Application01 {

	public static void main(String[] args) {
		/* 앞에서 발생한 두 가지 문제점을 해결해보자
		 * 다시 한 번 monster 클래스를 작성하여 필드에 직접 접근하는 것이 아닌 메소드를 이용하여 간접 접근을 해본다.
		 * Monster클래스에 method를 추가해보자
		 * */
		
		Monster monster = new Monster();
		monster.setInfo("드라큘라");
		
		monster.setHp(100);
		
		
		Monster monster2 = new Monster();
		monster2.setInfo("프랑켄슈타인");
		monster2.setHp(200);

		Monster monster3 = new Monster();
		monster3.setInfo("늑대인간");
		monster3.setHp(300);
		
		Monster monster4 = new Monster();
		monster4.setInfo("미이라");
		monster4.setHp(400);
		
		System.out.println(monster.getInfo());
		System.out.println(monster2.getInfo());
		System.out.println(monster3.getInfo());
		System.out.println(monster4.getInfo());
		
		monster4.name = "두치";
		monster4.hp = -500;
		System.out.println(monster4.name);
		System.out.println(monster4.hp);
		
	}

}
