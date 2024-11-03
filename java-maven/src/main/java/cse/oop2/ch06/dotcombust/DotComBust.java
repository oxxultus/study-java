package cse.oop2.ch06.dotcombust;

import java.util.ArrayList; // ArrayList 사용하기 위해 임포트

// DotCom 게임 전체를 관리하는 클래스
public class DotComBust {

    // 멤버 변수: 게임 보조 클래스, DotCom 객체 리스트, 사용자 시도 횟수
    private GameHelper helper = new GameHelper(); // 사용자 입력과 DotCom 배치를 도와주는 헬퍼 객체
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>(); // DotCom 객체들을 저장하는 리스트
    private int numOfGuesses = 0; // 사용자의 시도 횟수를 저장하는 변수

    // 게임 준비 메서드: DotCom 객체를 생성하고 설정
    void setUpGame() {
        // 3개의 DotCom 객체 생성 및 이름 설정
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToy.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        // 생성한 DotCom 객체들을 리스트에 추가
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        // 게임 설명 출력
        System.out.println("Your goal is to sink dot coms");
        System.out.println("Pets.com, eToy.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        // 각 DotCom 객체에 무작위 위치 할당
        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3); // 3칸짜리 위치 생성
            dotComToSet.setLocationCells(newLocation); // 위치 설정
        }
    }

    // 게임 진행 메서드: DotCom이 모두 침몰할 때까지 반복
    void startPlaying() {
        // DotCom 리스트가 비어 있지 않은 동안 반복
        while (!dotComList.isEmpty()) {
            // 사용자로부터 추측 입력을 받음
            String userGuess = helper.getUserInput("Enter your guess: ");
            // 입력한 추측을 확인
            checkUserGuess(userGuess);
        }
        // 게임 종료 후 메시지 출력
        finishGame();
    }

    // 사용자의 추측을 확인하는 메서드
    void checkUserGuess(String userGuess) {
        numOfGuesses++; // 시도 횟수 증가
        String result = "miss"; // 기본 결과는 "miss"로 초기화

        // 각 DotCom 객체에 대해 사용자의 추측을 확인
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess); // 추측 결과 확인
            if (result.equals("hit")) { // "hit"인 경우 반복 종료
                break;
            }
            if (result.equals("kill")) { // "kill"인 경우 해당 DotCom 제거 후 반복 종료
                dotComList.remove(dotComToTest);
                break;
            }
        }
        // 추측 결과를 콘솔에 출력
        System.out.println(result);
    }

    // 게임 종료 시 결과를 출력하는 메서드
    void finishGame() {
        System.out.println("All Dot Coms are dead! Your stock is now worthless."); // 게임 종료 메시지

        // 사용자의 시도 횟수에 따라 메시지 출력
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough... " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    // 메인 메서드: 게임 실행의 시작점
    public static void main(String[] args) {
        DotComBust game = new DotComBust(); // 게임 객체 생성
        game.setUpGame(); // 게임 준비
        game.startPlaying(); // 게임 시작
    }
}
