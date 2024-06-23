import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

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
