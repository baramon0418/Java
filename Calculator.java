import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display; // 숫자 입력 창

    public Calculator() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // 숫자 입력 창 설정 (BorderLayout 사용)
        display = new JTextField();
        display.setEditable(false); // 편집 불가능하도록 설정
        add(display, BorderLayout.NORTH);
        display.setPreferredSize(new Dimension(400, 50)); //입력창 크기 늘리기
        
        // 숫자 및 사칙 연산자 버튼 설정 (GridLayout 사용)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 5, 5, 5)); // 행과 열 간격을 5로 설정

        String[] buttonLabels = {
            "Backspace", "", "", "CE", "C", 
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "*", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+" ,"="
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            JPanel panel = new JPanel(new BorderLayout()); // 각 버튼을 담을 패널 생성
            panel.add(button, BorderLayout.CENTER); // 패널에 버튼 추가
            buttonPanel.add(panel); // 버튼 패널을 버튼 패널에 추가
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    // 버튼 클릭 리스너 클래스
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            // 클릭된 버튼의 텍스트를 display에 추가
            display.setText(display.getText() + command);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
