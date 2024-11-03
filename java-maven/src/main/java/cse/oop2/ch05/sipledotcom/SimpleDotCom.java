package cse.oop2.ch05.sipledotcom;

// 간단한 게임 로직을 구현한 클래스 정의
public class SimpleDotCom {

    // 멤버 변수: 위치 정보를 저장하는 배열과 맞힌 횟수를 추적하는 변수
    int[] locationCells; // DotCom이 배치된 위치를 저장하는 배열
    int numOfHits = 0;    // 적중된 횟수를 저장하는 변수

    // DotCom의 위치를 설정하는 메서드 (배열로 위치 전달)
    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells; // 전달받은 위치를 멤버 변수에 저장
    }

    // 사용자의 추측을 받아 결과를 확인하는 메서드
    public String checkYourself(String stringGuess) {
        // 사용자의 문자열 입력을 정수로 변환
        int guess = Integer.parseInt(stringGuess);
        String result = "miss"; // 기본 결과는 "miss"로 초기화

        // 위치 배열을 순회하며 사용자의 추측이 맞는지 확인
        for (int cell : locationCells) {
            if (guess == cell) { // 사용자의 추측이 위치와 일치하면
                result = "hit";  // "hit"으로 결과 변경
                numOfHits++;      // 맞힌 횟수 증가
                break;            // 맞췄으므로 반복문 종료
            }
        }

        // 모든 위치를 맞춘 경우 "kill"로 게임 종료 상태 표시
        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        // 결과를 콘솔에 출력
        System.out.println(result);
        return result; // 결과 반환
    }
}
