//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class WordStorage {
//    private String filePath;
//
//    public WordStorage(String filePath) {
//        this.filePath = filePath;
//    }
//
//    public List<Word> loadWords() {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
//            return (List<Word>) ois.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            return new ArrayList<>();
//        }
//    }
//
//    public void saveWords(List<Word> words) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
//            oos.writeObject(words);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
