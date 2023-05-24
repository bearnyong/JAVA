import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test2 {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setBounds(300,200,800,500);
		
		JButton btn = new JButton(" 버튼 ");
		btn.setLocation(350,100);
		btn.setSize(100,50);
		
		JButton btn2 = new JButton(" 버튼2 ");
		btn2.setLocation(350,100);
		btn2.setSize(50,50);
		
		mf.add(btn, BorderLayout.WEST);
		mf.add(btn2, BorderLayout.EAST);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
