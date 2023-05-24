package section06.singleton;

public class LazySingleton {
	
	private static LazySingleton Lazy;
	private LazySingleton() {}
	
	public static LazySingleton getInstace() {
		if(Lazy == null) {
			/* 인스턴스를 생성한 적이 없는 경우 새로운 인스턴스를 생성함*/
			
			Lazy = new LazySingleton();
			
		}
		return Lazy;
	}

}
