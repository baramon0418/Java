import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordTestFrame extends JFrame {
    private List<Word> words; //테스트에 사용할 단어 리스트
    private int totalWordsCount; // 시험에 사용된 단어의 총 수
    private int currentWordIndex = 0; //현재 단어 인덱스
    private int correctCount = 0; //맞춘 단어 인덱스
    private List<Word> correctWords = new ArrayList<>(); // 정답인 단어들을 저장
    private List<String> incorrectWords = new ArrayList<>(); //오답인 단어들을 저장
    private JLabel wordLabel; //현재 단어를 표시
    private JTextField textField; //사용자가 입력할 텍스트
    private MainFrame mainFrame; //메인프레임

    public WordTestFrame(List<Word> words, MainFrame mainFrame) {
        this.words = new ArrayList<>(words);
        Collections.shuffle(this.words); // 단어 순서를 랜덤하게 섞기
        this.mainFrame = mainFrame;
        this.totalWordsCount = words.size(); // 시험에 사용된 단어의 총 수 저장

        setTitle("영어 단어 암기 테스트");
        setSize(400, 300);
        setLocationRelativeTo(null); //창을 화면 중앙에 위치
        setLayout(new BorderLayout());

        wordLabel = new JLabel("", SwingConstants.CENTER); //단어를 표시할 레이블 초기화
        wordLabel.setFont(new Font("Serif", Font.BOLD, 24));
        add(wordLabel, BorderLayout.NORTH);

        textField = new JTextField(); //사용자가 입력할 텍스트 필드 초기화
        textField.setFont(new Font("Serif", Font.PLAIN, 24));
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer(); //엔터 키를 누르면 정답 확인
            }
        });
        add(textField, BorderLayout.CENTER);

        JButton submitButton = new JButton("제출"); //제출 버튼 초기화
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer(); //버튼을 클릭하면 정답 확인
            }
        });
        add(submitButton, BorderLayout.SOUTH);

        showNextWord(); //첫번째 단어 표시

        setVisible(true);
    }

    //다음 단어 표시하는 메소드
    private void showNextWord() {
        if (currentWordIndex < words.size()) {
            Word word = words.get(currentWordIndex);
            wordLabel.setText(word.getEnglish()); //현재 단어를 레이블에 설정
            textField.setText(""); //텍스트 필드 초기화
        } else {
            showResult(); //모든 단어를 테스트한 경우 결과 표시
        }
    }

    //사용자가 입력한 답을 확인하는 메소드
    private void checkAnswer() {
        String answer = textField.getText().trim(); //사용자가 입력한 답
        Word currentWord = words.get(currentWordIndex);

        //정답 맞는지 확인
        boolean isCorrect = currentWord.getKorean().stream()
                .anyMatch(korean -> korean.trim().equalsIgnoreCase(answer));

        if (isCorrect) {
            correctCount++; // 정답인 경우에만 correctCount 증가
            correctWords.add(currentWord); // 정답인 단어를 리스트에 추가
            mainFrame.getWordManager().updateConfirmedDate(currentWord); // 확인일 업데이트
            mainFrame.showWords(); // 단어 목록 업데이트
        }

        currentWordIndex++; //다음 단어 이동
        showNextWord(); //다음 단어 표시
    }

    //테스트 결과를 표시하는 메소드
    private void showResult() {
        StringBuilder resultMessage = new StringBuilder();
        resultMessage.append("테스트 완료!\n");
        resultMessage.append("총 단어 수: ").append(words.size()).append("\n");
        resultMessage.append("맞은 개수: ").append(correctCount).append("\n");
        resultMessage.append("틀린 개수: ").append(words.size() - correctCount).append("\n\n");
        
        JOptionPane.showMessageDialog(this, resultMessage.toString()); //결과 메시지 표시
        mainFrame.updateTestResult(correctCount); //메인 프레임에 테스트 결과 업데이트
        dispose(); // 테스트 창 닫기
    }
}
