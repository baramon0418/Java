//사용자로부터두개의정수를입력받아서둘중에큰수를출력하는프로그램
import java.util.Scanner;
public class Lec2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("첫번째 숫자:");
		num1 = input.nextInt();
		System.out.print("두번째 숫자:");
		num2 = input.nextInt();
		
		if(num1>num2) {
			System.out.print("첫번째 숫자가 큽니다.");
		}
		if(num2>num1){
			System.out.print("두번째 숫자가 큽니다.");
		}
		else {
			System.out.print("첫번째 숫자와 두번째 숫자가 같습니다.");
			
		}
	}

}
