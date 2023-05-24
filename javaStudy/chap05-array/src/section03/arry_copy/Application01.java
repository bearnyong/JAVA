package section03.arry_copy;

public class Application01 {

	public static void main(String[] args) {
		
		/* 배열의 복사
		 * 배열의 복사에는 크게 두 가지 종류가 있다.
		 * 1. 얕은 복사(shallow copy) : stack의 주소값만 복사
		 * 2. 깊은 복사(deep copy) : heap의 배열에 저장된 값을 복사
		 * */
		
		/* 먼저 얉은 복사에 대해 알아본다.
		 * 얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
		 * 따라서 두 개의 래퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
		 * 하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게 되면
		 * 다른 래퍼런스변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 떄문에 변경된 값이 반영된다.*/
		
		// 얕은 복사 확인을 위한 원본 배열 생성
		int[] originaArr = {1,2,3,4,5};
		
		// originArr에 저장된 배열의 주소를 copyArr에도 저장
		int[] copyArr = originaArr;
		
		// hashCode() 주소값 확인
		System.out.println(originaArr.hashCode());
		System.out.println(copyArr.hashCode());
		
		
		/* originArr의 값을 확인하기 위한 반복문 */
		System.out.println("\n======= originArr 값 확인 =======");
		for(int i=0; i<originaArr.length; i++) {
			System.out.print(originaArr[i]+" ");
		}
		
		/* copyArr의 값을 확인하기 위한 반복문 */
		System.out.println("\n======= copyArr 값 확인 =======");
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		
		
		System.out.println("\n====배열의 값 변경 후 확인====");
		int x = 0;
		for(int i=originaArr.length-1; i>=0; i--) {
			System.out.println(i+" : "+x);
			copyArr[x++] = originaArr[i];
		}
		
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		
		
		
	}

}
