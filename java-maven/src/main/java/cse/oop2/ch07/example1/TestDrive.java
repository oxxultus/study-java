package cse.oop2.ch07.example1;

public class TestDrive {
    public static void main(String[] args){
        // Doctor 객체 생성: 병원에서 일하지 않는 일반 의사
        Doctor doc = new Doctor(false);

        // FamilyDoctor 객체 생성: 병원에서 일하지 않고 왕진을 가지 않는 가정의
        FamilyDoctor familyDoctor = new FamilyDoctor(false, false);

        // Surgeon 객체 생성: 병원에서 일하지 않는 외과 의사
        Surgeon surgeon = new Surgeon(false);

        // 각 객체의 정보를 출력 (toString 메소드가 자동 호출됨)
        System.out.println(doc);
        System.out.println(familyDoctor);
        System.out.println(surgeon);

        // 외과 의사가 환자를 치료하고 절개하는 메소드 호출
        surgeon.treatPatient();  // "외과 수술을 합니다." 출력 (오버라이딩을 했기 때문에 자식 클래스의 매서드 사용)
        surgeon.makeIncision();   // "살을 쨉니다." 출력

        // 가정의가 환자에게 조언을 하고 치료하는 메소드 호출
        familyDoctor.giveAdvice(); // "집에서 필요한 조언을 합니다." 출력
        familyDoctor.treatPatient(); // "진료를 합니다." 출력 (Doctor 클래스의 메소드 사용)
    }
}
