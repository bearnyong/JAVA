package section02.level01.basic;

public class Application01 {

	public static void main(String[] args) {
		/* 1부터 10까지 합계를 구하고 결과를 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 1부터 10까지의 합 : 55
		 * */
		
		int num = 0;
		for(int i=1; i<=10; i++) {
			num += i;
		}
		
		System.out.println("1부터 10까지의 합 : "+num);


	}

}
