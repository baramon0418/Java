//do-while 문을 이용하여 ‘가’ 부터 ‘힣’까지 출력하는 프로그램을 작성하시오.
public class KoreanChar {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        char start = '가'; // 시작 유니코드
        char end = '힣';   // 종료 유니코드
        char current = start;


        char[] lastKor = {
            '\uB097', '\uB2E3', '\uB77B', '\uB9C7', '\uBC13',
            '\uC0AB', '\uC543', '\uC78F', '\uCC27', '\uCE73',
            '\uD0BF', '\uD30B', '\uD557'
        };

        do {
            System.out.print(current);
            // 현재 문자가 변경선을 출력할 유니코드와 같으면 변경선 출력
            for (char changeLine : lastKor) {
                if (current == changeLine) {
                    System.out.println("----");
                    break; 
                }
            }
            current++;
        } while (current <= end);
    }
}
