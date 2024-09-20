package cse.oop2.ch02.dog;  // 'DogTestDrive' 클래스가 속한 패키지를 선언합니다.

public class DogTestDrive {  // 'DogTestDrive' 클래스 선언
    public static void main(String[] args) {  // 메인 메서드 선언, 자바 프로그램이 실행될 때 가장 먼저 호출되는 메서드입니다.

        Dog d1 = new Dog(30, "알래스카 말라뮤트", "보리");  // 크기 30, 종 '알래스카 말라뮤트', 이름 '보리'를 가진 Dog 객체를 생성
        d1.bark();  // d1 객체의 bark() 메서드를 호출합니다.

        Dog d2 = new Dog();  // 매개변수 없이 Dog 객체 d2를 생성
        d2.bark();  // d2 객체의 bark() 메서드를 호출합니다.

        Dog d3 = new Dog();  // 매개변수 없이 Dog 객체 d3를 생성
        d3.name = "코코";  // d3 객체의 이름을 '코코'로 설정
        d3.size = 40;  // d3 객체의 크기를 40으로 설정
        d3.bark();  // d3 객체의 bark() 메서드를 호출합니다.
    }
}
