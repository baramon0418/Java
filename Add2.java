import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x, y;
		int sum;
		
		System.out.print("첫번째 숫자:");
		x = input.nextInt();
		System.out.print("두번째 숫자:");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
	}

}
