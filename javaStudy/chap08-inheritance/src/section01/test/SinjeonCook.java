package section01.test;

public class SinjeonCook extends Cook {
	
	public SinjeonCook() {
		super();
	}
	
	@Override
	public void pongdang() {
		if(pongpong()) {
			System.out.println("물,떡,소스를 넣어주세요");
		} else {
			System.out.println("가스를 먼저 켜주세요.");
		}
	}
	
}
