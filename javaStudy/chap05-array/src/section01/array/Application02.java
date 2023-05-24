package section01.array;

import java.util.Scanner;

public class Application02 {

	public static void main(String[] args) {
		/* 배열의 사용 방법
		 * 
		 * 배열의 선언
		 * 자료형[] 변수명;
		 * 자료형 변수명[];으로 선언할 수 있다.
		 * */
		
		/* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.*/
		int[] iarr; //정수형 배열
		char[] carr; //문자형 배열
		
		/* 배열을 할당할 시에는 반드시 배열의 크기를 지정해 주어야 한다.*/
		iarr = new int[5];
		carr = new char[5];
		
		// int iarr1[] = new int[5];
		
		/* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다.
		 * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
		 * */
		iarr[0]=1;
		iarr[1]=2;
		iarr[2]=3;
		iarr[3]=4;
		iarr[4]=5;
		
		System.out.println("iarr : "+iarr);  //16진수 주소값 출력
		System.out.println("carr : "+carr);  //16진수 주소값 출력
		
		/* hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
		 * 동일한 객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체 취급하기 위한 용도로 overring해서 사용한다.
		 * */
		System.out.println("iarr의 hashcode : " +iarr.hashCode()); //10진수 주소값 출력
		System.out.println("carr의 hashcode : " +carr.hashCode()); //10진수 주소값 출력
		
		/* 배열의 길이를 알 수 있는 기능을 필드로 제공하고 있다.
		 * 필드 또한 뒤에서 다루게 될 것이다. (일종의 변수라고 보면 된다.)
		 * 참고로 String의 문자열 길이는 메소드로 제공하고 있기 떄문에 length()로 사용한다.
		 * */
		
		System.out.println("iarr의 길이 : "+iarr.length);
		System.out.println("carr의 길이 : "+carr.length);
		
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 할당할 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();/**
		
		double[] darr = new double[size];
		System.out.println("darr의 hashcode : "+darr.hashCode());
		System.out.println("darr의 길이 : " +darr.length);
		//System.out.println(darr);
		
		sc.close();
		
		
		/* 배열의 사이즈를 변경한 것이 아니고, 새로운 배열을 생성하여 그 주소값을 래퍼런스 변수에 덮어 쓴 것이다.*/
		// 주소값을 참조해서 스탯에 저장한다????
		darr = new double[30];
		
		/* hashcode를 보면 다른 값을 가지고 있는 것을 확인할 수 있다.*/
		// 배열을 초기화하면 조소값이 바뀐다.
		System.out.println("\n수정 후darr의 hasgCode : " +darr.hashCode());
		System.out.println("수정 후 darr의 길이 : "+darr.length);
		
		//darr= null;
		//System.out.println("삭제 후 darr의 길이 : "+darr.length); //없는 값을 꺼내오려해서 오류 발생
		
	}

}
