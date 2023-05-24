package section02.stream;

import java.io.File;
import java.io.FileReader;

public class Application02 {

	public static void main(String[] args) {
		/* FileReader
		 * FileInputStream과 사용하는 방법이 거의 동일하다
		 * 단, byte 단위가 아닌 character 단위로 읽어 들이기는 부분이 차이점이다.
		 * 따라서 2바이트이던 3바이트이던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.*/
		
		FileReader fr = null;
		
		try {
			/* 마찬가지로 파일이 존재하지 않는 경우 파일을 찾지 못한다는 예외가 발생한다.
			 * 파일을 추가해주면 정상적으로 스트림이 생성된다.*/
			fr = new FileReader("src/section02/stream/testReader.txt");
			int value;
			
			while((value = fr.read())!=-1) {
				System.out.println((char)value);
			}
			
			/* 단, byte 배열로 읽어오는 경우 한글은 꺠지게 된다.
			 * 유니코드로 변환된 한글은 byte에 저장하기에 더 큰 숫자를 가지기 떄문에 오버플로우가 발생된다.
			 * 따라서 byte 배열이 아닌 char 배열로 내용을 읽어오는 기능을 제공하고 있따.*/
			
			char[] carr = new char[(int)new File("src/section02/stream/testReader.txt").length()];
			fr.read(carr);
			
			for(int i=0; i<carr.length; i++) {
				System.out.println(carr[i]);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	}

}
