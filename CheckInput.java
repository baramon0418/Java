//지정한범위의값을받을때까지반복입력받기
//두 변수 범위 안에 들어오는 값을 만족할 때 입력을 반복함
import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력하시오 [1-12]: ");
			month = input.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.println("사용자가 입력한 월은 "+ month);
	}
	
}
