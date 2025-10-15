package chapter2.interfaceexample.ex;

public class Main {
    public static void main(String[] args) {

        //가전제품 객체 생성
        Tv smartAiTv = new Tv();
        AirConditioner airConditioner = new AirConditioner();
        WashingMachine washingMachine = new WashingMachine();

        //개별적 전원 켜기
        smartAiTv.turnOn();
        airConditioner.turnOn();
        washingMachine.turnOn();

        //각제품별 추가기능 사용
        smartAiTv.changeChannel();
        airConditioner.setTemperature();
        washingMachine.setTime();

        //개별적 전원 끄기
        smartAiTv.turnOff();
        airConditioner.turnOff();
        washingMachine.turnOff();
    }
}
