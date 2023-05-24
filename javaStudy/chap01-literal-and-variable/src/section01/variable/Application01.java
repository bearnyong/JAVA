package section01.variable;

public class Application01 {

	public static void main(String[] args) {
		
		/* 변수의 사용 목적
		 * 1. 값에 의미를 부여하기 위한 목적
		 * 2. 한 번 값을 저장하고 재사용을 하기 위한 목적
		 * 3. 시간에 따라 변하는 값을 저장하고 사용하기 위한 목적 */
		
		System.out.println("==== 값에 의미 부여 테스트 =======");
		System.out.println("보너를 포함한 급여 : "+ (1000+2000)+ '원');
		
		/* 선언과 함께 초기화 */
		int salary = 1000;
		
		/* 선언 후 초기화 */
		int intern;
		intern = 500;
		
		System.out.println(intern);
		
		System.out.println("====== 1년이 지난뒤 연봉 협상 후 =====");
		
		salary = 1500;
		intern = 0;
		
		System.out.println(salary);
		System.out.println(intern);
		
		System.out.println("==== 변수를 사용하지 않는 경우 =====");
		
		System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
		
		System.out.println("보너스 포인트 추가 지급 이벤트 시작");
		System.out.println("1번 고객에게 포인트 130포인트를 지급하였습니다.");
		System.out.println("2번 고객에게 포인트 130포인트를 지급하였습니다.");
		System.out.println("3번 고객에게 포인트 130포인트를 지급하였습니다.");
		System.out.println("4번 고객에게 포인트 130포인트를 지급하였습니다.");
		System.out.println("5번 고객에게 포인트 130포인트를 지급하였습니다.");
		
		int bonus = 130;
		
		System.out.println();
		System.out.println("변수를 사용하는 경우 ");
		System.out.println("1번 고객에게 포인트 "+ bonus+"포인트를 지급하였습니다.");
		System.out.println("2번 고객에게 포인트 "+ bonus+"포인트를 지급하였습니다.");
		System.out.println("3번 고객에게 포인트 "+ bonus+"포인트를 지급하였습니다.");
		
		System.out.println();
		System.out.println("시간이 지남에 따라 변하는 변수");
		int sum = 0;
		
		System.out.println(sum);
		sum += 10;
		System.out.println(sum);
		sum += 10;
		System.out.println(sum);
		sum = sum + 10;
		System.out.println(sum);
		
	}

}
