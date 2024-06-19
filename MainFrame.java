import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;

public class MainFrame extends JFrame {
    private WordManager wordManager; // 단어 관리를 위한 wordManager
    private JTextArea textArea; // 단어 목록을 표시할 텍스트 영역
    private JLabel wordCountLabel; //등록된 단어 수를 표시할 레이블
    private JLabel testResultLabel; // 시험 결과를 표시할 레이블
    private int totalWords; // 등록된 총 단어 수
    private int totalCorrectWords; // 시험에서 맞춘 단어 수

    public MainFrame() {
        wordManager = new WordManager("words.dat");//단어 데이터를 관리하는 WordManager 초기화

        setTitle("영어 단어 암기 프로그램");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //창을 화면 중앙에 배치
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(2, 3));

        //단어 등록 버튼
        JButton addButton = new JButton("단어 등록");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addWord(); //단어등록 메소드 호출
            }
        });
        panel.add(addButton);

        //낱말 카드 생성 버튼
        JButton cardButton = new JButton("낱말 카드 생성");
        cardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WordCardFrame(wordManager); //WordCardFrame을 생성
            }
        });
        panel.add(cardButton);

        //영어 단어 암기 테스트 버튼
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
                    new WordTestFrame(words, MainFrame.this);// WordTestFrame 생성
                }
            }
        });
        panel.add(testButton);

        //등록된 단어 확인 버튼
        JButton showWordsButton = new JButton("등록된 단어 확인");
        showWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WordListFrame(wordManager); // WordListFrame 생성
            }
        });
        panel.add(showWordsButton);

        //잘못된 단어 삭제 버튼
        JButton deleteWordButton = new JButton("잘못된 단어 삭제");
        deleteWordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteWord(); //단어 삭제 메소드 호출
            }
        });
        panel.add(deleteWordButton);

        //단어 전체 초기화 버튼
        JButton clearWordsButton = new JButton("단어 전체 초기화");
        clearWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearWords(); //단어 전체 초기화 메소드 호출
            }
        });
        panel.add(clearWordsButton);

        add(panel, BorderLayout.NORTH); //버튼 패널을 프레임 상단에 추가

        textArea = new JTextArea(); //단어 목록을 표시할 텍스트 영역 생성
        add(new JScrollPane(textArea), BorderLayout.CENTER);// 스크롤 가능한 텍스트 영역을 프레임 중앙에 추가

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2)); // 레이아웃 변경

        wordCountLabel = new JLabel("등록된 단어 수: " + wordManager.getWords().size());// 등록된 단어 수 레이블 초기화
        bottomPanel.add(wordCountLabel);

        testResultLabel = new JLabel("최근 영어 단어 암기 결과: "); // 시험 결과 레이블 추가
        bottomPanel.add(testResultLabel);

        add(bottomPanel, BorderLayout.SOUTH); //하단 패널을 프레임 하단에 추가

        showWords(); //단어 목록 표시
    }

    //새로운 단어를 등록하는 메소드
    private void addWord() {
        String english = JOptionPane.showInputDialog("영어 단어를 입력하세요:");
        String korean = JOptionPane.showInputDialog("한글 뜻을 입력하세요 (쉼표로 구분):");
        LocalDate now = LocalDate.now();
        Word word = new Word(english, korean, now, now);
        wordManager.addWord(word); //단어를 WordManager에 추가
        showWords(); //단어 목록 업데이트
    }

    //단어 목록을 표시하는 메소드
    public void showWords() { // 메소드를 public으로 변경
        textArea.setText("");
        totalWords = wordManager.getWords().size(); // 총 단어 수 업데이트
        for (Word word : wordManager.getWords()) {
            textArea.append(word.getEnglish() + " - " + String.join(", ", word.getKorean()) + " (등록일: " + word.getRegisteredDate() + ", 확인일: " + word.getConfirmedDate() + ")\n");
        }
        wordCountLabel.setText("등록된 단어 수: " + totalWords); // 단어 수 레이블 업데이트
    }

    //단어 목록을 초기화하는 메소드
    private void clearWords() {
        wordManager.clearWords(); //단어 목록 초기화
        showWords(); //단어 목록 업데이트
        JOptionPane.showMessageDialog(this, "단어 목록이 초기화되었습니다.");
    }

    //특정 단어 삭제하는 메소드
    private void deleteWord() {
        String english = JOptionPane.showInputDialog("삭제할 영어 단어를 입력하세요:");
        wordManager.deleteWord(english); //단어 삭제
        showWords(); //단어 목록 업데이트
    }

    // 시험 결과를 업데이트하는 메서드
    public void updateTestResult(int correctAnswers) {
        totalCorrectWords = correctAnswers;
        testResultLabel.setText("최근 영어 단어 암기 결과: " + totalCorrectWords + "/" + totalWords); //시험 결과 업데이트
    }
    
    //WordManager 인스턴스 반환하는 메소드
    public WordManager getWordManager() {
        return wordManager;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true); //MainFrame 생성 및 표시
            }
        });
    }
}