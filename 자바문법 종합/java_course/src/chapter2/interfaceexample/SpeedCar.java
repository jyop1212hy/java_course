package chapter2.interfaceexample;

public class SpeedCar implements Car{

    @Override
    public void drive() {
        System.out.println("이러다 부산까지 10분만에 가겄네");
    }

    @Override
    public void stop() {
        System.out.println("너무 빨라서 못멈추겠어!!!");
    }

    void autuParking(){
        System.out.println("자동 주차 기능을 실행합니데이");
    }


//    void drive(){
//        System.out.println("이대로 부산까지 30분컷~!");
//    }
}
