
public class MyCounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCounter obj = new MyCounter();
		obj.value = 10;
//		obj.inc(x);
//		System.out.println("x: "+ x);
		
		MyCounter obj2 = new MyCounter();
		obj2.inc(obj);
		
//		obj.inc(obj);
		System.out.println("x: "+obj.value);
	}

}
