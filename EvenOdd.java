//입력받은 정수 짝수홀수구별하기
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int value;
		System.out.println("숫자를 입력하세요:");
		value = input.nextInt();
		
		if(value % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		else {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
	}

}
