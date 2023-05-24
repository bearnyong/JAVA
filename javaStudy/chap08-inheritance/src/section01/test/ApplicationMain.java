package section01.test;

import java.util.Scanner;

public class ApplicationMain {
	
	public static void main(String[] args) {
		
		/*main메서드 안에 만든 메서드를 사용하기 위해 객체 생성*/
		ApplicationMain main = new ApplicationMain();
		
		/*menu의 숫자를 입력받기 위한 Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*menu라는 라벨명을 가진 while문*/
		menu: 
		while(true){	
			System.out.println("\n\n==== 안녕하세요 민민떡볶이 레시피 입니다 ====");
			System.out.println("1. 동대문엽기떡볶이");
			System.out.println("2. 신전떡볶이");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴를 선택해 주세요!!! : ");
			int no = sc.nextInt();
				
			switch(no) {
				case 1: main.dongdong(); break; /*입력 값이 1일경우 case1실행*/
				case 2: main.sinsin(); break; /*입력 값이 2일경우 case2실행*/
				case 0: System.out.println("프로그램을 종료 합니다."); break menu; /*입력 값이 0일경우 case0실행, menu 종료*/
				default : System.out.println("잘못된 번호를 입력하였습니다."); break; /*그 외 입력 값의 경우*/
			}
		}
		sc.close();
	}
	
	
	public void dongdong() {
		
		/*동대문 riceCakeStoreDTO객체 생성 후 매개변수 전달 */
		riceCakeStoreDTO Dongdaemun = new riceCakeStoreDTO("동대문엽기떡볶이", 14000);
        System.out.println(Dongdaemun.toString());
        
        /*동대문Ingredient(재료)*/
        DongdaemunIngredient dt = new DongdaemunIngredient();
        // 동대문 떡볶이 재료를 set방식으로 인자를 보냄
        dt.setWater(700);
        dt.setRiceCake(350);
        dt.setSauce(300);
        dt.setFishcake(20);  
        
        /*재료를 출력하기 위한 toString*/
        System.out.println(dt.toString()+"\n");
        
        /*조리과정을 위한 객체*/
        /*dongdaemum변수에 들어있는 DongdaemunCook 클래스 메서드실행 */
        DongdaemunCook dongdaemum = new DongdaemunCook();
        dongdaemum.run(); //가스가 켜집니다.
        dongdaemum.pongdang(); //물,떡,소스,어묵을 넣어주세요
        dongdaemum.finish(); //가스를 줄이고 위에 치즈를 뿌려주세요! 떡볶이가 완성되었습니다♥
	}
	
	
	public void sinsin() {
		
		/*신전 riceCakeStoreDTO객체 생성 후 매개변수 전달 */
		riceCakeStoreDTO Sinjeon = new riceCakeStoreDTO("신전떡볶이", 3500);
        System.out.println("\n"+Sinjeon.toString());
        
        /*신전Ingredient(재료)*/
        SinjeonIngredient st = new SinjeonIngredient();
        // 신전떡볶이 재료를 set방식으로 인자를 보냄
        st.setWater(350);
        st.setRiceCake(120);
        st.setSauce(100);
        
        /*재료를 출력하기 위한 toString*/  
        System.out.println(st.toString()+"\n");
         
        /*조리과정을 위한 객체*/
        /*sinjeon변수에 들어있는 SinjeonCook 클래스 메서드실행 */
        SinjeonCook sinjeon = new SinjeonCook();
        sinjeon.run();
        sinjeon.pongdang();
        sinjeon.stop();
        sinjeon.finish();
        sinjeon.run();
        sinjeon.finish();
	}
}
