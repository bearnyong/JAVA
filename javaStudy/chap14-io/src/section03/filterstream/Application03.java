package section03.filterstream;

import java.io.IOException;

public class Application03 {

	public static void main(String[] args) {
		/* 외부 데이터로부터 읽어오는 데이터를 바이트할 정수, 문자, 문자열로만 읽어오면
		 * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해주어야 한다.
		 * 예) 정수 입력받아 ㅓㅊ리하려면 parsing을 해줘야 한다.*/

		catch(FileNotFoudException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(dout != null) {
				try {
					dout.close();
				} catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
		DataInputStream din= null;
		
		try {
			din = new DataInputStream(new FileInputStream(""))
		}
		
		
	}

}
