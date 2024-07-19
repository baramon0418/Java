//TextInput 테스트 하기
import java.util.Scanner;

public class TextInputTest {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("문자열을 입력하세요 (quit로 종료):");
            String input = scanner.nextLine();

            if ("quit".equalsIgnoreCase(input)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            TextInput.parseWWW(input);
        }

        scanner.close();
    }
}
