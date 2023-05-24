package section2.string;

import java.util.StringTokenizer;

public class Application03 {

	public static void main(String[] args) {
		
		/* split()과 StringTokenizer
		 * 문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
		 * 
		 * split() :
		 * 정규표현식을 이용하여 문자영을 분리한다.
		 * 비정형화된 문자열을 분리할 떄 좋지만(공백 문자열 값 포함)
		 * 정규표현식을 이용하기 떄문에 속도가 느리다는 단점을 가진다.
		 * 정규표현식은 자바에서는 다루지 않고 자바스크립트에서 다룰 예정이다.
		 * 
		 * StringTokenizer :
		 * 문자열의 모든 문자들을 구분자로 하여 문자열을 분리하낟.
		 * 정형화된 문자열 패턴을 분리할 떄 사용하기 좋다 ( 공백 문자열 무시)
		 * split()보다 속도면에서 더 빠르다
		 * 구분자를 생략하는 경우 공백이 기본 구분자이다.
		 * */
		
		/* 각 문자열의 의미는 사번.이름.주소.부서를 의미한다.*/
		String emp1 = "100/홍길동/서울/영업부";
		String emp2 = "200/유관순//총무부";
		String emp3 = "300/이순신/경기도/";
		
		String[] empArr1 = emp1.split("/");
		String[] empArr2 = emp2.split("/");
		String[] empArr3 = emp3.split("/");
		
		for(int i=0; i<empArr1.length; i++) {
			System.out.println("empArr1["+i+"] : " + empArr1[i]);
		}

		System.out.println();
		for(int i=0; i<empArr2.length; i++) {
			System.out.println("empArr1["+i+"] : " + empArr1[i]);
		}
		
		System.out.println();
		for(int i=0; i<empArr3.length; i++) {
			System.out.println("empArr1["+i+"] : " + empArr1[i]);
		}
		
		StringTokenizer st1 = new StringTokenizer(emp1,"/");
		StringTokenizer st2 = new StringTokenizer(emp2,"/");
		StringTokenizer st3 = new StringTokenizer(emp3,"/");
		
		while(st1.hasMoreTokens()) {
			System.out.println("st1 : " + st1.nextToken());
		}
		
		while(st1.hasMoreTokens()) {
			System.out.println("st2 : " + st2.nextToken());
		}
		
		while(st1.hasMoreTokens()) {
			System.out.println("st3 : " + st3.nextToken());
		}
		
		/* nextToken()으로 토큰을 꺼내면 해당 StringTokenizer의 토큰을 재사용하는 것이 불가능하다.*/
		while(st1.hasMoreTokens()) {
			System.out.println("st1 : " + st1.nextToken());
		}
		
		/* split()은 정규표현식 이용(문자열패턴), StringTokenizer는 구분자 문자열 이용*/
		String colorStr = "red*orange#blue/yello green";
		
		/* "[*#/]"이라는 대괄호로 묶은 문자열은 문자열이 아닌 각 문자들의 패턴으로 볼 수 있다.
		 * 따라서 순서 상관 없이 문자들을 이용해서 구분자로 이용할 수 있다.*/
		String[] colors = colorStr.split("[*/#]");
		
		for(int i=0; i<colors.length; i++) {
			System.out.println("colors[" + i + "] : " + colors[i]);
		}
		
		StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*#/ ");
		
		while(colorStringTokenizer.hasMoreTokens()) {	//다음값이 있어? 있으면 보여줘
			System.out.println(colorStringTokenizer.nextToken());	//green
		}
		
	}

}
