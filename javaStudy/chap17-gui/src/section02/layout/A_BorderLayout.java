package section02.layout;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A_BorderLayout extends JFrame {

	public A_BorderLayout() {
		super("BorderLayout");
		
		this.setBounds(300,200,800,500);
		JButton north = new JButton("북");
		JButton south = new JButton("남");
		JButton east = new JButton("동");
		JButton west = new JButton("서");
		JButton center = new JButton("가운데");
		
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);
		this.add(center, BorderLayout.CENTER);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
}
