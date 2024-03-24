import java.util.Scanner;

public class Lec3Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("양의 정수를 입력하세요:");
		num = input.nextInt();
		System.out.println(num+"의 약수는 다음과 같습니다.");
		
		for(int i = 1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i +" ");
			}
			
		}

	}

}
