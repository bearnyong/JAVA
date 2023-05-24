package section01.array;

public class Application05 {

	public static void main(String[] args) {
		/* 랜덤한 카드를 한 장 뽑아서 출력해본다.
		 * 먼저 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만들자*/
		
		/* 1. 카드의 모양(String[])
		 * 2. 숫자
		 * */

		String[] shapes = {"spade", "clover","heart", "diamond"};
		String[] cardNumber= {"2", "3", "4", "5","6","7","8","9","10","jack","queen","king","ace"};
		
		int randomShapeIndex = (int) (Math.random()*shapes.length);
		int randomCarNumberIndex = (int)(Math.random()*cardNumber.length);
		
		System.out.println("랜덤한 카드의 값은 : "+ shapes[randomShapeIndex]+ " "+ cardNumber[randomCarNumberIndex]);
		
		
	}

}
