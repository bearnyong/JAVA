package section01.file;

import java.io.File;
import java.io.IOException;

public class Application01 {

	public static void main(String[] args) {

		/* File을 이용한 스트림을 사용하기 앞서 File 클래스의 기본 사용 방법을 확인해 본다.
		 * 
		 * jdk 1.0부터 지원하는 API로 파일 처리를 수행하는 표적인 클래스이다.
		 * 대상 파일에 대한 정보를 인스턴스로 생성하고
		 * 파일의 생성, 삭제 등등의 처리를 수행하는 기능을 제공하고 있따.
		 * 파일 클래스를 이용해서 인스턴스를 생성하나다.
		 * 대상 파일이 존재하지 않아도 인스턴스를 생성할 수 있다.*/
		
		File file = new File("src/section01/file/test.txt");	// 상대경로
		File file2 = new File("C:\\DEV\\java\\basic_java\\javaStudy\\chap14-io");	// 절대경로
		
		try {
			boolean createSuccess = file.createNewFile();
			System.out.println("createSuccess : " + createSuccess);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일의 크기 : " + file.length());
		System.out.println("파일의 경로 : " + file.getPath());
		System.out.println("현재 파일의 상위 경로 : " + file.getParent());
		
		/*절대경로*/
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
		
		boolean deleteSuccess = file.delete();
		
		System.out.println("deleteSuccess : " + deleteSuccess);
		
		
	}

}
