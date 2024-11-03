package cse.oop2.ch03.dogsumaverage;

// 여기서 필드 란?
// 클래스 안에 포함된 변수를 의미한다.

public class Dog {
    // Dog의 이름을 저장할 변수. private로 선언하여 외부에서 직접 접근할 수 없도록 제한.
    private String name;

    // Dog 클래스의 생성자. 객체가 생성될 때 이름을 전달받아 name 변수에 저장.
    public Dog(String name) {
        this.name = name;  // 전달된 name 값을 필드에 할당
    }

    // Dog의 이름을 반환하는 getter 메서드. 외부에서 Dog의 이름을 확인할 수 있게 함.
    public String getName() {
        return name;  // 필드 name을 반환
    }

    // Dog가 짖는 행동을 표현하는 메서드. 이름과 함께 "왈! 하고 짖습니다" 메시지를 출력.
    public void bark() {
        System.out.println(name + "이(가) 왈! 하고 짖습니다.");  // 이름과 짖는 소리 출력
    }
}