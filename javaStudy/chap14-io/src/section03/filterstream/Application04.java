package section03.filterstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application04 {

	public static void main(String[] args) {
		/* 객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStrream을 살펴본다.
		 * 먼저 dto 클래스를 하나 추가한다.
		 * dto 패키지르 ㄹ하나 추가한 뒤 MemberDTO 클래스를 하나 만들어 본다.*/

		MemberDTO[]  outputMembers = {
				new MemberDTO("user01", "pass01" , "홍길동" , "hong777@gmail.com", 25, '남', 1250.7),
				new MemberDTO("user02", "pass02" , "홍길순" , "hong777@gmail.com", 26, '남', 1111.5),
				new MemberDTO("user03", "pass03" , "홍길덩" , "hong777@gmail.com", 27, '여', 502.2)
		};
	
		ObjectOutputStream objout = null;
		
		try {
			/* 객체 출력을 기존의 파일에 덮어쓰기 할 경우 */
			objOut = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("",true)));
			/* 출력 스트림을 열어 저장하게 되면 하나의 header와 data가 같이 저장되게 된다.
			 * 이때 fileOutputStream에 true를 하게 되면 기존 파일이 있는 상테에서 또 다른 header + data 가 이어서 누적되게 된다.
			 * 입력 스트림도 마찬가지로 한 번 열면 하나의 header+data 타입 단위로 읽게 된다.
			 * 하지만 읽어들이는 입력 스트림은 하나의 header+data 타입을 읽고 다시 header를 만나면
			 * StreamCorruptedException : invalid Type Code : Ac가 발생하게 된다.
			 * (이어붙이기 출력 당시 작성 된 이후 header를 만나면서 발생되는 예외)
			 * 
			 * 따라서, 추력 스트림을 통해 시어서 객체들을 저장하고 싶다면 척 header 이후에는 header없는 데이터들만 들어가야
			 * 한번의 입력 스트림으로 이어써진 모든 객체들을 예외없이 한 번에 불러올 수 있따.
			 * 
			 * 따라서 ObjectOutputStream을 상속받는 MyOutputStream을 따로 만들어 header를 생성하지 않는 출력 스트림을 만들고
			 * (오버라이딩을 통한 메소드 재정의)
			 * 기존에 파일이 있다면 한 번의 header+data가 들어있을테니 header를 작성하지 않는 MyOUtputStream을 써서 출력하도록 해야 한다.
			 * 아래의 if-else를 통해 작성하면 ObfectInputStream을 한 번에 여는 것으로 이어서 작성된 개게들을 한번에 불러올 수 있따.
			 * */
			
			// 객체 출력을 기존의 파일에 이어붙이기 하고 싶다면
			if(new File("src/section03/filterstream/testOvjectStream.txt").exists()/*파일 존재하는 지 검사*/) {
				/*파일이 있을 경우*/
				objOut = new MyOutputStream(
						new BufferedOutputStream(	//직렬화 헤더를 저장하지 않게 설정
								new FileOutputStream("src/section03/filterstream/testObjectStream.txt",)));
			} else {
				/*파일이 없는 경우 (최초 입력인 경우)*/
				objOut = new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("src/section03/filterstream/testObjectStream.txt")));
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
