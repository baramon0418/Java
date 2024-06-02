//순차탐색 알고리즘
//순차탐색(sequential search)은 탐색방법중에서가장간단하고직접적인탐색방법이다. 
//순차탐색은배열의원소를순서대로하나씩꺼내서탐색키와비교하여원하는값을찾아가는방법이다. 
//배열의원소를순서대로하나씩꺼내서탐색키와비교하여원하는값을찾아가는방법
import java.util.Scanner;

public class Lec2Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = { 0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 값을 입력하세요: ");
        int value = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < s.length - 1; i++) {
            if (value > s[i] && value < s[i + 1]) {
                System.out.println(value + "은(는) " + s[i] + "보다 크고 " + s[i + 1] + "보다 작습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당하는 범위를 찾을 수 없습니다.");
        }
        
        scanner.close();
    }
}
