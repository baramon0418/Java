//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.time.LocalDate;
//
//public class WordPanel extends JPanel {
//    private WordManager wordManager;
//    private MainFrame mainFrame;
//
//    public WordPanel(WordManager wordManager, MainFrame mainFrame) {
//        this.wordManager = wordManager;
//        this.mainFrame = mainFrame;
//
//        setLayout(new GridLayout(2, 3));
//
//        JButton addButton = new JButton("단어 등록");
//        addButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                addWord();
//            }
//        });
//        add(addButton);
//
//        JButton showWordsButton = new JButton("등록된 단어 확인");
//        showWordsButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                mainFrame.showWords();
//            }
//        });
//        add(showWordsButton);
//
//        JButton deleteWordButton = new JButton("잘못된 단어 삭제");
//        deleteWordButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                deleteWord();
//            }
//        });
//        add(deleteWordButton);
//
//        JButton clearWordsButton = new JButton("단어 전체 초기화");
//        clearWordsButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                clearWords();
//            }
//        });
//        add(clearWordsButton);
//    }
//
//    private void addWord() {
//        String english = JOptionPane.showInputDialog("영어 단어를 입력하세요:");
//        String korean = JOptionPane.showInputDialog("한글 뜻을 입력하세요 (쉼표로 구분):");
//        LocalDate now = LocalDate.now();
//        Word word = new Word(english, korean, now, now);
//        wordManager.addWord(word);
//        mainFrame.showWords();
//    }
//
//    private void deleteWord() {
//        String english = JOptionPane.showInputDialog("삭제할 영어 단어를 입력하세요:");
//        wordManager.deleteWord(english);
//        mainFrame.showWords();
//    }
//
//    private void clearWords() {
//        wordManager.clearWords();
//        mainFrame.showWords();
//        JOptionPane.showMessageDialog(mainFrame, "단어 목록이 초기화되었습니다.");
//    }
//}
