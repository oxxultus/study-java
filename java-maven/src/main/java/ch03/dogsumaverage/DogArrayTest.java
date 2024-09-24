package cse.oop2.ch03.dogsumaverage;

import cse.oop2.ch03.dogsumaverage.Dog;

public class DogArrayTest {

    public void test() {
        // Dog 객체를 저장할 배열을 선언. 배열의 크기는 3이다.
        Dog[] myDogs = new Dog[3];

        // 배열에 Dog 객체를 생성하여 각각 초기화.
        myDogs[0] = new Dog("Fred");
        myDogs[1] = new Dog("Marge");
        myDogs[2] = new Dog("Bart");

        // 배열의 마지막 인덱스는 배열의 길이 - 1이므로 마지막 개의 이름을 출력.
        // 배열의 인덱스는 0부터 시작하므로 마지막 요소에 접근하려면 length - 1을 사용해야 한다.
        System.out.println("마지막 개의 이름: " + myDogs[myDogs.length - 1].getName());

        // 배열의 모든 Dog 객체가 한번씩 짖도록 하는 구문.
        int x = 0;  // 인덱스를 위한 변수 x를 0으로 초기화
        while (x < myDogs.length) {  // 배열의 길이보다 작은 동안 반복
            myDogs[x].bark();  // 현재 인덱스의 Dog 객체가 짖는 메서드를 호출
            x += 1;  // 인덱스를 증가시켜 다음 Dog 객체로 이동
        }

        // 배열 내의 모든 Dog 객체가 짖는 행동을 람다 표현식으로 처리하는 구문 (주석 처리됨).
        // Arrays.stream(myDogs)로 배열을 스트림으로 변환한 후 forEach()로 각 요소에 대해 bark() 메서드를 호출.
        // java.util.Arrays.stream(myDogs).forEach(e -> e.bark());
    }
}
