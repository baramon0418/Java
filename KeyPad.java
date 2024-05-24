import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

public class KeyPad extends JFrame implements ActionListener{
	private JTextField field;
	private JButton[] button;
	
	public KeyPad() {
		JPanel panel = new JPanel(new BorderLayout());
		add(panel);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel.add(panel1,BorderLayout.NORTH);
		panel.add(panel2,BorderLayout.CENTER);
		
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new GridLayout(3,3,2,2));
		
		field = new JTextField();
		panel1.add(field);
		
		button = new JButton[9];
		for(int i = 0; i < 9; i++) {
			button[i] = new JButton();
			button[i].setText(""+(i+1));
			button[i].addActionListener(this);
			panel2.add(button[i]);
		}
		
		setSize(300, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KeyPad");
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i <9; i++) {
			if (e.getSource() == button[i]) {
				field.setText(field.getText() + button[i].getText());
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyPad obj = new KeyPad();

	}
	
}
