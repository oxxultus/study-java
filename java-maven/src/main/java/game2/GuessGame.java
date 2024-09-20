package cse.oop2.ch02.game2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessGame {
    private int machineGeneratedNumber;
    private int userGuessNumber;
    public static final int MAX_COUNT = 5;

    public void getUserInput() throws IOException {
        String inputLine;

        System.out.println("0~9 까지 한 자리 숫자를 추측해서 입력해 주세요: ");
        boolean rightNumberFormat = false;
        do{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();

            if(inputLine.matches("[0~9]")){
                this.userGuessNumber = Integer.parseInt(inputLine);
                rightNumberFormat = true;
            }
            else{
                System.out.println("0~9 까지의 한 자리 숫자만 입력해야 합니다. 다시 입력해 주세요.");
            }
        }while(!rightNumberFormat);
    }

    private void generateRandomNumber() {
        this.machineGeneratedNumber = (int)(Math.random() * 10);
    }

    public void startGame() throws IOException {
        int count = 0;
        boolean matched = false;

        System.out.println("컴퓨터가 임의로 생성한 0~9까지 한 자리 숫자를 맞추는 게임 입니다.");
        System.out.println("5번안에 맞추면 당신이 이기고 그렇지 않으면 컴퓨터가 이깁니다.");
        System.out.println("이제 시작하겠습니다.");
        System.out.println("");

        generateRandomNumber();

        while(!matched && count < MAX_COUNT){
            getUserInput();
            if(userGuessNumber == machineGeneratedNumber){
                matched = true;
            }
            else{
                count++;
            }
        }

        if(count == MAX_COUNT){
            System.out.println("당신이 이겼습니다.");
        }
        else{
            System.out.println("컴퓨터가 이겼습니다.");
        }
    }
}
