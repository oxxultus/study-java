package cse.oop2.ch02.game;

public class Player {
    private int number = 0;

    public void guess(){
        // 암기해야 할 부분
        number = new java.util.Random().nextInt(10);

        System.out.println("찍은 숫자: "+ number);
    }

    public int getNumber() {
        return number;
    }
}