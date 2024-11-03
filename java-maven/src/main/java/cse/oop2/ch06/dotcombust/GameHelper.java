// 패키지 선언 - GameHelper 클래스가 속한 패키지 지정
package cse.oop2.ch06.dotcombust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 게임의 입력 처리와 DotCom 배치를 담당하는 보조 클래스
public class GameHelper {

    // 알파벳 문자열: DotCom의 위치를 문자로 변환할 때 사용
    private static final String alphabet = "abcdefg";
    private final int gridLength = 7;  // 격자의 가로 길이
    private int gridSize = 49;         // 전체 격자 크기 (7x7)
    private final int[] grid = new int[gridSize]; // 위치 점유 여부를 추적하는 배열
    private int comCount = 0;          // DotCom 객체의 수를 추적

    /**
     * 사용자 입력을 받아 대문자로 반환하는 메서드
     * @param prompt 입력 요청 메시지
     * @return 사용자 입력 문자열 (대문자로 변환)
     */
    public String getUserInput(String prompt) {
        String input = null;
        System.out.print(prompt + " "); // 입력 요청 메시지 출력
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in)); // 입력 스트림 생성
            input = is.readLine(); // 사용자 입력 읽기

            if (input.length() == 0) { // 빈 입력일 경우 null 반환
                return null;
            }
        } catch (IOException e) { // 예외 처리
            System.out.println("IOException: " + e);
        }
        return input.toUpperCase(); // 입력을 대문자로 변환하여 반환
    }

    /**
     * DotCom의 위치를 무작위로 생성하여 반환하는 메서드
     * @param comSize DotCom이 차지할 크기 (칸 수)
     * @return DotCom의 위치를 나타내는 문자열 리스트
     */
    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>(); // 위치를 저장할 리스트
        String temp = null; // 임시 변수
        int[] coords = new int[comSize]; // 위치를 저장할 배열
        int attempts = 0; // 시도 횟수
        boolean success = false; // 성공 여부
        int location = 0; // 현재 위치 인덱스

        comCount++; // DotCom 객체 수 증가
        int incr = 1; // 위치 증분 (가로 방향)

        // 홀수 번째 DotCom은 세로로 배치 (증분을 7로 설정)
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }

        // 최대 200번까지 위치를 찾기 위해 반복
        while (!success && attempts++ < 200) {
            location = (int) (Math.random() * gridSize); // 무작위 시작 위치 선택
            int x = 0; // 배열 인덱스
            success = true; // 위치 설정 성공 여부 초기화

            // DotCom의 각 칸에 대해 유효한 위치인지 확인
            while (success && x < comSize) {
                if (grid[location] == 0) { // 해당 위치가 비어 있는지 확인
                    coords[x++] = location; // 위치 저장
                    location += incr; // 다음 위치로 이동

                    // 그리드의 범위를 벗어난 경우 실패 처리
                    if (location >= gridSize) {
                        success = false;
                    }

                    // DotCom이 격자의 끝을 넘어가는 경우 실패 처리
                    if (x > 0 && (location % gridLength) == 0) {
                        success = false;
                    }
                } else { // 위치가 이미 점유된 경우
                    success = false;
                }
            }
        }

        // 좌표를 알파벳+숫자 형식으로 변환하여 리스트에 추가
        for (int coord : coords) {
            int row = coord / gridLength; // 행 계산
            int column = coord % gridLength; // 열 계산
            temp = String.valueOf(alphabet.charAt(column)) + row; // 알파벳+숫자 형식으로 변환
            alphaCells.add(temp); // 리스트에 추가
        }

        return alphaCells; // 위치 리스트 반환
    }
}
