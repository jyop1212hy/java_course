package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {

        //인스턴스화
        LuxuryCar luxuryCar =  new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        // 활용
//        luxuryCar.move();
//        luxuryCar.stop();

//        speedCar.move();
//        speedCar.stop();
//        speedCar.drive();

        //인터페이스 활용
        luxuryCar.drive();
        luxuryCar.stop();

        speedCar.drive();
        speedCar.stop();

        luxuryCar.charge();
        speedCar.autuParking();
    }
}
