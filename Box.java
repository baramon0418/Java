//실습2 
//2개의박스가같은치수인지를확인하는메소드isSameBox()를작성하여보자. 
//만약박스의크기가같으면true를반환하고크기가다르면false를반환한다. isSameBox()의매개변수는객체참조변수가된다.
public class Box {
	int width, length, height;
	
	Box(int w, int l, int h){
		width = w;
		length = l;
		height = h;
	}
	
	boolean isSameBox(Box obj) {
		if((obj.width == width) & (obj.length == length) & (obj.height == height))
			return true;
		else 
			return true;
		
	}
}
