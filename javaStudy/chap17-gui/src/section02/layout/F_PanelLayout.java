package section02.layout;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame {

	public F_PanelLayout() throws HeadlessException {
		super("JPanelLayout");
		
		this.setBounds(200,200,500,500);	//창의 크기
		
		JLabel lb = new JLabel(" : ");		//:있는 부분
		lb.setLocation(50,100);
		lb.setSize(150,50);
		
		JTextField tf = new JTextField("hghg");  //텍스트필드 기본값 hghg
		tf.setLocation(110,100);
		tf.setSize(200,50);
		
		JButton btn = new JButton(" 버튼 ");
		btn.setLocation(350,100);
		btn.setSize(100,50);
		
		JPanel panel = new JPanel();
		panel.setSize(500,500);
		
		panel.setLayout(null);
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //실행중인지 아래 네모빨강 버튼으로 보여주기
		this.setVisible(true);	//창을 보일지 안보일지 옵션 설정!!
		}
	
}
