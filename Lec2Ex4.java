//사각형 모양 출력하기
public class Lec2Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5; // 행의 수
        int cols = 10; // 열의 수

        for (int i = 0; i < rows; i++) { // 행 반복
            for (int j = 0; j < cols; j++) { // 열 반복
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄바꿈
        }
    }
}