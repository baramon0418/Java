//정적변수예제 CarTest
public class CarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Car1("S600", "white", 80); // 첫 번째 생성자 호출
        Car1 c2 = new Car1("E500", "blue", 20); // 첫 번째 생성자 호출
        int n = Car1.getNumberOfCars(); // 정적 변수
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}