import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WordListFrame extends JFrame {
    private WordManager wordManager; // 단어를 관리하는 WordManager 인스턴스

    public WordListFrame(WordManager wordManager) {
        this.wordManager = wordManager;

        setTitle("등록된 단어 확인");
        setSize(400, 300);
        setLocationRelativeTo(null); //화면 중앙에 위치
        setLayout(new BorderLayout());

        JTextArea wordTextArea = new JTextArea(); //단어 목록 표시할 텍스트 영역
        wordTextArea.setEditable(false); //텍스트 영역을 수정할 수 없도록 설정

        JScrollPane scrollPane = new JScrollPane(wordTextArea); //스크롤 가능한 패널에 텍스트 영역 추가
        add(scrollPane, BorderLayout.CENTER);

        //단어 목록을 StringBuilder를 사용해 문자열로 변환
        StringBuilder wordListBuilder = new StringBuilder();
        for (Word word : wordManager.getWords()) {
            wordListBuilder.append(word.getEnglish()).append(" - ").append(word.getKorean()).append("\n");
        }
        wordTextArea.setText(wordListBuilder.toString()); //변환된 문자열을 텍스트 영역에 설정

        //창닫기 이벤트 처리하는 리스너
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true); //프레임을 화면에 표시
    }
}
