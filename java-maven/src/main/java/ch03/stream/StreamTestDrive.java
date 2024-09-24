package cse.oop2.ch03.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamTestDrive {
    public static List<Person> persons = new LinkedList<>();

    public static void main(String[] args) {
        initialize();

        // 남자는 몇명?
        long maleCount = persons.stream().filter(e ->e.getGender()== Gender.MALE).count();
        System.out.println("남자는 "+maleCount + "명 입니다.");

        //여자의 평균 나이는?
        OptionalDouble femaleAverageAge = persons.stream().filter(e-> e.getGender() == Gender.FEMALE).mapToInt(Person::getAge).average();
        if(femaleAverageAge.isPresent()) {
            System.out.println(">>> 여자의 평균 나이는"+ femaleAverageAge.getAsDouble() +"입니다.");
        }
        
        System.out.println(">>> 20~25살인 여자의 이름을 정렬해서 출력");
        Stream<Person> sp = persons.stream().filter(e->e.getGender() == Gender.FEMALE).filter(e->e.getAge()>=20 && e.getAge()<=25).sorted();
        sp.forEach(e->System.out.println(e.getName()));

    }
    // initialize 함수 구현 부
    public static void initialize() {
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
        // persons.addAll(Arrays.asList(data));
        for(Person p : data){
            persons.add(p);
        }
    }
}
