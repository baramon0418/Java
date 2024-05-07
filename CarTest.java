//Car 테스트하기
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car myCar = new Car("Red", 1, 0); //색상, 기어, 속도
        System.out.println(myCar);

        myCar.changeGear(6);
        myCar.speedUp(180);
        myCar.speedDown(80);
        System.out.println(myCar);
    }

}
