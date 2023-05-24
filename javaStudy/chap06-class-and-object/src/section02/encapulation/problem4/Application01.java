package section02.encapulation.problem4;

public class Application01 {

	public static void main(String[] args) {
		/* 여전히 필드에 접근하는 문제점을 가지고 있다.
		 * 필드에 직접 접근을 제한하는 방식으로 Monster 클래스를 다시 작성해본다.*/

		/*  */
		Monster monster1 = new Monster();
		
//		monster1.kinds = "두치";
//		monster1.hp = 500;
		
		/* 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고 public 메서드를 이용하여 접근할 수 있도록 해놓은 것이다.
		 * 이러한 것을 캡슐화라고 부른다.*/
		monster1.setKinds("프랑켄슈타인");
		monster1.setHp(200);
		
		System.out.println(monster1.getInfo());
		
	}

}
