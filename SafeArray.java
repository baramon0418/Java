//실습1: 만약인덱스가배열의크기를벗어나게되면실행오류가발생한다. 따라서실행오류를발생하지않는안전한배열을작성하여보자.
public class SafeArray {
	private int a[];
	public int length;
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}
	
	public void put(int index, int value) { //set
		if(index < length && index >=0)
			a[index] = value;
		else
			System.out.println("잘못된 인덱스 " + index);
	}

	public int get(int index) {
		if(index < length && index >=0)
			return a[index];
		else
			return 0;
	}
	
	
	
	
}
