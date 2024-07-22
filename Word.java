import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


//영어 단어와 그 뜻, 등록일, 확인일을 나타내는 클래스
public class Word implements Serializable {
    private static final long serialVersionUID = 1L; // 직렬화에 사용되는 버전 ID   
    private String english; //영어 단어
    private List<String> korean; //한글 뜻
    private LocalDate registeredDate; //등록일
    private LocalDate confirmedDate; //확인일

    
    //단어와 관련된 정보를 초기화하는 생성자    
    public Word(String english, String korean, LocalDate registeredDate, LocalDate confirmedDate) {
        this.english = english;
        this.korean = Arrays.asList(korean.split(",")); //한글 뜻을 쉼표로 구분하여 리스트로 저장
        this.registeredDate = registeredDate;
        this.confirmedDate = confirmedDate;
    }

    // 캡슐화를 위한 getter와 setter 메서드
    public String getEnglish() {
        return english; // 영어 단어를 반환
    }

    public void setEnglish(String english) {
        this.english = english; // 영어 단어를 설정
    }

    public List<String> getKorean() {
        return korean; // 한글 뜻 리스트 반환
    }

    public void setKorean(String korean) {
        this.korean = Arrays.asList(korean.split(",")); // 한글 뜻을 쉼표로 구분하여 리스트로 저장
    }

    public LocalDate getRegisteredDate() {
        return registeredDate; //단어 등록일 반환
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate; // 단어 등록일 설정
    }

    public LocalDate getConfirmedDate() {
        return confirmedDate; // 확인일 반환
    }

    public void setConfirmedDate(LocalDate confirmedDate) {
        this.confirmedDate = confirmedDate; // 확인일 설정
    }
}
