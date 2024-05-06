//정적변수예제 Car
public class Car1 {
	private String model;
    private String color;
    private int speed;
    // 자동차의 시리얼 번호
    private int id;
    private static int numbers = 0;

    public Car1(String m, String c, int s) {
        model = m;
        color = c;
        speed = s;
        // 자동차의 개수를 증가하고 id에 대입한다.
        id = ++numbers;
    }
    //정적 메소드
    public static int getNumberOfCars() {
    	return numbers;
    }
}