package cse.oop2.ch03.dogsumaverage;

public class TestDrive {
    public static void main(String[] args) {
        // intArrayTest 클래스의 인스턴스를 생성하여 test() 메서드를 호출
        intArrayTest test1 = new intArrayTest();
        test1.test(); // 배열의 랜덤 숫자 합계와 평균을 계산하는 메서드 호출

        // DogArrayTest 클래스의 인스턴스를 생성하여 test() 메서드를 호출
        DogArrayTest test2 = new DogArrayTest();
        test2.test(); // Dog 객체 배열을 생성하고 각 Dog가 짖는 메서드 호출
    }
}