//사용자가값을입력하면“하나”, “둘＂과같이출력하는코드
import java.util.Scanner;

public class Int2Hwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String num1;
		
		System.out.print("한글로 숫자를 입력하세요:");
		num1 = input.next();
		
		switch(num1) {
		case "하나", "일", "첫째":
			System.out.print("1");
			break;
		case "둘", "이", "둘째":
			System.out.print("2");
			break;
		default:
			System.out.print("없음");
			break;
		}
	}

}
