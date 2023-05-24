import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application02 {


	public static void main(String[] args) {
		/* 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용*/
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url","jdbc:oracle:thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "user");
		prop.setProperty("password", "pass");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("dirver.txt"),"jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Properties prop2 = new Properties();
		
		try {
			prop2.load(new FileInputStream("dricer.dat"));
			prop2.load(new FileReader("driver.txt"));
			
			// jdk 1.5 부터 xml 파일을 properties 로 사용할 수 있게 되었다.
			prop2.loadFromXML(new FileInputStream("driver.xml"));
			
			prop2.list(System.out);
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}