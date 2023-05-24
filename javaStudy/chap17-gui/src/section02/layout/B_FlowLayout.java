package section02.layout;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame {

	public B_FlowLayout() throws HeadlessException {
		super("FlowLayOut");
		this.setBounds(300,200,800,500);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.add(new JButton("1번"));
		this.add(new JButton("2번"));
		this.add(new JButton("3번"));
		this.add(new JButton("4번"));
		this.add(new JButton("5번"));
		this.add(new JButton("5번"));
		this.add(new JButton("6번"));
		this.add(new JButton("7번"));
		this.add(new JButton("8번"));
		this.add(new JButton("9번"));
		this.add(new JButton("10번"));
		this.add(new JButton("11번"));
		this.add(new JButton("12번"));
		this.add(new JButton("13번"));
		this.add(new JButton("14번"));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
