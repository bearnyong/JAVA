package section03.component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B_TextFiledTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		mf.setSize(300,130);
		mf.setTitle("제곱 계산하기");
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));
		JTextField text = new JTextField(15);
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값 : "));
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		JButton btn = new JButton("ok");
		panel.add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText());
				result.setText(value * value + " ");
				
				text.setText("");
				text.requestFocus();
			}
		});
		
		mf.add(panel);
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
