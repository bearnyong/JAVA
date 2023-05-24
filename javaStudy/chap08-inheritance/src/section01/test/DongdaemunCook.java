package section01.test;

public class DongdaemunCook extends Cook {
	
	public DongdaemunCook() {
		super();
	}
	
	@Override
	public void finish() {
		if(pongpong()) {
			System.out.println("가스를 줄이고 위에 치즈를 뿌려주세요! 떡볶이가 완성되었습니다♥");
		} else {
			System.out.println("가스를 다시 확인해 주세요!!");
		}
	}
	
	
	
}
