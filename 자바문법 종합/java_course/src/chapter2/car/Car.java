package chapter2.car;

public class Car {
    //속성
    String name;
    String carModel = "monig";
    int accelerate;

    //생성자
    Car(String name, String carModel) {
        this.name = name;
        //this.accelerate = 0;
    }

    //기능
    void drive() {
        System.out.println(name + "[" + this.carModel + "] 을 주행합니다.");
    }

    //현재 주행 속도를 입력 되어 주행속도가 0보다 크다면 가속중이라는 문구 출력한다

//    void getAccelerate(int accelerate) {
//        if (accelerate > 0) {
//            System.out.println("가속중 입니다.");
//        }
//    }

    void accelerate(int accelerate) {
        if (accelerate > 0) {
            this.accelerate = this.accelerate + accelerate;
            System.out.println("자동차를 " + this.accelerate + "만큼 가속합니다.");
        }
    }
}
