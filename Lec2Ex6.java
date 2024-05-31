//배열에담긴숫자에서가장작은숫자를찾는프로그램을만드시오.
public class Lec2Ex6 {

    public static void main(String[] args) {
        int s[] = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
        
        int min = s[0]; // 배열의 첫 번째 원소를 최솟값으로 초기화

        for (int i = 1; i < s.length; i++) {
            if (s[i] < min) { // 현재 원소가 최솟값보다 작으면
                min = s[i];  // 최솟값을 현재 원소로 업데이트
            }
        }

        System.out.println("배열 s의 최솟값: " + min);
    }
}
