import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class MainFrame extends JFrame {
    private WordManager wordManager;
    private JTextArea textArea;
    private JLabel wordCountLabel;
    private JLabel testResultLabel; // 시험 결과를 표시할 레이블
    private int totalWords; // 등록된 총 단어 수
    private int totalCorrectWords; // 시험에서 맞춘 단어 수

    public MainFrame() {
        wordManager = new WordManager("words.dat");

        setTitle("영어 단어 암기 프로그램");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(2, 3));

        JButton addButton = new JButton("단어 등록");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addWord();
            }
        });
        panel.add(addButton);

        JButton cardButton = new JButton("낱말 카드 생성");
        cardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WordCardFrame(wordManager);
            }
        });
        panel.add(cardButton);

        JButton testButton = new JButton("영어 단어 암기 Test");
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String countStr = JOptionPane.showInputDialog("테스트할 단어 수를 입력하세요", "10");
                int count = Integer.parseInt(countStr);
                List<Word> words = wordManager.getOldestConfirmedWords(count);
                if (words.isEmpty()) {
                    JOptionPane.showMessageDialog(MainFrame.this, "테스트할 단어가 없습니다.");
                } else {
                    new WordTestFrame(words, MainFrame.this);
                }
            }
        });
        panel.add(testButton);

        JButton showWordsButton = new JButton("등록된 단어 확인");
        showWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WordListFrame(wordManager);
            }
        });
        panel.add(showWordsButton);

        JButton deleteWordButton = new JButton("잘못된 단어 삭제");
        deleteWordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteWord();
            }
        });
        panel.add(deleteWordButton);

        JButton clearWordsButton = new JButton("단어 전체 초기화");
        clearWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearWords();
            }
        });
        panel.add(clearWordsButton);

        add(panel, BorderLayout.NORTH);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2)); // 레이아웃 변경

        wordCountLabel = new JLabel("등록된 단어 수: " + wordManager.getWords().size());
        bottomPanel.add(wordCountLabel);

        testResultLabel = new JLabel("최근 영어 단어 암기 결과: "); // 시험 결과 레이블 추가
        bottomPanel.add(testResultLabel);

        add(bottomPanel, BorderLayout.SOUTH);

        showWords();
    }

    private void addWord() {
        String english = JOptionPane.showInputDialog("영어 단어를 입력하세요:");
        String korean = JOptionPane.showInputDialog("한글 뜻을 입력하세요 (쉼표로 구분):");
        LocalDate now = LocalDate.now();
        Word word = new Word(english, korean, now, now);
        wordManager.addWord(word);
        showWords();
    }

    public void showWords() { // 메서드를 public으로 변경
        textArea.setText("");
        totalWords = wordManager.getWords().size(); // 총 단어 수 업데이트
        for (Word word : wordManager.getWords()) {
            textArea.append(word.getEnglish() + " - " + String.join(", ", word.getKorean()) + " (등록일: " + word.getRegisteredDate() + ", 확인일: " + word.getConfirmedDate() + ")\n");
        }
        wordCountLabel.setText("등록된 단어 수: " + totalWords);
    }

    private void clearWords() {
        wordManager.clearWords();
        showWords();
        JOptionPane.showMessageDialog(this, "단어 목록이 초기화되었습니다.");
    }

    private void deleteWord() {
        String english = JOptionPane.showInputDialog("삭제할 영어 단어를 입력하세요:");
        wordManager.deleteWord(english);
        showWords();
    }

    // 시험 결과를 업데이트하는 메서드
    public void updateTestResult(int correctAnswers) {
        totalCorrectWords = correctAnswers;
        testResultLabel.setText("최근 영어 단어 암기 결과: " + totalCorrectWords + "/" + totalWords);
    }
    
    public WordManager getWordManager() {
        return wordManager;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
