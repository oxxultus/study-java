package cse.oop2.ch07.example1;

public class Doctor {
    // 의사가 병원에서 일하는지 여부를 나타내는 필드
    boolean worksAtHospital;

    // 생성자: worksAtHospital 값을 받아 필드를 초기화
    public Doctor (boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    // 환자를 진료하는 메소드
    public void treatPatient(){
        System.out.println("진료를 합니다.");
    }

    // 객체의 문자열 표현을 제공하는 toString 메소드
    @Override
    public String toString() {
        String result = null;

        // 병원에서 일하는지 여부에 따라 다른 문자열 반환
        if (this.worksAtHospital){
            result = this.getClass().getName() + ": 병원에서 일하는 의사입니다.";
        }
        else {
            result = this.getClass().getSimpleName() + ": 집에서 일하는 의사입니다.";
        }
        return result;
    }
}
