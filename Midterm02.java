import java.util.*;
public class Midterm02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Positive Number:");
			num = input.nextInt();
			if(num==-1) {break;}
			if (num<0) {
				System.out.println("It is not a Positive Number");
			}
			if(num>0)
				System.out.println("The factors of "+num+" are:");
			
		} while (num < 0 || num == -1);
		
		
		
		
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i +" ");
			}
		}
		
		
		System.out.println("\nEnd the Program");
		
		
	
		
		
		
		
		
			
		

	}

}

