package cse.oop2.ch05.sipledotcom;

import java.io.*; // 입력/출력 관련 클래스들을 임포트

// 사용자의 입력을 처리하는 헬퍼 클래스 정의
public class GameHelper {

    // 사용자의 입력을 받아 문자열로 반환하는 메서드
    public String getUserInput(String prompt) {
        String inputLine = null; // 사용자의 입력을 저장할 변수 초기화

        // 입력 메시지를 출력하여 사용자에게 입력을 유도
        System.out.print(prompt + ": ");

        try {
            // BufferedReader 객체 생성: System.in을 감싸서 문자 단위로 입력을 처리
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            // 사용자가 입력한 문자열을 읽음
            inputLine = is.readLine();

            // 사용자가 아무것도 입력하지 않은 경우 "-1" 반환
            if (inputLine.length() == 0) {
                return "-1";
            }
        } catch (IOException e) { // 입력 중 예외 발생 시 처리
            System.out.println("IOException: " + e); // 예외 메시지 출력
        }

        // 입력된 값이 숫자(한 자리)일 경우 그대로 반환
        if (inputLine != null && inputLine.matches("\\d")) {
            return inputLine;
        } else { // 숫자가 아닌 경우 "-1" 반환
            return "-1";
        }
    }
}