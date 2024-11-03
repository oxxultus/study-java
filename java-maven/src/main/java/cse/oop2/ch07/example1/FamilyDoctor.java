package cse.oop2.ch07.example1;

// FamilyDoctor 클래스는 Doctor 클래스를 상속받음
public class FamilyDoctor extends Doctor {
    // 가정의가 집으로 왕진을 가는지 여부를 나타내는 필드
    boolean makeHouseCalls;

    // 생성자: makeHouseCalls와 worksAtHospital 값을 받아 초기화
    public FamilyDoctor(boolean makeHouseCalls, boolean worksAtHospital) {
        // 부모 클래스인 Doctor의 생성자를 호출하여 worksAtHospital 필드 초기화
        super(worksAtHospital);
        // makeHouseCalls 필드를 초기화
        this.makeHouseCalls = makeHouseCalls;
    }

    // 가정의가 환자에게 조언을 해주는 메소드
    public void giveAdvice() {
        System.out.println("집에서 필요한 조언을 합니다.");
    }
}
