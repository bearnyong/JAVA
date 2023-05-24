package section5.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application02 {

	public static void main(String[] args) {
		/* Calendar 클래스 사용
		 * Api 문서를 살펴보면 Calendar 클래스는 abstract 클래스로 작성되어 있따.
		 * 따라서 Caledar 클래스를 이용해서 인스턴스를 생성하는 것이 불가능하다.
		 * 
		 * Calendar 클래스를 이요한 인스턴스 생성 방법에는 두가지 방법이 있다.
		 * 1. getInstace() static 메소드를 이요해서 인스턴스를 반환받는 방법
		 * 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법*/

		// 1. getInstace() static 메소드 이용
		Calendar calendar = Calendar.getInstance();
		
		/* toString이 오버라이딩 되어 있어서 모든 필드의 값을 확인할 수 있다.
		 * Date 클래스에 비해 매우 많은 필드들이 값을 가지고 있따.
		 * 또한 생성된 인스턴스의 타입이 후손 클래스 타입인 GregorianCalendar 타입인 것을 확인할 수 있다.
		 * 
		 * 이 방식으로 인스턴스를 생성하면 운여에제의 날짜.시간 정보를 이용해서 인스턴스를 생성하게 된다.*/
		
		
		System.out.println(calendar);
		//특정 날짜/시간 정보를 이용해서 인스턴스를 생성하는 방법을 GregorianCalendar의 생성자로 제공한다.
		
		// 2. GregorianCalendar 이용하는 방법
		// 2-1. 기본 생성자 이용
		Calendar gragorianCalendar = new GregorianCalendar();
		System.out.println(gragorianCalendar);
		
		/* 2-2. 년,월,일,시,분,초 정보를 이용해서 인스턴스 생성
		 * 2014년 9월 18일 16:42:00*/
		int year = 2014;
		int month = 8;
		int dayOfmonth = 18;
		int hour = 16;
		int min = 42;
		int second = 0;
		
		Calendar birthDay = new GregorianCalendar(year, month, dayOfmonth, hour, min, second);
		System.out.println(birthDay);
		System.out.println(birthDay.getTimeInMillis());
		
		/* 상황에 따라 특정 일자를 기준으로 한 Date 타입의 인스턴스가 필요한 경우도 있다.
		 * 먼저 GregorianCalendar를 이용해서 특정 날짜.시간 정보를 인스턴스를 생성한 후
		 * 1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond로 계산해서 long 으로 반환하는 메소드가 있따.*/
		
		Date date = new Date();
		System.out.println(date);
		
		// 실제 사용 시 이런 형태로 사용되는 경우가 많다.
		Date date2 = new Date(new GregorianCalendar(year, month, dayOfmonth, hour, min, second).getTimeInMillis());
		System.out.println(date2);
		
		/* 생성된 인스턴스의 필드 정보를 Calendar클래스에 있는 get() 메소드를 사용하여 반환받을 수 있다.*/
		int birthYear = birthDay.get(1);
		int birthMonth = birthDay.get(2);
		int birthDayOfMonth = birthDay.get(3);
		
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDayOfMonth);
		
		/* 인자로 전달하는 정수에 따라 필드 값을 반환받을 수 있따.
		 * 하지만 이렇게 사용하게 되면 각 필드에 매칭되는 정수를 다 외워야 사용이 가능해진다.
		 * 따라서 저러한 정수를 상수 필드 형태로 제공하고 있따.
		 * */
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		/* 그러면 우리는 get() 메소드의 인자로 정수 대신 상수 필드값을 호출하는 식으로 코드를 개선하면 보다 의미 전달이 쉬운 코드가 된다.*/
		System.out.println("year : " + birthDay.get(Calendar.YEAR));
		System.out.println("month : " + birthDay.get(Calendar.MONTH));
		System.out.println("date : " + birthDay.get(Calendar.DATE));
		
		// 요일(일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)의 의미이다.
		System.out.println("dayOfweek : " + birthDay.get(Calendar.DAY_OF_WEEK));
		
		String day = "";
		switch(birthDay.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY : day = "일"; break;
			case Calendar.MONDAY : day = "월"; break;
			case Calendar.TUESDAY : day = "화"; break;
			case Calendar.WEDNESDAY : day = "수"; break;
			case Calendar.THURSDAY : day = "목"; break;
			case Calendar.FRIDAY : day = "금"; break;
			case Calendar.SATURDAY : day = "토"; break;
		}
		
		System.out.println("요일 : " + day);
		System.out.println("amPm : " + birthDay.get(Calendar.AM_PM));
		System.out.println(birthDay.get(Calendar.AM_PM)==Calendar.AM ? "오전" : "오후");
		System.out.println("hourOfDay : " + birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("hour : + " + birthDay.get(Calendar.HOUR));
		System.out.println("min : " + birthDay.get(Calendar.MINUTE));
		System.out.println("second : " + birthDay.get(Calendar.SECOND));
		
		/* 왜 1970년 1월 1일 0시 0분 0초 일까?
		 * 수직으로 태양이 떠로느는 시간을 정오(12)로 계산하는 방법을 태양시라고 부른다
		 * 그리치니 천문대 천문학적 업적을 기리고자 그리니치 천문대를 기준으로 태야잉 수직으로 떠오르는 시점을
		 * 12시로 측정한 시간대가 GMT 시간대 이다.
		 * 
		 * 하지만 태양시는 오차가 발생할 수 있따. 태양빛이 지구까지 오는 데 걸리는 시간은 8분12초~8분18초이기 떄문이다
		 * 태양시는 실제 태양 위치와 육안으로 측정한 시간의 오차가 발생할 수 밖에 없었따.
		 * 또한 지구가 23.5도 기울어져 있고 공전이 타원 궤도로 돌기 떄문에 계절에 따라 조금씩 다를 수 밖에 없다.
		 * 
		 * 이러한 시간을 측정하는 방식보다 조금 더 정밀한 측정 방법도 존재하는데
		 * 매우 작은 원자가 바다고가 들뜬 상태를 주기적으로 반복하는 것을 이용하여 측정하는 방법이 있따.
		 * 특히 세슘 원자의 경우 1초동안 진동하는 횟수가 실제 1초와 유사하여 30년만에 1초의 오차를 보이는 정확성을 보인다.
		 * 따라서 세계적으로 동일한 시간대를 사용하기 위해 협정한 시간을 세계시 UTC라고 한다.
		 * 
		 * 하지만 물리적으로 너무 정확하다보니 실제 존재하는 지구와 태양간의 공전.자전에 따른 오차를 반영해야 한다.
		 * 그래서 윤초를 두고 세슘 원자 시계와 태양시 오차를 보정하는데 사용한다.
		 * 이것이 정해진 날짜는 1972년 1월 1일이며, 세계 표준시를 기준으로 1972년 으로 계산하기에는 뭔가 딱 맞아 떨어지지 않아
		 * 1970년 1월 1일 0시 0분 0초 를 기준으로 컴퓨터에서는 시간대를 계산하기로 한 것이다.*/
		
	}

}
