//2차방정식이주어졌을때근을계산하는프로그램을작성하라. 

import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float a, b, c, result1, result2;
		a = 1;
		
		System.out.print("첫번째 숫자:");
		b = input.nextFloat();
		
		System.out.print("두번째 숫자:");
		c = input.nextFloat();

		result1 = (float) (-b + (Math.sqrt(b*b - 4*a*c))) / (2*a);
		result2 = (float) (-b - (Math.sqrt(b*b - 4*a*c))) / (2*a);
		
		System.out.println("근은 " + result1);
		System.out.println("근은 " + result2);
		
				

	}

}
