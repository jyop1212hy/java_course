package chapter2.interfaceexample.ex;

public class WashingMachine implements ElectronicDevice{

    // ElectronicDevice 인터페이스
    @Override
    public void turnOn() {
        System.out.println("세탁기가 작동을 시작합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("세탁기가 작동을 멈춥니다.");
    }

    // 세탁기 추가 기능(인터페이스에 없음)
    void setTime() {
        System.out.println("세탁 시간을 설정합니다.");
    }
}
