package section08.initblock;

public class Product {
	
	/* 필드를 초기화 하지 않으면 jvm이 정한 기본값으로 객체가 생성된다.*/
//	private String name; //기본값 null
//	private String price; //기본값 null
//	private static String brand;  //기본값 null
	
	private String name = "갤럭시";
	private int price = 10000;
	private static String brand = "삼송";
	
	/* 명시적 초기값 확인 후 인스턴스 초기화 블럭 확인된다.(초기화 블럭)*/
	{
		name = "사이언";
		price = 100000;
		/* 인스턴스 초기화 블럭에서는 static 필드를 초기화 할 수 잇는 것 처럼 보인다.
		 * 하지만 static 초기화 블럭은 클래스가 로드될 때 이미 기본값으로 초기화를 진행하였다.
		 * 따라서 인스턴스 초기화 블럭이 동작하는 시점에서는 임 초기화가 진행된 정적 필드에
		 * 인스턴스 초기화 블럭에서 대입한 값으로 덮어 쓰게 되는 것이다.*/
		brand = "사과";
		System.out.println("인스턴스 블록 초기화 됨...");
	}
	
	static {
		/* static 초기화 블럭에서는 non-static 필드를 초기화 하지 못한다.
		 * 정적 초기화 블럭은 클래스 로드 시에 동작하낟.
		 * 따라서 정적 초기화 블럭의 동작 시점에서는 인스턴스가 아무 것도 존재할 수 없기 때문에
		 * 존재하지 않는 인스턴스변수에 초기화 하는 것은 시기상으로 불가능하다.*/
		
//		name = "아이뵹";
//		price = 10000;
		brand = "헬지";
		System.out.println("정적 초기화 블럭 동작함...");
	}
	
	public Product() {
		System.out.println("기본 생성자 호출...");
	}
	
	/* 매개 변수가 있는 생성자
	 * 위에서 초기화된 값을 다 무시하고 생성자에 작성한 초기화 내용으로 인스턴스를 초기화 시킨다.
	 * */ 
	public Product(String name, int price, String brand){
		this.name = name;
		this.price =price;
		Product.brand = brand;
		System.out.println("매개변수 있는 생성자 호출됨...");
	}
	
	
	
	//Alt Shift s
	@Override //null 값 확인
	public String toString() {
		return "Product [name=" + name + ", price=" + price+", " + "brand =" +Product.brand+"]";
	}
	
	

}
