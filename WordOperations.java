//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class WordOperations {
//    private List<Word> words;
//
//    public WordOperations(List<Word> words) {
//        this.words = words != null ? words : new ArrayList<>();
//    }
//
//    public void addWord(Word word) {
//        words.add(word);
//    }
//
//    public void clearWords() {
//        words.clear();
//    }
//
//    public void deleteWord(String english) {
//        words.removeIf(word -> word.getEnglish().equalsIgnoreCase(english));
//    }
//
//    public List<Word> getWords() {
//        return words;
//    }
//
//    public List<Word> getOldestConfirmedWords(int count) {
//        return words.stream()
//                .sorted((w1, w2) -> w1.getConfirmedDate().compareTo(w2.getConfirmedDate()))
//                .limit(count)
//                .collect(Collectors.toList());
//    }
//
//    public void updateConfirmedDate(Word word) {
//        word.setConfirmedDate(LocalDate.now());
//    }
//}
