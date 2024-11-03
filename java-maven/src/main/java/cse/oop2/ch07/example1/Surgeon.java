package cse.oop2.ch07.example1;

// Surgeon 클래스는 Doctor 클래스를 상속받음
public class Surgeon extends Doctor {

    // 생성자: worksAtHospital 값을 받아 부모 클래스인 Doctor의 생성자를 호출
    public Surgeon(boolean worksAtHospital) {
        super(worksAtHospital);
    }

    // 환자를 치료하는 메소드: 외과의사 특성에 맞게 외과 수술을 한다고 출력
    @Override
    public void treatPatient() {
        System.out.println("외과 수술을 합니다.");
    }

    // 외과 수술에서 절개를 하는 행위를 나타내는 메소드
    public void makeIncision() {
        System.out.println("살을 쨉니다.");
    }
}
