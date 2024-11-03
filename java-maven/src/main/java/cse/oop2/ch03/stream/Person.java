package cse.oop2.ch03.stream;

// 필드(Field)는 객체 지향 프로그래밍에서 클래스의 속성을 정의하는 변수이다.
// Person 클래스 정의: Comparable 인터페이스를 구현하여 객체 비교 가능
public class Person implements Comparable<Person> {
    // 필드: 이름, 나이, 성별
    private String name;     // 개인의 이름을 저장하는 필드
    private int age;        // 개인의 나이를 저장하는 필드
    private Gender gender;  // 개인의 성별을 저장하는 필드 (Gender 열거형 사용)

    // 생성자: Person 객체를 초기화하는 메서드
    public Person(String name, int age, Gender gender) {
        super(); // 상위 클래스의 생성자를 호출 (여기서는 Object 클래스)
        this.name = name;     // 전달된 name 값을 필드에 할당
        this.age = age;       // 전달된 age 값을 필드에 할당
        this.gender = gender; // 전달된 gender 값을 필드에 할당
    }

    // getter 메서드: name 필드의 값을 반환
    public String getName() {
        return name; // 이름을 반환
    }

    // getter 메서드: age 필드의 값을 반환
    public int getAge() {
        return age; // 나이를 반환
    }

    // getter 메서드: gender 필드의 값을 반환
    public Gender getGender() {
        return gender; // 성별을 반환
    }

    // compareTo 메서드: 두 Person 객체를 비교하는 메서드
    @Override
    public int compareTo(Person o) { //Person 객체를 매개변수로 가진다.
        return name.compareTo(o.name); // 이름을 기준으로 비교
        // name의 알파벳 순서에 따라 비교 결과를 반환
        // 양수: 현재 객체가 더 큼, 음수: 현재 객체가 더 작음, 0: 동일
    }
}

/*
 * Comparable<Person>의 의미:
 * - 제네릭(Generics)을 사용하여 Person 타입의 객체를 비교할 수 있도록 함.
 * - 타입 안전성을 제공하여 Person 객체만 비교하도록 제한함.
 * - Comparable 인터페이스는 특정 클래스의 객체들을 서로 비교하는 방법을 정의하며,
 *   compareTo(T o) 메서드를 통해 객체 간의 정렬 순서를 결정함.
 */
