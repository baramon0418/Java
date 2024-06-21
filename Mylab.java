import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.*;

public class Mylab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		f.add(panel);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		
		//Panel1에 해당
		JLabel label1 = new JLabel("화씨 온도");
		JTextField field1 = new JTextField(15);
		panel1.add(label1);
		panel1.add(field1);
		
		//panel2에 해당
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField field2 = new JTextField(15);
		panel2.add(label2);
		panel2.add(field2);
		
		//panel3에 해당
		JButton button = new JButton("변환");
		button.addActionListener(new MyListener());
		panel3.add(button);

		f.setSize(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");
		f.setVisible(true);
	}
	
	

}
