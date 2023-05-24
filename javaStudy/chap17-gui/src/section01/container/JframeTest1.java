package section01.container;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JframeTest1 extends JFrame {
	
	public JframeTest1() {
		this.setBounds(300,200,800,500);
		this.setTitle("MyFrame");
		
		try{
			this.setIconImage(ImageIO.read(new File("images/bear.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setResizable(false);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
