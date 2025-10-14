package chapter2.car;

public class Main {
    public static void main(String[] args) {
        //자동차 객체 생성 (호출)
        Car myDreamCar = new Car("haryun", "mustang");

        myDreamCar.drive();
        //myDreamCar.getAccelerate(5);
        myDreamCar.accelerate(5);
    }
}
