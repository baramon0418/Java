//반지름을입력받아원의면적으로계산하는프로그램을작성

import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double PI = 3.141592;
		double radius, area;
		
		System.out.print("반지름을 입력해주세요:");
		radius = input.nextDouble();
		area = radius * radius * PI;
		
		System.out.println("반지름이" + radius + "인 원의 면적은" + area  + "입니다.");
	}

}
