package cse.oop2.ch03.stream;

import java.util.LinkedList;       // LinkedList 클래스 임포트
import java.util.List;            // List 인터페이스 임포트
import java.util.OptionalDouble;  // OptionalDouble 클래스 임포트
import java.util.stream.Stream;   // Stream 인터페이스 임포트

// StreamTestDrive 클래스 정의: 스트림을 사용하여 Person 데이터 처리
public class StreamTestDrive {
    // 모든 Person 객체를 저장할 리스트
    // 모든 Person 객체를 저장할 리스트 정의
    // List<Person>는 Person 객체를 저장하는 리스트의 타입을 지정
    // LinkedList<>는 이 리스트의 구체적인 구현을 나타내며, 연결 리스트 방식으로 요소를 저장
    public static List<Person> persons = new LinkedList<>();

    public static void main(String[] args) {
        initialize(); // Person 객체 리스트 초기화

        // 남자는 몇명인지 계산
        long maleCount = persons.stream() // persons 리스트에서 스트림을 생성하여 데이터를 처리
                // 성별이 남성인 Person 객체만 필터링
                .filter(e -> e.getGender() == Gender.MALE) // 성별이 남성인 객체 필터링
                // filter 메서드에서 사용된 람다 표현식의 자세한 설명:
                // e는 List<Person>에서 각 Person 객체를 나타내며,
                // e.getGender()를 통해 해당 객체의 성별을 가져옵니다.
                // Gender.MALE과 비교하여 남성인 경우에만 true를 반환합니다.

                // 필터링된 남성 객체의 수를 센다
                .count(); // 필터링된 남성의 수를 센다

        // 여자의 평균 나이를 계산하기 위한 스트림 생성
        // persons 리스트에서 스트림을 생성하여 데이터를 처리
        OptionalDouble femaleAverageAge = persons.stream()
                // 성별이 여성인 Person 객체만 필터링
                .filter(e -> e.getGender() == Gender.FEMALE) // 성별이 여성인 객체 필터링
                // filter 메서드에서 사용된 람다 표현식의 자세한 설명:
                // e는 List<Person>에서 각 Person 객체를 나타내며,
                // e.getGender()를 통해 해당 객체의 성별을 가져옵니다.
                // Gender.FEMALE과 비교하여 여성인 경우에만 true를 반환합니다.

                // 필터링된 Person 객체에서 나이만 추출하여 IntStream으로 변환
                .mapToInt(Person::getAge) // 나이로 변환
                // IntStream에서 평균을 계산하여 OptionalDouble로 반환
                .average(); // 평균 계산

        if (femaleAverageAge.isPresent()) { // 평균이 존재하는 경우
            System.out.println(">>> 여자의 평균 나이는 " + femaleAverageAge.getAsDouble() + "입니다."); // 결과 출력
        }

        System.out.println(">>> 20~25살인 여자의 이름을 정렬해서 출력");
        // 20~25살인 여성의 이름을 정렬하여 출력
        // persons 리스트에서 스트림을 생성하여 데이터를 처리
        Stream<Person> sp = persons.stream()
                // 성별이 여성인 Person 객체만 필터링
                .filter(e -> e.getGender() == Gender.FEMALE) // 성별이 여성인 객체 필터링
                // 나이가 20 이상 25 이하인 객체만 필터링
                .filter(e -> e.getAge() >= 20 && e.getAge() <= 25) // 나이가 20 이상 25 이하인 객체 필터링
                // 필터링된 Person 객체를 기본 정렬 순서(이름 순서)로 정렬
                .sorted(); // 정렬
        sp.forEach(e -> System.out.println(e.getName())); // 각 객체의 이름 출력

    }

    // initialize 함수 구현: Person 리스트 초기화
    public static void initialize() {
        // Person 객체 배열 정의
        Person[] data = {
                new Person("Linda", 21, Gender.FEMALE),
                new Person("Oliver", 25, Gender.MALE),
                new Person("Alive", 27, Gender.FEMALE),
                new Person("Noah", 19, Gender.MALE),
                new Person("Abby", 23, Gender.FEMALE),
                new Person("Daisy", 25, Gender.FEMALE),
                new Person("Samuel", 31, Gender.MALE),
                new Person("Crystal", 31, Gender.FEMALE),
                new Person("Tadeo", 33, Gender.MALE)
        };

        // Person 객체를 리스트에 추가
        for (Person p : data) {
            persons.add(p); // 각 Person 객체를 persons 리스트에 추가
        }
    }
}
