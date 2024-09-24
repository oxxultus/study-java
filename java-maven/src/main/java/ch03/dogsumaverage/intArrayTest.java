package cse.oop2.ch03.dogsumaverage;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class intArrayTest {
    public static final int MAX_NUMS = 1000; // 최대 숫자 개수 정의

    public void test() {
        int[] nums; // 정수 배열 nums 선언
        long sum = 0; // 합계를 저장할 변수 초기화

        nums = new int[MAX_NUMS]; // 최대 숫자 개수만큼 배열 생성
        for (int i = 0; i < MAX_NUMS; i++) {
            // 0부터 99까지의 랜덤 숫자를 생성하여 배열에 저장
            nums[i] = (int)(Math.random() * 100);
            sum += nums[i]; // 각 숫자를 sum에 더함
            // 동일한 표현: sum = sum + nums[i];
        }
        // 전체 합계로 평균을 계산하여 출력
        System.out.println("평균 1: " + (float)sum / MAX_NUMS);
        this.calculateSumUsingWrapper(nums); // 배열을 인자로 하여 계산 메서드 호출
    }

    private void calculateSumUsingWrapper(int[] nums) {
        // nums 배열의 값을 모두 더하는 코드
        OptionalInt sum = java.util.Arrays.stream(nums).reduce((x, y) -> (x + y));
        // reduce((x, y) -> (x + y))는 배열의 값을 순차적으로 더하는 함수
        // 예: 1 + 2 = 3, 3 + 3 = 6, 6 + 4 = 10 등의 방식으로 작동

        OptionalDouble average = java.util.Arrays.stream(nums).average(); // 배열의 평균 계산

        // ifPresent()가 호출될 때 s라는 이름으로 sum 값을 받아서 출력
        sum.ifPresent(s -> System.out.println("합계: " + s)); // sum이 존재하면 출력
        average.ifPresent(avg -> System.out.println("평균 2: " + avg)); // average가 존재하면 출력

        // 주석 처리된 코드: 값이 모두 존재할 때 sum과 average를 가져오는 방법
        /*
        if (sum.isPresent() && average.isPresent()) {
            System.out.println("합계: " + sum.getAsInt() + " 평균2: " + average.getAsDouble());
        }
        */
    }
}
