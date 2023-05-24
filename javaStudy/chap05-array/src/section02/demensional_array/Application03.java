package section02.demensional_array;

public class Application03 {

	public static void main(String[] args) {
		/* 2차원 가변배열(dynamic array)를 선언 및 할당하고 차례로 값을 대입해서 출력해본다.*/

		/* 1. 배열의 선언 및 할당
		 * 가변 배열의 경우 각 인덱스별 배열을 따로 할당을 해야만한다.
		 * 선언과 동시에 모든 배열을 할당할 수 없으며, 할당할 배열의 갯수만 지정하고 각 인덱스에 서로 다른 길이의 배열을 따로 할당해야 한다.
		 * 자료형[][] 변수명 = neww 자료형[할당할 배열의 갯수][];
		 * 변수명[배열의 인덱스] = new 자료형[배열의 길이];
		 * */
		
		// 1-1. 주소를 관리하는 배열의  주소를 보관하기 위한 변수 선언
		int[][] iarr = new int[3][];
		
		// 1-2. 주소를 관리하는 배열의 각 인데스마다 배열을 할당하여 주소값 대입
		iarr[0]=new int[3];
		iarr[1]=new int[5];
//		iarr[2]=new char[4]; // 자료형이 다른 배열은 하나로 묶어서 관리할 수 없다.
//		iarr[2]=new int[6];
		
		int[] arr = new int[5];
		iarr[2] = arr; //미리 할당해둔 배열을 이용해서도 활용할 수 있다.
		
		/* 2. 각 배열의 인덱스마다 접근하여 값 대입 후 출력ㄱ*/
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		
		iarr[1][0] = 1;
		iarr[1][1] = 2;
		iarr[1][2] = 3;
		iarr[1][3] = 4;
		iarr[1][4] = 5;
		
		arr[0]= 11;
		arr[1]= 22;
		arr[2]= 33;
		arr[3]= 44;
		arr[4]= 55;
		
		for(int i=0; i<iarr.length; i++) {
			for(int x=0; x<iarr[i].length; x++){
				System.out.print(iarr[i][x]+" ");
			}
			System.out.println();
		}
		
		
		//
		for(int i=0; i<iarr.length; i++) {
			int value = 0;
			for(int x=0; x<iarr[i].length; x++) {
				iarr[i][x] = value++;
			}
		}
		
		System.out.println("======= 값 초기화 ========");
		
		for(int i=0; i<iarr.length; i++) {
			for(int x=0; x<iarr[i].length; x++) {
				System.out.print(iarr[i][x]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------- arr ----------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
