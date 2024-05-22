import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener {
    private JTextArea area;
    private JTextField field;

    public KeyEventTest() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setLocation(screenSize.width / 2 - 300 / 2, screenSize.height / 2 - 200 / 2);
        setSize(300, 200); // 컨테이너 사이즈
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Key Event");
        setResizable(true);

        JPanel panel = new JPanel(new BorderLayout());
        add(panel);

        JPanel panelTop = new JPanel(new GridLayout(0, 2));
        panel.add(panelTop, BorderLayout.NORTH);

        JLabel label = new JLabel("문자를 입력하세요:");
        panelTop.add(label);

        field = new JTextField();
        panelTop.add(field);

        area = new JTextArea();
        area.setEditable(false); // JTextArea는 읽기 전용으로 설정
        panel.add(new JScrollPane(area), BorderLayout.CENTER);

        field.addKeyListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventTest();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Typed: " + e.getKeyChar());
        area.append("Typed: " + e.getKeyChar() + "\n");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Pressed: " + e.getKeyChar());
        area.append("Pressed: " + e.getKeyChar() + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Released: " + e.getKeyChar());
        area.append("Released: " + e.getKeyChar() + "\n");
    }
}
