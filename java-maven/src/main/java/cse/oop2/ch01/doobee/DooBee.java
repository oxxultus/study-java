package cse.oop2.ch01.doobee; // lowercase

public class DooBee { // PascalCase
    public static void main(String []args){ // camelCase
        int x = 0; // lowercase or camelCase

        while( x < 2){
            System.out.print("doo"); // 줄바꿈 하지 않는 표준 출력
            System.out.print("bee"); // 줄바꿈 하지 않는 표준 출력
            x += 1;
        }
        if(x == 2){
            System.out.print("Do"); // 줄바꿈 하지 않는 표준 출력
        }
    }
}
