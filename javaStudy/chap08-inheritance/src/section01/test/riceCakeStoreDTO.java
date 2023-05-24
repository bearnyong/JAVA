package section01.test;

public class riceCakeStoreDTO {
	
	
	private String name; //상호명(엽기떡볶이, 신전떡볶이)
	private int price; //가격
	
	
	
	public riceCakeStoreDTO() {
		System.out.println("riceCakeStore 클래스의 기본 생성자 호출함...");
	}

	
	
	public riceCakeStoreDTO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	/*String name Getter, Setter*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	/*int price Getter, Setter*/
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "\n["+ name + "] 선택되었으며, 금액은 "+ price + "원 입니다.\n"
				+name+" 레시피를 안내해 드리겠습니다. 레시피에 맞게 조리해 주세요 :-)\n";
	}
	
	
	
}
