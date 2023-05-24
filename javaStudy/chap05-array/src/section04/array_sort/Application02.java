package section04.array_sort;

public class Application02 {

	public static void main(String[] args) {
		/* 순차 정렬
		 * 순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
		 * 배열의 처음과 끝을 탐색하면서 차순대로 정렬하느 가장 기초적인 정렬 알고리즘이다.
		 * */

		/* 초기 배열 선언 및 초기화 */
		int[] iarr = {2,5,4,6,1,3};
		
		for(int i =1; i<iarr.length; i++) {
			for(int j=0; j<i; j++) {
				
				/* 오름차순 정렬을 위한 처리
				 * 내림차순은 부등호만 반대로 처리하면됨 */
				
				if(iarr[i]< iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}	
			}		
		}
		
		for(int i=0; i<iarr.length; i++) {
			System.out.print(iarr[i]+ " ");
		}
	}

}
