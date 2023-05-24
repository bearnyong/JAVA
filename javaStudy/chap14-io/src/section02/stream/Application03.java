package section02.stream;

import java.io.FileOutputStream;

public class Application03 {

	public static void main(String[] args) {
		/* FileOutputStream
		 * 
		 * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
		 * 1바이트 단위로 데이터를 처리한다.*/
		
		/* 파일에 데이터를 내보내기 */
		FileOutputStream fout = null;
		
		// 역시 FileNotFoundException을 핸들링 해야 한다.
		try {
			/* 하지만 실행해도 예외는 발생하지 않는다.
			 * OutputStream의 경우 대상 파일이 존재하지 않으면 파일이 자동으로 생성해준다.
			 * 
			 * 두 번쨰 인자로 true를 전달하면 이어쓰기가 된다.
			 * false는 이어쓰기가 아닌 덮어쓰기이며 기본값을 false이다.*/
			fout = new FileOutputStream("src/section02/stream/testOutputStream.txt");
			fout.write(97);
			
			byte[] bar = new byte[] {98, 99,100,101,102,10};
			fout.write(bar);
			
			/* 1번 인덱스부터 3의 길이만큼 파일에 내보ㄴㅐ기*/
			fout.write(bar,1,3);
		}catch(Exception e) {
			
		}finally {
			if(fout != null) {
				try {
					fout.close();
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
	}

}
