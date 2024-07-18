//사용자에게 문자열을 받아서 문자열이 “www”로 시작하는지를 검사하는 프로그램을 작성해 보자. 사용자가 “quit”를 입력하면 프로그램을 종료한다. 
public class TextInput {

        public static void parseWWW(String input) {
            if (input.startsWith("www")) {
                System.out.println(input + "은 'www'로 시작합니다.");
            } else {
                System.out.println(input + "은 'www'로 시작하지 않습니다.");
            }
        }
    
}

//int i = Integer.parseInt("123") 변수 i에 정수 123이 저장된다