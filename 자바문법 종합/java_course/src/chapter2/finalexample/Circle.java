package chapter2.finalexample;

public class Circle {
    //속성
    final static double PI = 3.14159; //  직접 만든 원주율 상수
    double radius;

    //생성자
    Circle(double radius) {
        this.radius = radius;
    }

    //기능
    Circle changeRadius(double newRadius) {
        return new Circle(newRadius);
    }
}
