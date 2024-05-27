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
		else if(num2>num1){
			System.out.print("두번째 숫자가 큽니다.");
		}
		else {
			System.out.print("첫번째 숫자와 두번째 숫자가 같습니다.");
			
		}
	}

}

/** 성적에 따라 학점 결정하기
 * import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오: ");
        int score = sc.nextInt();
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("학점 " + grade);

        sc.close();
    }
}
/
 */