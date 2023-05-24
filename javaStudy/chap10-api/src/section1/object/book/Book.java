package section1.object.book;

public class Book {
	private int number;
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(int number, String title, String author, int price) {
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		/* 두 인스턴스의 주소가 같으면 이후 다른 내용을 비교할 것 없이 true를 반환한다.*/
		if(this == obj) {
			return true;
		}
		
		/* this는 인스턴스가 생성되면 주소값이 저장된다. null일 수 있다.
		 * 따라서 전달받은 레퍼런스 변수에 null값이 저장되어 있다면
		 * 비교하려는 두 개의 인스턴스는 서로 다른 인스턴스이다.*/
		if(obj == null) {
			return false;
		}
		
		Book other = (Book) obj;
		
		/* title 필드의 값이 null인 경우
		 * 매개변수로 전달받은 인스턴스의 title필드에도 null이 저장되어 있어야 서로 같은 값을 가진다.
		 * 그렇지 않은 경우 false를 리턴하고 종료함*/
		if(this.title == null) {
			/* title 필드가 null인 경우 다른 인스턴스의 title이 null이 아니면 false를 반환*/
			if(other.title != null) {
				return false;
			}
		} else if(!this.title.equals(other.title)) {
			/* String 클래스의 equals()는 이미 해당 기능을 오버라이딩 해두었기 때문에
			 * 같은 값을 가지는지 비교를 한다.
			 * 
			 * title 필드가 null이 아닌 경우
			 * 두 인스턴스 title 필드값이 같아야 한다.
			 * 그렇지 않은 경우 false를 반환*/
			return false;
		} else if(!this.author.equals(other.author)) {
			return false;
		}
		
		if(this.price != other.price) {
			return false;
		}
		
		return true;
	}

	@Override
	public int hashCode() {
		/* 곱셈 연산을 누적시켜야 하기 떄문에 0이 아닌 값으로 초기화*/
		int result = 1;
		
		/* 필드마다 곱해줄 소수값을 선언
		 * 31은 소수이기 떄문에 연산 시 동일한 hashcode 값이 나오지 않을 활률을 증가시키나다.
		 * 31은 통신적인 관례이며 String 클래스의 hashCode에서도 사용한 값이다.*/
		final int PRIME = 31;
		
		/* 31과 필드의 값을 잉요하여 새로운 hashcode를 연산한다.
		 * 여기서 포인트는 필드값이 같은 경우 동일한 hashcode를 반환하면 된다.*/
		result = PRIME + result + this.number;
		
		/* String 클래스의 hashcode 메소드는 이미 재정의 되어 있다.
		 * 같은 값을 가지는 문자열은 동일한 hashcode 값을 반환한다.*/
		result = PRIME + result + this.title.hashCode();
		result = PRIME + result + this.author.hashCode();
		result = PRIME + result + this.price;
		
		return result;
	}
	
	
	
	
	
}
