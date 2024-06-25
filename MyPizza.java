import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyPizza extends JFrame implements ActionListener {

    JLabel label1, label2;
    JButton button1, button2, button3;
    JTextField field1;
    int numPizza = 0;

    public MyPizza() {
        JFrame f = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // panel1
        label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
        panel1.add(label1);

        // panel2
        button1 = new JButton("콤보피자");
        button1.addActionListener(e -> {
            System.out.println("콤보피자 이벤트");
            numPizza++;
            field1.setText("" + numPizza);
        });
        button2 = new JButton("포테이토피자");
        button2.addActionListener(this);
        button3 = new JButton("불고기피자");
        button3.addActionListener(this);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);

        label2 = new JLabel("개수");
        field1 = new JTextField(10);
        field1.setText("" + numPizza);
        panel2.add(label2);
        panel2.add(field1);

        f.setSize(600, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("MyFrame");

        panel.add(panel1);
        panel.add(panel2);
        f.add(panel);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        MyPizza obj = new MyPizza();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button2) {
            System.out.println("포테이토피자 이벤트");
            numPizza++;
            field1.setText("" + numPizza);
        } else if (e.getSource() == button3) {
            System.out.println("불고기피자 이벤트");
            numPizza++;
            field1.setText("" + numPizza);
        }
    }
}
