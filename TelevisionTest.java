
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv1 = new Television(); //객체를 생성한다.
		//tv1.channel = 7; //객체의 멤버에 접근할 때 멤버 연산자(.)를 사용한다.
		tv1.setChannel(7);
		tv1.volume = 10;
		tv1.onOff = true;
	
		Television tv2 = new Television();
		//tv2 = tv1;
		//tv2.channel = 9;
		tv2.setChannel(9);
		tv2.volume = 12;
		tv2.onOff = true;
		
		tv1.print();
		tv2.print();
		
		//String str1 = new String("Hello");
		
	}

}
