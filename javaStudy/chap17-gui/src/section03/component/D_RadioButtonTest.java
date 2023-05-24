package section03.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButtonTest {
	
	public static void main(String[] args) {
		JFrame mf = new JFrame("라디오 버튼 테스트");
		mf.setSize(300,150);
		
		JPanel topJPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topJPanel.add(label);
		mf.add(topJPanel, BorderLayout.NORTH);
		
		JPanel sizeJPanel = new JPanel();
		JRadioButton small = new JRadioButton("small size");
		JRadioButton medium = new JRadioButton("medium size");
		JRadioButton large = new JRadioButton("large size");
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);;
		size.add(large);;
		
		sizeJPanel.add(small);
		sizeJPanel.add(medium);
		sizeJPanel.add(large);
		
		mf.add(sizeJPanel, BorderLayout.CENTER);
		
		JPanel resultJPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다.");
		resultJPanel.add(text);
		
		mf.add(resultJPanel, BorderLayout.SOUTH);
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("small사이즈가 입력되었습니다.");
			}
		});
		
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("medium사이즈가 입력되었습니다.");
			}
		});
		
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("large사이즈가 입력되었습니다.");
			}
		});
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
