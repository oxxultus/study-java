// 패키지 선언 - DotCom 클래스가 속한 패키지를 지정
package cse.oop2.ch06.dotcombust;

import java.util.ArrayList; // ArrayList를 사용하기 위해 임포트

// DotCom 객체를 정의하는 클래스
public class DotCom {
    // 멤버 변수: DotCom의 위치와 이름을 저장
    private ArrayList<String> locationCells; // DotCom이 차지하는 위치 목록
    private String name; // DotCom의 이름

    // DotCom의 위치를 설정하는 메서드
    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells; // 전달받은 위치 목록을 저장
    }

    // 사용자의 추측을 확인하고 결과를 반환하는 메서드
    public String checkYourself(String userInput) {
        String result = "miss"; // 기본 결과는 "miss"로 설정

        // 사용자 입력이 위치 목록에 있는지 확인
        int index = locationCells.indexOf(userInput);

        if (index >= 0) { // 입력한 위치가 목록에 있으면
            locationCells.remove(index); // 해당 위치를 제거

            // 모든 위치를 맞췄으면 "kill" 반환
            if (locationCells.isEmpty()) {
                result = "kill";
            } else { // 일부만 맞췄으면 "hit" 반환
                result = "hit";
            }
        }
        return result; // 결과 반환
    }

    // DotCom의 이름을 설정하는 메서드
    public void setName(String name) {
        this.name = name; // 전달받은 이름을 저장
    }
}
