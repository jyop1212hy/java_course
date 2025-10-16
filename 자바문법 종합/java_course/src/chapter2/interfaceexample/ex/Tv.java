package chapter2.interfaceexample.ex;

public class Tv implements ElectronicDevice{

    // ElectronicDevice 인터페이스
    @Override
    public void turnOn() {
        System.out.println("TV가 켜집니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV가 꺼집니다.");
    }

    // TV 추가 기능(인터페이스에 없음)
    void changeChannel(){
        System.out.println("채널을 변경합니다.");
    }
}
