package cse.oop2.ch05.sipledotcom;

// 게임 실행을 담당하는 메인 클래스 정의
public class SimpleDotComGame {
    // 메인 메서드: 프로그램의 시작점
    public static void main(String[] args) {
        int numOfGuesses = 0; // 사용자의 시도 횟수를 저장하는 변수 초기화
        GameHelper helper = new GameHelper(); // 사용자 입력을 받기 위한 헬퍼 객체 생성
        SimpleDotCom theDotCom = new SimpleDotCom(); // DotCom 객체 생성

        // 0부터 4까지의 무작위 숫자를 생성
        int randomNum = (int) (Math.random() * 5);

        // 디버깅용 출력: 랜덤 숫자를 콘솔에 출력
        System.out.format("(randomNumber = %s)%n", randomNum);

        // DotCom의 위치를 설정 (랜덤한 시작 위치에 연속된 3칸 설정)
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations); // 설정된 위치 전달

        boolean isAlive = true; // 게임이 진행 중인지 여부를 나타내는 변수

        // 게임 루프: DotCom이 모두 파괴될 때까지 반복
        while (isAlive) {
            // 사용자로부터 숫자 입력을 받음
            String guess = helper.getUserInput("Enter a number");

            // 입력된 숫자를 DotCom과 비교해 결과를 얻음
            String result = theDotCom.checkYourself(guess);

            numOfGuesses++; // 시도 횟수 증가

            // "kill" 결과가 나오면 게임 종료
            if (result.equals("kill")) {
                isAlive = false; // 게임 루프 종료
                // 총 시도 횟수를 출력
                System.out.println("you took " + numOfGuesses + " guesses");
            }
        }
    }
}
