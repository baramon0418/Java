import java.awt.event.ActionListener;
import javax.swing.Timer;

public class CallBackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ActionListener obj = new MyClass();
		Timer time = new Timer(1000,obj->System.out.println("beep"));
		time.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
