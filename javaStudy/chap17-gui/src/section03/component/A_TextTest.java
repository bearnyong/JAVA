package section03.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_TextTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
		/*글을 입력할 수 있는 한 줄 짜리 대화 상자*/
		JTextField id = new JTextField();
		panel.add(new JLabel("id"));
		panel.add(id);
		
		JPasswordField passwordField = new JPasswordField();
		panel.add(new JLabel("PASSWORD"));
		panel.add(passwordField);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		JButton btn = new JButton("보내기");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				text += "password = " + passwordField.getPassword() + "\n";
				
				char[] pass = passwordField.getPassword();
				for(int i= 0; i< pass.length; i++) {
					System.out.println(pass[i]);
				}
				
				textArea.append(text);
			}
		});
		mf.setBounds(200,200,500,500);
		
		mf.add(panel, BorderLayout.NORTH);
		mf.add(textArea, BorderLayout.CENTER);
		mf.add(btn, BorderLayout.SOUTH);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}