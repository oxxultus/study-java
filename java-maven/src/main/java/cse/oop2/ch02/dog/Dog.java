package cse.oop2.ch02.dog;  // 'Dog' 클래스가 속한 패키지를 선언합니다.

public class Dog {  // 'Dog' 클래스 선언

    int size;  // 'size' 변수는 개의 크기를 저장하는 정수형
    String breed;  // 'breed' 변수는 개의 품종을 저장하는 문자열
    String name;  // 'name' 변수는 개의 이름을 저장하는 문자열

    // 기본 생성자
    public Dog() {
        this(30, "래브라도 리트리버", "새론");  // 기본적으로 크기 30, 품종 '래브라도 리트리버', 이름 '새론'으로 Dog 객체를 생성합니다.
    }

    // 매개변수가 있는 생성자
    public Dog(int size, String breed, String name) {
        this.size = size;  //'size' 값을 해당 객체의 'size' 변수에 저장합니다.
        this.breed = breed;  // 'breed' 값을 해당 객체의 'breed' 변수에 저장합니다.
        this.name = name;  // 'name' 값을 해당 객체의 'name' 변수에 저장합니다.
    }

    // 'bark' 메서드
    void bark() {
        System.out.println(name + "가/이 짖습니다.");  // 출력합니다.
    }
}
