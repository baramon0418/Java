//강의자료 33, 37을 참고하여 자동차 클래스를 완성하여라. 
public class Car {
    private String color; // 색상
    private int gear; // 현재 기어
    private int speed; // 현재 속도

    public Car() {}
    public Car(String newColor, int newGear, int newSpeed) {
    	color = newColor;
    	gear = newGear;
    	speed = newSpeed;
    }


    public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 6) {  // 기어는 1부터 6까지
            gear = newGear;
            System.out.println("기어를 " + gear + "단으로 변경하였습니다.");
        } else {
            System.out.println("올바른 기어를 선택하세요.");
        }
    }


    public void speedUp(int newSpeedUp) {
        speed += newSpeedUp;
        System.out.println(newSpeedUp + "km/h 속도를 증가시켰습니다.");
    }


    public void speedDown(int newSpeedDown) {
        speed -= newSpeedDown;
        if (speed < 0) {  // 속도는 음수가 될 수 없음
            speed = 0;
        }
        System.out.println(newSpeedDown + "km/h 속도를 감소시켰습니다.");
    }

    // 상태 변경사항 확인
    public String toString() {
        return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
    }

    //컬러 받기
    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
    	color = newColor; //this.color = color;
    }

    //기어 받기
    public int getGear() {
        return gear;
    }

    public void setGear(int newGear) {
    	gear = newGear;
    }
    
    //속도 받기
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
    	speed = newSpeed;
    }

    public void print() {
        System.out.println("Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]");
    }
    
    /**public static void print()
    {
    	System.out.println("Hello Car"+color); //컬러는 스태틱이 아니라서 오류가 남 color를 스태틱으로 선언해주면 됨
    }*/
    
}