package section01.array;

import java.util.Scanner;

public class Application04 {

	public static void main(String[] args) {
		/* 배열을 이용한 예제를 한 번 만들어 본다.*/
		// 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 작성한다.
		
		/* 1. 점수를 입력 받는다 int[]
		 * 2. 합계를 구한다.
		 * 3. 평균을 구한다.*/
		
		Scanner sc = new Scanner(System.in);
		int[] numList = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+ "번째 학생의 점수를 입력해 주세요 : ");
			numList[i] = sc.nextInt();
		}
		
		double sum = 0.0;
		double avg = 0.0;
		
		for(int i=0; i<numList.length; i++) {
			sum += numList[i];
		}
		
		avg = sum/numList.length;
		
		System.out.println("sum(합계) : "+sum);
		System.out.println("avg(평균) : "+avg);
		
	}

}
