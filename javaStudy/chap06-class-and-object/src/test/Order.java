package test;

import java.util.Date;

public class Order {

	/* A라는 사용자가 제품 커피를 주문하였다
	 * 
	 * 사용자 번호
	 * 제품명
	 * 제품 가격
	 * 주문 시간
	 * class Order
	 * */
	
	private int userName;
	private String productName;
	private int price;
	private Date orderTime;
	
	
	public Order() {
		System.out.println("기본 생성자를 생성함");
	}
	
	
	public Order(int userName, String productName, int price, Date orderTime) {
		super();
		this.userName = userName;
		this.productName = productName;
		this.price = price;
		this.orderTime = orderTime;
	}

	
	public int getUserName() {
		return userName;
	}
	
	
	public void setUserName(int userName) {
		this.userName = userName;
	}
	
	
	public String getProductName() {
		return productName;
	}
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Date getOrderTime() {
		return orderTime;
	}
	
	
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}


	@Override
	public String toString() {
		return "Order [userName=" + userName + ", productName=" + productName + ", price=" + price + ", orderTime="
				+ orderTime + "]";
	}
	

}
