package section02.demensional_array;

public class Application01 {

	public static void main(String[] args) {
		/* 다차원 배열
		 * 다차원 배열은 2차원 이상의 배열을 의미한다.
		 * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
		 * 즉. 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
		 * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차원의 배열은 사용 빈도가 현저히 적다.*/
		
		/* 2차원 배열을 사용하는 방법
		 * 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
		 * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
		 * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
		 * 4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용
		 * */
		
		// 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
		int[][] iarr1;
		int iarr2[][];
		int[] iarr[];
		
		// 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
		/* heap에 공간을 할당할 때는 new 연산자를 이용한다.
		 * 배열의 주소를 관리하는 배열의 길이는 앞 부분에 정수형으로 표기하며 반드시 크기를 지정해줘야 한다.*/
		// iarr1 = new int[][]; // 크기를 지정하지 않으면 에러 발생
		// iarr1 = new int[][4]; // 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 에러 발생
		
		iarr1 = new int[3][];
		
		// 3. 각 주소를 관리하는 배열의 인덱스마다 배열을 할당한다.(heap)
		iarr1 = new int[3][];
		
		iarr1[0] = new int[5];
		iarr1[1] = new int[5];
		iarr1[2] = new int[5];
		
		/* 참고 : 위에서 진행한 2,3번을 동시에 진행할 수 있따.
		 * 앞 부분 정수는 주소를 관리하는 배열의 크기, 뒷 부분 정수는 각 인덱스에 할당하는 배열의 길이이다.
		 * 관리하는 여러 개의 배열의 길이가 동일한 경우 아래와 같이 한 번에 할당할 수 있다.
		 * 하지만 여러 개의 배열의 길이가 각각 다른 경우에는 위에서 했던 방식처럼 인덱스별로 배열을 따로 할당해주어야 한다.
		 * 서로 같은 길이의 여러 개 배열을 하나로 묶어서 관리하는 2차원 배열을 정변 배열이라고 하며
		 * 서로 길이가 같지 않은 여러 개의 배열을 하나로 묶어서 관리하는 2차원 배열을 가변배열이라고 한다.*/
		
		// 4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용한다.
		// 0번 인덱스 배열의 값 출력 
		iarr2 = new int[5][3]; ///가변배열 : 앞의 길이와 뒤의 길이가 다른 배열
		
		for(int i=0; i<iarr1[0].length; i++) {
			System.out.print(iarr1[0][i]+" ");
		}
		System.out.println();
		
		
		// 1번 인덱스 배열의 값 출력
		for(int i=0; i<iarr1[1].length; i++) {
			System.out.print(iarr1[1][i]+ " ");
			
		}
		System.out.println();
		
		
		// 2번 인덱스 배열의 값 출력
		for(int i=0; i<iarr1[2].length; i++)
		{
			System.out.print(iarr1[2][i]+" ");
		}
		System.out.println();
		
		
		System.out.println("========================");
		for(int i=0; i<iarr2.length; i++) {
			for(int x=0; x<iarr2[i].length; x++) {
				System.out.print(iarr2[i][x]+" ");
			}
			System.out.println();
		}
	}

}
