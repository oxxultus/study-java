package cse.oop2.ch03.stream;

// Gender 열거형 정의
public enum Gender {
    // 열거 상수 정의
    FEMALE("female"), // 여성
    MALE("male");     // 남성

    private String info; // 각 열거 상수에 대한 정보를 저장하는 필드

    // 생성자: 각 열거 상수를 생성할 때 정보 문자열을 초기화
    private Gender(String info) {
        this.info = info; // 전달받은 info 값을 필드에 할당
    }

    // info 필드의 값을 반환하는 메서드
    public String getInfo() {
        return info; // info 값을 반환
    }
}
