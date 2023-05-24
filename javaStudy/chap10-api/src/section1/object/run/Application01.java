package section1.object.run;

import section1.object.book.Book;

public class Application01 {

	public static void main(String[] args) {
		/* 모든 클래스는 Object 클래스의 후손이다.
		 * 따라서 Object 클래스가 가진 메소드를 자신의 것 처럼 사용할 수 있따.
		 * 또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능하다.
		 * 
		 * Object 클래스의 메소드 중 관례상 많이 오버라이딩 해서 사용하는 메소드들이 있다.
		 * toString(), equals(), hashcode()이다.*/
		
		Book book1 = new Book(1,"홍길동전", "허균", 50000);
		Book book2 = new Book(2,"목민심서","정약용",30000);
		Book book3 = new Book(3,"춘향전","정약용",3000);
		
		System.out.println("book1.toString() : " + book1.toString());
		System.out.println("book2.toString() : " + book2.toString());
		System.out.println("book3.toString() : " + book3.toString());
		
		System.out.println();
		
		/* toStirng()을 호출하지 않고 레퍼런스 변수만 출력하는 경우 동일하게 결과가 나온다.
		 * 이 경우 자동으로 toString()메소드를 호출해준다.
		 * 그래서 이런 편리한 점을 이용하여 toString()메소드를 재정의해서 사용하게 된다.*/
		System.out.println("book1 : " + book1);
		System.out.println("book2 : " + book2);
		System.out.println("book3 : " + book3);
		
//		println(Object obj){
//			return obj.toString();
//		}
//		
//		println(String str){
//			return str;
//		}
		
	}

}
