//1부터 10까지의 정수의 합을 계산
public class ForExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			//System.out.println(sum += i); 이러면 더 하는 과정도 다 출력됨
			sum += i;			
		}
		System.out.printf("1부터 10까지의 정수의 합 = %d", sum);
	}

}
