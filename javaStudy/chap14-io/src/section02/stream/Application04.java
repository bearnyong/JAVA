package section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application04 {

	public static void main(String[] args) {
		/* FileWriter
		 * 
		 * 프로그램의 데이터를 파일로 내보내기 위한 용ㅇ도의 스트림이다.
		 * 1. 글자 단위로 데이터를 처리한다.*/
		
		FileWriter fw = null;
		
		/* FileNotFoundException을 핸들링 해야 한다.*/
		try{
			/* 하지만 실행해도 예외는 발생하지 않는다.
			 * Witer의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.
			 * 
			 * 두 번쨰 인자로 true를 전달하면 이어쓰기가 된다.
			 * false는 이어쓰기가 아닌 덮어쓰기 이며 기본값은 false이다.*/
			fw = new FileWriter("src/section02/stream/testWriter.txt", true);
			// writer() 메소드는 IOException을 핸들링 해야 ㅎㄴ다.
			fw.write(97);
			
			// 문자 기반 스트림은 직접 char 자료형으로 내보내기도 가능하다.
			fw.write('A');
			
			// char[] 배열도 가능하다.
			fw.write(new char[] {'A','B','C','D'});
			
			fw.write("문자열");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		

	}

}
