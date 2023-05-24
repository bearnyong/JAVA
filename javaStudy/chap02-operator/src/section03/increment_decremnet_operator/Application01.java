package section03.increment_decremnet_operator;

public class Application01 {

	public static void main(String[] args) {
		
		// 증감연산자
		// 피연산자의 앞 혹은 뒤에 사용이 가능ㅎ다ㅏ.
		// ++ : 1증가의 의미
		// -- : 1감소의 의미
		
		int num = 20;
		System.out.println("num : " + num);
		
		num++;
		System.out.println("num : "+ num);
		
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		// 단항으로 사용될 때는 1증가, 1감소의 의미를 가진다.
		/* 하지만 문제는 다른 연산자와 함께 사용할 때 의미가 달라진다는 것이다.
		 * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
		 * ++var : 피연산자에 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
		 * var++ : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
		 * --var : 피연산자의 값을 먼저  1 감소 시킨 후 다른 연산을 진행함
		 * var-- : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
		 * 
		 * */
		
		int firstNum = 20;
		int result = firstNum++ * 3;
		
		System.out.println("result1 : " + result);
		System.out.println("firstNum : " + firstNum );
		
		int secondNum = 20;
		int result2 = ++secondNum * 3;
		
		System.out.println("result2 : " + result2);
		System.out.println("secondNum :" + secondNum);
	}

}
