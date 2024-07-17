//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//
//public class TestPanel extends JPanel {
//    private WordManager wordManager;
//    private MainFrame mainFrame;
//
//    public TestPanel(WordManager wordManager, MainFrame mainFrame) {
//        this.wordManager = wordManager;
//        this.mainFrame = mainFrame;
//
//        setLayout(new GridLayout(1, 2));
//
//        JButton cardButton = new JButton("낱말 카드 생성");
//        cardButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new WordCardFrame(wordManager);
//            }
//        });
//        add(cardButton);
//
//        JButton testButton = new JButton("영어 단어 암기 Test");
//        testButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String countStr = JOptionPane.showInputDialog("테스트할 단어 수를 입력하세요", "10");
//                int count = Integer.parseInt(countStr);
//                List<Word> words = wordManager.getOldestConfirmedWords(count);
//                if (words.isEmpty()) {
//                    JOptionPane.showMessageDialog(mainFrame, "테스트할 단어가 없습니다.");
//                } else {
//                    new WordTestFrame(words, mainFrame);
//                }
//            }
//        });
//        add(testButton);
//    }
//}
