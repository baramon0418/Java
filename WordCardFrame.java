import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCardFrame extends JFrame {
    private WordManager wordManager; //단어를 관리하는 WordManager 인스턴스
    private Word currentWord; //현재 카드에 표시된 단어

    public WordCardFrame(WordManager wordManager) {
        this.wordManager = wordManager;
        currentWord = wordManager.getOldestConfirmedWord(); // 가장 오래된 확인일의 단어를 선택

      //등록된 단어가 없는 경우 메시지를 표시하고 프레임을 닫음
        if (currentWord == null) { 
            JOptionPane.showMessageDialog(this, "등록된 단어가 없습니다.");
            dispose();
            return;
        }

        setTitle("낱말 카드");
        setSize(300, 200);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); //화면 중앙 위치

        JLabel wordLabel = new JLabel(currentWord.getEnglish(), SwingConstants.CENTER); //영어 단어를 표시할 레이블
        wordLabel.setFont(new Font("Serif", Font.BOLD, 20));
        add(wordLabel, BorderLayout.CENTER);

        JTextField answerField = new JTextField(); //사용자가 한글 뜻을 입력한 텍스트 필드
        add(answerField, BorderLayout.SOUTH);

        //사용자가 엔터 키나 제출버튼을 누르면 정답을 확인하는 이벤트 리스너
        answerField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = answerField.getText().trim(); //사용자가 입력한 답
                boolean isCorrect = false;
              //한글 뜻 리스트와 비교
                for (String meaning : currentWord.getKorean()) { 
                    if (meaning.trim().equalsIgnoreCase(answer)) {
                        isCorrect = true;
                        break;
                    }
                }
                //정답 여부에 따라 메시지 표시하고 확인일 업데이트
                if (isCorrect) {
                    JOptionPane.showMessageDialog(WordCardFrame.this, "정답입니다!");
                    wordManager.updateConfirmedDate(currentWord);
                } else {
                    JOptionPane.showMessageDialog(WordCardFrame.this, "틀렸습니다!");
                }
                dispose();
            }
        });

        setVisible(true);
    }
}
