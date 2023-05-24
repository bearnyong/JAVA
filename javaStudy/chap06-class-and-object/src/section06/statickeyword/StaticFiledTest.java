package section06.statickeyword;

public class StaticFiledTest {
	
	private int nonStatiConut;  //StaticFiledTest sft1 = new StaticFiledTest(); 객체 생성을 통해 접근 가능
	private static int staticCount;  //공유저장소가됨,!! StaticFiledTest.staticCount로 접근 가능 
	
	public StaticFiledTest() {}
	
	public int getNonStatiCount() {
		return this.nonStatiConut;
	}
	
	public int getStaticCount() {
		/* static 필드에 접근하기 위해서 클래스명.필드명 으로 접근한다.
		 * this.으로 접근은 가능하지만 this를 사용하지 않는 것이 좋다.
		 * */
		return StaticFiledTest.staticCount;
	}
	
	public void increaseNonStaiCount() {
		this.nonStatiConut++;
	}
	
	public void incraseStatiCount() {
		StaticFiledTest.staticCount++;
	}
	
}
