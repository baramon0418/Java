
public class Lec3Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i=2; i<=1000; i++) {
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
