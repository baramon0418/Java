//1.직사각형의 둘레와 면적
import java.util.Scanner;
import java.util.*;
public class Midterm01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("width of triangle: ");
        int width = scanner.nextInt();
        
        System.out.print("height of triangle: ");
        int height = scanner.nextInt();
        double y = Math.sqrt((width*width)+(height*height));
        
        double Area = (width*height)/2;
        double Length = width+height+y;
        
        System.out.println("Area of triangle: " + Area);
        System.out.println("Length of triangle: " + Length);
	}

}
