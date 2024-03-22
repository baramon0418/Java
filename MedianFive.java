//양수 5개를 입력 받아 배열에 저장하고, 가운데 값을 출력하는 프로그램을 작성하시오.
import java.util.Arrays;
import java.util.Scanner;

public class MedianFive {
	
  public static void main(String[] args) {
  	  // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int[] numbers = new int[5];

      System.out.println("양수 5개를 입력하세요:");
      for (int i = 0; i < 5; i++) {
          int input = scanner.nextInt();
          if (input > 0) {
              numbers[i] = input;
          }
      }

      Arrays.sort(numbers);

      int middleIndex = numbers.length / 2;
      System.out.println("가운데 값은: " + numbers[middleIndex]);
  }
}