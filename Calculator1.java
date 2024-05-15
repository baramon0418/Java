import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator1 extends JFrame implements ActionListener {
    private JTextField field;
    private JButton[] button;
    private StringBuilder expression;
    double num1, num2 = 0;
    
    public Calculator1() {
        JPanel panel = new JPanel(new BorderLayout());
        add(panel);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel.add(panel1, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.CENTER);

        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(4, 4, 2, 2));

        field = new JTextField();
        field.setEditable(false);
        panel1.add(field);

        String[] KeyPadButton = {"7", "8", "9", "/",
                                "4", "5", "6", "*",
                                "1", "2", "3", "-",
                                "C", "0", "=", "+"};
        button = new JButton[KeyPadButton.length];
        for (int i = 0; i < KeyPadButton.length; i++) {
            button[i] = new JButton(KeyPadButton[i]);
            button[i].addActionListener(this);
            panel2.add(button[i]);
        }

        expression = new StringBuilder();

        setSize(300, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.equals("C")) {
            expression.setLength(0);
            field.setText("");
        } else if (input.equals("=")) {
            try {
                double result = evaluateExpression();
                field.setText(String.valueOf(result));
            } catch (Exception ex) {
                field.setText("Error");
            }
        } else {
            expression.append(input);
            field.setText(expression.toString());
        }
    }


    private double evaluateExpression() throws ArithmeticException {
        String expr = expression.toString();
        String[] tokens = expr.split("[\\+\\-\\*\\/]"); // "+" 뿐만 아니라 "-", "*", "/"도 고려

        if (tokens.length != 2) { // 피연산자는 2개여야 함
            throw new IllegalArgumentException("Invalid expression format");
        }
        

        num1 = Double.parseDouble(tokens[0].trim());
        char operator = expr.charAt(tokens[0].length()); // 연산자 위치
        num2 = Double.parseDouble(tokens[1].trim());

        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


    public static void main(String[] args) {
        Calculator1 calculator = new Calculator1();
    }
}
