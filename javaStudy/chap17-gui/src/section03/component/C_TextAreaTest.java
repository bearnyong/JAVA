package section03.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C_TextAreaTest {

	public static void main(String[] args) {
		JFrame mf = new JFrame();
		
		JTextField tf = new JTextField(30);
		JTextArea ta = new JTextArea(10,30);
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				ta.append(text+"\n");
				
				tf.setText("");
			}
		});
		
		mf.add(tf, BorderLayout.NORTH);
		mf.add(ta, BorderLayout.CENTER);
		
		mf.pack();
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
