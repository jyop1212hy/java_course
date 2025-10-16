package chapter2.interfaceexample;

public class LuxuryCar implements Car{

    @Override
    public void drive() {
        System.out.println("귀티나게 이동합니다.");
    }

    @Override
    public void stop() {
        System.out.println("부티나게 멈춰부렀습니다");
    }

    void charge(){
        System.out.println("차량 충전을 합니다.");
    }


//    void move(){
//        System.out.println("간지나게 이동합니다.");
//    }
//
//    void stop(){
//        System.out.println("기똥차게 정지합니다.");
//    }
}
