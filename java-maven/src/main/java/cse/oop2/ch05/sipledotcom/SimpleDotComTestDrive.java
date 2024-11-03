package cse.oop2.ch05.sipledotcom;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int[] location = {2,3,4};
        simpleDotCom.setLocationCells(location);

        String userGuess = "2";
        String result = simpleDotCom.checkYourself(userGuess);
        String testResult = "failed";
        if(result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
