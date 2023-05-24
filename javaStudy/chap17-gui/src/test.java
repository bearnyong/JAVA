import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class test {

	/*게임시작화면*/
	public static void main(String[] args) throws IOException {
		// 프레임 생성
        JFrame frm = new JFrame("코참런");
        frm.setIconImage(ImageIO.read(new File("images/bear.png")));
 
        // 프레임 크기 설정
        frm.setSize(1000, 700);
 
        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);
 
        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // 레이아웃 설정
        frm.getContentPane().setLayout(null);
 
        // 버튼 생성
        JButton btn1 = new JButton("점프");
        JButton btn2 = new JButton("슬라이드");
 
        // ★ 버튼 위치와 크기 설정
        btn1.setBounds(80, 550, 200, 50);
        btn2.setBounds(700, 550, 200, 50);
 
        // ★ 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
 
        // 프레임이 보이도록 설정
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
