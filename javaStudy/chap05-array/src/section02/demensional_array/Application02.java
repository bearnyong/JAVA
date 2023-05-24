package section02.demensional_array;

public class Application02 {

	public static void main(String[] args) {

		/* 2차원 정변배열을 선언 및 할당하고 차례로 값을 대입해서 출력해보자
		 * 
		 * 1. 배열의 선언 및 할당
		 * 정변 배열의 경우 각 인덱스별 배열을 따로 할당할 수도 있지만
		 * 선언과 동시에 모든 배열을 할당할 수 있다.
		 * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];
		 * */
		
		// 길이 5의 배열을 3개 할당하고 그 주소를 묶어서 관리하는 배열의 주소를 stack에 iarr에 저장한다.
		int[][] iarr = new int[3][5];
		
		//2. 각 배열의 인덱스에 접근해서 값 대입 후 출력
		// 값 대입
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		iarr[1][0] = 1;
		iarr[1][1] = 2;
		iarr[1][2] = 3;
		iarr[1][3] = 4;
		iarr[1][4] = 5;
		
		iarr[2][0] = 1;
		iarr[2][1] = 2;
		iarr[2][2] = 3;
		iarr[2][3] = 4;
		iarr[2][4] = 5;
		
		// System.out.println(iarr[0][1]);
		
		for(int i=0; i<iarr.length; i++) {
			int value = 1;
			for(int x=0; x<iarr[i].length; x++) {
				iarr[i][x] = value++;
			}
		}
		
		for(int i=0; i<iarr.length; i++) {
			for(int x = 0; x<iarr[i].length; x++) {
				System.out.print(iarr[i][x]+ " ");
			}
			System.out.println();
		}
	}

}
