//실습2 
//2개의박스가같은치수인지를확인하는메소드isSameBox()를작성하여보자. 
//만약박스의크기가같으면true를반환하고크기가다르면false를반환한다. isSameBox()의매개변수는객체참조변수가된다.
public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj1 = new Box(10,20,50);
		Box obj2 = new Box(10,20,50);
		
		System.out.println("obj1 == obj2:" + obj1.isSameBox(obj2));

	}

}
