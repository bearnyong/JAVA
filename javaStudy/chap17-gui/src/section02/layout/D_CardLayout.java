package section02.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame {

	public D_CardLayout() throws HeadlessException {
		super("D_CardLayout");
		
		this.setBounds(300,200,800,500);
		CardLayout card = new CardLayout();
		this.setLayout(card);
		
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		card1.setBackground(Color.GRAY);
		card2.setBackground(Color.yellow);
		card3.setBackground(new Color(50,100,50));
		
		this.add(card1);
		this.add(card2);
		this.add(card3);
		
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card1.getParent());
				} 
				if(e.getButton()==3) {
					card.next(card1.getParent());
				}
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card2.getParent());
				} 
				if(e.getButton()==3) {
					card.next(card2.getParent());
				}
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card3.getParent());
				} 
				if(e.getButton()==3) {
					card.next(card3.getParent());
				}
			}
		});
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
