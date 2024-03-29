//사용자에게 문자열을 받아서 문자열이 “www”로 시작하는지를 검사하는 프로그램을 작성해 보자. 사용자가 “quit”를 입력하면 프로그램을 종료한다. 
import java.util.Scanner;

public class StartsWithWWW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("문자열을 입력하세요 (quit로 종료):");
            input = scanner.nextLine();

            if ("quit".equalsIgnoreCase(input)) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input.startsWith("www")) {
                System.out.println("입력한 문자열은 'www'로 시작합니다.");
            } else {
                System.out.println("입력한 문자열은 'www'로 시작하지 않습니다.");
            }
        }

        scanner.close();
    }
}