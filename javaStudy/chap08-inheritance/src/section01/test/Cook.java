package section01.test;

public class Cook {
	
	/*가스 ON.OFF*/
	private boolean fireOn;
	
	public Cook() {
		super();
	}
	
	public void run() {
		fireOn = true;
		System.out.println("가스가 켜집니다.");
	}
	
	public void pongdang() {
		if(pongpong()) {
			System.out.println("물,떡,소스,어묵을 넣어주세요");
		} else {
			System.out.println("가스를 먼저 켜주세요.");
		}
	}
	
	protected boolean pongpong() {
		return fireOn;
	}
	
	public void stop() {
		fireOn = false;
		System.out.println("가스가 꺼졌습니다.");
	}
	
	public void finish() {
		if(pongpong()) {
			System.out.println("떡볶이가 완성되었습니다♥");
		} else {
			System.out.println("가스를 다시 확인해 주세요!!");
		}
		
	}

}
