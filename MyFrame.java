import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 
public class MyFrame extends JFrame{
	public MyFrame(String title) {
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			setLocation(screenSize.width/2 - 300/2, screenSize.height/2 - 200/2);
			setSize(300, 200); //컨테이너 사이즈
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("MyFrame");
			setResizable(true);
			setLayout(new BorderLayout());
			
			JButton button = new JButton("누르세요");
			this.add(button, BorderLayout.CENTER);
			
			JPanel panel2 = new JPanel(new BorderLayout());
			JButton button1 = new JButton("누르지 마세요");
			JButton button11 = new JButton("<");
			JButton button12 = new JButton(">");
			panel2.add(button1,BorderLayout.CENTER);
			panel2.add(button11,BorderLayout.WEST);
			panel2.add(button12,BorderLayout.EAST);
			
			this.add(panel2, BorderLayout.PAGE_END);
			
			JButton button2 = new JButton("첫번째 버튼을 누르세요");
			this.add(button2, BorderLayout.NORTH);
			
			
			setVisible(true);
	}
	
	public class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("버튼 눌림");
			JButton button = (JButton)e.getSource();
			if(button.getText() == "변환") {
				button.setText("변환 중");
			}
			else {
				button.setText("변환");
			}
			System.out.println(button.getText());
			
		}
	}
}
