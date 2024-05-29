//파이구하기
//파이를계산하는가장고전적인방법은Gregory-Leibniz 무한수열을이용하는것
//사용자로부터반복횟수를입력받아PI를계산한다.
//double로 선언
import java.util.Scanner;

public class Lec2Ex5 {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("반복 횟수를 입력하세요: ");
        int n = sc.nextInt();
        
        double pi = 0.0;
        for (int i = 0; i < n; i++) {
            pi += 4.0 * (1 - 2 * (i % 2) ) / (2 * i + 1);
        }
        
        System.out.println("계산된 원주율(π): " + pi);

        sc.close();
    }
}

