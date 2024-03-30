//입력받은수가3의배수인지판별하는프로그램을작성하시오
import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하세요:");
		num = input.nextInt();
		if(num%3==0) {
			System.out.println(num+"은 3의 배수가 맞습니다.");
		}
		else {
			System.out.println(num+"은 3의 배수가 아닙니다.");
		}

	}

}
