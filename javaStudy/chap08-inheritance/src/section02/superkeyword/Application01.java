package section02.superkeyword;

public class Application01 {

	public static void main(String[] args) {
		/* 앞에서 잠시 확인해본 super와 super()에 대하여 알아본다.*/
		
		/* super :
		 * 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도 함꼐 생성하게 된다.
		 * 이 때 생성한 부모의 인스턴스 주소를 보관하는 래퍼런스 변수로
		 * 자식 클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도 사용할 수 있는 레서펀스 변수이다.
		 * 
		 * super():
		 * 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는 부모의 생성자를 호출하게 된다.
		 * this()가 해당 클래스 내의 다른 생성자를 호출하는 구문이라면,
		 * super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를 호출할 수 있도록 하는 구문이다.
		 * */
		
		
		ProductDTO product1 = new ProductDTO();
		System.out.println(product1.toString());
		
		ProductDTO product2 = new ProductDTO("s-01234", "삼성", "갤럭시 제트 어쩌구", new java.util.Date());
		System.out.println(product2.toString());
		
		ComputerDTO computer1 = new ComputerDTO();
		System.out.println(computer1.toString());
		
	}

}
