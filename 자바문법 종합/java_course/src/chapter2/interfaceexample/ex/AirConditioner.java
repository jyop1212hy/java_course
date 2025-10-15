package chapter2.interfaceexample.ex;

public class AirConditioner implements ElectronicDevice{

    // ElectronicDevice 인터페이스
    @Override
    public void turnOn() {
        System.out.println("에어컨이 가동됩니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨이 꺼졌습니다.");
    }

    // 에어컨 추가 기능(인터페이스에 없음)
    void setTemperature(){
        System.out.println("온도를 설정합니다.");
    }
}
