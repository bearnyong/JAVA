package section02.branching_statement;

public class B_continue {
	
	public void testSimpleContinueStatement() {
		/* Continue문은 반복문 내에서 사용한다.
		 * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
		 * 일반적으로 if(조건식){continue;}처럼 사용한다.
		 * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
		 * */
		
		for(int i=1; i<=100; i++) {
			if(i%4 ==0 &&i%5==0) {
				System.out.println(i);
			} else {
				//continue;
			}
		}
	}
	
	public void testSimpleContinueStatement2() {
		/* 중첩 반복문 내에서 분기문의 흐름
		 * continue는 모든 반복문을 건너 뛰는 것이 아닌, 자신에게 가장 인접한 반복문 실행만 건너뛴다.
		 * */
		
		/* 구구단 2~9 단까지 출력
		 * 단, 각 단의 수가 짝수인 경우 출력을 생략한다.*/
		
		/* 1. 2~9까지 증가하는 반복문(for문)을 만든다
		 * 2. 1~9까지 증가하는 중첩 for문을 만든다.
		 * 3. 짝수일 경우 출력을 생략한다. (if문)
		 * */
		
		for(int i=2; i<10; i++) {
			for(int su=1; su<10; su++) {
				if(su%2 == 0) {
					continue;
				}
				System.out.println(i+" * "+su+" "+(i*su));
			}
			System.out.println();
		}
		
	}
	
	public void testSimpleContinueStatement3() {
		
		label:
		for(int dan=2; dan<10; dan++) {
			for(int su=1; su<10; su++) {
				if(su%2 == 0) {
					continue label;
				}
				System.out.println(dan + " * "+su + " = " + (dan*su));
				
			}
			System.out.println();
		}
	}

}
