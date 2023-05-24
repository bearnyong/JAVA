package section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application01 {

	public static void main(String[] args) {
		/* 입출력 스트림 개요
		 * 우리는 프로그래밍을 할 떄 많은 종류의 데이터를 다루어야 한다ㅏ.
		 * 하지만 데이터는 프로그램 내부에 있을 수도 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수 도 있다.
		 * 또한 프로그램에서 생성한 데이터를 외부로 출력할 수도 있따.
		 * 
		 * 외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미하낟. 외부 데이터는 하드 디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수도 있다.
		 * 
		 * 외부 데이터를 대상으로 작업할 떄 가장 먼저 해야할 일은 자바 프로그램과 외부 데이터를 연결하는 것이다.
		 * 프로그램과 외부 데이터가 연결된 길을 스트림(Stream)이라고 한다.
		 * 스트림은 단방향이기 떄문에 데이터를 읽어오기 위한 길은 입력스트림, 데이터를 출력하기 위한 길은 출력스트림이라고 부른다.
		 * 스트립ㅁ은 단방향이기 떄문에 데이터를 읽어오기 위한 길은 입력 스트림, 데이터를 출력하기 위한 길은 출력스트릠이라고 부른다.
		 * 
		 * 입출력과 관련된 api는 java.io 패키지에서 제공하고 있다.
		 * api 문서에 목록을 확인해보면 대부분 InputStream/Quputstream, Reader/Witer로 끝난다
		 * 이러한 클래스 모두가 외부 데이터를 읽어오는 기능을 가진 스트림이다.
		 * 그 중 inputStream과 Reader는 데이터를 읽어오는 입력스트림이고,
		 * OutputStream과 Writer는 데이터를 내보내는 출력 스트림이다.
		 * 
		 * 또한 InputStream과 QutputStream은 데이터를 1바이트 단위로 입/출력하고
		 * Reader와 Witer계역은 글자를 (2바이트 혹은  3바아트) 단위로 작업을 한다.
		 * 
		 * Ms949 인코딩에서는 한글 한 글자를 2바이트로 취급하지만
		 * UTF-8(세계 공용 인코딩set)에서는 한글 한 글자를 3바이트로 취급한다.
		 * (이는 전세계 문자를 표현하기 위해 1바이트를 올린 것이다.)
		 * 
		 * 자바 프로그램과 연결되는 외부 데이터의 타입이 무엇인지 클래스의 이름을 보고 유추가 가능하다.
		 * InputStream/OutputStram/Reader/Writer를 뺴고 남은 단어가 바로 외부 데이터의 타입이다.
		 * 
		 * 예) FileInputStram은 InputStream을 제거하고 남은 단어가 File이므로 외부 데이터는 File 임을 알 수 있다.
		 * 
		 * 외부 데이터를 프로그램으로 읽어들이는 스트림은 입력스트림이라고 하고
		 * 몇 바이트씩을 한 번에 처리하는지에 따라 InputStream과 Writer로 구분한다.*/
		
		//FileInputStream
		FileInputStream fin = null;
		
		try {
			/* 대상 파일이 존재하지 않는 경우 발생하는 FileNotFoundException에 대한 핸들링이 필요하다.*/
			fin = new FileInputStream("src/section02/stream/testInputStream.txt");
			/* 동일 패키지에서 우클릭 한 후 new -> file을 선택하여 해당 파일을 생성하고 실행하면 예외가 발생하지 않는다.*/
			
			int value;
			
			while((value = fin.read())!=-1){
				System.out.println(value);
				System.out.println((char)value);
			}
			System.out.println("파일의 길이 : "+ new File("src/section02/stream/testInputStream.txt").length());
			/* 파일의 길이 만큼 byte 배열을 만든다.*/
			int fileSize = (int) new File("src/section02/stream/testInputStream.txt").length();
			byte[] bar = new byte[fileSize];
			/* read() 메소드의 인자로 생성한 byte 배열을 넣어주면
			 * 파일의 내용을 읽어서 byte 배열에 기록해준다.*/
			fin.read(bar);
			System.out.println("fin : " + fin);
			/* 해당 스트림은 파일의 끝까지 다 읽어들인 스트림이기 때문에
			 * 위에 1바이트씩 읽어온 내용을 주석해야 정상적으로 동작한다.*/
			for(int i=0;i<bar.length; i++) {
				System.out.println((byte)bar[i]);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fin != null) {
				try {
					/* 처자원 해제를 하는 경우에도 IOException핸들링을 해야한다.
					 * 이미 자원이 반납된 경우 발생하는 Exception이다.
					 * 
					 * 자원 반납을 해야 하는 이유
					 * 1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 ㄱ리소스에서 누수(leak(가 발생한다.
					 * 2. 뒤에서 배우는 버퍼를 이요하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야 한다.
					 * 만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
					 * 판단하기 어렵고 의도하지 않은 상황에서도 이런 현상이 발생할 수 있기 떄문에 마지막에는 flush()를
					 * 무조건 실행해주는 것이 좋다.
					 * close()메소드느 자원을 반납하며 flush()를 해 주기 떄문에close()만 제대로 해 줘도 된다.
					 * 따라서 close()메소드는 외부 자원을 사용하는 경우 반드시 마지막에 호출해줘야 한다.*/
					
					/* try with resource 구문을 사용하면 마지막에 close를 자동으로 호출해준다.*/
					fin.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}

	}

}
