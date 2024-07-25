import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WordManager {
    private List<Word> words; //단어 목록 저장하는 리스트
    private String filePath; //단어 데이터 저장할 파일 경로

    public WordManager(String filePath) {
        this.filePath = filePath;
        words = new ArrayList<>();
        loadWords(); //파일에서 단어 로드
    }

    //새로운 단어를 추가하고 파일에 저장
    public void addWord(Word word) {
        words.add(word);
        saveWords(); //변경된 단어 목록을 파일에 저장
    }

    //모든 단어를 삭제하고 파일에 저장
    public void clearWords() {
        words.clear();
        saveWords(); // 변경된 단어 목록을 파일에 저장
    }

  //특정 단어를 삭제하고 파일에 저장
    public void deleteWord(String english) {
        words.removeIf(word -> word.getEnglish().equalsIgnoreCase(english));
        saveWords(); //변경된 단어 목록을 파일에 저장
    }

    //모든 단어를 반환
    public List<Word> getWords() {
        return words;
    }

    //가장 오래된 확인일의 단어를 반환
    public Word getOldestConfirmedWord() {
        return words.stream()
                .min((w1, w2) -> w1.getConfirmedDate().compareTo(w2.getConfirmedDate()))
                .orElse(null); // 확인일이 가장 오래된 단어를 반환
    }

    // 가장 오래된 확인일의 단어들을 지정된 개수만큼 반환
    public List<Word> getOldestConfirmedWords(int count) {
        return words.stream()
                .sorted((w1, w2) -> w1.getConfirmedDate().compareTo(w2.getConfirmedDate()))
                .limit(count)
                .toList(); //확인일이 오래된 순서로 정렬하여 지정된 개수만큼 반환
    }

    //단어의 확인일을 현재 날짜로 업데이트하고 파일에 저장
    public void updateConfirmedDate(Word word) {
        word.setConfirmedDate(LocalDate.now()); //확인일을 현재 날짜로 업데이트
        saveWords(); //변경된 단어 목록을 파일에 저장
    }

    //파일에서 단어 목록을 로드
    private void loadWords() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            words = (List<Word>) ois.readObject(); //파일에서 단어 목록을 읽음
        } catch (IOException | ClassNotFoundException e) {
            words = new ArrayList<>(); //오류 발생 시 빈 목록으로 초기화
        }
    }

    //단어목록을 파일에 저장
    private void saveWords() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(words);// 단어 목록을 파일에 저장
        } catch (IOException e) {
            e.printStackTrace(); //오류 발생 시스택 트레이스 출력
        }
    }
}
