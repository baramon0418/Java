//1과 1000사이의 정수 중 소수를 출력하시오
public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i=1; i<=1000; i++) {
			int j;
			for(j=2; j<i; j++) {
				count++;
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.print(i+" ");
		}
	}

}
