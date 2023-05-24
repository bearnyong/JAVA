package section04.array_sort;

public class Application03 {

	public static void main(String[] args) {
		/* 선택 정렬(select sort)
		 * 배열을 전부 탐색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		 * 데이터의 양이 적을 떄 좋은 성능을 나타낸다. (교환회수가 적음)
		 * 하지만 배열을 전부 탐색하여 최소값을 찾아야 하기 때문에 100개 이상의 자료에서는 급격하게 속도가 저하된다.
		 * */

		int[] iarr = {2,5,6,4,1,3};
		
		int min;
		int temp;
		
		for(int i=0; i<iarr.length-1;i++) {
			min = i;
			
			for(int j=i+1; j<iarr.length; j++) {
				if(iarr[min]> iarr[j]) {
					min = j;
				}
			}
			temp = iarr[min];
			iarr[min] = iarr[i];
			iarr[i] = temp;
		}
		
		for(int x :iarr) {
			System.out.print(x +" ");
		}
		
	}

}
