//실습1: 만약인덱스가배열의크기를벗어나게되면실행오류가발생한다. 따라서실행오류를발생하지않는안전한배열을작성하여보자.
public class SafeArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeArray array = new SafeArray(3);
		
		for (int i = 0; i <(array.length + 1); i++) {
			array.put(i,i*10);
		}

	}

}
