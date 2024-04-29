//실습4 은행 클래스 작성하기
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodBank bank1 = new GoodBank();
		BadBank bank2 = new BadBank();
		NormalBank bank3 = new NormalBank();
		//Bank[] bank = new Bank[3]; 이렇게도 가능하다
		//bank[0] = new GoodBank();
		
		//Bank bank1 = new GoodBank(); 이렇게도 가능하다
		
		System.out.println("GookBank의 이자율: "+ bank1.getInterestRate());
		System.out.println("BadBank의 이자율: "+ bank2.getInterestRate());
		System.out.println("NormalBank의 이자율: "+ bank3.getInterestRate());
		
		//((BadBank)bank[2]).ID = 4;
		//BadBank r = (BadBank)bank[2];
		//r.ID=4;

	}

}
