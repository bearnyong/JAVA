package section01.array;

public class Application01 {

	public static void main(String[] args) {
		/* 배열이란?
		 * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
		 * 배열은 heap 영역에 new 연산자를 이요하여 할당한다.
		 * */
		
		/* 배열의 사용이유
		 * 배열을 사용하지 않는다면 변수 여러 개 사용을 해야한다.
		 * 1. 연속된 메모리 공간으로 관리할 수 없다. (모든 변수의 이름을 사용자가 관리해야 한다.)
		 * 2. 반복문을 이용한 연속 처리가 불가능하다.
		 * */
		
		int num1=10;
		int num2=20;
		int num3=30;
		int num4=40;
		int num5=50;
		
		int sum=0;
		
		sum+=num1;
		sum+=num2;
		sum+=num3;
		sum+=num4;
		sum+=num5;
		
		System.out.println("sum : "+sum);
		
		/* 정수형[] 배열 arr이라는 변수에 int 자료형을 5 길이만큼 생성해서 넣어준다.*/
		int[] arr = new int[5];
		
		/* 하나의 이름으로 관리되는 연속된 메모리 공간이로, 공간마다 찾아갈 수 있는 버니호(인덱스)를 이용해 접근한다.*/
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//
		int sum4=0;
		for(int i=0; i<arr.length; i++) {  //length = 배열의 길이를 잼
			sum4+=10;
			arr[i] = sum4;
			System.out.println("나는 "+arr[i]+" = "+sum4);
		}
		
		
		//
		int cnt=0;
		for(int i=10; i<=50; i+=10) {
			arr[cnt]=i;
			
			System.out.println("arr["+cnt+"]"+" = "+i);
			cnt++;
		}
		
		
		//
		for(int i=0, value=0; i<arr.length; i++) {
			arr[i]=value+=10;
		}
		
		
		//
		int sum2=0;
		sum2 += arr[0];
		sum2 += arr[1];
		sum2 += arr[2];
		sum2 += arr[3];
		sum2 += arr[4];
		
		System.out.println(sum2);
		
		
		
		//
		int sum3 = 0;
		for(int i =0; i<arr.length; i++) {
			sum3+=arr[i];
		}
		System.out.println(sum3);

	}

}
